package com.deep.treeTraversal;
/*
     Main class containing the main method
 */
public class TestTreeTraversal {

    public static void main(String[] args) {

        String[] inputArray = {"A:B,C,D","B:A,D,E","C:E,B","D:F","B"};

        Traversal testObject = new Traversal();

        testObject.insert(inputArray);
        testObject.recursive(inputArray[inputArray.length - 1]);
        testObject.printResult();
    }

}
