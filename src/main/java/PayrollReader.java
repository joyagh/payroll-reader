import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollReader {
    public static void main(String[] args) {
        //File reafder
        String fileName = "employees.csv";

        try {

            // Open file
            FileReader fileReader = new FileReader(fileName);

            //Read file with buffer
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Variable to hold lines
            String input;
            // While loop to keep reading while lnes are true
            while(input = bufferedReader.readLine()) =! null){

            }
            // Store each line part into variables
            // New employee object
            // Print New Onject
        } catch(IOException e){
            System.out.println("Error reading file.");
        }
            // try/catch



    }
}
