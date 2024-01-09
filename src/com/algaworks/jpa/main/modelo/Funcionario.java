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
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Pessoa {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
