package com.company.miam;

public class Main {
    public static void main(String[] args) {

            Four four = new Four();

            four.puissance = 260;
            four.capacite = 55;


            Aliment cake = new Aliment();
            cake.nom = "cake aux fruits";
            cake.manger();
            four.cuire(cake);
            cake.manger();



    }
}
