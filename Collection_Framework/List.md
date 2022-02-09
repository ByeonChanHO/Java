# List

## 특징
1. 원소 저장 순서가 유지
2. 같은 원소 중복 저장 허용

## 대표적 List
1. ArrayList< E >
2. LinkedList< E >
3. Vector< E >
4. Stack< E >
5. Stack< E >
6. Queue< E >


+ ### ArrayList
```java
ArrayList<Integer> arrList = new ArrayList<Integer>();
// add() 원소 저장
arrList.add(40);
arrList.add(20);
arrList.add(30);
arrList.add(10);

// get() index에 따른 원소를 가져온다.
for (int i = 0; i < arrList.size(); i++) {
    System.out.print(arrList.get(i) + " ");
}
for (int e : arrList) { //Enhanced for문
    System.out.print(e + " ");
}

// remove() index의 원소 제거
arrList.remove(1);

// Collections.sort() 원소 정렬
Collections.sort(arrList);

// iterator() 와 next() 원소 가져오기
Iterator<Integer> iter = arrList.iterator();

while (iter.hasNext()) {
    System.out.print(iter.next() + " ");
}
// set() 첫번째 파라미터를 index로 잡고 두번째 파라미터 값으로 바꾼다.
arrList.set(0, 20);
for (int e : arrList) {
    System.out.print(e + " ");
}//0번쨰 index의 값이 20으로 바뀐다.

// size() arrList 크기
System.out.println("리스트의 크기 : " + arrList.size());
```
참조 : http://www.tcpschool.com/java/java_collectionFramework_list