class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        int n = 32;
        while(n-- !=0){
            int abit = a&1;
            int bbit = b&1;
            int cbit = c&1;
            
            if(cbit == 0){
                count += abit + bbit;
            }
            else{
                if(abit == 0 && bbit == 0){
                    count+=1;
                }
                
            }
            
            
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        
        return count;
    }
}