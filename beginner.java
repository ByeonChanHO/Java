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

    class_1(int var1, int var2, int var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

}