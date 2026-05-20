class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        int end=k;
        for(int i=1;i<=n-k;i++){
            sum=sum+arr[end]-arr[i-1];
            maxsum=Math.max(sum,maxsum);
            end++;
        }
        return maxsum;
        
    }
}