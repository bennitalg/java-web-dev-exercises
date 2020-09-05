package org.launchcode.java.excercises;
/*Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
Write a static method to print out each word in a list that has exactly 5 letters.
Modify your code to prompt the user to enter the word length for the search.
BONUS: Instead of creating our own list of words, what if we want to use the string from the Array Practice section?
Search “Java convert String to ArrayList” online to see how to split a string into the more flexible ArrayList collection.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Within main, create a list with at least 10 integers
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(8);
        numArray.add(14);
        numArray.add(3);
        numArray.add(45);
        numArray.add(6);
        numArray.add(27);
        numArray.add(2);
        numArray.add(11);
        numArray.add(34);
        numArray.add(21);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length for the search: ");
        int wordLength = input.nextInt();

        evenNumbers(numArray);
        String stringArray = "Please vote for Biden";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(stringArray.split(" ")));
        printList(wordList,wordLength);

    }
    //Write a static method to find the sum of all the even numbers
        public static void evenNumbers(ArrayList<Integer> numArray){
            int sum = 0;
            for (int num: numArray) {
                if(num % 2 == 0){
                sum += num;
                }
            }
            System.out.println(sum);
        }

    public static void printList(ArrayList<String> wordList, int wordLength) {
        boolean exist = false;
        for (String word : wordList) {
                if(word.length()== wordLength) {
                    exist = true;
                    System.out.println(word);
                }
        }
            if(!exist) {
                System.out.println("This word length does not exist.");
            }

    }
}


