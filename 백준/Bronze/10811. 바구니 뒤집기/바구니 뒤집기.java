import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] baguni = new int[N+1];
        for(int k = 1; k< baguni.length; k++){
            baguni[k] = k;
        }
        int tmp = 0;
        for(int k = 1; k <= M; k++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            if((j-i) < 2){
                tmp = baguni[j];
                baguni[j] = baguni[i];
                baguni[i] = tmp;
            }
            else{
                for(int l = 1; l <= ((j-i)/2)+1; l++){
                    tmp = baguni[j-l+1];
                    baguni[j-l+1] = baguni[i+l-1];
                    baguni[i+l-1] = tmp;
                }
            }
        }
        for(int k = 1; k < baguni.length; k++){
            System.out.print(baguni[k]+" ");
        }
    }
}