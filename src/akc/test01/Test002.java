package akc.test01;

import java.util.LinkedList;
import java.util.Queue;

public class Test002 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            queue.offer(arr[i]);
            int d = queue.size()-1;
            System.out.println("当前排队号码:"+arr[i]+"当前等待人数："+d);
        }
        while (!queue.isEmpty()) {
            System.out.println("当前办理业务的号码"+queue.poll());
        }

    }
}
