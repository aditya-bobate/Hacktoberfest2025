import java.util.PriorityQueue;
import java.util.Scanner;

public class AdvancedDataStructure_PriorityQueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Min-Heap by default (smallest element first)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Enter numbers to add to Priority Queue (type 'done' to finish):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            try {
                int num = Integer.parseInt(input);
                pq.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again!");
            }
        }

        // Displaying elements in priority order
        System.out.println("\nPolling elements from Priority Queue in order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Removes and returns the head
        }

        sc.close();
    }
}
