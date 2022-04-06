/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${3/29/2022}
 */

package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.gunInfo;
import dmacc.repository.gunRepository;

@Controller
public class WebController {
	@Autowired
	gunRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllGuns(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewGun(model);
		}
		
		model.addAttribute("gunInfo", repo.findAll());
		return "results";
	}

	@GetMapping("/inputGun")
	public String addNewGun(Model model) {
		
		gunInfo g = new gunInfo();
		model.addAttribute("newGun", g);
		return "input";
			
	}

	@GetMapping("/edit/{id}")
	public String showUpdateGun(@PathVariable("id") long id, Model model) {
		gunInfo g = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + g.toString());
		model.addAttribute("newGun", g);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseGun(gunInfo g, Model model) {
		
		if (g.getCompany() == "") {
			return addNewGun(model);
		}
		if (g.getType() == "") {
			addNewGun(model);
		}
		if (g.getAmmo() == "") {
			return addNewGun(model);
		}
		
		repo.save(g);
		return viewAllGuns(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteGun(@PathVariable("id") long id, Model model) {
		gunInfo g = repo.findById(id).orElse(null);
	    repo.delete(g);
	    return viewAllGuns(model);
	}
	
	
}
