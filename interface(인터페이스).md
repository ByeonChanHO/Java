# interface(인터페이스)
## 나오게 된 배경
자식 클래스가 여러 부모 클래스를 상속 받을 수 있으면, 다양한 메소드 활용이 가능해지는 이점이 있다. 

문제점은 다중상속을 할 경우, 메소드 출처가 모호해진다.

그렇기 때문에 **java은 다중상속을 지원하지 않는다.**

하지만 다중상속의 장점을 포기할 수 없어, interface를 통해 이를 지원하고 있다.

## 정의
interface는 abstract(추상화)와 같이 양식(기본 틀)을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스이다.

## 주의점
+ Abstract class 처럼 instance(인스턴스)에 생성을 하지 못한다.
+ interface 안에 Method(메소드)를 만들 때 전부 abstract(추상화)가 아니라면 Method 앞에 abstract를 붙이는 게 좋다.

## 사용처
+ Constant (상수)
+ Abstract Method(추상 메소드)

## 사용법
```java
interface name {void method();}
class A implements name{}
```

## 예시
+ ### 구현
```java
interface parent {public abstract void work();}

class mother implements parent{
    public void work(){
        System.out.println("work in shcool as teacher");
    }
}
class father implements parent{
    public void work(){
        System.out.println("work in company");
    }
}

public class interface_excute{//실행 문
    public static void main(String[] agrs){
        mother A = new motehr()
        father B = new father()
        A.work();
        B.work();
    }
}
```
+ ### 일반 class와 interface 상속
```java
interface parent {public abstract void work();}
class company{
    int id;
}

class father extends company implements parent{
    public void work(){
        System.out.println("work in company");
    }
}
```

+ ### interface 다중 상속
#### 다중 상속 예제1
```java
interface parent {public abstract void work();}
interface company {public abstract void attend();}

class father implements parent, company{
    public void work(){
        System.out.println("work in company");
    }
    public void attent(){
        System.out.println("attend!");
    }
}
```
#### 다중 상속 예제2
```java
interface parent {public abstract void work();}

interface mother implements parent{public abstract void work();}
interface father implements parent{public abstract void work();}

class child implements mother, father{
    public void work(){
        System.out.println("work!");
    }
}
```