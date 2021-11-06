package stats;

import java.util.*;

public class StatOp {
    public int average(int[] k){
        int sum=0;
        int avg = 0;
        for(int i= 0; i<k.length; i++){
            sum=sum+k[i];

        }
        avg=sum/k.length;
        return avg;

    }
   public  int median(int[] k){
     Arrays.sort(k);
     int len=k.length;
     int med ;
     if(len%2==0){
          med = (k[len/2]+k[(len/2)-1])/2;
     }
     else
     med = (k[len/2]);
     return med;

    }

    
}
