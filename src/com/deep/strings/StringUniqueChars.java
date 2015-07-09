package com.deep.strings;

/**
 * Description:
 *
 * @author Created by deepmistry
 *         7/9/15.
 */
public class StringUniqueChars {


    public static void main(String args[]){
        System.out.println(StringUniqueChars.uniqueChar("abcdef"));
        System.out.println(StringUniqueChars.uniqueChar("aacdef"));
    }


    public static boolean uniqueChar(String input) {

        if (input == null)
            return false;

        if (input.length() == 0 || input.length() == 1)
            return true;

        boolean[] asciiArray = new boolean[128]; // Ascii array

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (asciiArray[c])
                return false;
            else
                asciiArray[c] = true;
        }
        return true;
    }
}
