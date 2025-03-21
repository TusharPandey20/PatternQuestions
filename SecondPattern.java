/*
Creating a pattern like right-angled triangle of numbers like below

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
  
Logic Explanation:

    To create a right-angled triangle pattern of stars, we need to determine the number of rows and columns and iterate through them accordingly.

    1. The pattern has n rows.
    2. Each row i contains i occurrences of the number i.
    3. The outer loop runs from 1 to n (for rows).
    4. The inner loop runs from 1 to i (for columns) and prints i.
    
    Thus, the number in each row is equal to the row index (starting from 1), making the column loop iterate exactly as many times as the row number.
 */

package PatternBasedQuestions;

public class SecondPattern {
    public void PrintPattern(int n){

        //loop for row
        for(int i = 1; i <= n; i++){
            //loop for column
            for(int j = 1; j <= i; j++){
                System.out.print(i + " "); //printing row number in columns 
            }
            System.out.println(); //printing new line for the row
        }
    }


    public static void main(String[] args) {
        SecondPattern obj = new SecondPattern();
        obj.PrintPattern(6);
    }
}
