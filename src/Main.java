import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
    public static void task2() {
        Set<Integer> nums = new HashSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0){
                System.out.print(num+" ");
            }
        }
    }
    public static void task3() {
        Set<String> words = new HashSet<>(List.of("Любовь",
                "Природа",
                "Мир",
                "Природа",
                "Машина",
                "Птица",
                "Птица"));
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        int counter = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).equals(strings.get(i-1))) {
                counter++;
                System.out.println(counter);
            }
        }
    }
}