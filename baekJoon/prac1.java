public class prac1 {
    public static void main(String[] args) {
        int myNum;
        myNum = 1;
        System.out.println(myNum);
        myNum = 2;
        System.out.println(myNum);
        final int myNum1 = 3;
        System.out.println(myNum1);

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        
        float myFloat = 1.0f;
        System.out.println(myFloat);

        float f1 = 35e3f; //35000.0
        double d1 = 12E4d; //120000.0
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //ascii 코드 나온다
        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Casting widening
        int myInt = 1;
        double myDouble = myInt;
        System.out.println(myDouble);

        //Casting Narrowing

        int newInt = (int) myDouble;
        System.out.println(newInt);

        String txt = "Hello BTS we smooth like butter !";
        System.out.println(txt.indexOf("butter"));

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String e = "10";
        int f = 20;
        String g = e + f;   // z will be 1020 (a String)
        System.out.println(g);

        System.out.println(Math.sqrt(64));
        System.out.println(Math.max(1,100));
        System.out.println(Math.random()*101);

        if (9 < 10){
            System.out.println("작다");
        }else{
            System.out.println("크다");
        }

        int day = 4;
        int answer = 0;

        switch (day) {
            case 1:
                answer = 1;
                break;
            case 2:
                answer = 2;
                break;
            case 3:
                answer = 3;
                break;
            // case 4:
            //     answer = 4;
            //     break;
        }
        {System.out.println(answer);    
        }
    }
    
}
