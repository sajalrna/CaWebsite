package com.sajal.cawebsite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sajal.cawebsite.dao.ServiceDAO;
import com.sajal.cawebsite.model.Service;

@Controller
public class ServiceController {

	@Autowired
	Service service;

	@Autowired
	ServiceDAO serviceDAO;

	@RequestMapping("/serviceForm")
	public String serviceForm(Model model) {
		model.addAttribute("service", service);
		model.addAttribute("serviceList", serviceDAO.service());
		return "/admin/adminService";
	}

	@RequestMapping(value = "/registerService", method = RequestMethod.POST)
	String insertBrand(@Valid @ModelAttribute("service") Service s, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("serviceList", serviceDAO.service());
			return "forward:/serviceForm";
		} else {
			if (s.getId() == 0)
				this.serviceDAO.save(s);
			else
				this.serviceDAO.update(s);
			model.addAttribute("service", new Service());
		}
		model.addAttribute("serviceList", this.serviceDAO.service());
		return "/admin/adminService";
	}

	@RequestMapping("/deleteService/{id}")
	public String deleteService(@PathVariable("id") int id) {
		this.serviceDAO.delete(id);
		return "redirect:/serviceForm";
	}

	@RequestMapping("/editService/{id}")
	public String editService(@PathVariable("id") int id, Model model) {
		model.addAttribute("service", serviceDAO.getServiceByID(id));
		model.addAttribute("serviceList", this.serviceDAO.service());
		return "/admin/adminService";

	}
}
