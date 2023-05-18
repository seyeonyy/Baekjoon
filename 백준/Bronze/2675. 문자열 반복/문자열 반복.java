import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] P = new String[T];
        Arrays.fill(P,"");
        for(int i = 0; i < T; i++){
            int R = scanner.nextInt();
            String S = scanner.next();
            for(int k = 0; k < S.length(); k++){
                for(int j = 0; j < R; j++){
                    P[i] += S.charAt(k);
                }
            }
        }
        for(int i = 0; i < T; i++){
            System.out.println(P[i]);
        }
    }
}