package org.sikimaraservices.observateur;

import org.sikimaraservices.ElementListe;
import org.sikimaraservices.Liste;

public class SommeListeObs implements Observateur{
    private int somme;
    private Liste liste;

    public SommeListeObs(Liste liste) {
        this.liste = liste;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }
    @Override
    public void update(){
        ElementListe e=liste.getPremier();
        int somme=0;
        while(e!=null){
            somme+=e.getValeur();
            e=e.getSuivant();
        }
        this.somme=somme;
    }
}
