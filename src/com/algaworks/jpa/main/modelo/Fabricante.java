package com.algaworks.jpa.main.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 05/08/17 - 17:48
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/
@Entity
public class Fabricante {


	/**
	 * O tipo GenerationType.AUTO o JPA que escolhe o tipo dependendo do banco de dados.
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private String nome;


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Fabricante)) {
			return false;
		}

		Fabricante that = (Fabricante) o;

		return getCodigo().equals(that.getCodigo());
	}

	@Override
	public int hashCode() {
		return getCodigo().hashCode();
	}
}
