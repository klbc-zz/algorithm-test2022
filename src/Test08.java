import java.util.Arrays;
public class Test08 {
 public static void main(String[] args) {
     ListNode list1 = new ListNode(1);
//     list1.next = new ListNode(2);
//     list1.next.next = new ListNode(4);
     ListNode list2 = new ListNode(4);
     list2.next = new ListNode(6);
     list2.next.next = new ListNode(8);
     ListNode r = mergeTwoLists(list1,null);
     while (r.next!=null){
         System.out.println("r.val:"+r.val);
         r = r.next;
     }


 }
 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode m = new ListNode();
      ListNode k = new ListNode();

      ListNode p1 = list1;
      ListNode p2 = list2;
      int n = 0;
      while (p1!=null||p2!=null){
          n++;
          if(p1==null){
              m.val = p2.val;
              p2 = p2.next;
              if(n==1){
                  k = m;
              }
              if(p2!=null){
                  m.next = new ListNode();
                  m = m.next;
              }

              continue;
          }
          if(p2==null){
              m.val = p1.val;
              p1 = p1.next;
              if(n==1){
                  k = m;
              }
              if(p1!=null){
                  m.next = new ListNode();
                  m = m.next;
              }
              continue;
          }

          if(p1.val<=p2.val){
              m.val = p1.val;
              p1 = p1.next;
          }else {
              m.val = p2.val;
              p2 = p2.next;
          }
          m.next = new ListNode();

          if(n==1){
              k = m;
          }
          m = m.next;



      }
//      while (p1.next!=null){
//          m.val = p1.val;
//          p1 = p1.next;
//          m.next = new ListNode();
//          m = m.next;
//
//      }
//     while (p2.next!=null){
//         m.val = p2.val;
//         p2 = p2.next;
//         m.next = new ListNode();
//         m = m.next;
//
//     }
     return k;

 }
// public static ListNode recursion(){
//
// }

}
