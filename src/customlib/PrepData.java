package customlib;

import java.util.Arrays;

/**
 * Created by alexshi on 9/5/15.
 */
public class PrepData {
    public static TreeNode prepBST(){
        TreeNode[] nodes = new TreeNode[20];
        for(int i=0; i<20; i++){
            nodes[i] = new TreeNode(i);
        }
        nodes[6].left = nodes[3]; nodes[6].right = nodes[8];
        nodes[3].left = nodes[2]; nodes[3].right = nodes[4];
        nodes[2].left = nodes[1];
        nodes[4].right = nodes[5];
        nodes[8].left = nodes[7]; nodes[8].right = nodes[9];
        nodes[9].right = nodes[10];
        return nodes[6];
    }


    public static ListNode prepSinglyList(int length){
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        for(int i=2; i<=length; i++){
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        return head;
    }

    public static int[] prepSArray(int length, int min, int max){
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = (int) Math.round(Math.random() * (max-min) + min);
        }
        Arrays.sort(arr);
        Printer.pArray(-1, arr);
        return arr;
    }
}
