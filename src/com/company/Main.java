package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                continue;
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(Fizzbuzz.FIZZBUZZ);
            } else if (i % 3 == 0) {
                System.out.println(Fizzbuzz.FIZZ);
            } else if (i % 5 == 0) {
                System.out.println(Fizzbuzz.BUZZ);
            } else System.out.println(i);
        }
    }
}
