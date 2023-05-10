import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println(max);
        for(int k = 0; k < arr.length; k++){
            if(max == arr[k]){
                System.out.print(k+1);
            }
        }
    }
}