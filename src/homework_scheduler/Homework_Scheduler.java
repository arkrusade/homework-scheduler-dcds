/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Justin
 */
public class Homework_Scheduler {

    /**
     * @param args the command line arguments
     */
    ArrayList<String> classes = new ArrayList(7);
    String workingBlockString;
    final static Pattern okBlocks = Pattern.compile("\\((1|2|3|4|5|6|7|8)\\)");
    final static Pattern okPeriods = Pattern.compile("\\(p (1|2|3|4|5|6|7|8)\\)");
    final static Pattern honors = Pattern.compile("\\(H\\)");

    public static void main(String[] args) {
        Homework_Scheduler m = new Homework_Scheduler();
//        m.organize();
        m.workingBlockString = trim(m.input());
        m.organizeToWorks();
    }

    public String organizeToWorks() {
        String in = this.workingBlockString;
        ArrayList<work> works = new ArrayList();
        work currWork;
        Pattern first = Pattern.compile("\n");
        String[] lines = first.split(in);
        Matcher lineHonors;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
//            works.add(line);
            if (line.matches(".+\\(\\d\\):.+")) {
                lineHonors = honors.matcher(line);

                currWork = new work(line.substring(0, line.indexOf(":") - 4));
                if (!lineHonors.find()) {
                    currWork.setHonors(true);
                    line = lineHonors.replaceAll("");
                }

                currWork.setBlocknum(Integer.parseInt(line.substring(line.indexOf(":") - 2, line.indexOf(":") - 1)));
            }

        }
//        System.err.println(Arrays.toString(works.toArray()));
        return "";
    }

    public static String trim(String in) {
        StringBuilder input = new StringBuilder(in);
        input.delete(0, input.indexOf("<<"));
        input.delete(0, "<<  <  ".length());

        return input.toString();
    }

    public String input() {
        try {
            //        File file = new File("input.txt");
//        StringBuilder input = new StringBuilder();
//        try (Scanner in = new Scanner(file)) {
//            while (in.hasNextLine()) {
//                String i = in.nextLine();
//                input.append(i);
//                input.append("\n");
//            }
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found");
//        } catch (StringIndexOutOfBoundsException exception) {
//            System.out.println("there was index out of bounds");
//        }
//        
//        return input.toString();
            return web.scrape();
        } catch (InterruptedException ex) {
            Logger.getLogger(Homework_Scheduler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Failure";
    }
}
