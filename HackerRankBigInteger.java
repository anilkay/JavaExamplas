import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
       BigInteger []b=new BigInteger[unsorted.length];
       for(int i=0;i<b.length;i++){
          b[i]=new BigInteger(unsorted[i]);
       }

              /*  for(int i=0;i<b.length;i++){
                  for(int j=0;j<b.length;j++){
                          if(b[i].compareTo(b[j])==-1){
                              BigInteger temp=b[i];
                              b[i]=b[j];
                              b[j]=temp;
                          }
                  }
              }
              */
        Arrays.sort(b,new Comparator<BigInteger>(){
            @Override
            public int compare(BigInteger o1, BigInteger o2) {
                return o1.compareTo(o2);
            }
     
     });
        StringBuilder build=new StringBuilder();
        for(int i=0;i<b.length;i++){
                 build.append(b[i].toString()+"\n");
        }
        System.out.println(build.toString());
}
}
