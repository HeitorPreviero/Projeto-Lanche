package com.testefinch.finchlanche.entites;

public enum ELanche {	
    XBACON(new Lanche("X-Bacon", EIngredientes.BACON.getIngrediente(), EIngredientes.HAMBURGUER.getIngrediente(), EIngredientes.QUEIJO.getIngrediente())),
    XBURGUER(new Lanche("X-Burguer", EIngredientes.HAMBURGUER.getIngrediente(), EIngredientes.QUEIJO.getIngrediente())),
    XEGG(new Lanche("X-Egg", EIngredientes.OVO.getIngrediente(), EIngredientes.HAMBURGUER.getIngrediente(), EIngredientes.QUEIJO.getIngrediente())),
    XEGGBACON(new Lanche("X-Egg-Bacon", EIngredientes.OVO.getIngrediente(), EIngredientes.BACON.getIngrediente(), EIngredientes.HAMBURGUER.getIngrediente(), EIngredientes.QUEIJO.getIngrediente()));
	
    ELanche(Lanche lanche){
        this.lanche = lanche;
    }
    
    private Lanche lanche;

    public Lanche getLanche() {
        return lanche;
    }	

}
