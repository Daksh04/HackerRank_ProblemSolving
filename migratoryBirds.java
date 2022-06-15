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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        if(!hm.containsKey(arr.get(i))){
            hm.put(arr.get(i),1);
        }
        else{
            int val=hm.get(arr.get(i));
            val++;
            hm.put(arr.get(i),val);
        }
    }
    int max=0;
    int key=0;
    for(int i=1;i<=5;i++){
        if(hm.containsKey(i)){
        if(max<hm.get(i)){
            max=hm.get(i);
            key=i;
        }
        }
    }
    return key;
    }
}

public class migratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 