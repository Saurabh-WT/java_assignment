package day13_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedOperations {
    public static void main(String[] args) {
        String csvFile = "Fiza\\src\\day13_14\\student.csv";
        double averageScore = calculateAverageScore(csvFile);

        System.out.println("Average Score: " + averageScore);
    }

    public static double calculateAverageScore(String filePath) {
        double totalScore = 0.0;
        int numberOfStudents = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    try {

                        double score = Double.parseDouble(parts[1].trim());
                        totalScore += score;
                        numberOfStudents++;
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid score format in CSV row: " + parts[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (numberOfStudents == 0) {
            return 0.0; // Return 0 if no valid scores were found
        }

        return totalScore / numberOfStudents;
    }
}
