import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int l = 0; l < arr.length; l++) {
            arr[l] = l + 1;
        }
        int tmp = 0;
        for(int k = 0; k < M; k++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            tmp = arr[j-1];
            arr[j-1] = arr[i-1];
            arr[i-1] = tmp;
        }
        for(int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}
