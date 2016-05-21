/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_scheduler;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author Justin Lee
 */
public class day {
    String classtext = "Monday - April 18, 2016\n" +
"\n" +
"ADVANCED BIOLOGY (H) AP/IB (2): Excretion\n" +
"(p 2)\n" +
"Read Chapter 50\n" +
"\n" +
"WORLD LITERATURE (H) AP/IB (7): Godot - finale. Journal due.\n" +
"(p 7)\n" +
"\"Homework - 1) Godot - Best journal is due. Single grade.\n" +
"2) Overview of Oedipus the King\"\n" +
"\n" +
"FRENCH IV (H) IB (1): reading page 190-191 and summarize\n" +
"(p 1)\n" +
"write e-mail #4 page 192\n" +
"\n" +
"HISTORY OF THE AMERICAS (H) IB (3): Reading Quiz / Foreign Policy in the 50s\n" +
"(p 3)\n" +
"Complete plan, outline, etc.\n" +
"\n" +
"CALCULUS BC (H) AP/IB (5): Review Day Discuss FR packets\n" +
"(p 5)\n" +
"\n" +
"PHYSICS (H) IB (4): Speed of light\n" +
"(p 4)\n" +
"\"lab due today\n" +
"WW phys_optics due Tuesday\"";
    String day,month;
    int date,year;
    public static void main(String[] args)
    {
        day x = new day();
        x.parse();
    }
    public void parse()
    {
        Pattern first = Pattern.compile("\n");
        Pattern word = Pattern.compile("\\w");
        String[] lines = first.split(classtext);
        ArrayList<String> classes = new ArrayList();
        
//
//        day = temp[0];
//        month = temp[2];
//        date = Integer.parseInt(temp[3]);
//        year = Integer.parseInt(temp[5]);
//        Pattern classSplit = Pattern.compile("^\\w+ (\\(H\\))? ((IB)|(AP/IB))? \\(\\d\\): \\w+ \\(p \\d\\)$(\\w+$)+");
        Pattern classSplit = Pattern.compile(".*(\\(H\\)).*$?.*1");
        String[] hi = classSplit.split(classtext);        
        for (String line : lines) {
            if(line.matches(classSplit.toString()))
            {
                classes.add(line);
                
            }
        }
        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(classes.toArray()));

        
    }
}
