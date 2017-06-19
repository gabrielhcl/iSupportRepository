package com.yongyou.iSupport.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.xmlrpc.base.Array;
import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.entity.EchartsEntity;
import com.yongyou.iSupport.entity.IsBCorp;
import com.yongyou.iSupport.entity.IsBGroup;
import com.yongyou.iSupport.entity.IsBProduct;
import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.form.IsBProjectForm;
import com.yongyou.iSupport.service.AreaService;
import com.yongyou.iSupport.service.CorpService;
import com.yongyou.iSupport.service.IsBGroupService;
import com.yongyou.iSupport.service.IsBProjectService;
import com.yongyou.iSupport.service.ProductService;
import com.yongyou.iSupport.utils.TimeUtil;

@Controller
@RequestMapping("project")
public class IsBProjectController {
	
	@Autowired
	private IsBProjectService isBProjectService;
	@Autowired
	private IsBGroupService isBGroupService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private CorpService corpService;
	@Autowired
	private ProductService productService;
	
	
	
	
	/*
	 * 鍓嶅彴type=鈥渄ate鈥濈被鍨嬬殑input 璧嬪��
	 */
	@RequestMapping("timetest")
	public String TimeTest(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		IsBProject project = isBProjectService.selectByPrimaryKey(5);
		model.addAttribute("project",project);
		Date date = project.getServicestime();
		String datestring = null;
		String date2 = TimeUtil.newconvertDate(date, datestring);
		System.out.println(date2);
		model.addAttribute("date2",date2);
		return "TimeTest";
	}
	
	/*
	 * 璺宠浆project娣诲姞form琛ㄥ崟 
	 */
	@RequestMapping("addproject")
	public String addProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProject record,IsBGroup group,Area area,IsBCorp corp,IsBProduct product){
		List<IsBGroup> findList = isBGroupService.findList(group);
		model.addAttribute("glist",findList);
		List<Area> findList2 = areaService.findList(area);
		model.addAttribute("alist",findList2);
		List<IsBCorp> clist = corpService.findList(corp);
		model.addAttribute("clist",clist);
		List<IsBProduct> prolist = productService.findList(product);
		model.addAttribute("prolist",prolist);
		return "projectForm";
	}
	
	
	/*
	 * 鎻掑叆project鏁版嵁
	 * 杞崲鏃ユ湡鏁版嵁绫诲瀷
	 * 瀹炵幇绫荤殑澶嶅埗
	 */
	@RequestMapping("insertproject")
	public String insertProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProjectForm record){
//		瀹炰綋绫诲鍒讹紙record澶嶅埗鍒癰ean锛�
		IsBProject bean = new IsBProject();
		BeanUtils.copyProperties(record, bean);
//		璋冪敤宸ュ叿绫绘柟娉曞皢瀛楃涓插瀷鏃堕棿杞崲涓篸ate鍨�
		Date date = TimeUtil.parseDate(record.getServicestimef());
		System.out.println(date);
		bean.setServicestime(TimeUtil.parseDate(record.getServicestimef()));
		Date date2 = bean.getServicestime();
		System.out.println(date2);
		bean.setServiceftime(TimeUtil.parseDate(record.getServiceftimef()));
		bean.setCreatedate(TimeUtil.parseDate(record.getCreatedatef()));
		System.out.println(bean);
		Integer isimplement = bean.getIsimplement();
		if(isimplement == null){
			bean.setIsimplement(0);
		}
		UUID uuid = UUID.randomUUID();
		String projectcode = uuid.toString().substring(0, 8);
		bean.setProjectcode(projectcode);
		isBProjectService.insert(bean);
		return "redirect:/project/projectlist";
	}
	
	/*
	 * 鍒楄〃鏌ヨ
	 * 妯＄硦鏌ヨ锛岃繑鍥瀙roject鍒楄〃
	 */
	@RequestMapping("projectlist")
	public String projrctList(Model model,HttpServletRequest request,HttpServletResponse response,IsBProject record){
		List<IsBProject> plist = isBProjectService.findList(record);
		model.addAttribute("plist",plist);
		return "projectList";
	}
	
	/*
	 * 鍒犻櫎project鏁版嵁
	 */
	@RequestMapping("delete")
	public String deleteProject(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		isBProjectService.deleteByPrimaryKey(pkProject);
		return "redirect:/project/projectlist";
	}
	
	
	
	
	/*
	 * 鏍规嵁id鏌ヨproject鏁版嵁
	 * 杩斿洖project淇敼椤甸潰
	 * 灏嗘暟鎹甦ate鍨嬫椂闂磋浆鍖栦负string鍨嬫椂闂达紝浠ユ柟渚垮墠鍙扮洿鎺ュ睍绀烘椂闂�
	 */
	@RequestMapping("update")
	public String updateProject(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		IsBProject project = isBProjectService.selectByPrimaryKey(pkProject);
		model.addAttribute("project",project);
		IsBGroup group = new IsBGroup();
		List<IsBGroup> glist = isBGroupService.findList(group);
		model.addAttribute("glist",glist);
		
		IsBCorp corp = new IsBCorp();
		List<IsBCorp> clist = corpService.findList(corp);
		model.addAttribute("clist",clist);
		
		
		Area area = new Area();
		List<Area> alist = areaService.findList(area);
		model.addAttribute("alist",alist);
	
		
		IsBProduct product = new IsBProduct();
		List<IsBProduct> prolist = productService.findList(product);
		model.addAttribute("prolist",prolist);
		
		String Servicestimedate = null;
		String servicestime = TimeUtil.newconvertDate(project.getServicestime(),Servicestimedate);
		
		String Serviceftimedate = null;
		String serviceftime = TimeUtil.newconvertDate(project.getServiceftime(), Serviceftimedate);
		
		String Createdatedate = null;
		String createdate = TimeUtil.newconvertDate(project.getCreatedate(), Createdatedate);
		model.addAttribute("servicestime",servicestime);
		model.addAttribute("serviceftime",serviceftime);
		model.addAttribute("createdate",createdate);
		
		return "updateProjectForm";
	}
	
	
	/*
	 * 淇敼project鏁版嵁骞惰繑鍥炲垪琛�
	 */
	@RequestMapping("saveproject")
	public String saveProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProjectForm form,Integer pkProject){
		IsBProject project = new IsBProject();
		BeanUtils.copyProperties(form, project);
		IsBProject project2 = isBProjectService.selectByPrimaryKey(pkProject);
		
		project.setProjectcode(project2.getProjectcode());
		project.setServicestime(TimeUtil.parseDate(form.getServicestimef()));
		project.setServiceftime(TimeUtil.parseDate(form.getServiceftimef()));
		project.setCreatedate(TimeUtil.parseDate(form.getCreatedatef()));
		isBProjectService.updateByPrimaryKey(project);
		return "redirect:/project/projectlist";
	}
	
	/*
	 * 鏌ヨproject璇︾粏淇℃伅
	 */
	@RequestMapping("projectdetail")
	public String projectDetail(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		IsBProject project = isBProjectService.selectByPrimaryKey(pkProject);
		String groupcode = project.getGroupcode();
		String areacode = project.getAreacode();
		IsBGroup group = isBGroupService.selectByCode(groupcode);
		Area area = areaService.selectByCode(areacode);
		model.addAttribute("group",group);
		model.addAttribute("area",area);
		model.addAttribute("project",project);
		
		
		String Servicestimedate = null;
		String servicestime = TimeUtil.newconvertDate(project.getServicestime(),Servicestimedate);
		
		String Serviceftimedate = null;
		String serviceftime = TimeUtil.newconvertDate(project.getServiceftime(), Serviceftimedate);
		
		String Createdatedate = null;
		String createdate = TimeUtil.newconvertDate(project.getCreatedate(), Createdatedate);
		model.addAttribute("servicestime",servicestime);
		model.addAttribute("serviceftime",serviceftime);
		model.addAttribute("createdate",createdate);
		
		return "projectDetail";
	}
	
	@RequestMapping("selectcountbyarea")
	public String selectcountbyarea(HttpServletRequest request,HttpServletResponse response,Model model){
		List<IsBProject> areacountlist = isBProjectService.selectcountbyarea();
		String areastring = areacountlist.toString();
		System.out.println(areastring);
		for (int i = 0; i < areastring.length(); i++) {
			char at = areastring.charAt(i);
			System.out.println(at);
			
		}
		
		int projectcount5 = isBProjectService.selectcountbyareacode("5");
		int projectcount6 = isBProjectService.selectcountbyareacode("6");
		int projectcount7 = isBProjectService.selectcountbyareacode("7");
		model.addAttribute("xibei",projectcount5);
		model.addAttribute("sichuan",projectcount6);
		model.addAttribute("xian",projectcount7);
		model.addAttribute("areacountlist",areacountlist);
		return "echartsDemo";
	}
	
	
	
	/*
	 * 测试ajax返回数据，并在前台echarts展示
	 * 统计各区域在建项目数量
	 * 柱状图
	 */
	@RequestMapping("getdata")
	@ResponseBody
	public Map<String, Object> getData(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException, IOException 
	{
		Area area = new Area();
//		获取区域列表，用于获取区域名及区域代码
		List<Area> arealist = areaService.findList(area);
//		新建数据用来存放区域名及区域项目数量数据
		String[] categories = new String[arealist.size()];
		String[] values = new String[arealist.size()];
//		循环将数据插入数组
		for (int i = 0; i < arealist.size(); i++) {
//			获取区域代码与区域名称
			String areacode = arealist.get(i).getAreacode();
			String areaname = arealist.get(i).getAreaname();
//			根据获取的区域代码搜索该区域的项目数量
			int projectcount = isBProjectService.selectcountbyareacode(areacode);
//			返回的项目数量为int型，转换为string
			String s=String.valueOf(projectcount);
//			循环插入数组
			values[i]=s;
			categories[i]=areaname;
		}
//		将数据装入map，返回到页面
        Map<String, Object> json = new HashMap<String, Object>();    
        json.put("categories", categories);    
        json.put("values", values);    
        return json;
	}
	
	
	
	
	/*
	 * 测试ajax返回数据，并在前台echarts展示
	 * 统计各区域在建项目数量
	 * 饼状图
	 */
	@RequestMapping("getpiedata")
	@ResponseBody
	public Map<String, Object> getPieData(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException, IOException 
	{
		Area area = new Area();
		List<Area> arealist = areaService.findList(area);
		String[] areanamelist = new String[arealist.size()];
		String[] categories = new String[arealist.size()];
		String[] values = new String[arealist.size()];
//		循环将数据插入数组
		for (int i = 0; i < arealist.size(); i++) {
			String areacode = arealist.get(i).getAreacode();
			String areaname = arealist.get(i).getAreaname();
//			根据获取的区域代码搜索该区域的项目数量
			int projectcount = isBProjectService.selectcountbyareacode(areacode);
//			返回的项目数量为int型，转换为string
			String s=String.valueOf(projectcount);
//			循环插入数组
			values[i]=s;
			categories[i]=areaname;
		    areanamelist[i]=areaname;
		}
//		将数据装入map，返回到页面
		 Map<String, Object> json = new HashMap<String, Object>();    
	        json.put("categories", categories);    
	        json.put("values", values);    
	        json.put("areanamelist", areanamelist);
	        return json;
	}
}
