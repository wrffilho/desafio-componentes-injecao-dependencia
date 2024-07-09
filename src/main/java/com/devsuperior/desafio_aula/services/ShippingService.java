package com.devsuperior.desafio_aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio_aula.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {

		if (order.getBasic() > 200) {
			return 0.0;
		} else if (order.getBasic() <= 200.00 && order.getBasic() >= 100.00) {
			return 12.0;
		}

		return 20.00;
	}

}
