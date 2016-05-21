/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_scheduler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Justin Lee
 */
public class date {
    private int day;
    private int month;
    private int year;
    
    public date(int d, String m, String y){
        day = d;
        if (m == "January"){
            month = 1;
        }
         if (m == "Febuary"){
            month = 2;
        }
         if (m == "March"){
            month = 3;
        }
         if (m == "April"){
            month = 4;
        }
          if (m == "May"){
            month = 5;
        }
         if (m == "June"){
            month = 6;
        }
         if (m == "July"){
            month = 7;
        }
         if (m == "August"){
            month = 8;
        }
          if (m == "September"){
            month = 9;
        }
         if (m == "October"){
            month = 10;
        }
         if (m == "November"){
            month = 11;
        }
         if (m == "December"){
            month = 12;
        }
    }
}
