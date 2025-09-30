package com.jvlatrille.facteursPremiers;

public class FacteursPremiers {
    public static java.util.List<Integer> generate(int n) {
        java.util.List<Integer> facteurs = new java.util.ArrayList<>();
        for (int diviseur = 2; diviseur <= n; diviseur++) {
            while (n % diviseur == 0) {
                facteurs.add(diviseur);
                n /= diviseur;
            }
        }
        return facteurs;
    }
}
