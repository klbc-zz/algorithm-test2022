public class Test10 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
//     list1.next = new ListNode(2);
//     list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);
        list2.next.next.next.next.next = new ListNode(6);
        list2.next.next.next.next.next.next = new ListNode(7);
//        list2.next.next.next = new ListNode(4);
        ListNode r = swapPairs(list2);
        while (r!=null){
            System.out.println("r.val:"+r.val);
            r = r.next;
        }


    }
    public static ListNode swapPairs(ListNode head) {
        //判断0为交换第一位，1为交换第二位
        int s,n = 0;
        //返回的链表头
        ListNode re = new ListNode();
        //遍历填充节点
        ListNode rre = new ListNode();
        ListNode one = head;
        ListNode two = one.next;
        //用于交换两个节点的中转节点
        ListNode z = new ListNode();

        while (one!=null){


            if(one.next!=null) {
                if(one.next.next!=null){
                    z = one.next.next;
                    two = one.next;
                    two.next = one;
                    one.next = z;
                }else {
                    two = one.next;
                    two.next = one;
                    one.next = null;
                }
            }else {
                two = one;
                two.next = null;
            }

            n++;
            if(n==1){
                re = two;
                rre = two.next;
            }else {
                rre.next = two;
                if(one.next!=null){
                    rre = rre.next.next;
                }
            }
            //遍历到下一个交换点
            one = one.next;


        }
        return re;

    }

}
