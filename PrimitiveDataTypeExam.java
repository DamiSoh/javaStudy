
public class PrimitiveDataTypeExam {


    public static void main(String[] args) {
        boolean isFun = false;
        System.out.println(isFun);

        char c = 'a';
        System.out.println(c);

        int x = 59;
        System.out.println(x);

        long bing = 343455332l;
        System.out.println(bing);

        float f = 32.4F;
        double d = 343434.4;

        System.out.println(f);
        System.out.println(d);

        int x1 = 50000;
        long y = x1;

        long x3 = 5;
        int y3 = (int) x3;

    }
}

// long 은 꼭 뒤에 대문자나 소문자 L,l 붙여주어야한다
// float (실수)도 꼭 뒤에 f붙여주어야 한다.
// 조금 더 큰 실수형 데이터는 double을 써준다.

