import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //Initialize row and column
    static int row=6;
    static int col=6;
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        if(row<4 || col<4)
            return -1;
        int maximum_sum=Integer.MIN_VALUE;
        for(int i=0; i< (row-2); i++){
            for(int j=0; j<(col-2); j++){
                int sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2])+(arr[i+1][j+1])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);

                maximum_sum=Math.max(maximum_sum,sum);
            }
        }
        return maximum_sum;
    }
}
