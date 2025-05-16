import org.xml.sax.SAXException;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

public class isAnagram1 {

    public boolean isAnagram1(String s, String t){
        HashMap<Character, Integer> tableS = new HashMap<>();
        HashMap<Character, Integer> tableT = new HashMap<>();

        if (s.length()!=t.length()){
            return false;
        }
        for (int i =0 ; i<s.length(); i++){
            tableS.put(s.charAt(i) , tableS.getOrDefault(s.charAt(i), 0)+1);
            tableT.put(t.charAt(i) , tableT.getOrDefault(t.charAt(i), 0)+1);
        }
        return tableS.equals(tableT);

    }

    public static void main(String[] args) {
        isAnagram1 chcker =new isAnagram1();

        System.out.println(chcker.isAnagram1("abb", "abb"));
    }
}
