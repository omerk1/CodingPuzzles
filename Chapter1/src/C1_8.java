/**
 * Created by 0mer on 08/10/2017.
 */
public class C1_8 {

    public static boolean isSubstring(String s1, String s2){
        if(s1.length()<s2.length()) return false;
        if(s1.length()==s2.length()) return s1.equals(s2);
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int matchLength=1;
                for(int j=1;j<s2.length();j++){
                    if(s1.charAt(i+j)!=s2.charAt(j)){
                        break;
                    }
                    matchLength++;
                }
                if(matchLength==s2.length()) return true;
            }
        }
        return false;
    }

    public static boolean isRotation(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if(n1 != n2)
            return false;
        s1 = s1.concat(s1);

        return isSubstring(s1,s2);
    }

    public static void main(String[] args) {
        String s1 = "omer";
        String s2 = "mero";
        System.out.println(isRotation(s1,s2));
    }
}