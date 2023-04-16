import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Nurbakyt");
        arrayList.add("Aslan");
        arrayList.add("Arman");

        for (String names:arrayList){
            System.out.println(names);
        }
    }
}