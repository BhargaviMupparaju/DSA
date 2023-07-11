
public class Anagram{

    public boolean anagram(String s,String t) {

        if (s.length() != t.length())
            return false;

        int [] char_cnt=new int[26];

        for (int i = 0; i < s.length(); i++) {
            char_cnt[s.charAt(i)-'a']++;

            char_cnt[t.charAt(i)-'a']--;

        }

        for (int cnt: char_cnt){
            if(cnt!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        Anagram l=new Anagram();
        System.out.println("z:"+  l.anagram(s,t));



    }
}