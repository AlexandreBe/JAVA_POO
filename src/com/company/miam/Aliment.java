package com.company.miam;

public class Aliment {

    public String nom;
    public boolean estCuit;

    public void manger(){
        if (estCuit){
            System.out.println("Miam cet aliment " + nom + " est bien cuit");
        }else{
            System.out.println("Beeurk cet aliment " + nom + " n'est pas cuit");
        }
    }
}
