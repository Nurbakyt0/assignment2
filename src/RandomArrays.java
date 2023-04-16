import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0 ; i<=10 ; i++){
            int randomNumbers = random.nextInt(10);
            arrayList.add(randomNumbers);
        }
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("sorted list"+arrayList);
    }
}
