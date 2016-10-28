/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retam.shaolintiger.Helpers;

/**
 *
 * @author key
 */
 public class StringTo {
     //StringToDouble (double!)
    public static double StringToDouble(String str) {
        char[]  tmp = str.toCharArray();
        double n = 0;
        
        double x =(tmp.length == 5 || tmp.length == 2)? 10:1;
        if(tmp.length == 3 && tmp[1]!='.') x = 100;
        for(int k:tmp) {
            if (k == '.') continue;
            n+=(k -48)*x;
            x/=10;
            if(x%10 != 0) {
                x=x%10;
            }
        }
        
        return n;
    }
    
    public static int StringToInt(String str) {
        char[] tmp = str.toCharArray();
        int y = 0;
        int x = 1000;
         for(int k:tmp) {
            if (k == '.') continue;
            y+=(k -48)*x;
            x/=10;
         }
         
         return y;
    }
    
    
}
