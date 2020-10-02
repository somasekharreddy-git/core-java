package com.vidvaan.corejava.basic009continue;
public class SimpleContinueEx {
 
    public static void main(String a[]){
         
        for(int i=1;i<=10;i++){
            /**
             * here this loop prints only odd numbers.
             * if below condition returns true, the current
             * iteration will be skipped.
             */
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
