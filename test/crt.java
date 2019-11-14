import java.util.*;
class crt{
    public static void main(String[] args) {
        
        int i;
        int n =3;
        int [] num = {3,4,5};
        int [] rem = {2,3,1};
        int prd=1;
        int pp[] = new int[num.length];
        for(i=0;i<num.length;i++){
            prd = prd*num[i];
        }

        for(i=0;i<num.length;i++){
            pp[i] = prd/num[i];
        }

        int[] inv = new int[n];
        for(i=0;i<n;i++){
            inv[i] = modeinv(pp[i],num[i]);
            //System.out.println(inv[i]);

        }
        int x=0;
        for(i=0;i<n;i++){
            x+= rem[i]*pp[i]*inv[i];
        }
        System.out.println(x%prd);
    
        
    }

    static int modeinv(int a,int n){
        int r1 = n;
        int r2 = a;
        int t1 = 0;
        int t2 = 1;
        int t;
        int q;
        while(r2>0){
            q = r1/r2;
            t = r2;
            r2 = r1%r2;
            r1 = t;

            t = t2;
            t2= t1-q*t2;
            t1 = t;
            
        }
        if(t1<0){
            return t1+n;
        }
        else {
            return t1;
        }
        
    }
    
}
