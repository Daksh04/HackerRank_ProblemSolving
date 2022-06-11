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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static boolean acounter(List<Integer>a,int factor){
       int c=0;
       for(int i=0;i<a.size();i++){
           if(factor%a.get(i)==0){
               c++;
           }
       }
       if(c==a.size()){
           return true;
       }
       return false; 
    }
    public static int counter(List<Integer>b,int factor){
      int count=0;
      for(int i=0;i<b.size();i++){
        if(b.get(i)%factor==0){
            count++;
        }
        }
        return count;  
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int small=b.get(0);
    int finalcount=0;
    for(int i=1;i<b.size();i++){ 
        if(small>b.get(i)){small=b.get(i);}
    }
    for(int i=1;i<=Math.sqrt(small);i++){
        if(small%i==0){
            int factor=i;
            int factor2=small/i;
            if(factor==factor2){
               int count=counter(b,factor);
               if(count==b.size()){
                   boolean ans=acounter(a,factor);
                   if(ans==true){
                       finalcount++;
                   }
               }
            }else{
               int count=counter(b,factor);
               if(count==b.size()){
                   boolean ans=acounter(a,factor);
                   if(ans==true){
                       finalcount++;
                   }
               }
               count=counter(b,factor2); 
               if(count==b.size()){
                   boolean ans=acounter(a,factor2);
                   if(ans==true){
                       finalcount++;
                   }
               }
            }
        }
    }
    return finalcount;
    }

}

public class betweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
