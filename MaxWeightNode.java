import java.util.Scanner;

public class MaxWeightNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of cells (N)
        int N = scanner.nextInt();
        int[] edges = new int[N];
        
        // Read the edges
        for (int i = 0; i < N; i++) {
            edges[i] = scanner.nextInt();
        }
        
        // Array to store the weights of each node
        int[] weights = new int[N];
        
        // Calculate the weights
        for (int i = 0; i < N; i++) {
            int targetNode = edges[i];
            if (targetNode != -1) {
                weights[targetNode] += i; // Increment the weight by the index of the source cell
            }
        }
        
        // Find the node with the maximum weight
        int maxWeightNode = -1;
        int maxWeight = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxWeightNode = i;
            }
        }
        
        // Output the result
        System.out.println(maxWeightNode);
        
        scanner.close();
    }
}

