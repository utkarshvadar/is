
import java.util.*; 
import java.lang.*;
import java.io.*;
import java.math.BigInteger;  

class GCD_Extended_Eclidean
{ 
	
	public static BigInteger gcdExtended(BigInteger a, BigInteger b, BigInteger s1, BigInteger s2) 
    { 
        
        if (a ==BigInteger.valueOf(0)) 
        { 
            s1= BigInteger.valueOf(0); 
            s2 = BigInteger.valueOf(1); 
            return b; 
        } 
  
        BigInteger ss1=BigInteger.valueOf(1), ss2=BigInteger.ONE;  
        BigInteger gcd = gcdExtended(b.mod(a), a, ss1, ss2); 
  
        
        //s1 = ss2 - (b/a) * ss1; 
        s1=ss2.subtract((b.divide(a)).multiply(ss1));
        s2 = ss1; 
  
        return gcd; 
    } 


	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no1:");
		BigInteger a =sc.nextBigInteger();
		System.out.print("Enter no2:");
		BigInteger b = sc.nextBigInteger();
		BigInteger s1=BigInteger.valueOf(1);
		BigInteger s2=BigInteger.valueOf(1);
		BigInteger g = gcdExtended(a, b,s1,s2); 
		System.out.println("GCD(" + a + " , " + b+ ") = " + g); 
		
		

	} 
} 

