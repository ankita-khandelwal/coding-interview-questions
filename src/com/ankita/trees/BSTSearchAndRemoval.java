package com.ankita.trees;

/**
 * @author akhandelwal
 */
public class BSTSearchAndRemoval {

    class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        BSTSearchAndRemoval sol = new BSTSearchAndRemoval();
        Node newN = sol.add(5, null);
        newN = sol.add(3, newN);
        newN = sol.add(7, newN);
        newN = sol.add(2, newN);
        newN = sol.add(4, newN);
        newN = sol.remove(3, newN);
        sol.printSubtree(newN);

    }

    private void printSubtree(Node curr) {
        if (curr == null) {
            return;
        }

        System.out.println(curr.val);
        printSubtree(curr.left);
        printSubtree(curr.right);

    }

    private Node add(int key, Node curr) {
        if (curr == null) {
            curr = new Node(key);
            return curr;
        }
        if (key < curr.val) {
            curr.left = add(key, curr.left);
        } else if (key > curr.val) {
            curr.right = add(key, curr.right);
        }
        return curr;
    }

    private Node remove(int key, Node curr) {
        if (curr == null) return null;
        if (key < curr.val) {
            curr.left = remove(key, curr.left);
        } else if (key > curr.val) {
            curr.right = remove(key, curr.right);
        } else if (key == curr.val) {
            if (curr.left != null) {
                Node newCurr = findNextElement(curr.left);
                if (curr.left.right != null) {
                    newCurr.left = curr.left;
                }
                newCurr.right = curr.right;
                return newCurr;
            } else if (curr.right != null) {
                Node newCurr = findNextElement(curr.right);
                if (curr.right.right != null) {
                    newCurr.left = curr.left;
                }
                newCurr.right = curr.right;
                return newCurr;
            } else {
                return null;
            }
        }
        return curr;
    }

    private Node findNextElement(Node curr) {

        if (curr.right != null) {
            Node returnedElement = findNextElement(curr.right);
            curr.right = null;
            return returnedElement;
        } else {
            return curr;
        }
    }
}
