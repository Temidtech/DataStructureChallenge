import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int n=a.length;
        int[] rotated_arr = new int[n];
       //------------------------------------Left rotation
        for (int i = 0; i < n; i++)
        {
            rotated_arr[(i + (n-d)) % n] = a[i];
        }
       return rotated_arr;
    }

}
