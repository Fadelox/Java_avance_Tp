package Generalite.services;

import Generalite.model.Produit;

import java.util.ArrayList;
import java.util.List;


public class MetierProduitImpl implements IMetier<Produit>{
    private final List<Produit> produits = new ArrayList<>();


    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(Long id) {
        for(Produit p : produits){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        produits.removeIf(p -> p.getId().equals(id));
    }
}
