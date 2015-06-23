package com.deep.treeTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Temp class for recursive tree traversal
 *
 * Created by deepmistry on 9/21/14.
 */
public class Traversal {

    Map<String,String[]> map = new HashMap<String, String[]>();

    ArrayList<String> processed = new ArrayList<String>();
    ArrayList<String> printed = new ArrayList<String>();
    ArrayList<String> print = new ArrayList<String>();

    public void insert(String[] inputArray){

        for(int i=0; i < inputArray.length - 1; i++){
            String[] kvp = inputArray[i].split(":");

            String key = kvp[0];
            String value = kvp[1];
            String[] children = value.split(",");

            map.put(key,children);
        }
    }

    void recursive(String key){
        String printString = "";
        printed.add(key);
        processed.add(key);

        String[] children = map.get(key);

        if(children == null)
            return;

        for(int i=0; i<children.length;i++){
            if(!printed.contains(children[i])) {
                printString += children[i];
                printString += ",";
                printed.add(children[i]);
            }
        }

        if(printString!="") {
            print.add(printString.substring(0, printString.length() - 1));
        }

        for(int i=0; i<children.length;i++){
            if(!processed.contains(children[i])) {
                recursive(children[i]);
            }
        }

    }

    void printResult(){
        for(int i =0; i<print.size();i++){
            System.out.println(print.get(i));
        }
    }


}
