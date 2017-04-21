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

import com.sajal.cawebsite.dao.PartnerDAO;
import com.sajal.cawebsite.model.Partner;

@Controller
public class PartnerController {

	@Autowired
	Partner partner;

	@Autowired
	PartnerDAO partnerDAO;

	@RequestMapping("partnerForm")
	public String partnerForm(Model model) {
		model.addAttribute("partner", partner);
		model.addAttribute("partnerList", partnerDAO.partner());
		return "/admin/adminPartner";
	}

	@RequestMapping(value = "/registerPartner", method = RequestMethod.POST)
	String insertBrand(@Valid @ModelAttribute("partner") Partner p, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("partnerList", partnerDAO.partner());
			return "forward:/partnerForm";
		} else {
			if (p.getId() == 0)
				this.partnerDAO.save(p);
			else
				this.partnerDAO.update(p);
			model.addAttribute("partner", new Partner());
		}
		model.addAttribute("partnerList", this.partnerDAO.partner());
		return "/admin/adminPartner";
	}

	@RequestMapping("/deletePartner/{id}")
	public String deletePartner(@PathVariable("id") int id) {
		this.partnerDAO.delete(id);
		return "redirect:/partnerForm";
	}

	@RequestMapping("/editPartner/{id}")
	public String editPartner(@PathVariable("id") int id, Model model) {
		partner = partnerDAO.getPartnerByID(id);
		return "/admin/adminPartner";

	}

}
