import java.util.*;

class Solution {

    public List<Integer> frequencyCount(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for(int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Add frequency from 1 to n
        for(int i = 1; i <= arr.length; i++) {

            list.add(map.getOrDefault(i, 0));
        }

        return list;
    }
}