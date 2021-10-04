public class conditions {
    
    public static void main(String[] args){
        int x = 50;
        int y = 60;

        if (x < y){
            System.out.println("x는 y보다 작습니다.");
        }

        x = 60;

        if (x == y)
            System.out.println("x는 y와 같습니다.");
            // if문에 {} 줄 수도 있고, 안 줄 수도 있다. 안 줄 때는 한 라인만 작성 가능하다.

        if (x>y){
            System.out.println("-- x가 y보다 큽니다.");
        }else {
            System.out.println("-- x는 y와 같거나 작습니다.");
        }

        x = 70;

        if (x==y){
            System.out.println("---- x와 y가 같습니다.");
        }else if (x < y) {
            System.out.println("---- x는 y보다 작습니다.");
        }else {System.out.println("---- x는 y보다 큽니다.");
        }
    }
}
