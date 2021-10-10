/* 

2021.09.30

백준 2588번

수학적
vs
charAt() - '0' 이용 

(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

      4 7 2
X     3 8 5
------------
    2 3 6 0 
  3 7 7 6
1 4 1 6
------------
1 8 1 7 2 0

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

*/

// import java.util.Scanner;


// public class Main{
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);
//         int A = input.nextInt(); 
//         int B = input.nextInt();
//         input.close();
//         System.out.println(A*(B%100%10));
//         System.out.println(A*(B%100/10));
//         System.out.println(A*(B/100));
//         System.out.println(A*B);
//         }
// }


// import java.util.Scanner;
 
// public class Main {
 
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
 
// 		int A = in.nextInt();
// 		String B = in.next();
        
// 		in.close();
 
// 		System.out.println(A * (B.charAt(2) - '0'));
// 		System.out.println(A * (B.charAt(1) - '0'));
// 		System.out.println(A * (B.charAt(0) - '0'));
// 		System.out.println(A * Integer.parseInt(B));
 
// 	}
// }


/*
2021.10.01
문제: 1330번

입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.

제한
-10,000 ≤ A, B ≤ 10,000
*/

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();

//         if (a>b){
//             System.out.println(">");
//         }else if(a==b){
//             System.out.println("==");
//         }else{
//             System.out.println("<");
//         }
//     }
// }

//9498번

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         if(a>=90){
//             System.out.println("A");
//         }else if(a>=80){
//             System.out.println("B");
//         }else if(a>=70){
//             System.out.println("C");
//         }else if(a>=60){
//             System.out.println("D");
//         }else{
//             System.out.println("F");
//         }
//     }
// }

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         input.close();
//         if (a%400 == 0){
//             System.out.println(1);
//         }else if(a%4 ==0 && a%100 !=0){
//             System.out.println(1);
//         }else{
//             System.out.println(0);
//         }
//     }
// }

// 14681번
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         input.close();
//         if(a*b>0){
//             if(a>0){
//                 System.out.println("1");
//             }else{
//                 System.out.println("3");
//             }
//         }else if(a>0){
//             System.out.println("4");
//         }else{
//             System.out.println("2");
//         }
//     }
// }

//2884번

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int H = input.nextInt();
//         int M = input.nextInt();
//         input.close();
//         int total = H*60 + M ;
//         if(total<45){
//             System.out.print("23");
//             System.out.print(" " + (60 +((total-45)%60)));
//         }else{
//             System.out.print((total-45)/60);
//             System.out.print(" " + (total-45)%60);
//     }
// }
// }

/* 다른사람풀이

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); // 시
		int M = in.nextInt(); // 분
		in.close();
		
		if(M < 45) {
			H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(min) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}

*/

//2739번 구구단

// import java.util.Scanner;

// public class Main{
// 	public static void main(String[] args){
// 		Scanner input = new Scanner(System.in);
// 		int n = input.nextInt();
// 		input.close();
// 		for(int i = 1; i <10; i++){
// 			// System.out.println(n+" * "+i+" = " + (n*i));
// 			System.out.println(n+i);
// 		}

// 	}
// }

//10950번 A+B--3

// import java.util.Scanner;
// public class Main{
// 	public static void main(String[] args){
// 		Scanner input = new Scanner(System.in);
// 		int alpha = input.nextInt();
// 		for (int i = 0; i < alpha; i++){
// 			int a = input.nextInt();
// 			int b = input.nextInt();
// 			System.out.println(a+b);
// 		}
// 		input.close();
// 	}
// }

//10871번 X보다 작은 수

// import java.util.Scanner;

// public class Main{
// 	public static void main(String[] args){
// 		Scanner input = new Scanner(System.in);
// 		int N = input.nextInt();
// 		int X = input.nextInt();
// 		for(int i =0; i<N; i++){
// 			int temp = input.nextInt();
// 				if (temp < X){
// 					System.out.print(temp + " ");
// 				}
// 		}
// 		input.close();

// 	}
// }

//10952번 A+B=5

// import java.util.Scanner;
// public class Main{
// 	public static void main(String[] args){
// 		Scanner in = new Scanner(System.in);
// 		while(true){
// 			int a = in.nextInt();
// 			int b = in.nextInt();
// 			if (a==0 && b==0){
// 				in.close();
// 				break;
// 			}
// 			System.out.println(a+b);
// 		}
// 	}
// }

//10951번 A+B-4 종료 조건 EOF(End of File) hasNextInt();

// import java.util.Scanner; 

// public class Main{
// 	public static void main(String[] args){
// 		Scanner in = new Scanner(System.in);
// 		while(in.hasNextInt()){
// 			int a = in.nextInt();
// 			int b = in.nextInt();
// 			System.out.println(a+b);
// 		}
// 		in.close();

// 	}
// }

//1110번 더하기 사이클

//import java.util.Scanner; 
//
//public class Main{
//	public static void main(String[] args){
//		Scanner in = new Scanner(System.in);
//
//		int newN = in.nextInt();
//		in.close();
//
//		int n = newN;
//		int i = 0;
//
//		while(true){
//			newN = (((newN/10)+(newN%10))%10) + ((newN%10)*10);
//			i++;
//			if(newN == n){
//				break;
//			}
//		}
//		System.out.println(i);
//	}
//}

//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		int a = in.nextInt();
//		int[] list = new int[a];
//		for(int i = 0; i < a; i++) {
//			list[i] = in.nextInt();
//		}
//		in.close();
//		Arrays.sort(list); //오름차순으로 정렬해주는 메소드이다.
//		System.out.print(list[0]+" "+list[a-1]);
//	}
//}

//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int[] array = new int[9];
//		
//		for (int i = 0 ; i < 9; i++) {
//			array[i] = in.nextInt();
//			}
//		
//		in.close();
//		int a = 0, b = 0;
//		
//		for (int i = 0; i < 9; i++) {
//			if (array[i] > a) {
//				a = array[i];
//				b = i+1;
//				}
//			}
//		System.out.println(a);
//		System.out.println(b);
//		}
//		
//	}

//int to String -> Integer.toStrin(숫자) / str.charAt(i)
//String to int -> Integer.parseInt(문자열) / String.valueOf(문자열) 

//public class Main{
//	public static void main(String[] args) {
//		int a = 123456;
//		String a_ = Integer.toString(a);
//		for (int i = 0; i < a_.length(); i++) {
//			System.out.println(a_.charAt(i));
//	}
//}
//}

//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int mul = in.nextInt() * in.nextInt() * in.nextInt();
//		in.close();
//		
//		String str = Integer.toString(mul);
//		
//		for (int i=0; i<10; i++) {
//			int counter = 0;
//			for (int j=0; j < str.length(); j++) {
//				if (str.charAt(j) - '0' == i) {
//					counter ++;
//				}
//			}
//			System.out.println(counter);
//		}
//	}
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] arr = new int[10];
//		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//		String str = String.valueOf(val);
//		
//		for (int i = 0; i < str.length(); i++) {
//			arr[(str.charAt(i) - 48)]++;
//		}
//		
//		for (int v: arr) {
//			System.out.println(v);
//		}
//	}
//}

//public class Main {
//    public void sayNick(String nick) {
//        if("fool".equals(nick)) {
//            return;
//        }
//        System.out.println("당신의 별명은 "+nick+" 입니다.");
//    }
//
//    public static void main(String[] args) {
//        Main test = new Main();
//        test.sayNick("fool");
//        test.sayNick("genious");
//    }
//}

//public class Main{
//	public static void main(String[] args) {
//		
//		int[] arr = new int[10];
//		arr[0]++;
//		System.out.println(arr[1]);
//		}
//	}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] arr = new int[10];
//		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//		String str = String.valueOf(val);
//		
//		for (int i = 0; i < str.length(); i++) {
//			arr[(str.charAt(i) - 48)]++;
//		}
//		
//		for (int v: arr) {
//			System.out.println(v); //--> arr의 배열을 v라는 변수에 담겠다.
//		}
//	}}


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class Main{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[10];
//		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()) *Integer.parseInt(br.readLine());
//		String str = Integer.toString(val);
//		
//		for (int i = 0; i < str.length(); i++) {
//			arr[str.charAt(i)-'0']++;
//		}
//		for (int v:arr) {
//			System.out.println(v);
//		}
//	}
//}
// 1546번 
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int n = in.nextInt();
//		
//		double[] arr = new double[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		in.close();
//		
//		Arrays.sort(arr);
//		
//		double max = arr[n-1];
//
//		double sum = 0;
//		
//		for (int i=0; i<n; i++) {
//			sum += arr[i]/max*100;
//
//		}
//		System.out.print(sum/arr.length);
//		}
//}
//		
	
// 4344번 
// import java.text.DecimalFormat;
// import java.util.Scanner;


// public class Main{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		int times = in.nextInt();
		
// 		for (int i=0; i < times; i++) {
			
// 		int N = in.nextInt();
// 		double[] scores = new double[N];
// 		double sum = 0;
		
// 		for (int j=0; j<N; j++) {
// 			scores[j] = in.nextDouble();
// 			sum += scores[j];
// 		}
	
// 		double avg = sum /(double)N;
// 		double high_scr = 0;
		
// 		for (double v:scores) {
// 			if (v > avg) {
// 				high_scr += 1;
// 			}}
// //		double ans = high_scr/((double)N)*100;
// //		DecimalFormat form = new DecimalFormat("#.000"); // - System.out.printf("%.3f%%\n",(count/N)*100);
// //		System.out.println(form.format(ans) + "%" );
// 		System.out.printf("%.3f%%\n", high_scr/((double)N)*100);
			
// 		}
// 		in.close();
// 	}
// }

//class & method 
//HashMap과 ArrayList

//import java.util.HashMap;
//import java.util.ArrayList;
//
//public class Main {
//
//	public int sum(int a, int b){
//		int c = a + b;
//		return c;
//	}
//	public static void main(String[] args){
//		HashMap<String, String> map = new HashMap<String, String>() ;
//		map.put("people", "사람");
//		map.put("baseball", "야구");
//
//		ArrayList<String> arr = new ArrayList<String> ();
//		arr.add("123");
//		arr.add("456");
//
//		System.out.println(arr.get(0));
//
//		int a = 1;
//		int b = 2;
//		Main met = new Main();
//		int d = met.sum(a, b);
//		System.out.println(d);
//
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr.length);
//		
//		int[] arr2 = new int[10];
//		System.out.println(arr2.length);
//	}
//}

//public class Main{
//	
//	public static void main(String[] args) {
//		
//		boolean[] check = new boolean[10001];
//	
//		
//		for (int i=0; i <10001; i++) {
//			int n = d(i);
//			
//			if(n <10001) {
//				check[n] = true;
//			}
//			
//		}
//		
//		for(int j=0; j<10001; j++) {
//			if (check[j] == false) {
//				System.out.println(j);
//			}
//		}
//	}
//		
//	public static int d(int number) {
//		int sum = number;
//		
//		while (number !=0) {
//			sum += number%10;
//			number /= 10;
//		}
//		
//		return sum;
//		
//	}
//	}


