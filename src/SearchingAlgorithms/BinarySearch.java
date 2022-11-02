package SearchingAlgorithms;
/*
Formule of search speed O(logN).

Positive sides:
+very fast
Negative Sides:
-Only works on sorted  list

*/ 

public class BinarySearch {
    public static int sort(int[] list , int sNumber) {
        int last = list.length - 1;
        int firts = 0;
        int mid = (last+firts)/2;
        int count = -1;
        while(sNumber != list[mid]){
            if(count == mid){
                mid = -1;
                break;
            }
            if(sNumber>list[mid]){
                firts = mid;
            }
            else{
                last = mid;
            }
            count = mid;
            mid = (last+firts)/2;
        }
        return mid;
    }
}
