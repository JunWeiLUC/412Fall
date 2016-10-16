import java.io.*;

public class Test {
    public static void main(String [] args) {

        String fileName = "input.txt";

        String line = null;
		
		double sum = 0;
		double mean = 0;
		int count = 0;

        try {
                FileReader fileReader = new FileReader(fileName);

                BufferedReader reader = new BufferedReader(fileReader);

            while((line = reader.readLine()) != null) {
                sum = sum + Double.valueOf (line);
				count ++;
				mean =sum/count;
				
            }   

            reader.close(); 
			System.out.println (mean);
			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
           
        }
    }
}