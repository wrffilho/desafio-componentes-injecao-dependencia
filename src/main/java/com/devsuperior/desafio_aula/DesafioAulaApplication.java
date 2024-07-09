package com.devsuperior.desafio_aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio_aula.entities.Order;
import com.devsuperior.desafio_aula.services.OrderService;

@SpringBootApplication
public class DesafioAulaApplication implements CommandLineRunner {

    @Autowired
    private OrderService pedidoService;

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        SpringApplication.run(DesafioAulaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Order order = new Order();

            System.out.print("Digite o código do pedido: ");
            Long code = scanner.nextLong();
            order.setCode(code);

            System.out.print("Digite o valor básico do pedido: ");
            Double basic = scanner.nextDouble();
            order.setBasic(basic);

            System.out.print("Digite o valor de desconto do pedido: ");
            Double discount = scanner.nextDouble();
            order.setDiscount(discount);

            Double total = pedidoService.total(order);

            System.out.println("Pedido criado com sucesso!");
            System.out.println("Código: " + order.getCode());
            System.out.println("Valor Total: " + total);

            System.out.print("Deseja calcular outro pedido? (s/n): ");
            scanner.nextLine(); 
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
