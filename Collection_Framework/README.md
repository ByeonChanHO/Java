# Collection Framework
## 정의
다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합

즉,데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것

프레임 워크는 interface를 사용하여 구현되어 있다.

## 주요 인터페이스
1. List 인터페이스
2. Set 인터페이스
3. Map 인터페이스

List, Set은 Collection interface에 상속 받지만, map은 구조상의 이유로 별도의 interface로 구성되어 있다.

![화면 캡처 2022-02-04 170834](https://user-images.githubusercontent.com/38696775/152494080-db246254-6c15-4bab-9d71-461903befddc.png)

### List
순서가 있는 데이터 집합으로, 데이터 중복이 허용된다.

Vector, ArrayList, LinkedList, Stack, Queue 가 있다.

### Set
순서가 없는 데이터 집합으로, 데이터 중복이 허용되지 않는다.

HashSet, TreeSet 이 있다.

### Map
키와 값의 한 쌍으로 이루어져 있는 데이터 집합으로, 순서가 없다.

키 값은 중복을 허용하지 않지만, 값은 상관이 없다.

HashMap, TreeMap, HashMap, Properties 가 있다.

## Collection interface의 주요 메소도
참조 주소를 볼것.



참조 및 이미지 출처 : http://www.tcpschool.com/java/java_collectionFramework_concept
