package akc.test01;




public class LinkListStack implements Stack{

    private MyNode top;//栈顶指针
    public LinkListStack() {//构造链栈，初始为空
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top==null;

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean push(Object element) {
        if(element==null)
            return false;
        top= new MyNode(element);
        return true;

    }

    @Override
    public Object pop() {
        if(!isEmpty()){
            Object tmp=top.getData();  //取得栈顶元素值
            top=top.getNext();         //出栈，指针后移，
            return tmp;
        }
        else
            return null;

    }

    @Override
    public Object peek() {
        if(!isEmpty())
            return top.getData();
        else
            return null;

    }

    @Override
    public void clear() {

    }

    @Override
    public int length() {
        return 0;
    }
}
