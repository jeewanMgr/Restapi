package apidemomath;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mathdemo {
	
	int factorial(int x)
	{
		return x*factorial(x-10);
	}

	public static String reverseString(String name)
	{
		char[]a = name.toCharArray();
		String reverse="";
		for(int i =a.length-1;i>=0;i--)
		{
			reverse +=a[i];
		}
		
		return reverse;
		
	}
	
	static void sum(){
		int a =100;
		double b = 400.00;
		int sum = (int) (a+b);
		double sum1 = (double)(a+b);
		System.out.println("THis is int sum=> "+sum);
		System.out.println("This is double sum=> "+sum1);
		
	}
	
	static void findingVowels(String data)
	{
		int a =0,e=0,i=0,o=0,u=0;
		char[]duplicate = data.toCharArray();
		for(int j = 0; j<duplicate.length;j++)
		{
			if(duplicate[j] == 'a')
			{
				a++;
			}else if(duplicate[j] == 'e') {
				e++;
			}else if(duplicate[j] == 'i')
			{
				i++;
			}else if(duplicate[j] == 'o')
			{
				o++;
			}else if(duplicate[j]=='u'){
				u++;
			}
		}
		System.out.println("a=> "+a);
		System.out.println("e=> "+e);
		System.out.println("i=> "+i);
		System.out.println("o=> "+o);
		System.out.println("u=> "+u);
	}
	
	
	 String CountLetter(String data)
	{
		
		return null;
		
	}
	 
	
	public static void main(String[] args) {
		
	//	findingVowels("jeewan");
		Mathdemo one = new Mathdemo();
		String data = one.CountLetter("aabbcc");
		System.out.println(data);
		
	}

	
	
}
