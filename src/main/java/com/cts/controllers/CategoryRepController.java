package com.cts.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.dao.categoryRepdao;
import com.cts.model.CategoryRepBean;

@Controller
public class CategoryRepController {
	
	@Autowired
	private categoryRepdao crdao;
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String toMain() {
		return "main";
	}
	
	
	@RequestMapping(value="/Admin",method=RequestMethod.GET)
	public String toAdmin() {
		return "Admin";
	}
	
	@RequestMapping(value="/CategoryRepRegister",method=RequestMethod.GET)
	public String CategoryPage(@ModelAttribute("categoryRep")CategoryRepBean categoryRep) {
		
		return "categoryRep";
	}
	
	@PostMapping("/addCategoryRep")
	public String AddCategoryRep(@ModelAttribute("categoryRep")CategoryRepBean categoryRep,BindingResult br,HttpSession session){
		
		crdao.save(categoryRep);
		
		session.setAttribute("categoryRep", categoryRep);
		return "CategoryPage";
	}
	
	
	/*
	 * @InitBinder public void handleDate(WebDataBinder binder) {
	 * 
	 * SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	 * 
	 * 
	 * 
	 * CustomDateEditor cde=new CustomDateEditor(sdf, false);
	 * 
	 * binder.registerCustomEditor(Date.class,cde);
	 * 
	 * System.out.println("dsddsds");
	 * 
	 * 
	 * }
	 */

}
