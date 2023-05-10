import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] < X) {
                System.out.printf(A[j]+" ");
            }
        }
    }
}