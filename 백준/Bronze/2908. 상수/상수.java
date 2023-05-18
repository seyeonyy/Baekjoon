import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        ArrayList<Integer> num1Arr = new ArrayList<Integer>();
        ArrayList<Integer> num2Arr = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            num1Arr.add(num1%10);
            num1/=10;
        }
        for(int i = 0; i < 3; i++){
            num2Arr.add(num2%10);
            num2/=10;
        }
        int num3 = 0;
        int num4 = 0;
        for(int i : num1Arr){
            num3 *= 10;
            num3 += i;
        }
        for(int i : num2Arr){
            num4 *= 10;
            num4 += i;
        }
        if(num3 > num4){
            System.out.println(num3);
        }
        else{
            System.out.println(num4);
        }
    }
}