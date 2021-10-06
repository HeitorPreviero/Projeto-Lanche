package com.testefinch.finchlanche.entites;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Lanche lanche;
    @ManyToMany
    private List<Ingredientes> ingredientesExtras;
    @ManyToOne
    private Promocao promocao;
    private double preco;
    private double precoFinal;
    private String usuario;
    
    public Pedido() {
    	
    }

	public Pedido(Long id, Lanche lanche, List<Ingredientes> ingredientesExtras, Promocao promocao, double preco,
			double precoFinal, String usuario) {
		super();
		this.id = id;
		this.lanche = lanche;
		this.ingredientesExtras = ingredientesExtras;
		this.promocao = promocao;
		this.preco = preco;
		this.precoFinal = precoFinal;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Lanche getLanche() {
		return lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	public List<Ingredientes> getIngredientesExtras() {
		return ingredientesExtras;
	}

	public void setIngredientesExtras(List<Ingredientes> ingredientesExtras) {
		this.ingredientesExtras = ingredientesExtras;
	}

	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
}
