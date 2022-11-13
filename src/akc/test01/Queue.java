package akc.test01;

/*
 *  队列接口
 */
public interface Queue {
    boolean isEmpty();
    boolean isFull();
    boolean enQuene(Object element);
    Object deQueue();
    Object peek();
    int getSize();
}
