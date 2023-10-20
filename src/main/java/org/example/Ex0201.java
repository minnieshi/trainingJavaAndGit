package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0201{
    public static void main(String[] args) {
        /*
        Write a Java program that takes three integers as input, namely n, m, and k.
        The program should calculate the value of (n  m + n  k) modulo k and output an integer as the result.
        All output ends with a newline.
        Here's an example to clarify the task:
        Input:
        2
        3
        4
        Output:
        2
        Explain: (2  3+2  4) mod 4 = 2
            */
        Scanner keyboard = new Scanner(System.in);

//        int n, m, k;

        System.out.println("Input some words separated by space"); //or use a for loop to read them 1 by 1;

        String input = keyboard.nextLine();
//        https://www.baeldung.com/string/split
//        String[] inputArray = input.split(" ");
//https://stackoverflow.com/questions/18838781/converting-string-array-to-an-integer-array:
//        int[] ints = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
//or use a for loop to parse each one to int
//see here: https://stackoverflow.com/a/18838815/4582240
        /*
String line = scanner.nextLine();
String[] numberStrs = line.split(",");
int[] numbers = new int[numberStrs.length];
for(int i = 0;i < numberStrs.length;i++)
{
   // Note that this is assuming valid input
   // If you want to check then add a try/catch
   // and another index for the numbers if to continue adding the others (see below)
   numbers[i] = Integer.parseInt(numberStrs[i]);
}
         */
/*
int n = ints[0];
int m = ints[1];
int k = ints[2];*/
//int result = (n  m+n  k) mod k; //I do NOT understand the formular, so i could not make it happen


        Boolean result = warAndPeace(input);
        System.out.println("Output: " + result);
    }


    public static boolean warAndPeace(String text) {
/*Write a Java method that given a string text,
 returns true if the string "war" and "peace" appear the same number of times in text.
 All input letters are in lowercase.
Test cases :
warAndPeace("there was never a good war, or a bad peace") → true
warAndPeace("war what is it good for") → false

Q: should the 'word' be defined as separated by space - normally it is....
test cases:
    warAndPeace("there was never a good warandpeace") 0 and 0, so equal
    warAndPeace("war what is it good for") 1 and 0, not equal
    warAndPeace("what is it good for") 0 and 0, equal
    warAndPeace("there was never a good war or a bad peace") 1 and 1, equal
 */

//        String whatever = "the colored port should be black or white or brown";
//        The regex means that the delimiters will be anything that is not a word [\W],
//        in groups of at least one [+]. Because [+] is greedy, it will take for instance ';' and ' ' together as one delimiter.
        String[] words = text.split("\\W+");
        String wordForWar = "war";
        String wordForPeace = "peace";
        int occurrencesForWar = 0;
        int occurrencesForPeace = 0;
        for (int i=0; i<words.length; i++){
            if (words[i].equals(wordForWar))
                occurrencesForWar++;
            if (words[i].equals(wordForPeace))
                occurrencesForPeace++;
        }
//        System.out.println(occurrences);
        return (occurrencesForWar == occurrencesForPeace);

        /*
        String war = "war"; //test comment changes
        String temp[] = text.split("[ ,]"); // WRONG: you should NOT to split by a DELIMITER such as comma
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (war.equals(temp[i]))
                count++;
        }
        String peace = "peace";
        int count2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (peace.equals(temp[i]))
                count2++;
        }
        if (count == count2) return true;
        else return false;
        */

    }


}
