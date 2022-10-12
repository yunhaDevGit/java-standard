package chapter7;

public class Ex7_7 {
    public static void main(String args[]) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        // car.water(); // car = (Car)fe; 에서 형 변환이 생략됨
        // ㄴ> 컴파일 에러!! Car타입의 참조변수로는 water()를 호출할 수 없다!
        fe2 = (FireEngine) car; // 자손타임 <- 조상타입. 형변환 생략 불가
        fe2.water();

//        Car car1 =null;
//        FireEngine fe3 = (FireEngine)car1; // 조상 -> 자손 으로 형 변환
//        Car car2 = (Car)fe3; // 자손 -> 조상 으로 형 변환
//        car2.drive(); // NullPointerException 발생
    }
}


class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}
