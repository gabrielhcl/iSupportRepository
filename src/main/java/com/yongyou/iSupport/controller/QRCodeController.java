package com.yongyou.iSupport.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.zxing.WriterException;
import com.yongyou.iSupport.utils.QRCodeUtils;

@Controller
@RequestMapping("qrcode")
public class QRCodeController {

	@RequestMapping("code")
	public ResponseEntity<byte[]> downloadIOSAPPController(@RequestParam(required = true)String type)  
	           throws WriterException, IOException{  
//	       InputStream is = this.getClass().getClassLoader().getResourceAsStream("app.properties");  
//	       Properties props = new Properties();  
//	       props.load(is);  
//	       String appId = (String)props.get(type);  
	       String url = "http://192.168.1.104/iSupport/jsp/page/login.jsp";  
	       return QRCodeUtils.getResponseEntity(url, 150, 150, "png");  
	   }  
	
	@RequestMapping("controllercode")
	public ResponseEntity<byte[]> controllerCode(@RequestParam(required = true)String type)  
	           throws WriterException, IOException{  
//	       InputStream is = this.getClass().getClassLoader().getResourceAsStream("app.properties");  
//	       Properties props = new Properties();  
//	       props.load(is);  
//	       String appId = (String)props.get(type);  
	       String url = "http://192.168.1.104/iSupport/news/newsmain";  
	       return QRCodeUtils.getResponseEntity(url, 150, 150, "png");  
	   }  
}
