class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(int nums:map.keySet()){
            if(map.get(nums)>arr.length/2){
                return nums;
            }
        }
        return -1;
    }
}