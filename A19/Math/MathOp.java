package Math;
public class MathOp {
public  int max(int[] x)
    {
        int k= x[0];
        for(int i = 0; i < x.length;i++) {
            if(x[i]>k){
                k=x[i];
            }


        }
        return k;


    }
   public int min(int[] x){
        int k= x[0];
        for(int i = 0; i < x.length;i++) {
            if(x[i]<k){
                k=x[i];
            }


        }
        return k;

    
}
}
