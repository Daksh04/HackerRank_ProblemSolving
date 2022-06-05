import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int n=arr.size();
    int count_z=0;
    int count_p=0;
    int count_n=0;
    for(int i=0;i<n;i++){
        if(arr.get(i)==0){
            count_z+=1;
        }
        if(arr.get(i)<0){
            count_n+=1;
        }
        if(arr.get(i)>0){
            count_p+=1;
        }
    }
    // System.out.println(count_z+" "+count_p+" "+count_n);
    double ans_z= (double)(count_z)/n;
    double ans_p= (double)(count_p)/n;
    double ans_n= (double)(count_n)/n;
    System.out.println(String.format("%.6f",ans_p));
    System.out.println(String.format("%.6f",ans_n));
    System.out.println(String.format("%.6f",ans_z));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

