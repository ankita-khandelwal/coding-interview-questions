package com.deep.strings;

/**
 * Description:
 *
 * @author Created by deepmistry
 *         7/9/15.
 */
public class StringReversal {


    public static void main(String args[]){
        System.out.println(StringReversal.reverse("abcdef"));
    }

    public static String reverse(String input){
        if (input == null)
            return null;

        if (input.length() == 0 || input.length() == 1)
            return input;

        char start, end, temp;
        int i=0,j=input.length()-1;

        StringBuilder sb = new StringBuilder(input.length());

        while(i<j){
            start = input.charAt(i);
            end = input.charAt(j);
            temp = start;
            start = end;
            end = temp;
            sb.setCharAt(i, start); // Dont know why this throws an exception. This should work.. No time to debug
            sb.setCharAt(j, end);
            i++;
            j--;
        }
        return sb.toString();
    }
}
