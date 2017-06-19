package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBProduct;
import com.yongyou.iSupport.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("addproduct")
	public String addProduct(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		return "ProductForm";
	}
	
	
	@RequestMapping("saveproduct")
	public String saveProduct(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		productService.insert(record);
		return "redirect:productlist";
	}
	
	@RequestMapping("productlist")
	public String productList(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		List<IsBProduct> prolist = productService.findList(record);
		model.addAttribute("prolist",prolist);
		return "ProductList";
	}
	
	@RequestMapping("deleteproduct")
	public String deleteProduct(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		productService.deleteByPrimaryKey(pkProduct);
		return "redirect:productlist";
	}
	
	@RequestMapping("toupdate")
	public String toUpdate(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		IsBProduct product = productService.selectByPrimaryKey(pkProduct);
		model.addAttribute("product",product);
		return "UpdateProductForm";
	}
	
	@RequestMapping("saveupdate")
	public String saveUpdate(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		productService.updateByPrimaryKey(record);
		return "redirect:productlist";
	}
	
	@RequestMapping("productdetail")
	public String productdetail(HttpServletRequest request,HttpServletResponse response,Model model,IsBProduct record,Integer pkProduct){
		IsBProduct product = productService.selectByPrimaryKey(pkProduct);
		model.addAttribute("product",product);
		return "ProductDetail";
	}
}
