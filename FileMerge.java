import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        try {
            // First input file path
            String inputFile1 = "file1.txt";
            // Second input file path
            String inputFile2 = "file2.txt";
            
            // Open first input file
            FileInputStream inputStream1 = new FileInputStream(inputFile1);
            
            // Open second input file
            FileInputStream inputStream2 = new FileInputStream(inputFile2);
            
            // Merge data from input files
            SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);
            
            // Read data from merged input stream
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            // Display merged data on console
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close files
            inputStream1.close();
            inputStream2.close();
            bufferedReader.close();
            
            System.out.println("File merge successful.");
        } catch (IOException e) {
            System.out.println("An error occurred while merging the files.");
            e.printStackTrace();
        }
    }
}
