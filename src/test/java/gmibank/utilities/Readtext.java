package gmibank.utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Readtext {
    public static List<String>  returnAllCustomers(String filePath)  {

        List<String> allSSNIds =new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line =reader.readLine();
        //    System.out.println(line);

           int i =0;
           while (line !=null){
               String temp = "";
               temp= line.split(",")[0].trim();

               sb.append(System.lineSeparator())    ;
               line=reader.readLine();

               System.out.println(i++);

               allSSNIds.add(temp);
           }




        } catch (IOException e) {
            e.printStackTrace();
        }
        return allSSNIds;

    }

}
