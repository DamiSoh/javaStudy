/* 

백준 2588번

수학적
vs
charAt() - '0' 이용 

*/

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(); 
        int B = input.nextInt();
        input.close();
        System.out.println(A*(B%100%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
        }
}


import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int A = in.nextInt();
		String B = in.next();
        
		in.close();
 
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
}