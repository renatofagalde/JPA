package com.algaworks.jpa.main.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 07/08/17 - 16:36
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/

@Entity
@DiscriminatorValue("MOTORISATA")
public class Motorista extends Pessoa {

	private String numeroCNH;

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
}
