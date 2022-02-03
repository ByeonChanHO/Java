import java.io.IOException;
import java.util.Scanner;

public class beginner{ 
    
    public static void main(String[] args){

        //Type Change(형변환)
        double type_change1 = 3.0F;    //메모리 작은 걸 큰쪽으로 넣을때는 자동 형변환이 일어난다.
                            //float b = 3.0D; 반대는 자동 형변환이 일어날 수 없다.
        float type_change2 = (float)100;
        int type_change3 = (int)100.0;
        Long type_change4 = (long)type_change1;
        String type_change5 = String.valueOf(type_change3);
        String type_change6 = String.valueOf(type_change4);
        String type_change7 = String.valueOf(type_change2);
        int type_change8 = Integer.parseInt(type_change5);
        Long type_change9 = Long.parseLong(type_change5);
        float type_change10 = Float.parseFloat(type_change5);

        
        //Operator(연산자)
        int op_1 = 10;
        int op_2 = 6;
        System.out.println("Operator 10+6 : " + (op_1+op_2));
        System.out.println("Operator 10/6 : " + op_1/op_2);
        System.out.println("Operator 10%6 : " + op_1%op_2);
        System.out.println("Operator 10*6 : " + op_1*op_2);
        op_1++;
        System.out.println("Operator 10++ : " + op_1);
        op_1--;

        float op_3 = 10.0F;
        float op_4 = 6;
        System.out.println("Operator 10/6.0 : " + op_1/op_4);
        System.out.println("Operator 10.0/6 : " + op_3/op_2);
        System.out.println("Operator 10.0%6.0 : " + op_3%op_4);
        op_3++;
        System.out.println("Operator 10.0++ : " + op_3);


        String op_5 = "Hello";
        String op_6 = "\nworld";
        String op_7 = op_5 + op_6;
        System.out.println("Operator str + str : " + (op_5+ op_6));


        //String Method(string 함수)
        String str_1 = "Hi My name";
        System.out.println("String Method str.lenth() : " + str_1.length());
        System.out.println("String Method str.split() : " + str_1.split(" "));
        System.out.println("String Method str.replaceAll() : " + str_1.replaceAll("Hi", "Hello"));
        System.out.println("String Method str.toUpperCase() : " + str_1.toUpperCase());
        System.out.println("String Method str.toLowerCase() : " + str_1.toLowerCase());
        System.out.println("String Method str.charAt() : " + str_1.charAt(0));
        System.out.println("String Method str.hashCode() : " + str_1.hashCode());
        System.out.println("String Method str.charAt() : " + str_1.indexOf(0));
        System.out.println("String Method \" www.abs \".charAt() : " + " www.abs ".strip());
        System.out.println("String Method str.toCharArray() : " + str_1.toCharArray()); //char 형 array로 바뀐다.
        

        //if 문
        if(true){
            System.out.println("if : 1");
        }else if(true){
            System.out.println("if : 2");
        }else {
            System.out.println("else : 3");
        }

        switch(3){
        case 1:
            System.out.println("switch : 1");
            break;
        case 2:
            System.out.println("switch : 2");
            break;
        default :
            System.out.println("switch : defalt");
            break;
        }


        //Conditional Operator(논리 연산자)
        System.out.println("AND operator : &&");
        System.out.println("OR operator : ||");
        System.out.println("NOT operator : !(boolean)");

        
        //loop(반복문)
        while(true){
            break;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("print : " + i);
        }
        

        //Array(배열)
        String[] Group  = {"AAA", "BBB", "CCC", "DDD"};
        String[] Group_1 = new String[4];
        String[] Group_2 = Group.clone();
        Group_1 = Group;
        System.out.println(Group);
        System.out.println(Group_1);
        Group_1[0] = "aaa";
        System.out.println(Group[0]);
        System.out.println(Group_1[0]);
        System.out.println(Group_2[0]);

        for(String e : Group){
            System.out.println("name : " + e);
        }
        for(int i = 0; i < Group.length; i++){System.out.println("name1 : " + Group[i]);}

        //input and output(입력과 출력)
            //import java.utill.Scanner 로 사용자 입력을 받을 수 있다.
        /*Scanner sc = new Scanner(System.in);
        int get_sc = sc.nextInt();  //사용자 입력을 받으면 string 형태기에 next형태()해서 받아야 원하는 타입으로 받을 수 있다.
        System.out.println(get_sc);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();*/

            //또는 그냥 System.in으로 하나씩 아스키코드로 받아올 수 있다.
        /*try {
            char asc_c = (char)system.in.read();
            int asc = System.in.read();
            System.out.println(asc);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }*/

        

        //overriding
        child_ov ov_ex = new child_ov();
        ov_ex.sum();



    }

    //Method(함수)
    //array 나 list 은 reference 로 받고 value는 value로 받는다.
    public static void fun_1(){
        System.out.println("fun_1");
    }
    public static int fun_2(int var){
        return var;
    }
    public static String fun_3(String var){
        var = "aaa";
        return var;
    }

    
}
//class(클래스)
class class_1{
    private int var1;
    public int var2;
    int var3;

    class_1(int var1, int var2, int var3){ //생성자
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

}

//inheritance(상속)
    //상속 관계에 놓이게 되면 부모클래스는 기본 생성자(초기화)함수가 존재해야 작동이 된다.
    //만약 초기화를 사용자가 파라미터를 붙여 만든다면 기본 생성자는 자동으로 생성이 안됨으로
    //사용자가 알아서 기본 초기화를 만들어 주어야한다.
class parent{
    String name;
    int age;
    int num_childs;

    parent(){}  //기본 초기화(생성자)
    parent(String name, int age, int num_childs){
       this.name = name;
       this.age = age;
       this.num_childs = num_childs; 
    }

    public void scold(){
        System.out.println("scold childs!");
    }

    public void compliment(){
        System.out.println("good job!");
    }
}

class child extends parent{
    String name;
    int age;
    String parent_name;

    child(String parent_name, int parent_age, String child_name, int child_age){
        // parent(parent_name,parent_age, 1);
        super(parent_name, parent_age, 1);  //부모 클래스의 생성자이다.(파라미터있는 것)
        super.scold();                      //super 은 부모 클래스를 의미한다.
        this.name = child_name;
        this.age = child_age;
        this.parent_name = parent_name;
    }

    
}

//Overriding(오버라이딩)
    //똑같은 함수 이름으로 이미 존재하는 함수를 재정의하는 것이다.
    //그 영역에서만 재정의된 함수가 돌아간다.
    //이름이 같은 함수가 존재할 때 항상 가까운 함수가 실행된다.
    //overriding 을 하기 위해서는 override 취할 함수의 이름과 타입, 파라미터가 같아야한다.
    //즉, 함수의 이름과 타입, 파라미터가 동일한 것을 선언해 재정의한 것이다.
class parent_ov{
    int left;
    int right;
    parent_ov(){
        this.left = 1;
        this.right = 2;
    }
    void sum(){
        System.out.println("부모 sum : " + (this.left+this.right));
    }
} 
class child_ov extends parent_ov{

    //override 로 아들 class로 sum을 실행시 아들클래스로 정의된 sum이 출력된다.
    @Override
    void sum(){
        System.out.println("아들 sum : " + (this.left+this.right));
    }
}

//overloading(오버로딩)
    //같은 이름으로 다른 파라미터 형태, 개수로 선언
    //return 값의 타입은 같아야한다.
    //즉, 함수의 타입과 이름이 같아야하고 파라미터가 다른 것을 오버로딩이라고 한다.
class parent_load{
    void scold(){System.out.println("scold");}
    void scold(int i){for(int k = 0; k < i; k++){System.out.println("scold");}}

}

//Class Path
    //java 파일에 코드를 적고 cmd 에서 "javac 파일이름.java" 를 실행 시키면 comfile하여 안에 있는 코드의 class들이 설정된 경로에 생성이 된다.
    //그 후 public static main(String[] args){}을 가지고 있는 class 를 cmd에서 "java 클래스이름" 을 실행 시키면 실제 java에서 code 실행하듯이 된다..
    //하지만 main에서 쓰는 다른 class가 지정된 경로에 없으면 cmd에 "java -classpath ".;폴더이름" 실행시킬 클래스이름" 방식을 써서 실행시키면 된다.
    // ".;lib" 에서 .은 현재 경로에서 찾아보라는 뜻이고 ;은 없으면 lib에서 찾아보라는 뜻이다.
    //제일 편한 방법은 환경변수에 path 설정하면 됨.


//package(패키지)
    //클래스 여러개가 모여 생성되는 것
    //"package 경로" 로 불러오거나 "import 경로" 로 불러오면 된다.
    // ex) package javatutorials.java          import. javatutorials.java.beginner.java
    // 두개의 package 에서 class의 이름이 같은 걸 발견했을 떄 구분지어주는 방법은 경로와 함께 class를 쓰면 된다.
    
    
//Access Modifier(접근 제어자)
class acess_modifier{
    private String priv = "오직 같은 클래스안에 있어야 이를 접근할 수 있다.";
    public String pub = "모든 곳에서 접근이 가능";
    protected String pro = "상속 관계이면 불러올 수 있다.";
    String defa = "같은 클래스,패키지만 접근 가능";
    //클래스 또한 public과 defalt 가 있는데. public은 모두 쓸 수 있는 것이고 defalt 는 같은 패키지에서만 쓸 수 있는 class 다.
    //단, package나 import 로 불러와야 같은 패키지내에서 defalut class를 쓸 수 있다.
    //다른 패키지에 있는 defalut class는 불러와도 쓰지 못한다.
    //하나의 소스코드 안에는 하나의 public class만 있어야한다.(소스코드 이름과 public class 이름이 같아야한다.)
}

//Abstract(추상화)
    //자식 클래스에서 추상화된 부모 클래스 코딩 양식대로 오버라이딩(Overriding)을 하게 만드는 것을 말한다.
    //즉, 추상화된 클래스를 상속하게 되면 반드시 부모 클래스에 선언된 추상화들을 자식 클래스에서 Overriding으로 재정의 해주어야한다.
    //글쓰는 양식이라고 생각하면 된다.
    //목적 : 양식대로 만들라고.
    //주의 : 추상화된 class나 method은 선언 및 사용을 못한다.
    abstract class Abstract_parent{
        public abstract String ex();
    }
    class Abstract_child extends Abstract_parent{
        public String ex(){
            return "OMG";
        }
    }




    