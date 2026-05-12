class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        int n=arr.length;
        int target=0;
        for(int i=0;i<n-2;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                int complement=target-(arr[i]+arr[j]);
                if(map.containsKey(complement)){
                    return true;
                }
                map.put(arr[j],j);
            }
        }
        return false;
        
    }
}