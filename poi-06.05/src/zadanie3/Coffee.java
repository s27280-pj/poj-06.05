package zadanie3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {

        ArrayList<String> coffeeType = new ArrayList<>();

        coffeeType.add("esspresso");
        coffeeType.add("latte");
        coffeeType.add("mocha");
        coffeeType.add("auLait");
        coffeeType.add("macchiato");
        coffeeType.add("cappuccino");

        System.out.println("Nazwy kaw: ");

        StringBuilder sb = new StringBuilder("[");
        for (String coffee : coffeeType){
                sb.append(coffee).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        System.out.println(sb.toString());


        System.out.println("Nazwy kaw (iterator)");
        Iterator<String> iterator = coffeeType.iterator();
        while (iterator.hasNext()){
            String coffee = iterator.next();
            System.out.println(coffee);
        }

        System.out.println("Nazwy kaw (duże litery)");
        for (String coffee : coffeeType){
            System.out.println(coffee.toUpperCase());
        }

        System.out.println("4 pierwsze litery z nazwy kaw");

        for (String coffee : coffeeType){
            String expected = coffee.substring(0,4);
            System.out.println(expected);
        }
    }
}
