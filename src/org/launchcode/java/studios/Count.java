package org.launchcode.java.studios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner input = new Scanner(system.in);
        System.out.println("enter a string: ");

        //String quote = input.nextLine();
        StringBuilder quote = new StringBuilder();

        File hello = new File("C:\\Users\\Bennita\\Documents\\hello.txt");
        Scanner input = new Scanner(hello);

        while (input.hasNextLine()) {
            quote.append(input.nextLine());//going through the file to see if there is another line
        }
        char[] charactersInQuote = quote.toString().toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char c : charactersInQuote) {
            if (Character.isAlphabetic(c)) {
                if (characterCount.containsKey(c)) {
                    characterCount.put(c, characterCount.get(c) + 1);
                } else {
                    characterCount.put(c, 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> display : characterCount.entrySet()) {
            System.out.println(display.getKey() + ":" + display.getValue());
        }
    }
}
