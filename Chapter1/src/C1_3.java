/**
 * Created by 0mer on 07/10/2017.
 */
public class C1_3 {


    public static void removeDuplicates(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        if (tail != len)
            str[tail] = 0;
    }

    public static void main(String[] args){
        String str = "rormrerr";
        char[] strA;
        strA = str.toCharArray();
        removeDuplicates(strA);
        str = strA.toString();


        int i = 0;
        while (strA[i] != 0 && i<strA.length) {
            System.out.print(strA[i]);
            ++i;
        }
    }
}
