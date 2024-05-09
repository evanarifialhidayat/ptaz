package com.app.interview.ptaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.interview.ptaz.model.UserLogin;
import com.app.interview.ptaz.repo.UserLoginRepo;
import com.app.interview.ptaz.services.UserLoginService;
import com.app.interview.ptaz.util.ParamPath;

@Controller
@RequestMapping(value = com.app.interview.ptaz.util.ParamPath.PATH_WEB_INTERVIEW_PTAZ_USER)
public class UserController {
	@Autowired UserLoginService userLoginService;
	@Autowired UserLoginRepo userLoginRepo;

	    @GetMapping(value = com.app.interview.ptaz.util.ParamPath.PATH_WEB_INTERVIEW_PTAZ_FORM)
	    public String registrasi(Model model){	   
	    	return "ptaz_registrasi_form";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ_CREATE)
		public String formsave(@ModelAttribute("name") UserLogin forminput, Model model) {
	    	userLoginService.saveData(forminput);
	    	return "redirect:/user"+ParamPath.PATH_WEB_INTERVIEW_PTAZ_LIST;
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ_UPDATE)
  		public String formupdate(@ModelAttribute("name") UserLogin forminput, Model model) {
	    	userLoginService.updateData(forminput);
  	        return "redirect:/user"+ParamPath.PATH_WEB_INTERVIEW_PTAZ_LIST;
  	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ_LIST)
	    public String formlist(Model model){
	    	
            JSONArray arr = new JSONArray();
            UserLogin obj = new UserLogin();
	        List listParam = (List<UserLogin>) userLoginRepo.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (UserLogin) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	    	return "ptaz_registrasi_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_PTAZ_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	UserLogin obj = new UserLogin();
	        obj.setId_seq(Long.parseLong(id));
	        userLoginService.deleteData(obj);
	        return "redirect:/user"+ParamPath.PATH_WEB_INTERVIEW_PTAZ_LIST;
	    }

}
