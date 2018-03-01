package org.wecancodeit.virtualpetthymeleaf;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

	@Resource
	VirtualPetRepository virtualPetRepo;

	@RequestMapping("/pets")
	public String getAllPets(Model model) {
		model.addAttribute("pets", virtualPetRepo.findAll());
		return "pets";
	}

}
