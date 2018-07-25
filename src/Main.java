import operations.Operation;
import operations.OperationFactory;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        // Check if any argument has been passed. If not, exit.
        if(args.length == 0)
        {
            System.out.println("Error: An argument of input file expected.");
            System.exit(0);
        }

        ArrayList<Operation> listOfOperations = new ArrayList<>();
        Double result;


        try {
            //Open stream and read file via BufferedReader
            FileInputStream fistream = new FileInputStream(args[0]);
            DataInputStream in = new DataInputStream(fistream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            //Put first line of the file into strLine
            String strLine = br.readLine();
            String nextLine;

            // While there is one more line after current line, separate line into tokens and add appropriate Operation into listOfOperations
            while ((nextLine = br.readLine()) != null) {
                String[] tokens = strLine.split(" ");
                listOfOperations.add(OperationFactory.getOperation(tokens[0], new Double(tokens[1])));
                strLine = nextLine;

            }

            //Last line is the starting number. Call getResult with the startnig number (that is the second token).
            String[] tokens = strLine.split(" ");
            result =  OperationFactory.getResult(listOfOperations, new Double(tokens[1]));

            if (result != null) {
                //  System.out.println(result);
                System.out.println(Math.round(result));
            } else{
                //if result is null, something went wrong (probably not implemented operation in the input file?)
                System.out.println("An error has occurred. The input file may possibly contain some nonexistent operations.");
            }

            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}
