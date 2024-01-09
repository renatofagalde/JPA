package com.algaworks.jpa.main.modelo;

import javax.persistence.*;

/**
 * Power by Intellij IDEA
 * <p>
 * Version information (versionamento)
 * <p>
 * Date 07/08/17 - 10:56
 * <p>
 * author renatofagalde
 * <p>
 * What this class does renatofagalde ?
 **/

@Entity
public class ModeloCarro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private String descricao;

	@ManyToOne
	private Fabricante fabricante;


	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ModeloCarro)) {
			return false;
		}

		ModeloCarro that = (ModeloCarro) o;

		return getCodigo().equals(that.getCodigo());
	}

	@Override
	public int hashCode() {
		return getCodigo().hashCode();
	}
}
