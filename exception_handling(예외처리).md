# exception_handling(예외 처리)
## 나오게 된 배경
프로그램을 실행 시키고 잘 못된 경우는 error(오류) 또는 exception(예외)가 나온다.

error는 시스템 레벨에서 프로그램에 심각한 오류를 야기해서 실행 중에 있는 프로그램을 종료시킨다.

이러한 오류는 개발자가 예측하고 처리할 수 없는게 대부분이기에, 이에 대한 것은 처리하지 못한다.

exception는 오류와 마찬가지로 실행 중인 프로그램을 비정상적으로 종료시킨다.

하지만 예외는 개발자가 미리 예측하여 처리할 수 있다.


그래서 예외를 최대한 처리하여 프로그램이 비정상으로 종료되는 것을 막고자 예외 처리가 나왔다.

## 정의
예측 및 원하지 않은 이벤트가 발생할 때 처리하는 것을 말한다.

## exception의 종류
![화면 캡처 2022-02-03 185130](https://user-images.githubusercontent.com/38696775/152319839-74e3f838-6496-412e-94eb-d4636222c2f7.png){: width="60%" height="60%"}

출처 : http://www.tcpschool.com/java/java_exception_class

이미지와 같이 error와 exception은 Throwable을 상속받고 있고 Throwable은 Object를 상속받고 있다.

exception는 총 2가지로 나누어진다.
1. IOException
2. RuntimeException

### IOException(Checked Exception)
IOException 은 스트림, 파일 및 디렉터리를 사용하여 정보에 접근하는 동안 발생하는 예외이다.
+ 컴파일시의 예외 처리가 체크를 해야한다.

참조 : https://docs.microsoft.com/ko-kr/dotnet/api/system.io.ioexception?view=net-6.0

### RuntimeException(UnChecked Exception)
RuntimeException 은 Runtime 도중 발생되는 예외로 주로 개발자의 실수에 의해 발생된 예외이다.
+ 예외를 딱히 주지 않아도 된다. 하지만 문제가 되는 부분을 고쳐주거나 예외처리 하는 것이 좋다.


## 예외 처리 방법
예외 처리는 try/catch/finally를 사용한다.

try를 기본으로 하여 부가적으로 catch나 finally를 추가한다.

(try/catch, try/catch ,try/finally)
+ **try :** 먼저 실행되는 코드로 try에서 예외 발생시 throw 하여 catch로 란다.
+ **catch :** 예외 코드나 예외 객체를 인수 받아 처리
+ **finally :** try에 예외가 발생하든 말든 상관없이 마지막에 실행 되는 부분.




## Throwable Class' Method
Trowable 클래스 메소드로 예외 또는 오류에 대한 다양한 정보를 확인할 수 있다.

자식 클래스는 당연히 Throwable class의 method 를 이용할 수 있다.

+ Throwable 클래스의 메소드들
    + String getMessage() : 해당 throwable 객체에 대한 자세한 내용을 문자열로 반환함.
    + void printStackTrace() : 해당 throwable 객체와 표준 오류 스트림(standard error stream)에서 해당 객체의 스택 트레이스(stack trace)를 출력함.
    + String toString() : 해당 throwable 객체에 대한 간략한 내용을 문자열로 반환함.

## 사용되는 예외 클래스
검색해보자.

## 예시
+ ### try/catch/finally
```java
try{
    //예외를 처리하길 원하는 실행 코드
}catch(e1){
    //e1이 예외가 발생할 때 처리하는 코드
}catch(e2){
    //e2 예외가 발생할 때 처리하는 코드
}finally{
    //예외 발생 여부 상관없이 실행되는 코드
}
```
+ ### IOException 처리
```java
public class IOException_handling{
    public static void main(String[] args){
        byte[] list = {'a', 'b', 'c'};

        try{
            System.out.write(list);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
```
+ ### 예외 발생시키기
throw라는 키워드로 강제로 예외를 발생시킬 수 있다.
```java
Exception e = new Exception("오류메시지");
throw e;
```

+ ### 예외 회피하기
throw를 이용하여 해당 메소드가 사용할때 발생되는 예외를 미리 명시할 수 있다.
```java
public class exception_handling {
    static void handling_exception() {
        try {
            throw new Exception();  //throw로 예외 미리 명시
        } catch (Exception e) {
            System.out.println("호출된 메소드에서 예외가 처리됨!");
        }
    }
    public static void main(String[] args) {
        try {
            handling_exception();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리됨!");
        }

    }
}
```



참조 자료 : http://www.tcpschool.com/java/java_exception_intro

