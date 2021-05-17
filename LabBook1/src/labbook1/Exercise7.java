package labbook1;

import java.util.Scanner;

public class Exercise7 {
	boolean isIncreasing(int n)
    {
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch>s.charAt(i+1))
            {
                f = 1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 Exercise7 e7=new Exercise7();
		 System.out.print("Enter a number : ");
	        int n = sc.nextInt();
	       System.out.println( e7.isIncreasing(n));
	       sc.close();
	        
	}

}
