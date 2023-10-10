import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExerciseFour {
    public static void main(String[] args) {
        String csvFilePath = "Prakhar\\DayThirteenFourteen\\student.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            double totalScore = 0.0;
            int numStudents = 0;

            // Skip the header line if present
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                // Split the line into fields based on the CSV delimiter (usually a comma)
                String[] fields = line.split(",");

                if (fields.length >= 2) {
                    String studentName = fields[0].trim();
                    double score = Double.parseDouble(fields[1].trim());

                    // Process the student data
                    System.out.println("Student: " + studentName + ", Score: " + score);

                    // Accumulate the scores for calculating the average
                    totalScore += score;
                    numStudents++;
                }else {
                    System.out.println("CSV format is wrong please fix the format CSV with name and score");
                }
            }

            // Calculate and display the average score
            if (numStudents > 0) {
                double averageScore = totalScore / numStudents;
                System.out.println("---------------\nAverage Score of "+numStudents+" students: " + averageScore);
            } else {
                System.out.println("No student data found.");
            }
        } catch (IOException e) {
            System.err.println("Exception Found: "+e.getMessage());
        }
    }
}
