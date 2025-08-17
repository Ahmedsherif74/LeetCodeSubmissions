import java.util.HashMap;

public class kFreqEelement {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> Val = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            Val.put(nums[i] , Val.getOrDefault(nums[i] , 0)+1);
        }
    }
}
