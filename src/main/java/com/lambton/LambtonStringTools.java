/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.HashMap;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools
{

    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        if (s==null)
        {
            return null;
        }
        else {

            String splittedArray[]= s.split("\\s+");
            String temp=" ";
            for (int i=splittedArray.length-1;i>0;i--)
            {
                temp=temp+splittedArray[i]+" ";
            }
            return temp;
        }
    }

    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
    {
        String[] word = s.split("\\s+");

        String capital = "";
        if (word.length == 3) {
            capital = word[0].substring(0, 1).toUpperCase() + ". "
                    + word[1].substring(0, 1).toUpperCase() + ". "
                    + word[2].substring(0, 1).toUpperCase() + word[2].substring(1).toLowerCase();
        } else {
            capital = null;
        }
        return capital;
    }

    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char[] mostFrequent(String s)
    {

            char temp[] = s.toCharArray();

            HashMap<Character, Integer> frequentLetters = new HashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {
                if (frequentLetters.containsKey(temp[i])) {
                    int tempValue = frequentLetters.get(temp[i]);
                    tempValue++;
                    frequentLetters.put(temp[i], tempValue);
                } else {
                    frequentLetters.put(temp[i], 1);
                }
            }
            return null;

    }

    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s)
    {
        int decimal=0;

        decimal = Integer.parseInt(s, 2);

        return decimal;

    }

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString)
    {
        originalString= originalString.toLowerCase();
        findString = findString.toLowerCase();
        newString = newString.toLowerCase();
        if (originalString.contains(findString)) {
            originalString = originalString.replace(findString, newString);
            return originalString;
        } else
            return "String doesn't contain matched pattern";
    }
}