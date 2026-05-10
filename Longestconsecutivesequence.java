import java.util.HashSet;
import java.util.Set;

public class Longestconsecutivesequence{
    public static int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);

    int longest = 0;

    for (int num : set) {
        if (!set.contains(num - 1)) {
            int current = num;
            int length = 1;

            while (set.contains(current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);
        }
    }

    return longest;
}
    public static void main(String[] args) {
        int[] nums={1,2,100,4,3,200,5};
        int ans=longestConsecutive(nums);
        System.out.println(ans);
    }
}