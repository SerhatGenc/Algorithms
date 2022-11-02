package SortingAlgorithms;
/*
    Formule of Algorithm speed O(N^2).

    Negative sides:
    -So slow
 
 */
public class BubbleSort {
    public static int[] Sort(int[] list) { 

        for(int i = 0; i< list.length-1; i++){  // We start a nested loop. i = narrowing right side in list.
            for(int j = 0; j<list.length-1-i; j++){ // j = find the bigger one on the list and add the right side.
                if(list[j]>list[j+1]){
                    int x = list[j]; // Changing operation.
                    list[j] = list[j+1];
                    list[j+1] = x;
                }
            }
        }
        return list;
    }
}

// This seem little bit confusing, you can understand better here: https://visualgo.net/en/sorting