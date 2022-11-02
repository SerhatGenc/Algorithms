package SearchingAlgorithms;
/*
Formule of search speed O(logN).

Positive sides:
+Very fast
Negative Sides:
-Only works on sorted  list

*/ 

public class BinarySearch {
    public static int sort(int[] list , int sNumber) {
        
        int last = list.length - 1;  //Found the last of list.
        int firts = 0; // Found the first of list(Obviusly 0).
        int mid = (last+firts)/2;   //Found middle of list for a start loop.
        int count = -1; // Count for the saves us a infinite loop if sNumber not in the list.
        
        while(sNumber != list[mid]){ //Start the loop 
            if(count == mid){ // If mid repeats itself stop the loop and return a -1.
                mid = -1;
                break;
            }
            if(sNumber>list[mid]){ // If sNumber bigger then list[mid] ===> sNumber is between mid and last number.
                firts = mid;
            }
            else{   // If sNumber lower then list[mid](we dont need a new if because only 1 possibility have) ===> sNumber is between a first and mid.
                last = mid;
            }
            count = mid;    
            mid = (last+firts)/2; // Find the new mid of divided range.
        }
        return mid;
    }
}
