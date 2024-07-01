package com.devsuperior.desafio_aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio_aula.entities.Pedido;

@Service
public class PedidoService {

	@Autowired
	private DescontoService descontoService;

	@Autowired
	private FreteService freteService;

	public Double calcularTotalPedido(Pedido pedido) {
		Double valorDesconto = descontoService.calcularDesconto(pedido.getValorBasico(), pedido.getValorDesconto());
		Double valorFrete = freteService.verificarFrete(pedido.getValorBasico());
		Double total = pedido.getValorBasico() - valorDesconto + valorFrete;
		pedido.setValorTotal(total);
		pedido.setValorFrete(valorFrete);

		return pedido.getValorTotal();

	}

}
