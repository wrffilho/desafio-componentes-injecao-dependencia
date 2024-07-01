package com.devsuperior.desafio_aula.services;

import org.springframework.stereotype.Service;

@Service
public class DescontoService{
	
	
	public Double calcularDesconto(Double valorPedido, Double valorDesconto){
		
		return (valorDesconto/100) * valorPedido;
	}
	
	

}
