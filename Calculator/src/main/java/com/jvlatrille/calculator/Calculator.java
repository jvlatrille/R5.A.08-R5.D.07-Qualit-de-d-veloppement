package com.jvlatrille.calculator;

import java.util.Set;
import java.util.HashSet;

public class Calculator {

    public static int add(int opG, int opD) {
        long res = (long) opG + (long) opD;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            throw new ArithmeticException("Overflow");
        }
        return (int) res;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) throw new ArithmeticException("Division par zéro");
        return opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> s = new HashSet<>();
        int n = Math.abs(pNombre);
        if (n == 0) { s.add(0); return s; }
        while (n > 0) { s.add(n % 10); n /= 10; }
        return s;
    }
}
