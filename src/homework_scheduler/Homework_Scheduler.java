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
    static String ending;
    String workingBlockString;
    final static Pattern okBlocks = Pattern.compile("\\((1|2|3|4|5|6|7|8)\\)");
    final static Pattern okPeriods = Pattern.compile("\\(p (1|2|3|4|5|6|7|8)\\)");
    public static void main(String[] args) {
        Homework_Scheduler m = new Homework_Scheduler();
//        m.organize();
        ending = "\n"
                + "\n"
                + "    \n"
                + "Select Language??\n"
                + "\n"
                + "\n"
                + "DETROIT COUNTRY DAY SCHOOL | CONTACT US\n"
                + "\n"
                + "\n"
                + "Lower School (Grades PK-2)\n"
                + "3003 West Maple Road\n"
                + "Bloomfield Hills, MI 48301\n"
                + "Phone: 248.430.2740 Junior School (Grades 3-5)\n"
                + "3600 Bradway Boulevard\n"
                + "Bloomfield Hills, MI 48301\n"
                + "Phone: 248.430.1074 Middle School (Grades 6-8)\n"
                + "22400 Hillview Lane\n"
                + "Beverly Hills, MI 48025\n"
                + "Phone: 248.430.1677 Upper School (Grades 9-12)\n"
                + "22305 West 13 Mile Road\n"
                + "Beverly Hills, MI 48025\n"
                + "Phone: 248.646.7717\n"
                + "\n"
                + "\n"
                + "Detroit Country Day School is a private, independent, co-educational, non-denominational, preschool through grade 12 college preparatory school focused on a well-rounded liberal arts education. Emphasis on academics, arts, athletics, and character development is prevalent across the curriculum. The school admits students of any race, color, religion, sexual orientation, national and ethnic origin to all the rights, privileges, programs and activities generally accorded or made available to students in the school. \n"
                + "Privacy Policy\n"
                + "Full Non-discrimination Statement\n"
                + "\n"
                + "powered by finalsite\n"
                + " Account: Justin Lee  Portal  Groups Dashboard  Bookmarks  Logoff ";
        m.workingBlockString = trim(m.input());
        m.organizeToWorks();
    }

    public String organizeToWorks() {
        String in = this.workingBlockString;
        ArrayList<work> works = new ArrayList();
        work currWork;
        Pattern first = Pattern.compile("\n");
        String[] lines = first.split(in);
        
        for (int i = 0; i < lines.length; i++) 
        {
            String line = lines[i];
//            works.add(line);
            if (line.matches(".+\\(\\d\\):.+")) {
                
                currWork = new work(line.substring(0, line.indexOf(":")-4));
                currWork.setBlocknum(Integer.parseInt(line.substring(line.indexOf(":")-2,line.indexOf(":")-1)));
            }

        }
//        System.err.println(Arrays.toString(works.toArray()));
        return "";
    }

    public static String trim(String in) {
        StringBuilder input = new StringBuilder(in);
        input.delete(0, input.indexOf("<<"));
        input.delete(0, "<<  <  ".length());
        input.delete(input.indexOf(ending), input.length() - 1);

        return input.toString();
    }

    public String input() {
        File file = new File("input.txt");
        StringBuilder input = new StringBuilder();
        try (Scanner in = new Scanner(file)) {       
            while (in.hasNextLine()) {
                String i = in.nextLine();
                input.append(i);
                input.append("\n");
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("there was index out of bounds");
        }

        return input.toString();
    }

}
