package Interview;

import java.util.Scanner;

class reverseachword


    {
        public static void main(String[] args) {

            String originalStr=" I love java programs";

            String words[] = originalStr.split("\\s");
            String reversedString = "";

            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }

            // Displaying the string after reverse
            System.out.print("Reversed string : " + reversedString);
        }
    }

