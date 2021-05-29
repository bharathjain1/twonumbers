import java.util.*;
public class Twonumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		System.out.println("enter the alice,bob,turns values");
		for(int a=0;a<t;a++)
		{
			int al=sc.nextInt();
			int bb=sc.nextInt();   //Enter values for alice bob and turns.
			int n=sc.nextInt();
			
			if(n%2==0)    // if turns are even 
			{
				int k=Math.max(al,bb)/Math.min(al, bb);// if turns are even there is no need to multiply because the division values comes same
				System.out.println(k);
			}
			else
			{
				int k=Math.max(al*2,bb)/Math.min(al*2, bb);// if turns are odd then first element is only multiplied by 2.
				System.out.println(k);
			}
		}

	}

}


/*
 pseudo code
 1.enter the values alice,bob and turns.
 2.if turns are even divide without multiplying (max/min)
 3.if turns are odd then multiply with first element and perform division.
 
 logic
 
 if n is even no matter how much u multiply it by 2 after division answer is same
 if n is odd multiply it only once with first element.
 
 
 */

