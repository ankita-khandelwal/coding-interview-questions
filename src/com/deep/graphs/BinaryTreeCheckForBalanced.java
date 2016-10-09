package com.deep.graphs;

/**
 * @author deepmistry on 10/9/16.
 */
public class BinaryTreeCheckForBalanced {

    private static int maxHeight;
    private static int minHeight = Integer.MAX_VALUE;

    public static void main (String[] args) throws Exception
    {
        int arr[] = {1,2,3,4};
        BSTMinimal bstMinimal = new BSTMinimal(); // create a basic tree
        TreeNode head = bstMinimal.createMinimalBST(arr);
        System.out.println("Basic balanced tree created");

        // Add a bunch of nodes to make it imbalanced
        TreeNode[] extraNodes = new TreeNode[5];
        extraNodes[0] = new TreeNode(5);
        extraNodes[1] = new TreeNode(6);
        extraNodes[2] = new TreeNode(7);
        extraNodes[3] = new TreeNode(8);
        extraNodes[4] = new TreeNode(9);

        head.right.right.right = extraNodes[0];
        head.right.right.right.right = extraNodes[1];
        head.right.right.right.right.right = extraNodes[2];
        head.right.right.right.right.right.right = extraNodes[3];
        head.right.right.right.right.right.right.right = extraNodes[4];

        head.left.left = new TreeNode(1);
        head.left.left.right = new TreeNode(1);
        head.left.left.right.left = new TreeNode(1);
        head.left.left.right.left.left = new TreeNode(1);
        head.left.left.right.left.left.left = new TreeNode(1);
        head.left.left.right.left.left.left.left = new TreeNode(1);
        head.left.left.right.left.left.left.left.left = new TreeNode(1);
        head.left.left.right.right = new TreeNode(1);
        head.left.left.left = new TreeNode(1);


        System.out.println("imbalanced tree created");
        BinaryTreeCheckForBalanced obj = new BinaryTreeCheckForBalanced();
        int level = 0;
        obj.dfs(head, level);
        System.out.println("Max Height: " + maxHeight);
        System.out.println("Min Height: " + minHeight);

    }

    private int dfs(TreeNode node, int  level){
        if (node == null) return level;
        else level++;

        int countL = dfs(node.left, level);
        int countR = dfs(node.right, level);

        if(countL > countR){
            if(maxHeight < countL)
                maxHeight = countL;

            if(minHeight > countR)
                minHeight = countR;
        } else {
            if(maxHeight < countR)
                maxHeight = countR;

            if(minHeight > countL)
                minHeight = countL;
        }
        return level;
    }
}
