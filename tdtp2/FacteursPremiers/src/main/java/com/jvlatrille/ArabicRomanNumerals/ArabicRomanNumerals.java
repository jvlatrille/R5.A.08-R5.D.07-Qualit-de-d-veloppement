package com.jvlatrille.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    /**
     * Convertit un entier (1..50) en chiffres romains.
     * @param n entier entre 1 et 50
     * @return la représentation romaine
     * @throws IllegalArgumentException si n est hors [1,50]
     */
    public static String convert(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("n doit être dans [1,50]");
        }

        // Table greedy suffisante jusqu'à 50
        int[] values   = {50, 40, 10, 9, 5, 4, 1};
        String[] romans= {"L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n > 0) {
            while (n >= values[i]) {
                sb.append(romans[i]);
                n -= values[i];
            }
            i++;
        }
        return sb.toString();
    }
}
