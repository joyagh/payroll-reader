package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PayrollReader {
    public static void main(String[] args) {
        //File reafder


        try {
            //Read file with buffer
            BufferedReader bufferedReader =  new BufferedReader(new FileReader("src/main/resources/employees.csv"));
            String input;
            bufferedReader.readLine();

            while ((input = bufferedReader.readLine()) != null){
                String[] splitData = input.split(Pattern.quote("|"));
                int id = Integer.parseInt(splitData[0]);
                String name = splitData[1];
                double hoursWorked = Double.parseDouble(splitData[2]);
                double payRate = Double.parseDouble(splitData[3]);
            }
            bufferedReader.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Issue with IO");
        } catch (IOException e ){
            e.printStackTrace();
            System.out.println("Issue with IO");
        }




    }
}
