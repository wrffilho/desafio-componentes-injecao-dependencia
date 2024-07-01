package com.devsuperior.desafio_aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio_aula.entities.Pedido;
import com.devsuperior.desafio_aula.services.PedidoService;

@SpringBootApplication
public class DesafioAulaApplication implements CommandLineRunner {

    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        SpringApplication.run(DesafioAulaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Pedido pedido = new Pedido();

            System.out.print("Digite o código do pedido: ");
            Long codigo = scanner.nextLong();
            pedido.setCodigo(codigo);

            System.out.print("Digite o valor básico do pedido: ");
            Double valorBasico = scanner.nextDouble();
            pedido.setValorBasico(valorBasico);

            System.out.print("Digite o valor de desconto do pedido: ");
            Double valorDesconto = scanner.nextDouble();
            pedido.setValorDesconto(valorDesconto);

            Double total = pedidoService.calcularTotalPedido(pedido);

            System.out.println("Pedido criado com sucesso!");
            System.out.println("Código: " + pedido.getCodigo());
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
