package com.devsuperior.desafio_aula.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

	public Double verificarFrete(Double valorPedido) {

		if (valorPedido > 200) {
			return 0.0;
		} else if (valorPedido <= 200.00 && valorPedido >= 100.00) {
			return 12.0;
		}

		return 20.00;
	}

}
