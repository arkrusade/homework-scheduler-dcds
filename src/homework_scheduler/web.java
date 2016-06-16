package homework_scheduler;

import java.net.*;
import java.io.*;

public class web {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://www.dcds.edu/page.cfm?p=8186Z");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}