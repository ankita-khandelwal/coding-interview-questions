package com.deep.graphs;

import java.lang.*;


class BSTMinimal {
    public static void main (String[] args) throws Exception
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        BSTMinimal obj = new BSTMinimal();
        TreeNode n = obj.createMinimalBST(arr);
        obj.print(n);
    }

    private TreeNode createMinimalBST(int arr[], int start, int end){
        if(end < start)
            return null;
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr,start,mid-1);
        n.right = createMinimalBST(arr,mid+1,end);
        return n;
    }

    public TreeNode createMinimalBST(int arr[]){
        return createMinimalBST(arr,0,arr.length-1);
    }

    /**
     * Print a representation of this BST on System.out.
     */
    public void print(TreeNode root) {
        printHelper(root, "");
    }

    /**
     * Print the BST rooted at root, with indent preceding all output lines.
     * The nodes are printed in in-order.
     * @param root The root of the tree to be printed.
     * @param indent The string to go before output lines.
     */
    private static void printHelper(TreeNode root, String indent) {
        if (root == null) {
            System.out.println(indent + "null");
            return;
        }

        // Pick a pretty indent.
        String newIndent;
        if (indent.equals("")) {
            newIndent = ".. ";
        }
        else {
            newIndent = "..." + indent;
        }

        printHelper(root.left, newIndent);
        System.out.println(indent + root.data);
        printHelper(root.right, newIndent);
    }
}


class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
    }
}


