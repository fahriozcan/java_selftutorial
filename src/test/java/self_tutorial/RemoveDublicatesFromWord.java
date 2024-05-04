package self_tutorial;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class RemoveDublicatesFromWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write your word to remove duplicated characters in the word");

        String word = scan.next().toLowerCase();
        int length = word.length();
        String result = "";

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);

            if(!result.contains(ch+"")){
                result += ch;
            }
        }
        System.out.println("After removing the duplicated character = "+result);
    }

}
