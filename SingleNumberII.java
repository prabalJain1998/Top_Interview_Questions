class Solution {
    public int singleNumber(int[] nums) {
          
        int arr[] = new int[32];
        
        for(int i=0;i<nums.length;i++){
            int temp = 32;
            int n = nums[i];
            while(temp !=0){
                int bit = n&1;
                if(bit == 1){
                    arr[32-temp]++;
                }
                n = n>>1;
                temp--;
            }
        
        }
        
        int res=0;
        for(int i=0;i<32;i++){
            if(arr[i]%3 == 1){
                res += (1<<i);
            }
            
        }
        
        
        
        return res;
        
        
        
    }
}