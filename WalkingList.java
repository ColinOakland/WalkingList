/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkinglist;

import java.util.Scanner;
import java.io.*;
public class WalkingList {

    public static void main(String[] args) throws IOException
    {
        FileReader in = null;
        FileWriter out = null;
        
        try
        {
        in = new FileReader(args[0]);
        out = new FileWriter(args[1]);
        String line;
        String tmpLine = null;
        BufferedReader bufferedReader = new BufferedReader(in);
        BufferedWriter bufferedWriter = new BufferedWriter(out);
        
        while((line = bufferedReader.readLine()) !=null)
        {
            //paramaterize this
            if(line.contains(args[2]))
            {
                line=line.trim();
                
                
                if(Character.isDigit(line.charAt(18)))
                {
                    //System.out.println(line.substring(30));
                    bufferedWriter.write(line.substring(30));
                    bufferedWriter.append(',');
                    bufferedWriter.newLine();
                    
                }
                else if(Character.isDigit(line.charAt(17)))
                {
                    //System.out.println(line.substring(29));
                    bufferedWriter.write(line.substring(29));
                    bufferedWriter.append(',');
                    bufferedWriter.newLine();
                    
                }
                else if(Character.isDigit(line.charAt(16)))
                {
                    //System.out.println(line.substring(28));
                    bufferedWriter.write(line.substring(28));
                    bufferedWriter.append(',');
                    bufferedWriter.newLine();
                }
                else if(Character.isDigit(line.charAt(15)))
                {
                    //System.out.println(line.substring(27));
                    bufferedWriter.write(line.substring(27));
                    bufferedWriter.append(',');
                    bufferedWriter.newLine();
                }
                else if(Character.isDigit(line.charAt(14)))
                {
                    //System.out.println(line.substring(26));
                    bufferedWriter.write(line.substring(26));
                    bufferedWriter.append(',');
                    bufferedWriter.newLine();
                }
                
                //15 characters to the first number
                //27 characters from start to > with 2 digit records
                //28 characters from start to > with 3 digit records
                //29 characters from start to > with 4 digit records
                //30 with 5 digit
                //so on
            }
            
        }
        bufferedWriter.close();
        
        }
        finally
        {
            if(in !=null)
            {
                in.close();
            }
            if(out !=null)
            {
                out.close();
            }
        }
        }
}
    
