## Static
Static은 java에서 Method(함수)나 Variable(변수)에서 자주 쓰이는데 
이를 Static 영역 메모리에 할당하여 프로그램이 끝날때 메모리를 풀어주는 기능을 가지고 있다.


즉, 이는 Static 을 쓴 함수나 변수는 선언된 지역 안에서 공동으로 쓰여지는 함수나 변수처럼 된다는 뜻이다

### Static 메모리 영역
+ 주로 클래스들이 할당되는 영역
+ Garbage Collector가 관여하지 못한다.
+ 모든 객체가 메모리를 공유한다.

### Heap 메모리 영역
+ 주로 객체들이 할당
+ Garbage Collector가 관여
+ 메모리 공유가 일어나지 않는다.

### 예시
```
class 
```