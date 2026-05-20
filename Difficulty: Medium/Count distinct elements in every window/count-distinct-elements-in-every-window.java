class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        int end=k;
        for(int i=1;i<=n-k;i++){
            int out=arr[i-1];
            map.put(out,map.get(out)-1);
            if(map.get(out)==0){
                map.remove(out);
            }
            int in=arr[end];
            map.put(in,map.getOrDefault(in,0)+1);
            list.add(map.size());
            end++;
        }
        return list;
    }
}