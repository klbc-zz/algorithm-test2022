public class Test04 {
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    public static void main(String[] args) {
        //head = [1,2,3,4,5], n = 2
//        ListNode d = new ListNode(5);
//        ListNode c = new ListNode(4,d);
//        ListNode b = new ListNode(3,c);
        ListNode a = new ListNode(2);
        ListNode head = new ListNode(1,a);
        head = removeNthFromEnd(head,2);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        };




    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode a = head;
        while (a!=null){
            a=a.next;
            len++;
        }
        if(len==n){
            head=head.next;
            return head;
        }
        recursion(head,len-n,1);

        return head;
    }
    public static ListNode recursion(ListNode head, int len,int s){

        if(s<len){
            recursion(head.next,len,++s);
            return head;
        }
        if(s==len){
            head.next=head.next.next;
        }

        return head;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
