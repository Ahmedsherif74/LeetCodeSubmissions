import java.util.Arrays;
import java.util.HashMap;

public class twoSum1 {
    public int[] twosum(int[] nums, int target){
        HashMap <Integer , Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i] ,i);
        }
        for (int i = 0; i <nums.length; i++) {
            int diff = target - nums[i];
            if (values.containsKey(diff) && values.get(diff)!=i) {
                return new int[]{i, values.get(diff)};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoSum1 checher = new twoSum1();

        int[] result =checher.twosum(new int []{1,2,5} , 7);
        System.out.println("Result is " + Arrays.toString(result));




    }
}
