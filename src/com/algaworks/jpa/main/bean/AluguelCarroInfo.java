package com.algaworks.jpa.main.bean;

import com.algaworks.jpa.main.modelo.Carro;

import java.math.BigDecimal;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 10/08/17 - 20:08
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/
public class AluguelCarroInfo {

	private Carro carro;
	private Long totalAlugueis;
	private BigDecimal valorMaximo;
	private BigDecimal valorMedio;

	/*
	ficar atendo ao tipo BigDecimal na classe, mas number no construtor
	 */

	public AluguelCarroInfo(Carro carro, Long valorTotal, Number valorMaximo, Number valorMedio) {
		this.carro = carro;
		this.totalAlugueis = valorTotal;
		this.valorMaximo = BigDecimal.valueOf((Double) valorMaximo);
		this.valorMedio = BigDecimal.valueOf((Double) valorMedio);
	}

	public Carro getCarro() {
		return carro;
	}

	public Long getTotalAlugueis() {
		return totalAlugueis;
	}

	public BigDecimal getValorMaximo() {
		return valorMaximo;
	}

	public BigDecimal getValorMedio() {
		return valorMedio;
	}
}
