package akc.test01;

import akc.test01.Stack;

public class MyStack implements Stack {

    public Object[] elem;//对象数组

    public int top = -1;//默认栈顶元素位置 注意为0和为-1的区别

    public int MAX_SIZE = 50;//存放元素的最大数量

    public MyStack() {
        this.elem = new Object[MAX_SIZE];
    }

    public MyStack(int size) {
        if (size <= 0) {
            System.err.println("wrong size!!! using default");
        } else {
            MAX_SIZE = size;
        }
        elem = new Object[MAX_SIZE];
    }


    @Override
    public void clear() {
        top = -1;
        elem = new Object[MAX_SIZE];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == MAX_SIZE-1;
    }


    @Override
    public int length() {
        //一开始top为-1 计算长度时需要加1
        //若top为0 则不需要
        return top + 1;
    }

    @Override
    public Object peek() {
        if (top == -1) {
            return null;
        } else {
            return elem[top];
        }
    }

    @Override
    public boolean push(Object o) {
        if (top + 1 == MAX_SIZE) {
            System.err.println("stack is full!");
            return false;
        }

        //top先加1 再把元素放在该位置 注意 ++top 和 top++ 的区别
        this.elem[++top] = o;
        return true;
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            System.err.println("stack has no element!");
            return this.elem[top];
        }
        //先把top所在元素返回 之后top减1
        return elem[top--];
    }
}



