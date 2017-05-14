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
		model.addAttribute("projectname",projectname);
		User user = (User) session.getAttribute("user");
		model.addAttribute("user",user);
		return "startingPlanForm";
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
}
