class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> result=new ArrayList<>();
        solve("",n/2,0,0,result);
        return result;
        
    }
    public void solve(String s,int n,int open,int close,List<String> result){
        if(s.length()==2*n){
            result.add(s);
            return;
        }
        if(open<n){
            solve(s+"(",n,open+1,close,result);
        }
        if(close<open){
            solve(s+")",n,open,close+1,result);
        }
    }
}