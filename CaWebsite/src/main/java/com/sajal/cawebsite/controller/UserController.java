package com.sajal.cawebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.cawebsite.dao.UserDAO;
import com.sajal.cawebsite.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;

	@Autowired(required = true)
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
/*
	@RequestMapping("register")
	public ModelAndView showRegister() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("RegisterClicked", "true");
		mv.addObject("user", new User());
		return mv;
	}
*/
	@RequestMapping("/registerUser")
	public ModelAndView userAdd(@ModelAttribute("user") User u) {
		ModelAndView mv = new ModelAndView("/Home");
		userDAO.save(u);
		return mv;
	}
}
