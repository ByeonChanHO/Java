# Polymorphism(다형성)
## 정의
Polymorphism(다형성)이란 하나의 객체에 여러가지 타입을 가질 수 있는 것을 의미한다.

## 사용처
+ class(클래스)와 class
+ interface 와 class

## 주의점
+ 상속이 있을 경우에만 사용가능하다.

## 사용법
부모 클래스로 선언한 것을 자식 클래스로 채울 수 있다.

하지만 반대로 자식 클래슬르 선언한 것을 부모 클래스로 채울 수 없다.

즉, 큰 공간을 가진 것은 작은 걸 담을 수 있지만 작은 공간으로 큰 것을 담을 수는 없다.

## 예시
+ ### class 와 class간의 Polymorphism
```java
class parent{}
class child extends parent{}

public class polymorphism_excute{
    public static void main(String[] agrs){
        //A instanceof B 란 A가 B의 instance이냐를 묻는 것이다.

        parent A = new Parent();
        parent B = null;
        System.out.println("A instanceof Object :" + A instanceof Object);  //ture
        System.out.println("A instanceof parent :" + A instanceof parent);  //ture
        System.out.println("A instanceof child :" + A instanceof child);    //false
        System.out.println();

        child C = new child();
        child D = null;
        System.out.println("C instanceof Object :" + C instanceof Object);  //ture
        System.out.println("C instanceof parent :" + C instanceof parent);  //ture
        System.out.println("C instanceof child :" + C instanceof child);    //ture
        System.out.println();

        B = new child();    //parent class는 child를 담을 수 있다.
        D = new parent();   //child class는 parent을 담을 수 없다.

    }
}
```
+ ### interface 와 class간의 Polymorphism
```java
interface father{}
interface mother{}
class child implements father, mother{}

public class polymorphism_excute{
    public static void main(String[] agrs){
        //A instanceof B 란 A가 B의 instance이냐를 묻는 것이다.
        father A = new child(); //가능
        mother B = new child(); //가능
        child C = new father(); //불가능
    }
}
```
