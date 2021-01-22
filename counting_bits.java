class Solution {
    public int[] countBits(int num) {
        
        int res[] = new int[num+1];
        
        for(int i=0;i<num+1;i++){
         int cnt = 0;
         int n = i;
            
            while(n!=0){
                cnt++;
                n = n & (n-1);
            }
            
            res[i] = cnt;
            
        }
        return res;
    }
}