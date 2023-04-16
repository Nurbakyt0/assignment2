import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();

        String separator = File.separator;
        String path = separator + "Users" + separator + "nurba" + separator + "OneDrive" + separator + "Рабочий стол" + separator +"StudentGrades.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int grade = Integer.parseInt(parts[1]);
            students.add(new Student(name, grade));
        }
        scanner.close();

        // Sort the list by grade in descending order
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.getGrade() - s1.getGrade();
            }
        });

        // Print the sorted list of students
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }
    }
}


