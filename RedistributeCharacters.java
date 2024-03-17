import java.util.HashMap;

public class RedistributeCharacters {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> temp = new HashMap<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(temp.containsKey(ch)){
                    temp.put(ch, temp.get(ch)+1);
                }else{
                    temp.put(ch,1);
                }
            }
        }

        for(Character ch:temp.keySet()){
            int count = temp.get(ch);
            int len = words.length;
            if(count%len != 0) return false;
        }
        return true;
    }
}
