package com.testefinch.finchlanche.entites;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity(name = "lanche")
public class Lanche{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;    
	private String nomeLanche;
    @ManyToMany
	private List<Ingredientes> ingrediente;
	
    public Lanche() {
    	
    }
        
    public Lanche(String nomeLanche, Ingredientes... ingredientes){
        this.nomeLanche = nomeLanche;
        this.ingrediente = Arrays.asList(ingredientes);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeLanche() {
		return nomeLanche;
	}

	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}

	public List<Ingredientes> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(List<Ingredientes> ingrediente) {
		this.ingrediente = ingrediente;
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
		Lanche other = (Lanche) obj;
		return Objects.equals(id, other.id);
	}
}
