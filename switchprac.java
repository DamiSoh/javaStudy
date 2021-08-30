public class switchprac {
    public static void main(String[] args){
        //switch case default break
        
        int value = 1; /*리턴: case1부터 모두 출력, 만약 value = 2면, case 2부터 시작한다. 
                        만약 case1만 실행하고 싶다면, break를 적절하게 써주어야한다.*/

        switch(value){ //value 란에는 정수, 문자열 가능하다.
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("그 외 다른숫자");
        }

    }
    
}
