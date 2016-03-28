/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pp;

import com.pp.jst.CSVToolkit;
import com.pp.jst.ReadFile;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jcosgrove
 */
public class Sandbox {

    private static String fileName = "customer.csv";
    private static ArrayList<String> al = new ArrayList();
    private static CSVToolkit csv;

    public static void main(String[] args) throws IOException {

        ReadFile rf = new ReadFile(fileName);
        al = rf.GetFileAsArrayList();
        csv = new CSVToolkit(al);
    }

}
