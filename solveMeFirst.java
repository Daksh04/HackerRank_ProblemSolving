import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solveMeFirst {


    static int solveMeFirst1(int a, int b) { 
    return a+b; 
   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst1(a, b);
        System.out.println(sum);
   }
}


