/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pp;

import com.pp.jst.ReadFile;
import java.util.ArrayList;
/**
 *
 * @author jcosgrove
 */
public class Sandbox {
    
    private static String fileName = "test.txt";
    private static String temp;
    private static ArrayList<String> al = new ArrayList();
    
    public static void main(String[] args){
        
        
        ReadFile rf = new ReadFile(fileName);

        
       
        temp = rf.GetNextLine();
        while (temp != null)
        {
            al.add(temp);
            temp = rf.GetNextLine();
            
        }
        

        for (String a : al){
            System.out.println(a);
            
        }
        
        
        
        
    }
    
}
