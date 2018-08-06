package com.company.miam;

public class Four {

    private int capacite;
    private int puissance;

    private Resistence resistence;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){

        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma puissance de : " + capacite);
        System.out.println("et ma puissance de " + puissance + " degrès");
        aliment.estCuit = true;
    }
}
