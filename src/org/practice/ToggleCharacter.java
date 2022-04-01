package org.practice;

public class ToggleCharacter {

    public static void main(String[] args) {

        String name = "PepCodinG";

        toggleCharacter(name);

    }
    //lc - 'a' = uc - 'A'
    //uc = 'A' - 'a' + lc
    //lc = 'a' + uc - 'A'
    private static void toggleCharacter(String name) {
        StringBuilder sb = new StringBuilder(name);

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.setCharAt(i, (char)('A' - 'a' + ch));
            }else if(ch >= 'A' && ch <= 'Z'){
                sb.setCharAt(i, (char)('a' - 'A' + ch));
            }
        }
        System.out.println(sb);
    }
}
