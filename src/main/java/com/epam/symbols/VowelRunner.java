package main.java.com.epam.symbols;

public class VowelRunner {
    public static void main(String[] args) {
        int count = 0; // int counter
        String sentence = "Java is a great capability to grow through pain"; // sentence
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // array of letters
        for (char vowel : vowels) { // for each --> input the whole chars array into char variable
            char[] charArray = sentence.toLowerCase().toCharArray(); // place the sentence into chars array
            for (int i = 0; i < charArray.length; i++) { // run through sentence array chars[]
                char letter = charArray[i]; // initialize char variable with array index value
                if (letter == vowel) count++; // increment if letter == vowel
            }
        }
        System.out.println("Number of vowels in the given sentence is " + count);
    }
}
