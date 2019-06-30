package org.etudiant.portail.controller;

import javax.validation.Valid;

import org.etudiant.portail.model.Student;
import org.etudiant.portail.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Student")
public class EtudiantController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/inscriptionTC")
	public String index(Model model) {
		model.addAttribute("categorie", new Student());
		return "sinscrire_tronc_c";
	}
	@RequestMapping("/sinscrire_tronc_c")
	public String enregietrer( @Valid Student std,Model model) {
			service.addStudent(std.getCin_std(), std.getCne_std(), std.getName_std(), std.getFirst_name_std(), std.getBirth_date(),std.getEmail_std(), std.getAddress_std(), std.getSpinneret(), std.getUniversity_level(),null);
			return"succes";
	}
}
