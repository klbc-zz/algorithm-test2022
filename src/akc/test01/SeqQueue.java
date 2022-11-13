package akc.test01;

public class SeqQueue implements Queue{
    private final int MAX_QUEUE=100;//数组的默认容量
    private Object[ ] value;//对象数组
    private int front;//队头指针
    private int rear;//队尾指针
    private int count;//计数器
    public SeqQueue() {//构造空队列
        value=new Object[MAX_QUEUE];
        front=0;
        rear=MAX_QUEUE-1;
        count=0;
    }
    public boolean isEmpty(){	//判断队列是否为空
        return count==0;
    }
    public boolean isFull(){	//判断队列是否已满
        return count==MAX_QUEUE;
    }
    public boolean enQuene(Object element){//入队
        if(!isFull()){
            value[rear]=element;
            rear=(rear+1)%MAX_QUEUE;
            count++;
            return true;
        }
        return false;
    }
    public Object deQueue(){//出队
        if(!isEmpty()){
            Object temp=value[front];
            front=(front+1)%MAX_QUEUE;
            count--;
            return temp;
        }
        return null;
    }
    public Object peek(){//取队头元素
        if(!isEmpty()){
            return value[front];
        }
        return null;
    }
    //查询队列长度
    public int getSize(){
        return count;
    }




}
