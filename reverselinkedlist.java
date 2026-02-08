public class ListNode {
     int val;
   ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current!=null){
            current.next = previous;
            previous = current;
            current = next;
            if(next!=null){
                next=current.next;
            }

        }
        head=previous;
        return head;
    }
}
public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode result = solution.reverseList(head);
    while(result!=null){
        System.out.println(result.val);
        result=result.next;
    }
}