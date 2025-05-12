import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        ContainDuplicate217 checker = new ContainDuplicate217();
        int[] test1 = {1, 2, 3, 4};           // No duplicates
        int[] test2 = {1, 2, 3, 1};           // Has duplicates
        int[] test3 = {};                     // Empty array
        int[] test4 = {5, 5, 5, 5};           // All duplicates


        System.out.println(checker.containsDuplicate(test1)); // false
        System.out.println(checker.containsDuplicate(test2)); // true
        System.out.println(checker.containsDuplicate(test3)); // false
        System.out.println(checker.containsDuplicate(test4)); // true
    }
}
