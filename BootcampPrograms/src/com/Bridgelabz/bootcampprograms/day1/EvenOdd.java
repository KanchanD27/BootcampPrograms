package com.Bridgelabz.bootcampprograms.day1;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Number is Even");
		}
		
		else if(number%2!=0)
		{
			System.out.println("Number is negative");
		}
		
		else
		{
			System.out.println("Number is Zero");
		}
	}

}
