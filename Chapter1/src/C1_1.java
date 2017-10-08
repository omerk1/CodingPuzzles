import java.util.HashMap;
import java.util.Map;

/**
 * Created by 0mer on 07/10/2017.
 */
public class C1_1 {

    static boolean withAddDS(String str){
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        Character c;
        for (int i=0; i<str.length(); i++){
            c = str.charAt(i);

            if (m.get(c) != null)
                return false;
            else
                m.put(c,1);
        }
        return true;
    }

    static boolean withoutAddDS(String str){
        Character c;
        for (int i=0; i<str.length(); i++){
            c = str.charAt(i);
            for (int j=0; j<i; j++){
                if (c == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "omer koer";
        System.out.println("With additional DS: " + withAddDS(s));
        System.out.println("Without additional DS: " + withoutAddDS(s));
    }
}
