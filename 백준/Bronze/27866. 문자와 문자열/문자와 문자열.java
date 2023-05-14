import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = scanner.nextInt();
        char[] word = new char[S.length()+1];
        for(int j = 1; j < word.length; j++){
            word[j] = S.charAt(j-1);
        }
        for(int j = 1; j < word.length; j++){
            if(i == j){
                System.out.println(word[j]);
            }
        }
    }
}