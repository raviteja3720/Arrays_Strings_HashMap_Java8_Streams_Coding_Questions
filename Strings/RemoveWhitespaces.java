package Strings;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String s="Ra vi tej a";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                result.append(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
