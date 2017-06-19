package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.datetime.joda.MillisecondInstantPrinter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.entity.IsMainplanB;
import com.yongyou.iSupport.entity.IsMainplanH;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.form.MainPlanForm;
import com.yongyou.iSupport.service.IsBProjectService;
import com.yongyou.iSupport.service.IsMainPlanBService;
import com.yongyou.iSupport.service.IsMainPlanHService;
//import com.yongyou.iSupport.utils.StringUtil;
import com.yongyou.iSupport.utils.TimeUtil;

@Controller
@RequestMapping("mainplan")
public class MainPlanController {

	@Autowired
	private IsMainPlanHService isMainPlanHService;
	@Autowired
	private IsMainPlanBService isMainPlanBService;
	@Autowired
	private IsBProjectService isBProjectService;
	
	@RequestMapping("addmainplan")
	public String addMainPlan(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkProject,HttpSession session){
		IsBProject project = isBProjectService.selectByPrimaryKey(pkProject);
		String projectname = project.getProjectname();
		IsMainplanH isMainplanH = isMainPlanHService.selectByProjectName(projectname);
		if(isMainplanH == null){
			model.addAttribute("projectname",projectname);
			User user = (User) session.getAttribute("user");
			model.addAttribute("user",user);
			return "startingPlanForm";
		}else{
			return "addMainPlanFaile";
		}
	}
	
	@RequestMapping("mainplanlist")
	public String mainplanlist(HttpServletRequest request,HttpServletResponse response,Model model,IsMainplanH mainplanh){
		List<IsMainplanH> hlist = isMainPlanHService.findList(mainplanh);
		model.addAttribute("hlist",hlist);
		return "startingPlanList";
	}
	
	
	@RequestMapping("savemainplan")
	public String saveMainPlan(HttpServletRequest request,HttpServletResponse response,Model model,MainPlanForm form){
//		获取主计划主表表单数据
		String compiledate = form.getCompiledate();
		String pstartdate = form.getPstartdate();
		String penddate = form.getPenddate();
		
		
		
//		创建主计划实体类
		IsMainplanH mainplanH = new IsMainplanH();
		
//		将mainplanform数据复制到实体类
		BeanUtils.copyProperties(form, mainplanH);
		
//		由于表单中form接收的时间类型为String，所以要先将String类型转化为date型时间，然后赋值给实体类
		mainplanH.setCompiledate(TimeUtil.parseDate(compiledate));
		mainplanH.setPstartdate(TimeUtil.parseDate(pstartdate));
		mainplanH.setPenddate(TimeUtil.parseDate(penddate));
		
//		将数据插入数据库
		isMainPlanHService.insert(mainplanH);
		
		
		
		
		
//		创建主计划字表实体类用来接收数据
		IsMainplanB mainplanB = new IsMainplanB();
		
//		获取主数据子表表单数据列表
		List<String> plancodelist = form.getPlancode();
		List<String> plannamelist = form.getPlanname();
		List<String> spstartdatelist = form.getSpstartdate();
		List<String> spenddatelist = form.getSpenddate();
		List<String> splancyclelist = form.getSplancycle();
		List<String> spmnumlist = form.getSpmnum();
		List<String> spmdayslist = form.getSpmdays();
		List<String> simnumlist = form.getSimnum();
		List<String> simdayslist = form.getSimdays();
		List<String> alldayslist = form.getAlldays();
		List<String> ufrolelist = form.getUfrole();
		List<String> custrolelist = form.getCustrole();
		List<String> servicecontentlist = form.getServicecontent();
		List<String> ufdocumentlist = form.getUfdocument();
		List<String> sremarklist = form.getSremark();
		
		
//		将list数据循环插入实体类mainplanB
		if(!StringUtils.isEmpty(plancodelist)){
			Integer id = mainplanH.getPkMainplanH();
			
			for (int i = 0; i < plancodelist.size(); i++) {
				mainplanB.setPkMainplanH(id);
				mainplanB.setPlancode(plancodelist.get(i));
				mainplanB.setPlanname(plannamelist.get(i));
				mainplanB.setSpstartdate(TimeUtil.parseDate(spstartdatelist.get(i)));
				mainplanB.setSpenddate(TimeUtil.parseDate(spenddatelist.get(i)));
				mainplanB.setSplancycle(splancyclelist.get(i));
				mainplanB.setSpmnum(spmnumlist.get(i));
				mainplanB.setSpmdays(spmdayslist.get(i));
				mainplanB.setSimnum(simnumlist.get(i));
				mainplanB.setSimdays(simdayslist.get(i));
				mainplanB.setAlldays(alldayslist.get(i));
				mainplanB.setUfrole(ufrolelist.get(i));
//				mainplanB.setUfmember(ufmemberlist.get(i));
				mainplanB.setCustrole(custrolelist.get(i));
				mainplanB.setServicecontent(servicecontentlist.get(i));
				mainplanB.setUfdocument(ufdocumentlist.get(i));
				mainplanB.setSremark(sremarklist.get(i));
				isMainPlanBService.insert(mainplanB);
			}
		}
		return "redirect:mainplanlist";
	}
	
	/*
	 * 删除主计划
	 */
	@RequestMapping("delete")
	public String deleteMainplan(HttpServletRequest request,HttpServletResponse response,Integer pkMainplanH){
		isMainPlanHService.deleteByPrimaryKey(pkMainplanH);
		isMainPlanBService.deleteByMainplanId(pkMainplanH);
		return "redirect:mainplanlist";
	}
	
	/*
	 * 查询主计划详细信息
	 */
	@RequestMapping("detail")
	public String mainplanDetail(HttpServletRequest request,HttpServletResponse response,Integer pkMainplanH,Model model){
		IsMainplanH mainplanh = isMainPlanHService.selectByPrimaryKey(pkMainplanH);
		IsMainplanB plancode1 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1");
		IsMainplanB plancode11 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.1");
		IsMainplanB plancode12 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.2");
		IsMainplanB plancode13 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.3");
		IsMainplanB plancode14 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.4");
		IsMainplanB plancode15 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.5");
		IsMainplanB plancode16 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.6");
		IsMainplanB plancode2 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2");
		IsMainplanB plancode21 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.1");
		IsMainplanB plancode22 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.2");
		IsMainplanB plancode23 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.3");
		IsMainplanB plancode24 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.4");
		IsMainplanB plancode25= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.5");
		IsMainplanB plancode26= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.6");
		IsMainplanB plancode3 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3");
		IsMainplanB plancode31 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.1");
		IsMainplanB plancode32 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.2");
		IsMainplanB plancode33 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.3");
		IsMainplanB plancode34= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.4");
		IsMainplanB plancode35= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.5");
		IsMainplanB plancode36= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.6");
		IsMainplanB plancode37= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.7");
		IsMainplanB plancode38= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.8");
		IsMainplanB plancode4 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4");
		IsMainplanB plancode41 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.1");
		IsMainplanB plancode42= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.2");
		IsMainplanB plancode43= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.3");
		IsMainplanB plancode44= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.4");
		IsMainplanB plancode45= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.5");
		IsMainplanB plancode46= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.6");
		IsMainplanB plancode47= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.7");
		IsMainplanB plancode5 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5");
		IsMainplanB plancode51 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.1");
		IsMainplanB plancode52 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.2");
		IsMainplanB plancode53= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.3");
		model.addAttribute("mainplanh",mainplanh);
		model.addAttribute("plancode1",plancode1);
		model.addAttribute("plancode11",plancode11);
		model.addAttribute("plancode12",plancode12);
		model.addAttribute("plancode13",plancode13);
		model.addAttribute("plancode14",plancode14);
		model.addAttribute("plancode15",plancode15);
		model.addAttribute("plancode16",plancode16);
		model.addAttribute("plancode2",plancode2);
		model.addAttribute("plancode21",plancode21);
		model.addAttribute("plancode22",plancode22);
		model.addAttribute("plancode23",plancode23);
		model.addAttribute("plancode24",plancode24);
		model.addAttribute("plancode25",plancode25);
		model.addAttribute("plancode26",plancode26);
		model.addAttribute("plancode3",plancode3);
		model.addAttribute("plancode31",plancode31);
		model.addAttribute("plancode32",plancode32);
		model.addAttribute("plancode33",plancode33);
		model.addAttribute("plancode34",plancode34);
		model.addAttribute("plancode35",plancode35);
		model.addAttribute("plancode36",plancode36);
		model.addAttribute("plancode37",plancode37);
		model.addAttribute("plancode38",plancode38);
		model.addAttribute("plancode4",plancode4);
		model.addAttribute("plancode41",plancode41);
		model.addAttribute("plancode42",plancode42);
		model.addAttribute("plancode43",plancode43);
		model.addAttribute("plancode44",plancode44);
		model.addAttribute("plancode45",plancode45);
		model.addAttribute("plancode46",plancode46);
		model.addAttribute("plancode47",plancode47);
		model.addAttribute("plancode5",plancode5);
		model.addAttribute("plancode51",plancode51);
		model.addAttribute("plancode52",plancode52);
		model.addAttribute("plancode53",plancode53);
		return "startingPlanDetail";
	}
	
	/*
	 * 进入修改页，并通过主机划id查出相关数据插入页面
	 */
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkMainplanH){
		IsMainplanH mainplanh = isMainPlanHService.selectByPrimaryKey(pkMainplanH);
		String Compiledate = null;
		String compiledate = TimeUtil.newconvertDate(mainplanh.getCompiledate(), Compiledate);
		String Pstartdate = null;
		String pstartdate = TimeUtil.newconvertDate(mainplanh.getPstartdate(), Pstartdate);
		String Penddate = null;
		String penddate = TimeUtil.newconvertDate(mainplanh.getPenddate(), Penddate);
		IsMainplanB plancode1 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1");
		String Pstartdate1 = null;
		String pstartdate1 = TimeUtil.newconvertDate(plancode1.getSpstartdate(), Pstartdate1);
		String Penddate1 = null;
		String penddate1 = TimeUtil.newconvertDate(plancode1.getSpenddate(), Penddate1);
		IsMainplanB plancode11 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.1");
		String Pstartdate11 = null;
		String spstartdate11 = TimeUtil.newconvertDate(plancode11.getSpstartdate(), Pstartdate11);
		String Penddate11 = null;
		String spenddate11 = TimeUtil.newconvertDate(plancode11.getSpenddate(), Penddate11);
		IsMainplanB plancode12 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.2");
		String Pstartdate12 = null;
		String spstartdate12 = TimeUtil.newconvertDate(plancode12.getSpstartdate(), Pstartdate12);
		String Penddate12 = null;
		String spenddate12 = TimeUtil.newconvertDate(plancode12.getSpenddate(), Penddate12);
		IsMainplanB plancode13 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.3");
		String Pstartdate13 = null;
		String spstartdate13 = TimeUtil.newconvertDate(plancode13.getSpstartdate(), Pstartdate13);
		String Penddate13 = null;
		String spenddate13 = TimeUtil.newconvertDate(plancode13.getSpenddate(), Penddate13);
		IsMainplanB plancode14 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.4");
		String Pstartdate14 = null;
		String spstartdate14 = TimeUtil.newconvertDate(plancode14.getSpstartdate(), Pstartdate14);
		String Penddate14 = null;
		String spenddate14 = TimeUtil.newconvertDate(plancode14.getSpenddate(), Penddate14);
		IsMainplanB plancode15 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.5");
		String Pstartdate15 = null;
		String spstartdate15 = TimeUtil.newconvertDate(plancode15.getSpstartdate(), Pstartdate15);
		String Penddate15 = null;
		String spenddate15 = TimeUtil.newconvertDate(plancode15.getSpenddate(), Penddate15);
		IsMainplanB plancode16 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"1.6");
		String Pstartdate16 = null;
		String spstartdate16 = TimeUtil.newconvertDate(plancode16.getSpstartdate(), Pstartdate16);
		String Penddate16 = null;
		String spenddate16 = TimeUtil.newconvertDate(plancode16.getSpenddate(), Penddate16);
		IsMainplanB plancode2 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2");
		String Pstartdate2 = null;
		String spstartdate2 = TimeUtil.newconvertDate(plancode2.getSpstartdate(), Pstartdate2);
		String Penddate2 = null;
		String spenddate2 = TimeUtil.newconvertDate(plancode2.getSpenddate(), Penddate2);
		IsMainplanB plancode21 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.1");
		String Pstartdate21 = null;
		String spstartdate21 = TimeUtil.newconvertDate(plancode21.getSpstartdate(), Pstartdate21);
		String Penddate21 = null;
		String spenddate21 = TimeUtil.newconvertDate(plancode21.getSpenddate(), Penddate21);
		IsMainplanB plancode22 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.2");
		String Pstartdate22 = null;
		String spstartdate22 = TimeUtil.newconvertDate(plancode22.getSpstartdate(), Pstartdate22);
		String Penddate22 = null;
		String spenddate22 = TimeUtil.newconvertDate(plancode22.getSpenddate(), Penddate22);
		IsMainplanB plancode23 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.3");
		String Pstartdate23 = null;
		String spstartdate23 = TimeUtil.newconvertDate(plancode23.getSpstartdate(), Pstartdate23);
		String Penddate23 = null;
		String spenddate23 = TimeUtil.newconvertDate(plancode23.getSpenddate(), Penddate23);
		IsMainplanB plancode24 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.4");
		String Pstartdate24 = null;
		String spstartdate24 = TimeUtil.newconvertDate(plancode24.getSpstartdate(), Pstartdate24);
		String Penddate24 = null;
		String spenddate24 = TimeUtil.newconvertDate(plancode24.getSpenddate(), Penddate24);
		IsMainplanB plancode25= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.5");
		String Pstartdate25 = null;
		String spstartdate25 = TimeUtil.newconvertDate(plancode25.getSpstartdate(), Pstartdate25);
		String Penddate25 = null;
		String spenddate25 = TimeUtil.newconvertDate(plancode25.getSpenddate(), Penddate25);
		IsMainplanB plancode26= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"2.6");
		String Pstartdate26 = null;
		String spstartdate26 = TimeUtil.newconvertDate(plancode26.getSpstartdate(), Pstartdate26);
		String Penddate26 = null;
		String spenddate26 = TimeUtil.newconvertDate(plancode26.getSpenddate(), Penddate26);
		IsMainplanB plancode3 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3");
		String Pstartdate3 = null;
		String spstartdate3 = TimeUtil.newconvertDate(plancode3.getSpstartdate(), Pstartdate3);
		String Penddate3 = null;
		String spenddate3 = TimeUtil.newconvertDate(plancode3.getSpenddate(), Penddate3);
		IsMainplanB plancode31 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.1");
		String Pstartdate31 = null;
		String spstartdate31 = TimeUtil.newconvertDate(plancode31.getSpstartdate(), Pstartdate31);
		String Penddate31 = null;
		String spenddate31 = TimeUtil.newconvertDate(plancode31.getSpenddate(), Penddate31);
		IsMainplanB plancode32 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.2");
		String Pstartdate32 = null;
		String spstartdate32 = TimeUtil.newconvertDate(plancode32.getSpstartdate(), Pstartdate32);
		String Penddate32= null;
		String spenddate32 = TimeUtil.newconvertDate(plancode32.getSpenddate(), Penddate32);
		IsMainplanB plancode33 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.3");
		String Pstartdate33 = null;
		String spstartdate33 = TimeUtil.newconvertDate(plancode33.getSpstartdate(), Pstartdate33);
		String Penddate33 = null;
		String spenddate33 = TimeUtil.newconvertDate(plancode33.getSpenddate(), Penddate33);
		IsMainplanB plancode34= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.4");
		String Pstartdate34 = null;
		String spstartdate34 = TimeUtil.newconvertDate(plancode34.getSpstartdate(), Pstartdate34);
		String Penddate34 = null;
		String spenddate34 = TimeUtil.newconvertDate(plancode34.getSpenddate(), Penddate34);
		IsMainplanB plancode35= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.5");
		String Pstartdate35 = null;
		String spstartdate35 = TimeUtil.newconvertDate(plancode35.getSpstartdate(), Pstartdate35);
		String Penddate35 = null;
		String spenddate35 = TimeUtil.newconvertDate(plancode35.getSpenddate(), Penddate35);
		IsMainplanB plancode36= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.6");
		String Pstartdate36 = null;
		String spstartdate36 = TimeUtil.newconvertDate(plancode36.getSpstartdate(), Pstartdate36);
		String Penddate36 = null;
		String spenddate36 = TimeUtil.newconvertDate(plancode36.getSpenddate(), Penddate36);
		IsMainplanB plancode37= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.7");
		String Pstartdate37 = null;
		String spstartdate37 = TimeUtil.newconvertDate(plancode37.getSpstartdate(), Pstartdate37);
		String Penddate37 = null;
		String spenddate37 = TimeUtil.newconvertDate(plancode37.getSpenddate(), Penddate37);
		IsMainplanB plancode38= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"3.8");
		String Pstartdate38 = null;
		String spstartdate38 = TimeUtil.newconvertDate(plancode38.getSpstartdate(), Pstartdate38);
		String Penddate38 = null;
		String spenddate38 = TimeUtil.newconvertDate(plancode38.getSpenddate(), Penddate38);
		IsMainplanB plancode4 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4");
		String Pstartdate4 = null;
		String spstartdate4 = TimeUtil.newconvertDate(plancode4.getSpstartdate(), Pstartdate4);
		String Penddate4 = null;
		String spenddate4 = TimeUtil.newconvertDate(plancode4.getSpenddate(), Penddate4);
		IsMainplanB plancode41 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.1");
		String Pstartdate41 = null;
		String spstartdate41 = TimeUtil.newconvertDate(plancode41.getSpstartdate(), Pstartdate41);
		String Penddate41 = null;
		String spenddate41 = TimeUtil.newconvertDate(plancode41.getSpenddate(), Penddate41);
		IsMainplanB plancode42= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.2");
		String Pstartdate42 = null;
		String spstartdate42 = TimeUtil.newconvertDate(plancode42.getSpstartdate(), Pstartdate42);
		String Penddate42 = null;
		String spenddate42 = TimeUtil.newconvertDate(plancode42.getSpenddate(), Penddate42);
		IsMainplanB plancode43= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.3");
		String Pstartdate43 = null;
		String spstartdate43 = TimeUtil.newconvertDate(plancode43.getSpstartdate(), Pstartdate43);
		String Penddate43 = null;
		String spenddate43 = TimeUtil.newconvertDate(plancode43.getSpenddate(), Penddate43);
		IsMainplanB plancode44= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.4");
		String Pstartdate44 = null;
		String spstartdate44 = TimeUtil.newconvertDate(plancode44.getSpstartdate(), Pstartdate44);
		String Penddate44 = null;
		String spenddate44 = TimeUtil.newconvertDate(plancode44.getSpenddate(), Penddate44);
		IsMainplanB plancode45= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.5");
		String Pstartdate45 = null;
		String spstartdate45 = TimeUtil.newconvertDate(plancode45.getSpstartdate(), Pstartdate45);
		String Penddate45 = null;
		String spenddate45 = TimeUtil.newconvertDate(plancode45.getSpenddate(), Penddate45);
		IsMainplanB plancode46= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.6");
		String Pstartdate46 = null;
		String spstartdate46 = TimeUtil.newconvertDate(plancode46.getSpstartdate(), Pstartdate46);
		String Penddate46 = null;
		String spenddate46 = TimeUtil.newconvertDate(plancode46.getSpenddate(), Penddate46);
		IsMainplanB plancode47= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"4.7");
		String Pstartdate47 = null;
		String spstartdate47 = TimeUtil.newconvertDate(plancode47.getSpstartdate(), Pstartdate47);
		String Penddate47 = null;
		String spenddate47 = TimeUtil.newconvertDate(plancode47.getSpenddate(), Penddate47);
		IsMainplanB plancode5 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5");
		String Pstartdate5 = null;
		String spstartdate5 = TimeUtil.newconvertDate(plancode5.getSpstartdate(), Pstartdate5);
		String Penddate5 = null;
		String spenddate5 = TimeUtil.newconvertDate(plancode5.getSpenddate(), Penddate5);
		IsMainplanB plancode51 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.1");
		String Pstartdate51 = null;
		String spstartdate51 = TimeUtil.newconvertDate(plancode51.getSpstartdate(), Pstartdate51);
		String Penddate51 = null;
		String spenddate51 = TimeUtil.newconvertDate(plancode51.getSpenddate(), Penddate51);
		IsMainplanB plancode52 = isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.2");
		String Pstartdate52 = null;
		String spstartdate52 = TimeUtil.newconvertDate(plancode52.getSpstartdate(), Pstartdate52);
		String Penddate52 = null;
		String spenddate52 = TimeUtil.newconvertDate(plancode52.getSpenddate(), Penddate52);
		IsMainplanB plancode53= isMainPlanBService.selectByMainplanHAndPlancode(pkMainplanH,"5.3");
		String Pstartdate53 = null;
		String spstartdate53 = TimeUtil.newconvertDate(plancode53.getSpstartdate(), Pstartdate5);
		String Penddate53 = null;
		String spenddate53 = TimeUtil.newconvertDate(plancode53.getSpenddate(), Penddate53);
		model.addAttribute("mainplanh",mainplanh);
		model.addAttribute("compiledate",compiledate);
		model.addAttribute("pstartdate",pstartdate);
		model.addAttribute("penddate",penddate);
		model.addAttribute("plancode1",plancode1);
		model.addAttribute("pstartdate1",pstartdate1);
		model.addAttribute("penddate1",penddate1);
		model.addAttribute("plancode11",plancode11);
		model.addAttribute("spstartdate11",spstartdate11);
		model.addAttribute("spenddate11",spenddate11);
		model.addAttribute("plancode12",plancode12);
		model.addAttribute("spstartdate12",spstartdate12);
		model.addAttribute("spenddate12",spenddate12);
		model.addAttribute("plancode13",plancode13);
		model.addAttribute("spstartdate13",spstartdate13);
		model.addAttribute("spenddate13",spenddate13);
		model.addAttribute("plancode14",plancode14);
		model.addAttribute("spstartdate14",spstartdate14);
		model.addAttribute("spenddate14",spenddate14);
		model.addAttribute("plancode15",plancode15);
		model.addAttribute("spstartdate15",spstartdate15);
		model.addAttribute("spenddate15",spenddate15);
		model.addAttribute("plancode16",plancode16);
		model.addAttribute("spstartdate16",spstartdate16);
		model.addAttribute("spenddate16",spenddate16);
		model.addAttribute("plancode2",plancode2);
		model.addAttribute("spstartdate2",spstartdate2);
		model.addAttribute("spenddate2",spenddate2);
		model.addAttribute("plancode21",plancode21);
		model.addAttribute("spstartdate21",spstartdate21);
		model.addAttribute("spenddate21",spenddate21);
		model.addAttribute("plancode22",plancode22);
		model.addAttribute("spstartdate22",spstartdate22);
		model.addAttribute("spenddate22",spenddate22);
		model.addAttribute("plancode23",plancode23);
		model.addAttribute("spstartdate23",spstartdate23);
		model.addAttribute("spenddate23",spenddate23);
		model.addAttribute("plancode24",plancode24);
		model.addAttribute("spstartdate24",spstartdate24);
		model.addAttribute("spenddate24",spenddate24);
		model.addAttribute("plancode25",plancode25);
		model.addAttribute("spstartdate25",spstartdate25);
		model.addAttribute("spenddate25",spenddate25);
		model.addAttribute("plancode26",plancode26);
		model.addAttribute("spstartdate26",spstartdate26);
		model.addAttribute("spenddate26",spenddate26);
		model.addAttribute("plancode3",plancode3);
		model.addAttribute("spstartdate3",spstartdate3);
		model.addAttribute("spenddate3",spenddate3);
		model.addAttribute("plancode31",plancode31);
		model.addAttribute("spstartdate31",spstartdate31);
		model.addAttribute("spenddate31",spenddate31);
		model.addAttribute("plancode32",plancode32);
		model.addAttribute("spstartdate32",spstartdate32);
		model.addAttribute("spenddate32",spenddate32);
		model.addAttribute("plancode33",plancode33);
		model.addAttribute("spstartdate33",spstartdate33);
		model.addAttribute("spenddate33",spenddate33);
		model.addAttribute("plancode34",plancode34);
		model.addAttribute("spstartdate34",spstartdate34);
		model.addAttribute("spenddate34",spenddate34);
		model.addAttribute("plancode35",plancode35);
		model.addAttribute("spstartdate35",spstartdate35);
		model.addAttribute("spenddate35",spenddate35);
		model.addAttribute("plancode36",plancode36);
		model.addAttribute("spstartdate36",spstartdate36);
		model.addAttribute("spenddate36",spenddate36);
		model.addAttribute("plancode37",plancode37);
		model.addAttribute("spstartdate37",spstartdate37);
		model.addAttribute("spenddate37",spenddate37);
		model.addAttribute("plancode38",plancode38);
		model.addAttribute("spstartdate38",spstartdate38);
		model.addAttribute("spenddate38",spenddate38);
		model.addAttribute("plancode4",plancode4);
		model.addAttribute("spstartdate4",spstartdate4);
		model.addAttribute("spenddate4",spenddate4);
		model.addAttribute("plancode41",plancode41);
		model.addAttribute("spstartdate41",spstartdate41);
		model.addAttribute("spenddate41",spenddate41);
		model.addAttribute("plancode42",plancode42);
		model.addAttribute("spstartdate42",spstartdate42);
		model.addAttribute("spenddate42",spenddate42);
		model.addAttribute("plancode43",plancode43);
		model.addAttribute("spstartdate43",spstartdate43);
		model.addAttribute("spenddate43",spenddate43);
		model.addAttribute("plancode44",plancode44);
		model.addAttribute("spstartdate44",spstartdate44);
		model.addAttribute("spenddate44",spenddate44);
		model.addAttribute("plancode45",plancode45);
		model.addAttribute("spstartdate45",spstartdate45);
		model.addAttribute("spenddate45",spenddate45);
		model.addAttribute("plancode46",plancode46);
		model.addAttribute("spstartdate46",spstartdate46);
		model.addAttribute("spenddate46",spenddate46);
		model.addAttribute("plancode47",plancode47);
		model.addAttribute("spstartdate47",spstartdate47);
		model.addAttribute("spenddate47",spenddate47);
		model.addAttribute("plancode5",plancode5);
		model.addAttribute("spstartdate5",spstartdate5);
		model.addAttribute("spenddate5",spenddate5);
		model.addAttribute("plancode51",plancode51);
		model.addAttribute("spstartdate51",spstartdate51);
		model.addAttribute("spenddate51",spenddate51);
		model.addAttribute("plancode52",plancode52);
		model.addAttribute("spstartdate52",spstartdate52);
		model.addAttribute("spenddate52",spenddate52);
		model.addAttribute("plancode53",plancode53);
		model.addAttribute("spstartdate53",spstartdate53);
		model.addAttribute("spenddate53",spenddate53);
		return "UpdateStartingPlan";
	}
	
	
	/*
	 * 更新主机划字表数据
	 */
	@RequestMapping("update")
	public String updateplan(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkMainplanH,MainPlanForm form){
//		获取主计划主表表单数据
		String compiledate = form.getCompiledate();
		String pstartdate = form.getPstartdate();
		String penddate = form.getPenddate();
		
		
		
//		创建主计划实体类
		IsMainplanH mainplanH = new IsMainplanH();
		
//		将mainplanform数据复制到实体类
		BeanUtils.copyProperties(form, mainplanH);
		
//		由于表单中form接收的时间类型为String，所以要先将String类型转化为date型时间，然后赋值给实体类
		mainplanH.setPkMainplanH(pkMainplanH);
		mainplanH.setCompiledate(TimeUtil.parseDate(compiledate));
		mainplanH.setPstartdate(TimeUtil.parseDate(pstartdate));
		mainplanH.setPenddate(TimeUtil.parseDate(penddate));
		
//		将数据插入数据库
		isMainPlanHService.updateByPrimaryKey(mainplanH);
		
		
		
		
		
//		创建主计划字表实体类用来接收数据
		IsMainplanB mainplanB = new IsMainplanB();
		
//		获取主数据子表表单数据列表
		List<Integer> planpkmainblist = form.getPkmainplanb();
		List<String> plancodelist = form.getPlancode();
		List<String> plannamelist = form.getPlanname();
		List<String> spstartdatelist = form.getSpstartdate();
		List<String> spenddatelist = form.getSpenddate();
		List<String> splancyclelist = form.getSplancycle();
		List<String> spmnumlist = form.getSpmnum();
		List<String> spmdayslist = form.getSpmdays();
		List<String> simnumlist = form.getSimnum();
		List<String> simdayslist = form.getSimdays();
		List<String> alldayslist = form.getAlldays();
		List<String> ufrolelist = form.getUfrole();
		List<String> custrolelist = form.getCustrole();
		List<String> servicecontentlist = form.getServicecontent();
		List<String> ufdocumentlist = form.getUfdocument();
		List<String> sremarklist = form.getSremark();
		
		
//		将list数据循环插入实体类mainplanB
		if(!StringUtils.isEmpty(plancodelist)){
			
			for (int i = 0; i < plancodelist.size(); i++) {
				mainplanB.setPkMainplanH(pkMainplanH);
				mainplanB.setPkMainplanB(planpkmainblist.get(i));
				mainplanB.setPlancode(plancodelist.get(i));
				mainplanB.setPlanname(plannamelist.get(i));
				mainplanB.setSpstartdate(TimeUtil.parseDate(spstartdatelist.get(i)));
				mainplanB.setSpenddate(TimeUtil.parseDate(spenddatelist.get(i)));
				mainplanB.setSplancycle(splancyclelist.get(i));
				mainplanB.setSpmnum(spmnumlist.get(i));
				mainplanB.setSpmdays(spmdayslist.get(i));
				mainplanB.setSimnum(simnumlist.get(i));
				mainplanB.setSimdays(simdayslist.get(i));
				mainplanB.setAlldays(alldayslist.get(i));
				mainplanB.setUfrole(ufrolelist.get(i));
//				mainplanB.setUfmember(ufmemberlist.get(i));
				mainplanB.setCustrole(custrolelist.get(i));
				mainplanB.setServicecontent(servicecontentlist.get(i));
				mainplanB.setUfdocument(ufdocumentlist.get(i));
				mainplanB.setSremark(sremarklist.get(i));
				isMainPlanBService.updateByMainplanH(mainplanB);
			}
		}
		return "redirect:mainplanlist";
	}
	
}
