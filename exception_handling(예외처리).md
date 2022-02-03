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



## 예외 처리 방법
예외 처리는 try/catch/finally를 사용한다.

try를 기본으로 하여 부가적으로 catch나 finally를 추가한다.

(try/catch, try/catch ,try/finally)
+ **try :** 먼저 실행되는 코드로 try에서 예외 발생시 throw 하여 catch로 란다.
+ **catch :** 예외 코드나 예외 객체를 인수 받아 처리
+ **finally :** try에 예외가 발생하든 말든 상관없이 마지막에 실행 되는 부분.


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
참조 자료 : http://www.tcpschool.com/java/java_exception_intro

