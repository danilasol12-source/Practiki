//Задание 6

public class ProcessStrings implements Stringi {
    public int countChars(String s){
        return s.length();
    }

    public String oddPositionChars(String s){
        String snew = "";
        for(int i = 1; i<s.length(); i+=2){
            snew += s.charAt(i);
        }
        return snew;
    }

    public String reverseString(String s){
        String snew = "";
        for (int i = s.length()-1; i>=0; i--){
            snew += s.charAt(i);
        }
        return snew;
    }
}
