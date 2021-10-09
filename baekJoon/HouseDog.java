public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name); // 메소드명이 클래스 네임과 동일하고 리턴 자료형이 없는 메소드를 생성자(Constructor)라고 한다.
    }
    public void sleep(){
        System.out.println(this.name + "zzz in house");
    }

    public void sleep (int hour){
        System.out.println(this.name + "zzz in house for " + hour + "hours");
    }

    public static void main(String[] args){
        HouseDog houseDog = new HouseDog("happy");
        System.out.println(houseDog.name);

    }
    
}
