package com.testefinch.finchlanche.entites;

public enum EIngredientes {	
    ALFACE(new Ingredientes("Alface", 0.42)),
    BACON(new Ingredientes("Bacon", 2.00)),
    HAMBURGUER(new Ingredientes("Hambúrguer", 3.00)),
    OVO(new Ingredientes("Ovo", 0.80)),
    QUEIJO(new Ingredientes("Queijo", 1.50));
		    
	private EIngredientes(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
	}

	private Ingredientes ingredientes;

    public Ingredientes getIngrediente(){
        return this.ingredientes;
    }
}
