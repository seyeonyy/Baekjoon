import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String wordArrAscii = "abcdefghijklmnopqrstuvwxyz";
        char[] wordArrAscii2 = wordArrAscii.toCharArray();
        for(int i = 0; i < wordArrAscii.length(); i++){
            System.out.print(word.indexOf(wordArrAscii2[i])+" ");
        }
    }
}