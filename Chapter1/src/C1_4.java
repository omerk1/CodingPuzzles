/**
 * Created by 0mer on 08/10/2017.
 */
public class C1_4 {

    public static boolean areAnagrams(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if(n1 != n2)
            return false;
        int[] a1 = new int[256];
        int[] a2 = new int[256];
        int i;
        for (i = 0 ; i < 256 ; i++){
            a1[i] = 0;
            a2[i] = 0;
        }
        for (i = 0 ; i < n1 ; i++){
            a1[s1.charAt(i)]++;
        }
        for (i = 0 ; i < n2 ; i++){
            a2[s2.charAt(i)]++;
        }
        for (i = 0 ; i < 256 ; i++){
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "rome";
        String s2 = "omel";
        System.out.println(areAnagrams(s1,s2));
    }
}