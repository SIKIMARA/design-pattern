package org.sikimaraservices.adapteur;

public class File extends MaListe{
    public File() {
        super();
    }
    public void push(int v){
        super.push(v);
    }
    public void pop(){
        super.delete();
    }
    public Boolean estVide(){
        return super.estVide();
    }
    public void afficher(){
        super.afficher();
    }
}
