package com.jvlatrille.FizzBuzz;

public class FizzBuzz {
    public static String de(int nbre){
        if (nbre % 3 == 0 && nbre % 5 == 0) {
            return "FizzBuzz";
        } else if (nbre % 3 == 0) {
            return "Fizz";
        } else if (nbre % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(nbre);
        }
    }
}
