package com.Bridgelabz.bootcampprograms.day1;
import java.util.*;
public class ReverseSentence {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter String");
				String str=sc.nextLine();
				String str1[]= str.split(" ");
				//int i,j;
				char temp=0;
				for(int i=0;i<str.length()-1;i++)
				{
				char charArray[]=str1[i].toCharArray();	
					for(int j=str1[i].length()-1;j>=0;j--)
					{
					while(i>j)
						{
							temp=charArray[i];
							charArray[i]=charArray[j];
							charArray[j]=temp;
							//i++;
							//j--;
						}
						
					}
					System.out.println("Reverse:"+str1[temp]);
	
				}
	}
}

	


