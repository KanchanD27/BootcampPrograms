package com.Bridgelabz.bootcampprograms.day1;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		//String str1[]= str.split(" ");
		String reverse=" ";
		//for(int i=0;i<str.length()-1;i++)
		{
			//int length=str1[i].length();
			for(int j=str.length()-1;j>=0;j--)
			
				reverse=reverse+str.charAt(j);
				System.out.print(reverse);
				//System.out.print(str.charAt(j));
			
		}
		System.out.println();
	}

}
