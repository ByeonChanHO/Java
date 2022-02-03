# final
final 은 초기값이 정해지면 프래그램이 끝날때까지 수정할 수 없도록하는 기능이다.
## final 사용처
+ 변수
+ Method(함수)
+ class (클래스)

## 예시
+ ### 자료형 변수
```java
final int num = 999;

num = 1000; //에러 발생
```
+ ### Method(함수)
```java
class final_test{
    public final void test(){
        System.out.println("최종");
    }
}

class final_test2 extends final_test{

    @Override
    public void test(){
        System.out.println("고고");
    }//Override 실패(에러 발생)

}
```
final 로 인해 override 도 안된다.

+ ### Class(클래스)
```java
final class final_test{
}

class final_test2 extends final_test{ //에러 발생

}
```
상속도 실패한다.