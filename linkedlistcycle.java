public class ListNode {
        int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
     // End of ListNode class

// Solution class should be in its own file, but fixing for single file demonstration
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
               slow= slow.next;
               fast= fast.next.next;
              if(slow==fast){
               return true;
              }
           
           }
           return false;
       }
   }
   public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = head;
    boolean result = solution.hasCycle(head);
    System.out.println("Has cycle: " + result);
   }
}