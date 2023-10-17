package org.sikimaraservices.decorateur;

import org.sikimaraservices.adapteur.MaListe;

public class DecoratorMaListe extends MaListe {
    MaListe Liste;
    public DecoratorMaListe(MaListe Liste) {
        super();
        this.Liste = Liste;
    }
    public void decorer(){
        System.out.println("décoré");
    }


}
