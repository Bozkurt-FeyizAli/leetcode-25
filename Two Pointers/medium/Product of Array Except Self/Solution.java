class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int dnz=nums[0];
        int dz=nums[0];
        if(nums[0]==0){
            dz=1;
        }
        int nof0=0;
        if(nums[0]+1==1) nof0++;
        for (int i = 1; i < res.length; i++) {
            dnz*=nums[i];      
            if(nums[i]!=0) dz*=nums[i];   
            else nof0++;          
        }
        for (int i = 0; i < res.length; i++) {
            res[i]=dnz;
        }
        for (int j = 0; j < res.length; j++) {
            if(nums[j]==0){
                if(nof0==1){res[j]=dz;} 
                else{ res[j]=0;}
            }
            else res[j]/=nums[j];
        }
        
        System.out.println(nof0);
        return res;
    }
}