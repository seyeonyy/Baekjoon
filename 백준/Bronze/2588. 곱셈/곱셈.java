import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num2 % 10;
        int num4 = (num2 / 10) % 10;
        int num5 = (num2 / 10) / 10;
        System.out.println(num1 * num3);
        System.out.println(num1 * num4);
        System.out.println(num1 * num5);
        System.out.println(num1 * num2);
    }
}