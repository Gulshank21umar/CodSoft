
    import java.util.Scanner;
    public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int sub = sc.nextInt();
            int totalMarks = 0;
            double average;
            for (int i = 1; i <= sub; i++) {
                System.out.print("Enter marks  for subject " + i + ": ");
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                   System.out.println("Invalid marks. Marks should be between 0 and 100.");
                    return;
                }
                totalMarks += marks;
            }
            average = (double) totalMarks / sub;
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + average + "%");
            String grade;
            if (average >= 90) {
                grade = "A+";
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);

            sc.close();
        }
    }


