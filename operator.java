public class operator {
    public static void main(String[] args){
        //논리연산자 

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        // System.out.println(b1 && b2);
        // System.out.println(b1 || b2);
        // System.out.println(b2 || b2);

        // int score = 88;
        // if (score <= 100 && score >= 70){
        //     System.out.println("성공했어요");
        // }else{System.out.println("다시도전하세요");}


        System.out.println(b1 ^ b3); //서로 달라야 True
        System.out.println(b2 ^ b3);

        System.out.println(!b1); // 부정연산자 

        /* 삼항연산자
        if랑 비슷하다 */

        int c1 = (5 > 4) ? 50 : 40 ; // true c1에 50을, false라면 40을 대입해주어라.
        System.out.println(c1);

        int c2 = 0;
        if (5>4){
            c2=50;
        }else{
            c2=40;
        }

    }
    
}
