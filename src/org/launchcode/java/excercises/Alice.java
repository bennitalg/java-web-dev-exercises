package org.launchcode.java.excercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Please select a word or term within this string: ");
        String searchTerm = input.nextLine();
    if(quote.toLowerCase().contains(searchTerm.toLowerCase())){
        System.out.println(searchTerm + " was found.");
    } else {
        System.out.println(searchTerm + " was not found.");
    }
  }
}
