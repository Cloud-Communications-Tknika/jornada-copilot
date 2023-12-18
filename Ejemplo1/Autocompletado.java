package Ejemplo1;

import java.util.HashMap;
import java.util.Map;


public class Autocompletado {
    public static void main(String[] args) {
        
        int a[] = {1, 5, 9, 2, 2, 5, 8, 7, 6};

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }

        System.out.print("\n");

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }

        int mostFrequentNumber = findMostFrequentNumber(a);
        System.out.println("\nThe most frequent number is: " + mostFrequentNumber);
    }

    public static int findMostFrequentNumber(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentNumber = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequentNumber = number;
                maxFrequency = frequency;
            }
        }

        return mostFrequentNumber;
    }
}

    

