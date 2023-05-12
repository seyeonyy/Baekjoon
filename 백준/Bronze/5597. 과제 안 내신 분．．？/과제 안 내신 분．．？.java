import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] assignment = new int[28];
        for(int i = 0; i < assignment.length; i++){
            int n = scanner.nextInt();
            assignment[i] = n;
        }
        Arrays.sort(assignment);
        for(int i = 0; i < assignment.length; i++){
            if(assignment[i]==(i+1)){
                continue;
            }
            System.out.println(i+1);
            break;
        }
        for(int i = assignment.length-1; i >= 0; i--){
            if(assignment[i] == (i+3)){
                continue;
            }
            System.out.println(i+3);
            break;
        }
    }
}