package com.cts.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.dao.categorydao;
import com.cts.model.CategoryBean;

@Controller
public class AdminController {
	
	@Autowired
	private categorydao cdao;
	
	@RequestMapping(value="/addorview",method=RequestMethod.GET)
	public String addorView() {
		
		return "addorview";
	}
	

	
}
