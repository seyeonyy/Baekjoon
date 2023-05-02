import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int h = 0;
        int m = 0;
        if(M>=45 && M<=59){
            m = M-45;
            h = H;
        }
        else if(M>=0 && M<=44){
            m = 60-(45-M);
            h = H-1;
            if(H == 0){
                h = 23;
            }
        }
        System.out.println(h+" "+m);
    }
}