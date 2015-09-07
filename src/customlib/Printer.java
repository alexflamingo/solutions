package customlib;

import java.util.Arrays;

/**
 * Printer
 * Created by alexshi on 9/4/15.
 */
public class Printer {
    public static void pListNode(int num, ListNode head) {
        System.out.print("test " + num + "   :   ");

        if (head == null) {
            System.out.print("NULL");
        } else {
            while (head != null && head.next != null) {
                System.out.print(head.val + "->");
                head = head.next;
            }
            if (head != null) System.out.print(head.val + "\n");
        }
    }

    public static void pTreeNode(int num, TreeNode root) {
        System.out.print("test " + num + "   :   ");

        if (root == null) {
            System.out.print("NULL");
        } else {
            printTree(root);
            System.out.print("END\n");
        }
    }

    public static void pArray(int num, int[] a){
        if(num>=0){
            System.out.print("test " + num + "   :   ");
        }
        else if(num == -1){
            System.out.print("input   :   ");
        }
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "" + ((i==a.length-1)?"":", "));
        }
        System.out.print("]\n");
    }

    private static void printTree(TreeNode root){
        if(root.left != null) printTree(root.left);
        System.out.print(root.val + "->");
        if(root.right != null) printTree(root.right);
    }
}
