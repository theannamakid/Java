//Find 2nd largest element 
package test;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
		int n,i,j,temp;
		System.out.println("Enter Size of the array : ");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		int[] a=new int[n];
		System.out.println("Enter element of array");
		for(i=0;i<n;i++)
		{
			a[i]=x.nextInt();
		}
		System.out.println("array elements are \n");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		System.out.println("\n2nd Largest Element = : "+a[1]);
		}
		// TODO Auto-generated method stub

	}

