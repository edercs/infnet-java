package br.edu.infnet.mypet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.mypet.model.domain.Cliente;
import br.edu.infnet.mypet.model.domain.Usuario;
import br.edu.infnet.mypet.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", clienteService.obterLista());

		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		clienteService.excluir(id);
		
		return "redirect:/cliente/lista";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}
	
	
}
