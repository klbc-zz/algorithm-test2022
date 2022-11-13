package akc.test01;



public class LinkedQueue implements Queue{
    private MyNode front;//指向队头
    private MyNode rear;//指向队尾
    //构造空队列
    public LinkedQueue() {
        front=null;
        rear=null;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return front==null;
    }
    //判断队列是否已满
    public boolean isFull(){
        return false;
    }
    public boolean enQuene(Object element){//入队
        MyNode temp=new MyNode(element);
        if(!isEmpty()){
            rear.setNext(temp);
        }
        else{
            front.setNext(temp);
        }
        rear=temp;
        return true;
    }

    public Object deQueue(){	//出队
        if(!isEmpty()){
            Object temp=front.getData();
            front=front.getNext();
            if(front==null)
                rear=null;
            return temp;
        }
        return null;
    }
    //取队头元素
    public Object peek(){
        if(!isEmpty()){
            return front.getData();
        }
        return null;
    }
    //查询队列长度
    public int getSize(){
        int length=0;
        if(!isEmpty()){
            MyNode p=front;
            while(p!=null){
                p=p.getNext();
                length++;
            }
        }
        return length;
    }



}
