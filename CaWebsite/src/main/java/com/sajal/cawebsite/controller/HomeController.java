package com.sajal.cawebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView showStart() {
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}

	@RequestMapping("home")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}

	@RequestMapping("partners")
	public ModelAndView showPartners() {
		ModelAndView mv = new ModelAndView("/partners");
		return mv;
	}

	@RequestMapping("associates")
	public ModelAndView showAssociates() {
		ModelAndView mv = new ModelAndView("/associates");
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("LoginClicked", "true");
		return mv;
	}

	@RequestMapping("logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}
}
