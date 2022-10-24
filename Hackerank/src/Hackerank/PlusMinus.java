package Hackerank;

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
    
        double posRate = 0.0;
        double negRate = 0.0;
        double zeroRate = 0.0;
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i)>0){
                posRate += (double) 1/ (double)arr.size();
            }
            else if(arr.get(i)<0){
                negRate += (double)1/ (double)arr.size();
            }
            else{
                zeroRate += (double)1/(double)arr.size();  
                              
            }
        }
        System.out.printf("%.5f" , posRate);
        System.out.println();
        System.out.printf("%.5f" , negRate);
        System.out.println();
        System.out.printf("%.5f" , zeroRate);
    }
}

