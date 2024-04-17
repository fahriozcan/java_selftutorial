package self_tutorial;

import org.junit.jupiter.api.Test;

public class DivisibleBy {

    /*
    create a program that will print all the numbers divisible by 3, 5 and 15
    in the range from 1 to the given N number. Print grouped sections seperately
     */
    @Test
    public void test() {

        divisibleBy(100);

    }

    public static void divisibleBy(int n){
        String divisible_by_3 = "" , divisible_by_5 = "", divisible_by_15 = "";

        for(int i = 1; i <= n; i++){
            if(i%15==0){
                divisible_by_15 += i + " ";
            } else if(i%5==0){
                divisible_by_5 += i + " ";
            } else if (i%3==0) {
                divisible_by_3 += i + " ";
            }
        }

        System.out.println("Divisible by 15: " + divisible_by_15);
        System.out.println("Divisible by 5: " + divisible_by_5);
        System.out.println("Divisible by 3: " + divisible_by_3);
    }
}
