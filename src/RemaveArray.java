import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemaveArray {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();

        String separator = File.separator;
        String path = separator + "Users" + separator + "nurba" + separator + "OneDrive" + separator + "Рабочий стол" + separator + "input.txt.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            arrayList.add(scanner.nextLine());
        }
        scanner.close();

        Set<String> set = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);

        // Step 3: Print the list of strings with duplicates removed
        System.out.println("List of strings with duplicates removed:");
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
