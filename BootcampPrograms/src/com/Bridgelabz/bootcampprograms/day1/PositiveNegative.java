package com.Bridgelabz.bootcampprograms.day1;
import java.util.*;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check whether it is positive or negative:");
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("Number is positive");
		}
		else if(number<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}

}
