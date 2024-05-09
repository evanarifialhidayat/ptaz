package com.app.interview.ptaz.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.interview.ptaz.util.ParamPath;

@Controller
public class IndexController {
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	return "ptaz";
	    }	    
	    @GetMapping(value = ParamPath.PATH_DEFAULTH)
	    public String home_1(Model model){
	    	return "ptaz";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ)
	    public String home_2(Model model){
	    	return "ptaz";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ_DASHBOARD)
	    public String home_3(Model model){
//	    	System.out.println("=========2==22222222========");
//	    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    	return "ptaz";
	    }
}
