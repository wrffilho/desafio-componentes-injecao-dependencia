package com.devsuperior.desafio_aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio_aula.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService calculateShippingService;

	public Double total(Order order) {
		Double discount = calculateDiscount(order.getBasic(), order.getDiscount());
		Double shipment = calculateShippingService.shipment(order);
		Double total =  (order.getBasic() + shipment) - (discount);
		return total;
	}

	private Double calculateDiscount(Double valorPedido, Double valorDesconto) {

		return (valorDesconto / 100) * valorPedido;
	}

}
