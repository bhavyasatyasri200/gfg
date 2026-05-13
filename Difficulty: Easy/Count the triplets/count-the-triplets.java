import java.util.*;

class Solution {
    int countTriplet(int arr[]) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        HashSet<String> triplets = new HashSet<>();
        
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = i + 1; j < n; j++) {
                
                int sum = arr[i] + arr[j];
                
                if (set.contains(sum)) {
                    
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);
                    
                    triplets.add(a + "," + b + "," + sum);
                }
            }
        }
        
        return triplets.size();
    }
}