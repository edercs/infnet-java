package br.edu.infnet.mypet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mypet.model.service.VacinaService;

@Controller
public class VacinaController {

	@Autowired
	private VacinaService vacinaService;
	
	@GetMapping(value = "/vacina/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", vacinaService.obterLista());

		return "vacina/lista";
	}
	
	@GetMapping(value = "/vacina/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		vacinaService.excluir(id);
		
		return "redirect:/vacina/lista";
	}
}
