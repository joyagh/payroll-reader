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
            //Variable to hold lines
            // While loop to keep reading while lnes are true
            // Store each line part into variables
            // New employee object
            // Print New Onject
        } catch(IOException e){
            System.out.println("Error reading file.");
        }
            // try/catch



    }
}
