public class EasyTest01 {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        searchInsert(nums,4);
    }
    public static int searchInsert(int[] nums, int target) {
        int p=0;
        int q=nums.length-1;
        while(p<q){
            if(nums[p]<=target){

                if(nums[p]==target){
                    return p;
                }
                p++;

            }else {
                return ((p==0)?0:p+1);
            }
            if(nums[q]>=target){
                if(nums[q]==target){
                    return q;
                }
                q--;
            }else {
                return q+1;

            }

        }
        if(p>=q){
            return p;
        }
        return 0;


    }
}
