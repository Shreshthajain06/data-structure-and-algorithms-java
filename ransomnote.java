import java.util.HashMap;
public class ransomnote{ 

    public static
     boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

      
        for(int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomnote="aa";
        String magazine="aab";
       boolean ans= canConstruct(ransomnote,magazine);
       System.out.println(ans);
    }
}





   