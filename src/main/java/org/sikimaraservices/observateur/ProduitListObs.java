package org.sikimaraservices.observateur;

import org.sikimaraservices.ElementListe;
import org.sikimaraservices.Liste;

public class ProduitListObs implements Observateur{
    private int produit;
    private Liste liste;

    public ProduitListObs(Liste liste) {
        this.liste = liste;
    }

    public int getProduit() {
        return produit;
    }

    public void setProduit(int produit) {
        this.produit = produit;
    }
    @Override
    public void update(){
        ElementListe e=liste.getPremier();
        int produit=1;
        while(e!=null){
            produit*=e.getValeur();
            e=e.getSuivant();
        }
        this.produit=produit;
    }
}
