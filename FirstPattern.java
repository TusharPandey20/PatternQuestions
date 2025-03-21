/*
Creating a pattern like right-angled triangle of star

*
* *
* * *
* * * *
* * * * *
* * * * * *

Logic Explanation:

    To create a right-angled triangle pattern of stars, we need to determine the number of rows and columns and iterate through them accordingly.

    1. The pattern consists of n rows.
    2. Each row i contains exactly i stars.
    3. The first row has 1 star, the second row has 2 stars, the third row has 3 stars, and so on.
    4. This means that for every row i, the inner loop (column loop) should iterate i times to print the required number of stars.

    Thus, the number of stars in each row is equal to the row index (starting from 1), making the column loop iterate exactly as many times as the row number.
 */



package PatternBasedQuestions;

public class FirstPattern {
    public void PrintRightAngeledTriangle(int n){

        //Loop for row
        for(int i = 1; i <= n; i++){

            //Loop for column
            for(int j = 1; j <= i; j++){
                System.out.print("* ");//printing stars from jth column to ith row
            }
            System.out.println(); //printing new line for the new row
        }

    }


    public static void main(String[] args) {
        FirstPattern firstPattern = new FirstPattern();
        firstPattern.PrintRightAngeledTriangle(6);
    }
}
