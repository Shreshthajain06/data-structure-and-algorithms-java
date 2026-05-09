import java.util.HashMap;

public class Longestsubstring {
     public static int lengthOfLongestSubstring(String s) {
      
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
public static void main(String[] args) {
    
    String s="abcdaabce";
    int n=lengthOfLongestSubstring(s);
    System.out.println(n);
} 
}
    


