import java.util.*;
public class week_11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        /* int size = s.nextInt();
         int length = s.nextInt();
         int pair = 0;
         int[] a = new int [length];
         for(int i =0;  i < length ; i++){
             a[i] = s.nextInt();
         }
        for (int i = 0; i < length; i++) {

            if(a[i] > size){
                pair++;
                size =  a[i] + 3;
            }

        }
        System.out.println(pair);*/
        String list = "HeLLo WorLD";
        toAlternativeString(list);
        int a  = s.nextInt();
        System.out.println(a % 109);












    }

    public static String toAlternativeString(String string){
        char[] charArr = string.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(Character.isLowerCase(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
            else{
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
        }
        return new String(charArr);
    }
}


