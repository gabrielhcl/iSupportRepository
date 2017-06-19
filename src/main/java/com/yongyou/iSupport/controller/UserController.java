package com.yongyou.iSupport.controller;


import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.AreaService;
import com.yongyou.iSupport.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AreaService areaService;
	
	
	@RequestMapping(value="logout")
	public String logout(HttpServletRequest request,HttpServletResponse response){
		return "login";
	}
	
	
	/*
	 * 鐧诲綍鍔熻兘
	 */
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession httpsession){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		User user2 = new User();
		List<User> ulist = userService.findList(user2);
		
		user= userService.selectByNameAndPwd(user);
		if(user !=null){
			model.addAttribute("user",user);
			httpsession.setAttribute("user", user);
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/yonyou-map.jsp");
			System.out.println(request.getContextPath() + "/yonyou-map.jsp");
			httpsession.setAttribute("user", user);
			model.addAttribute("ulist",ulist);
			return "index";
		}else{
			String loginfailed = "鐧婚檰澶辫触锛岃閲嶆柊杈撳叆鐢ㄦ埛鍚嶄笌瀵嗙爜";
			model.addAttribute("loginfailed",loginfailed);
			return "login";
		}
	}
	
	/*
	 * 鐐瑰嚮娉ㄥ唽璺宠浆娉ㄥ唽鍔熻兘
	 */
	@RequestMapping("regist")
	public String regist(HttpServletRequest request,HttpServletResponse response,Area area,Model model){
		List<Area> alist = areaService.findList(area);
		model.addAttribute("alist",alist);
		return "userRegistForm";
	}
	/*
	 * 娉ㄥ唽瀹屾垚杩斿洖鐧诲綍椤�
	 */
	@RequestMapping("insertuser")
	public String insertUser(User user,HttpServletRequest request,HttpServletResponse response,Model model){
		if(user.getDef1()==""){
			user.setDef1("defaultimg.jpg");
		}
		userService.insertUser(user);
		
		return "login";
	}
	
	
	@RequestMapping("updatepassword")
	public String updatePassword(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session){
		User user = (User) session.getAttribute("user");
//		String password = user.getPassword();
//		String username = user.getUsername();
//		String userphone = user.getUserphone();
		model.addAttribute("user",user);
		return "updatePwd";
	}
	
	@RequestMapping("changepassword")
	public String changepassword(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session,String password){
		User user = (User) session.getAttribute("user");
		user.setPassword(password);
		userService.updateByPrimaryKey(user);
		return "UpdatePwdSuccess";
	}
	
	@RequestMapping("userlist")
	public String userList(HttpServletRequest request,HttpServletResponse response,Model model,User user){
		List<User> ulist = userService.findList(user);
		model.addAttribute("ulist",ulist);
		return "index";
	}
	
	
	@RequestMapping("checkPwd")
	@ResponseBody
	public String checkPwd(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session,String oldpassword){
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		String password1 = user.getPassword();
		User user2 = new User();
		user2.setUsername(username);
		user2.setPassword(oldpassword);
		User user3 = userService.selectByNameAndPwd(user2);
		if(user3 == null){
			return JSON.toJSONString("error");
		}else{
			String password2 = user3.getPassword();
			if(password2.equals(password1)){
				return JSON.toJSONString("success");
			}else{
				return JSON.toJSONString("error");
			}
		}
	}
	
	@RequestMapping("getusername")
	public String getusername(HttpServletRequest request,HttpServletResponse response,Model model,String employName){
		System.out.println(employName);
		return null;
	}
	
	/*
	 * 上传头像
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "text/html; charset=UTF-8") 
	@ResponseBody
    public String upload(HttpServletRequest request,@RequestParam(value = "upfile", required = false) MultipartFile upfile) {
        String path = "F:/iSupportFile/uploadfile/portrait"; 
        UUID uuid = UUID.randomUUID();
        String substring = uuid.toString().substring(0, 8);
        String fileName = substring+upfile.getOriginalFilename();  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }   try {  
        	upfile.transferTo(targetFile);
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
           return fileName;
    } 
}
