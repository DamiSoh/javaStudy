public class free {
    public static void main(String[] args){
        // 산술  증감  연산자
        // int intValue = 200;
        // long longValue = intValue;
        // System.out.println(longValue);

        // int i1 = -5;
        // int i2 = +i1;
        // int i3 = -i1;

        // System.out.println(i1);
        // System.out.println(i2);
        // System.out.println(i3);

        // int i4 = --i1;
        // System.out.println(i4);
        // System.out.println(i1);

        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a>5 && b>5); // 하나만 False여도 false
        System.out.println(a>5 || b>5); // 하나만 True여도 True
        System.out.println(++a - 5); // 증감연산자(단항)가 산술연산자보다 우선이다.
        System.out.println(b++ - 10); 
        System.out.println(b);
    }
}
