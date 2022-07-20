import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        removeDuplicates(nums);
        System.out.println("nums"+nums.length);
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> n = new ArrayList<Integer>();
        int f = nums[0];
        n.add(f);
        for(int i= 1;i<nums.length;i++){
            if(f!=nums[i]){
                n.add(nums[i] );
                f = nums[i];
            }
        }
        for (int j = 0; j<n.size();j++){
            nums[j] = n.get(j);

        }
        System.out.println("----------------");
        for(int i= 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return n.size();

    }
    public int removeElement(int[] nums, int val) {
        List<Integer> n = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                n.add(nums[i]);
            }
        }
        for (int j = 0; j<n.size();j++){
            nums[j] = n.get(j);
        }
        return n.size();

    }
}
