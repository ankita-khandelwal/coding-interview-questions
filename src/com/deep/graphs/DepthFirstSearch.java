package com.deep.graphs;

/**
 * Title:
 *
 * @author deepmistry
 *         10/22/14.
 */
public class DepthFirstSearch {

    public static void dfs(Node root) {

        if (root == null) return;

        System.out.print(root.getVertex() + "\t");
        root.state = State.VISITED;

        //for every children
        for (Node n : root.getChildren()) {
            //if childs state is not visited then recurse
            if (n.state == State.UNVISITED) {
                dfs(n);
            }
        }
    }
}
