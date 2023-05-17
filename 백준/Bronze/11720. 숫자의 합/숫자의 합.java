import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String number = scanner.next();
        char[] numberArr = number.toCharArray();
        int[] numberArrInt = new int[numberArr.length];
        int sum = 0;
        for(int i = 0; i < numberArrInt.length; i++){
           numberArrInt[i] = (int)numberArr[i] - '0';
           sum += numberArrInt[i];
        }
        System.out.println(sum);
    }
}