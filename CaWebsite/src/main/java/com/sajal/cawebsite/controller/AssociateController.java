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

import com.sajal.cawebsite.dao.AssociateDAO;
import com.sajal.cawebsite.model.Associate;

@Controller
public class AssociateController {

	@Autowired
	Associate associate;

	@Autowired
	AssociateDAO associateDAO;

	@RequestMapping("/associateForm")
	public String associateForm(Model model) {
		model.addAttribute("associate", associate);
		model.addAttribute("associateList", associateDAO.associate());
		return "/admin/adminAssociate";
	}

	@RequestMapping(value = "/registerAssociate", method = RequestMethod.POST)
	String insertBrand(@Valid @ModelAttribute("associate") Associate a, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("associateList", associateDAO.associate());
			return "forward:/associateForm";
		} else {
			if (a.getId() == 0)
				this.associateDAO.save(a);
			else
				this.associateDAO.update(a);
			model.addAttribute("associate", new Associate());
		}
		model.addAttribute("associateList", this.associateDAO.associate());
		return "/admin/adminAssociate";
	}

	@RequestMapping("/deleteAssociate/{id}")
	public String deleteAssociate(@PathVariable("id") int id) {
		this.associateDAO.delete(id);
		return "redirect:/associateForm";
	}

	@RequestMapping("/editAssociate/{id}")
	public String editAssociate(@PathVariable("id") int id, Model model) {
		model.addAttribute("associate", associateDAO.getAssociateByID(id));
		model.addAttribute("associateList", this.associateDAO.associate());
		return "/admin/adminAssociate";

	}
}
