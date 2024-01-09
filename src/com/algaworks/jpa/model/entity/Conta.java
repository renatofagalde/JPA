package com.algaworks.jpa.model.entity;

import javax.persistence.*;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 04/08/17 - 11:34
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/
@Entity
@Table
public class Conta {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long codigo;
	private Double saldo;

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
