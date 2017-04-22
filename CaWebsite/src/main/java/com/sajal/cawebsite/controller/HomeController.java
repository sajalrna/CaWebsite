package com.sajal.cawebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.cawebsite.dao.AssociateDAO;
import com.sajal.cawebsite.dao.PartnerDAO;
import com.sajal.cawebsite.dao.ServiceDAO;

@Controller
public class HomeController {

	@Autowired
	PartnerDAO partnerDAO;
	
	@Autowired
	AssociateDAO associateDAO;
	
	@Autowired
	ServiceDAO serviceDAO;

	@RequestMapping("/")
	public ModelAndView showStart() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("serviceList", serviceDAO.service());
		return mv;
	}

	@RequestMapping("home")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("serviceList", serviceDAO.service());
		return mv;
	}

	@RequestMapping("partners")
	public ModelAndView showPartners(Model model) {
		ModelAndView mv = new ModelAndView("/partners");
		model.addAttribute("partnerList", partnerDAO.partner());
		return mv;
	}

	@RequestMapping("associates")
	public ModelAndView showAssociates(Model model) {
		ModelAndView mv = new ModelAndView("/associates");
		model.addAttribute("associateList", associateDAO.associate());
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
