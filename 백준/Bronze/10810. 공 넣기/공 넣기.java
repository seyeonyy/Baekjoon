import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        int i, j, k;
        for (int l = 0; l < M; l++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            k = scanner.nextInt();
            for (int m = i - 1; m < j; m++) {
                arr[m] = k;
                if(arr[m]!= k){
                    arr[m] = 0;
                }
            }
        }
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}