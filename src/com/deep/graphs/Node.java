package com.deep.graphs;

/**
 * Title:
 *
 * @author deepmistry
 *         10/22/14.
 */

public class Node {

    public Node[] children;
    public int childCount;
    private String vertex;
    public State state;

    public Node(String vertex) {
        this.vertex = vertex;
    }

    public Node(String vertex, int childlen) {
        this.vertex = vertex;
        childCount = 0;
        children = new Node[childlen];
    }

    public void addChildNode(Node adj) {
        adj.state = State.UNVISITED;
        if (childCount < 30) {
            this.children[childCount] = adj;
            childCount++;
        }
    }

    public Node[] getChildren() {
        return children;
    }

    public String getVertex() {
        return vertex;
    }

}