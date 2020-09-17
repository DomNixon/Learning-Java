package com.company;

//TODO: Relate into main...?
public class CapitalSplit
{
    public static String capSpace(String txt)
    {
    //capture data and split at UpperCase, inserting space at split and return all lower case.
        //String txt = "iLoveMyTeapot";
        String [] a = txt.split("(?=[A-Z])");
        int i =0;
        String answer = "";
        while ( i < a.length )
        {
            answer = answer.concat(a[i] + " ");
            System.out.println(i);
            i++;
        }
        //Ensure all lower case and trim space
        answer = answer.replaceAll("([A-Z])", "$1").toLowerCase();
        answer = answer.trim();
        System.out.println(answer);
        return (answer);
    }
}
