import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N+1];
        for(int i = 1; i < score.length; i++){
            score[i] = scanner.nextInt();
        }
        int M = score[1];
        for(int i = 2; i < score.length; i++){
            if(M < score[i]){
                M = score[i];
            }
        }
        double sum = 0;
        for(int i = 1; i < score.length; i++){
            sum += score[i];
        }
        double average = ((sum/M)*100)/N;
        System.out.println(average);
    }
}