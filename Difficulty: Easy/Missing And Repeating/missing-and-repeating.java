//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// class Solution {
//     // Function to find two elements in array
//     ArrayList<Integer> findTwoElement(int arr[]) {
//         ArrayList<Integer> result=new ArrayList<>();
//         java.util.Arrays.sort(arr);
//         int  repeat=-1;
//         int missing=-1;
//         for(int i=1;i<arr.length;i++)
//         {
//             if( arr[i]==arr[i-1])
//             {
//                 repeat=arr[i];
                
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]!=i+1)
//             {
//               missing=i+1;
//               break;
//             }
            
//         }
//         if (missing==-1)
//         {
//             missing = arr.length;
//         }
//         result.add(repeat);
//         result.add(missing);
//       return result;
//     }
// }




class Solution {
    // Function to find two elements in the array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
       java.util.Arrays.sort(arr);  // Sort the array
        
        int repeat = -1;
        int missing = -1;
        int n = arr.length;

        // Find the repeating number
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                repeat = arr[i];
            }
        }

        // Find the missing number
        // Check the numbers in range [1, n]
        boolean[] seen = new boolean[n + 1]; // to keep track of numbers seen
        for (int i = 0; i < n; i++) {
            seen[arr[i]] = true;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        // Add the results to the result list
        result.add(repeat);
        result.add(missing);
        
        return result;
    }

    
}

