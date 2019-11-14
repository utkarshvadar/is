import java.io.*;
import java.util.*;
class EucleDemo
{
	public static void main(String[] args)
	{
		int a,b,r1,r2,q,r,t1=0,t2=1,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD:");
		a=sc.nextInt();
		b=sc.nextInt();
		r1=a;
		r2=b;
		q=r1/r2;
		r=r1-q*r2;
		t=t1-q*t2;
		while(r2>0)
		{
			q=r1/r2;
			r=r1-q*r2;
			t=t1-q*t2;
			r1=r2;
			r2=r;
			t1=t2;
			t2=t;
			System.out.println("q "+q+" "+"r1 "+r1+" "+"r2 "+r2+" "+"r "+r+" "+"t1 "+t1+" "+"t2 "+t2+" "+"t "+t);
		}
		System.out.println("GCD:"+r1);
	}
}