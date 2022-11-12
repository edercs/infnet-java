package br.edu.infnet.mypet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.mypet.model.domain.Pedido;
import br.edu.infnet.mypet.model.domain.Usuario;
import br.edu.infnet.mypet.model.service.ClienteService;
import br.edu.infnet.mypet.model.service.PedidoService;
import br.edu.infnet.mypet.model.service.ServicoService;


@Controller
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ServicoService servicoService;

	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("clientes", clienteService.obterLista(usuario));

		model.addAttribute("servicos", servicoService.obterLista(usuario));
		
		return "pedido/cadastro";
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pedidoService.obterLista(usuario));

		return "pedido/lista";
	}
	
	@PostMapping(value = "/pedido/incluir")
	public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Cliente: " + pedido.getCliente());		
		System.out.println("Servicos: " + pedido.getServicos());
		
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
		
		return "redirect:/pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		pedidoService.excluir(id);
		
		return "redirect:/pedido/lista";
	}
}
