/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pp.jst;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcosgrove
 */
public class ReadFile {

    private FileReader fr;
    private BufferedReader br;

    public ReadFile(String fileName) {

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            System.out.println("File Found: " + fileName);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

    }
    
    
    
    public String GetNextLine() {

        try {
            return br.readLine();
        } catch (IOException ex) {
               System.out.println(ex);
        }
        return "";
    }
}
