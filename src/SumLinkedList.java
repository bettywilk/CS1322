import java.util.LinkedList;

public class SumLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = sumLinkedList(numbers);
        System.out.println("Sum of numbers in the linked list: " + sum);
    }
    public static int sumLinkedList(LinkedList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
