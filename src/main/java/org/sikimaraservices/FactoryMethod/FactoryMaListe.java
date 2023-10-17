package org.sikimaraservices.FactoryMethod;

import org.sikimaraservices.adapteur.File;
import org.sikimaraservices.adapteur.MaListe;
import org.sikimaraservices.adapteur.Pile;

public class FactoryMaListe {
    public static MaListe getMaListe(String par){
        if(par.equals("Pile")){
            return new Pile();
        }else if(par.equals("File")){
            return new File();
        }else{
            return null;
        }
    }
}
