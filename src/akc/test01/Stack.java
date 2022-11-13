package akc.test01;

public interface Stack {
    boolean isEmpty();
    boolean isFull();
    boolean push(Object element);
    Object pop();
    Object peek();
    void clear();
    int length();
}
