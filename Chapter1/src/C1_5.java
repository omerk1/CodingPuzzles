/**
 * Created by 0mer on 08/10/2017.
 */
public class C1_5 {

    public static void replaceSpaces(char[] str){
        int spacesCounter = 0;
        for(int i = 0 ; i < str.length ; i++)
            if (str[i] == ' ')
                spacesCounter++;
        char[] newStr = new char[str.length + 2*spacesCounter];
        for(int i = str.length-1 ; i >= 0 ; i--){
            if(str[i] == ' '){
                newStr[i + 2*spacesCounter] = '0';
                newStr[i + 2*spacesCounter - 1] = '2';
                newStr[i + 2*spacesCounter - 2] = '%';
                spacesCounter--;
            }
            else{
                newStr[i + 2*spacesCounter] = str[i];
            }
        }
        for (int j = 0 ; j < newStr.length ; j++)
            System.out.print(newStr[j]);
    }

    public static void main(String[] args) {
        String s = "om  e r";
        char[] sA = s.toCharArray();
        replaceSpaces(sA);
    }
}
