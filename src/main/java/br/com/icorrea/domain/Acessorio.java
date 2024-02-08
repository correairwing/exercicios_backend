package br.com.icorrea.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="acessorio_seq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private Long codigo;
	
	@Column(name = "NOME", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "VALOR", nullable = false)
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name = "id_acessorio_fk", foreignKey = @ForeignKey(name = "fk_acessorio_carro"), referencedColumnName = "nome", nullable = false)
	private Carro car;
	
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Carro getCar() {
		return car;
	}

	public void setCar(Carro car) {
		this.car = car;
	}
	
	
}
