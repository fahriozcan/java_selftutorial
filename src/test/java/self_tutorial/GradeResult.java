package self_tutorial;

import org.junit.jupiter.api.Test;

public class GradeResult {

    /*
    Based on the given score between 0-100, user will know the result
    if the result is less than 60, result is failed
    if the score is more than or equal to 60, result is passed
    score should be between 0-100, otherwise result is invalid
    solve the problem with if statement and ternary statement
     */

    @Test
    public void test() {

        int score = 101;

        String result = (score >= 0 && score <= 100) ? (score < 60) ? "Failed" : "Passed" : "Invalid Score";

        System.out.println("result = " + result);

    }

    @Test
    public void test2() {

        int score = 50;

        String result="";

        if(score>=0 && score<=100){
            if(score<60){
                result = "Failed";
            } else {
                result = "Passed";
            }
        } else {
            result="Invalid Score";
        }

        System.out.println("result = " + result);

    }

}
