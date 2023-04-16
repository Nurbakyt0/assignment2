import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class NumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter Number and in the end enter number '0': ");
        int input;
        while ((input  = scanner.nextInt())!= 0){
            arrayList.add(input);
        }

        int min = Collections.min(arrayList);
        int max = Collections.max(arrayList);

        System.out.println("minimum values in the list: "+min);
        System.out.println("maximum values in the list: "+max);
    }
}
