
public class forPrac{
    public static void main(String[] args){
        // 1. 변수 초기값 선언(한번만 수행), 
        // 2. 조건, 3. 증감식 순서 (2,3은 계속 반복수행)
        // continue -> 무시하고 다시 올라가서 for문 돌리기
        // break -> for문 아예 빠져나오기 

        int total = 0;
        for(int i = 1; i <= 100; i++){
            if (i%2 != 0){
                continue; // 아래쪽 구문 무시하고 다시 위로 가라 
            }
            total = total + i;
        }
        System.out.println(total);
    }  
}
