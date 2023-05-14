import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 1; i <= T; i++){
            String S = scanner.next();
            System.out.println(S.charAt(0)+""+S.charAt(S.length()-1));
        }
    }
}