class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        if(n<0){
            return false;
        }
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        
        if(count == 1){
            return true;
        }
        else{
            return false;
        }
        
    }
}