package com.cts.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.dao.categorydao;
import com.cts.model.CategoryBean;

@Controller
public class CategoryController {

	@Autowired
	private categorydao cdao;
	
	@RequestMapping(value="/ViewCategory",method=RequestMethod.GET)
	public String ViewCategory(Model m) {
		
		List<CategoryBean> opt= cdao.findAll();
		
		System.out.println("Category ID : Category Name");
		for(CategoryBean cb:opt){
			System.out.println("\n" + cb.getCategoryId());
			System.out.print(" === " + cb.getCategory());
		}
		
		m.addAttribute("course", opt);
			
		return "ViewCategory";
	}
	
		
	@RequestMapping(value="/addCategory",method=RequestMethod.GET)
	public String addCategory(@ModelAttribute("category")CategoryBean category) {
		
		return "addCategory";
	}
	
	@RequestMapping(value="/updateCategoryPage",method=RequestMethod.GET)
	public String updateCoursePage(@RequestParam("cid")Integer cid,Model m) {
		
		System.out.println(cid);
		
		Optional<CategoryBean> opt= cdao.findById(cid);
		
		CategoryBean category=opt.get();
		
//		m.addAttribute("login", new CategoryBean());
		
		m.addAttribute("course", category);
		m.addAttribute("category", category);
		
		return "updateCategoryPage";
		
	}
	
	@PostMapping("/updateCategory")
	public String updateCourse(CategoryBean cat,BindingResult br,Model m) {
		
		m.addAttribute("category", cat);
		
		cdao.save(cat);
		
		return "updateSuccess";
		
		}
	
	
	
	@PostMapping("/result")
	public String addtoDB(CategoryBean cat,Model m) {
		
		m.addAttribute("category", cat);
		
		
		cdao.save(cat);
		
		return "result";
	}
}
