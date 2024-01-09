package com.algaworks.jpa.main.modelo;

import javax.persistence.*;
import java.util.Date;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 07/08/17 - 16:32
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoPessoa", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	private String cpf;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Pessoa)) {
			return false;
		}

		Pessoa pessoa = (Pessoa) o;

		return getCodigo() != null ? getCodigo().equals(pessoa.getCodigo()) : pessoa.getCodigo() == null;
	}

	@Override
	public int hashCode() {
		return getCodigo() != null ? getCodigo().hashCode() : 0;
	}

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
