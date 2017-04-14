package com.yongyou.iSupport.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

//import com.yongyou.iSupport.service.impl.TestService;


@Controller
@RequestMapping("test")
public class TestController{
	
//	
//	Gson gson = new Gson();
//	Map map = gson.fromJson(data, Map.class);
	
	private static final long serialVersionUID = 1L;
	
	public TestController() {
        // TODO Auto-generated constructor stub
    }
	
	
	@RequestMapping(value="testtable")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("opid");
		data=new String(data.getBytes("ISO-8859-1"), "UTF-8");
		JSON json = JSON.parseObject(data);

	}
}