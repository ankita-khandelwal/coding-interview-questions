package com.deep.graphs;

import java.util.HashMap;

public class Diameter {

    public static void main(String[] args) {
        Diameter d = new Diameter();
        System.out.println(d.addNode(0, 1));
        System.out.println(d.addNode(0, 2));
        System.out.println(d.addNode(1, 3));
        System.out.println(d.addNode(1, 4));
        System.out.println(d.addNode(1, 5));
    }

    private HashMap<Integer,Node> map;
    private HashMap<Integer,Integer> connections;
    private int diameter;

    public Diameter(){
        diameter=0;
        map = new HashMap<Integer, Node>();
        connections = new HashMap<Integer, Integer>();
        Node n = new Node(0);
        map.put(0, n);
        connections.put(0, 0);
    }

    public int addNode(int par, int i){
        Node n = new Node(i, par);
        if (connections.get(par)<2)
        diameter++;
        connections.put(par, connections.get(par)+1);
        map.put(i,n);
        connections.put(i, 1);
        return diameter;
    }

    public class Node{
        int id;
        Node parent;
        public Node(int i){
            id=i;
            parent=null;
        }
        public Node(int i, int p){
            id=i;
            parent = map.get(p);
        }
    }
}