# generic(제네릭)
## 정의
generic 이란 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다.
즉, class를 구현 할때는 내부에 사용할 데이터 타입을 미정으로 하다가 main의 instance 로  선언 및 생성할 때 데이터 타입을 정한다.
```java
class person<T>{public T name;}

person<String> per = new person<string>();
```
T로 미정의 데이터 타입을 선언하고 외부에서 person을 선언할때 wrapper로 데이터의 타입을 적어준다.
복수의 미정 데이터 타입을 선언하여 쓸 수도 있다.

## 장점
1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 줄 수 있다.
2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.

미정의 데이터 타입에 class나 int 등을 넣을 수 있다.

