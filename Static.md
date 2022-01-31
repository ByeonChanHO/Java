## Static
Static은 java에서 Method(함수)나 Variable(변수)에서 자주 쓰이는데 
이를 Static 영역 메모리에 할당하여 프로그램이 끝날때 메모리를 풀어주는 기능을 가지고 있다.


즉, 이는 Static 을 쓴 함수나 변수는 선언된 지역 안에서 공동으로 쓰여지는 함수나 변수처럼 된다는 뜻이다

### Static 메모리 영역(Static Field)
+ 주로 클래스들이 할당되는 영역
+ Garbage Collector가 관여하지 못한다.
+ 모든 객체가 메모리를 공유한다.

### Heap 메모리 영역(Non-static Field)
+ 주로 객체들이 할당
+ Garbage Collector가 관여
+ 메모리 공유가 일어나지 않는다.

### instance vs class
instance 변수 : Non-static Field
class 변수 : Static Field

### 예시
```
class example{
    static int num = 0; //클래스 static 변수
    int num2 =0;        //클래스 일반 변수

    public static void output(){    //클래스 static 함수
        System.out.println("Hello~~ static");
    }

    public void output2(){          //클래스 일반 함수
        System.out.prinln("Hello~~ normal");
    }
}

public class example_static{

    public static void main(String[] args){

        example ex_1 = new example();   //첫번째 example class 선언
        example ex_2 = new example();   //두번째 example class 선언

        ex_1.num++;                     //첫번째 example의 static 변수 num을 1증가
        ex_1.num2++;                    //첫번째 example의 일반 변수 num2을 1증가

        System.out.println(ex_2.num);   //두번째 example의 static 변수 num 출력
        System.out.println(ex_2.num2);  //두번째 example의 일반 변수 num2 출력

        example.output();               //class 변수 선언 없이 class의 이름만으로 static함수 호출 가능
        ex_1.output2();                 //오직 class 변수가 선언하여 일반 함수를 호출해야한다.

    }
}
```