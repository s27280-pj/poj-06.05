package zadanie1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long countTime = System.nanoTime();

        ArrayList<Integer> numbers = new ArrayList<>();

        int number = 2;
        for (int i = 0; i < 50; i++) {
            numbers.add(number);
            number += 2;
            System.out.println("Aktualny numer: " +  number + " |Akualny indeks: " + i);
        }

        long stopCount = System.nanoTime();
        long duration = (stopCount - countTime) / 1000000;
        System.out.println("Czas działania:" + duration + " ms");
    }
}