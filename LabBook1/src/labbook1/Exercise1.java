package labbook1;

import java.util.Scanner;

public class Exercise1 {
	int input;
	int sum=0;
	public void cube() {
		int number = input; 
	     

	    while(number>0){
	        int t= number%10;
	        sum=sum+(t*t*t);
	        
	        number = number/10;
	        
	}
	    System.out.println("The sum the cubes of the digits is :- "+sum);
	}
	public static void main(String[] args) {
		 
		   Exercise1 ex=new Exercise1();
		    System.out.println("Enter a Number");
		    Scanner sc = new Scanner(System.in);
		     ex.input= sc.nextInt();
		     ex.cube();
		    sc.close();
		    }


}
