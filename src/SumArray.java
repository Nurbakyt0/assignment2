import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        String separator = File.separator;
        String path = separator+"Users"+ separator+"nurba"+separator + "OneDrive"+separator+"Рабочий стол"+separator+"input.txt.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()){
            arrayList.add(scanner.nextInt());
        }
        scanner.close();

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        double average = (double) sum / arrayList.size();

        // Step 3: Print the sum and average of the numbers
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
