import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class MyCircularDeque {

    Deque<Integer> deque;
    int k =0;
    public MyCircularDeque(int k) {
        this.deque= new ArrayDeque<>(k);
        this.k=k;
    }

    public boolean insertFront(int value) {
        if(this.deque.size()<k){
            return this.deque.offerFirst(value);
        }
        return false;

    }

    public boolean insertLast(int value) {
        if(this.deque.size()<k){
            return this.deque.offerLast(value);
        }
        return false;
    }

    public boolean deleteFront() {
        return this.deque.pollFirst()!=null?true:false;
    }

    public boolean deleteLast() {
        return this.deque.pollLast()!=null?true:false;
    }

    public int getFront() {
        return this.deque.peekFirst();
    }

    public int getRear() {
        return this.deque.peekLast();
    }

    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    public boolean isFull() {
        return this.deque.size()==this.k?true:false;
    }
}