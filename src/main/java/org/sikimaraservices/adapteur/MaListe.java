package org.sikimaraservices.adapteur;

import org.sikimaraservices.ElementListe;
import org.sikimaraservices.Liste;

public class MaListe {
    Liste liste;

    public MaListe(Liste liste) {
        this.liste = liste;
    }

    public Liste getListe() {
        return liste;
    }

    public void setListe(Liste liste) {
        this.liste = liste;
    }
    public void push(int v){
        liste.AjouterDebut(v);
    }
    public void pop(){
        liste.SupprimerPremier();
    }
    public void delete(){
        liste.SupprimerDernier();
    }
    public Boolean estVide(){
        return liste.estVide();
    }
    public void afficher(){
        ElementListe e=liste.getPremier();
        while(e!=null){
            System.out.println(e.getValeur());
            e=e.getSuivant();
        }
    }

    public MaListe() {
    }
}
