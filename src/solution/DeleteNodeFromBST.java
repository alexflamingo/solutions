package solution;

import customlib.PrepData;
import customlib.Printer;
import customlib.TreeNode;

/**
 * Delete a node from Binary Search Tree
 * Time: O(logn) Space: const
 * Created by alexshi on 9/4/15.
 */
public class DeleteNodeFromBST {

    private static TreeNode test(TreeNode root, int num) {
        if (root == null) return null;
        TreeNode res = new TreeNode(root.val);
        res.left = root;
        delete(res, root, true, num);
        return res.left;
    }

    private static void delete(TreeNode parent, TreeNode node, boolean isLeft, int num){
        if(node == null) return ;
        if(node.val == num){
            if(node.left==null && node.right==null){
                if(isLeft) parent.left = null;
                else parent.right = null;
            }
            else if(node.left == null) {
                if(isLeft) parent.left = node.right;
                else parent.right = node.right;
            }
            else if(node.right == null) {
                if (isLeft) parent.left = node.left;
                else parent.right = node.left;
            }
            else{
                TreeNode max = findMax(node.left);
                node.val = max.val;
                delete(node, node.left, true, max.val);
            }
        }
        else if(node.val < num) delete(node, node.right, false, num);
        else delete(node, node.left, true, num);
    }

    private static TreeNode findMax(TreeNode root){
        return root.right == null ? root : findMax(root.right);
    }

    public static void run(){
        Printer.pTreeNode(0, test(PrepData.prepBST(), 1));
        Printer.pTreeNode(1, test(PrepData.prepBST(), 2));
        Printer.pTreeNode(2, test(PrepData.prepBST(), 3));
        Printer.pTreeNode(3, test(PrepData.prepBST(), 4));
        Printer.pTreeNode(4, test(PrepData.prepBST(), 5));
        Printer.pTreeNode(5, test(PrepData.prepBST(), 6));
        Printer.pTreeNode(6, test(PrepData.prepBST(), 7));
        Printer.pTreeNode(7, test(PrepData.prepBST(), 8));
        Printer.pTreeNode(8, test(PrepData.prepBST(), 9));
        Printer.pTreeNode(9, test(PrepData.prepBST(), 10));
    }
}
