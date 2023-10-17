package org.sikimaraservices.observateur;

public interface Observe {
    public Observateur ajouterObservateur(int observateur);
    public Observateur supprimerObservateur(int observateur);
    public void notifierObservateurs();
}
