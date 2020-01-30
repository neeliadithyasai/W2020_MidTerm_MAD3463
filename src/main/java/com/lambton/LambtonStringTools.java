/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import javax.print.DocFlavor;
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
    public static String mostFrequent(String s)
    {

        return null;


    }

    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s)
    {




        return 0;
    }

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString)
    {

        return null;
    }
}