/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pp.jst;

import java.util.ArrayList;

/**
 *
 * @author jcosgrove
 */
public class CSVToolkit {
    private static int maxX = 20;
    private static int maxY;
    private static ArrayList newAl = new ArrayList<String>();
    
    public CSVToolkit(ArrayList al){
        String line = "";
        newAl = al;
        maxY = al.size();
        for (Object a : newAl){
          line = a.toString();
          
         if (line.indexOf('"') > 0){
             
             
             
             
         }
         else
         {
             System.out.println(line);
         }
          
          
            
        }
        
        
    }
    
    
}
