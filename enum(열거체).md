# enumeration(열거체)
## 장점
1. 열거체를 비교할 때 실제 값뿐만 아니라 타입까지 체크
2. 열거체의 상수값이 재정의되더라도 다시 컴파일할 필요가 ㅇ벗다.

## 사용법

### 일반 사용 방법
```java
enum 열거체이름{상수1이름, 상수2이름,....}  //주의 : 한글이기에 안돌아갑니다.
열거체이름.상수이름                         //호출
```
+ 예시
```java
enum Rainbow{Red, Blue, Green}
Rainbow.Red
```

### 상수값 정의 및 추가
```java
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
```
상수값을 추가시 ()를 열고 만들면 되지만 그와 함께 method 까지 함께 만들어 주어야한다.

## enum의 기본 method
+ ### values()
열거체의 모든 상수를 저장한 배열을 생성해서 반환한다.
**주의점 :** 열거체의 이름을 가지고 변수를 선언할 수 있다. 하지만 이 변수는 일반 변수와 같이 하나의 값만 가질 수 있는 변수이기에 values() 함수를 통해 모든 상수를 가지고 오고자 할때 array형태로 선언하여 가져와야한다.
```java
Rainbow[] arr = Rainbow.values();
```

+ ### valueOf()
전달된 문자열과 일치하는 상수값을 반환

+ ### ordinal()
index을 반환하는 메소드

참조 : http://www.tcpschool.com/java/java_api_enum

