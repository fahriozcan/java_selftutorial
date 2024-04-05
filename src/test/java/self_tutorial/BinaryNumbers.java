package self_tutorial;

import org.junit.jupiter.api.Test;

public class BinaryNumbers {

    @Test
    public void test(){

        /*
        Binary Representation Of N
        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int
            The given n will be more than 0
            Binary representation : it refers to data using binary numeral system that contains only 0 and 1
            each position of binary digit represents a power of 2
        Ex:
            input: 6
            output: 2
            6 in binary is 110
            there are two '1' digits, so the output is 2
        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */

        System.out.println(find1sInBinary(6));


    }

    public static int find1sInBinary(int n){

        String result="";
        while(n>0){

           result  = n % 2 + result; // each division will be concatenated to write the numbers side by side
            n = n/2;

        }


        return result.replace("0", "").length();
    }

}
