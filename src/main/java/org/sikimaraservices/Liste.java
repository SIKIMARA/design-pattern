package org.sikimaraservices;

public class Liste {
    private ElementListe premier;

    public ElementListe getPremier() {
        return premier;
    }

    public void setPremier(ElementListe premier) {
        this.premier = premier;
    }

    public Liste(ElementListe premier) {
        this.premier = premier;
    }
    public void AjouterDebut(int v){
        premier=new ElementListe(v,premier);
    }
    public void AjouterFin(int v){
        ElementListe e=premier;
        while(e.getSuivant()!=null){
            e=e.getSuivant();
        }
        e.setSuivant(new ElementListe(v,null));
    }
    public Boolean estVide(){
        return premier==null;
    }
    public ElementListe getDernier(){
        ElementListe e=premier;
        while(e.getSuivant()!=null){
            e=e.getSuivant();
        }
        return e;
    }
    public void SupprimerPremier(){
        premier=premier.getSuivant();
    }
    public void SupprimerDernier(){
        ElementListe e=premier;
        while(e.getSuivant().getSuivant()!=null){
            e=e.getSuivant();
        }
        e.setSuivant(null);
    }
    public Boolean contient(){
        ElementListe e=premier;
        while(e.getSuivant()!=null){
            if(e.getValeur()==e.getSuivant().getValeur()){
                return true;
            }
            e=e.getSuivant();
        }
        return false;
    }
    public int getLongueur(){
        ElementListe e=premier;
        int i=0;
        while(e.getSuivant()!=null){
            i++;
            e=e.getSuivant();
        }
        return i;
    }

}
