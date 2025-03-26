import java.io.*;
public classConvertupperotlower {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        convertFileToLowercase(inputFile, outputFile);
    }
    public static void convertFileToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine(); // Maintain original line structure
            }
            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
