package br.edu.infnet.mypet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mypet.model.service.ConsultaService;

@Controller
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping(value = "/consulta/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", consultaService.obterLista());

		return "consulta/lista";
	}
	
	@GetMapping(value = "/consulta/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		consultaService.excluir(id);
		
		return "redirect:/consulta/lista";
	}
}
