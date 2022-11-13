package akc.test01;

import java.util.LinkedList;
import java.util.Queue;


public class Test001 {
    public static void main(String[] args) {
        System.out.println(convert(123,2));
    }
    //定义一个方法

    public  static String convert(int num,int decimal){

        Stack stack =new MyStack();//定义一个栈保存余数

        int remainder=num%decimal;//余数

        while(num!=0)//（num!=0)表示商不等于0

        {

            stack.push(remainder);//余数进栈

            num=num/decimal;//继续

            remainder=num%decimal;//继续求余

        }

        //出栈

        StringBuilder sb =new StringBuilder();//保存余数

        while(!stack.isEmpty()){

            sb.append(stack.pop());//把出栈结果放到sb当中

        }

        return sb.toString();


    }


}
