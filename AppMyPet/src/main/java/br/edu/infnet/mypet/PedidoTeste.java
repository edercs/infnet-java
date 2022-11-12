package br.edu.infnet.mypet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Cliente;
import br.edu.infnet.mypet.model.domain.Consulta;
import br.edu.infnet.mypet.model.domain.Pedido;
import br.edu.infnet.mypet.model.domain.Servico;
import br.edu.infnet.mypet.model.domain.Usuario;
import br.edu.infnet.mypet.model.service.PedidoService;


@Order(7)
@Component
public class PedidoTeste implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("########## Cadastramento de Pedidos ##########");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Consulta consulta = new Consulta();
		consulta.setId(1);
	

		Cliente c1 = new Cliente();
		c1.setId(1);
		
		List<Servico> servicosPrimeiroPedido = new ArrayList<Servico>();
		servicosPrimeiroPedido.add(consulta);
		
		List<Servico> servicosDemaisPedidos = new ArrayList<Servico>();
		servicosDemaisPedidos.add(consulta);

		Pedido p1 = new Pedido(c1);		
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		p1.setServicos(servicosPrimeiroPedido);
		p1.setUsuario(usuario);
		pedidoService.incluir(p1);
		
		Pedido p2 = new Pedido();
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		p2.setCliente(c1);
		p2.setServicos(servicosDemaisPedidos);
		p2.setUsuario(usuario);
		pedidoService.incluir(p2);
		
		Cliente c2 = new Cliente();		
		c2.setId(2);

		Pedido p3 = new Pedido();
		p3.setDescricao("Terceiro pedido");
		p3.setCliente(c2);
		p3.setServicos(servicosDemaisPedidos);
		p3.setUsuario(usuario);
		pedidoService.incluir(p3);
	}
}
