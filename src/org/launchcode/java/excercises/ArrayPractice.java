package org.launchcode.java.excercises;

        /*Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox.
        I will not eat them in a house. I will not eat them with a mouse.
        Use the split method to divide the string at each space and store the individual words in an array.
        If you need to review the method syntax, look back at the String methods table.
        Print the array of words to verify that your code works.
        Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences. */


public class ArrayPractice {
    public static void main(String[] args) {
        //Create and initialize an array
        int[] arrayNum = { 1, 1, 2, 3, 5, 8};
        //Loop through the array and print out each value
        for (int i = 0; i < arrayNum.length ; i++) {
            //modify the loop to only print the odd numbers
            if(arrayNum[i] % 2 != 0){
                System.out.println(arrayNum[i]);
            }

        }
        String verse = "I would not, could not, in a box. I would not, could not with a fox.\n" +
                "I will not eat them in a house. I will not eat them with a mouse.";
        //Use the split method to divide the string at each space and store the individual words in an array
        String[] verseArray = verse.split(" ");
        for (int i = 0; i < verseArray.length; i++) {
            System.out.println(verseArray[i]);
        }
        //change the delimiter to split the string into separate sentences
        String [] splitVerseArray = verse.split("\\.");
        for (int i = 0; i < splitVerseArray.length; i++) {
            System.out.println(splitVerseArray[i]);
        }





    }
}
