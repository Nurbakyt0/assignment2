import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        String input = scanner.nextLine();
        String[] wordArray = input.split(" ");
        Collections.addAll(arrayList, wordArray);
        Collections.sort(arrayList);

        System.out.println("Sorted list of words:");
        for (String word : arrayList) {
            System.out.print(word+' ');
        }
    }
}
