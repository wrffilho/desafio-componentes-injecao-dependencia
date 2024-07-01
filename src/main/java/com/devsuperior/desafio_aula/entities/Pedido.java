package com.devsuperior.desafio_aula.entities;

public class Pedido {

	private Long codigo;
	private Double valorBasico;
	private Double valorDesconto;
	private Double valorTotal;
	private Double valorFrete;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(Double valorBasico) {
		this.valorBasico = valorBasico;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

}