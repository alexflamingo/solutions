package solution;

import customlib.ListNode;
import customlib.PrepData;
import customlib.Printer;

/**
 * Created by alexshi on 9/4/15.
 */
public class ReverseListNodesInPairs {

    private static ListNode test(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode last=new ListNode(0);
        ListNode res = last;
        ListNode p = head;
        ListNode q = head.next;
        while(p!=null && q !=null){
            ListNode t = q.next;
            last.next = q;
            q.next = p;
            p.next = t;
            last = p;
            p = t;
            q = p==null?null:p.next;
        }
        return res.next;
    }
    public static void run(){
        Printer.pListNode(0, test(PrepData.prepSinglyList(18)));
        Printer.pListNode(1, test(PrepData.prepSinglyList(19)));
    }
}