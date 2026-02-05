package src;

public class remove_duplicate_from_sorted_array {
    public static int removeDuplicates(int[] nums) {

        int index = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}
