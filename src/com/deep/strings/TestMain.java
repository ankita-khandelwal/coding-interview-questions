package com.deep.strings;

import com.deep.graphs.Test;

import javax.sound.midi.SysexMessage;
import java.util.*;

/**
 * @author deepmistry on 3/13/16.
 */
public class TestMain {

    public static void main(String[] args){
        TestMain o = new TestMain();

        int result = o.tasksScheduling(15,new Integer[]{4, 15, 6, 3, 13, 4, 7, 14, 8, 15, 5, 8});
        System.out.println(result);
    }

    int tasksScheduling(int workingHours, Integer[] tasks) {
        if(workingHours < 1)
            return -1;
        if(tasks.length == 0)
            return 0;

        int curDay=workingHours;
        int result = 0;

        for (int i=0; i<tasks.length; i++) {
            if (tasks[i] > workingHours)
                return -1;
            if(tasks[i] == 0)
                continue;
            else {
                for(int j=i;j<tasks.length;j++){
                    if(curDay - tasks[j] >= 0){
                        curDay-=tasks[j];
                        tasks[j] = 0;
                    }
                }
                result++;
                curDay=workingHours;
            }
        }
        return result;
    }
}
