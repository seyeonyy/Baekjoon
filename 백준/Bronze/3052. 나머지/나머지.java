import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int[] namuji = new int[10];
        for(int i = 0; i < namuji.length; i++){
            namuji[i] = arr[i] % 42;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i: namuji) set.add(i);
        Integer[] namuji2 = set.toArray(new Integer[0]);
        int count = 1;
        for(int i = 0; i < namuji2.length-1; i++){
            if(namuji2[0]!= namuji2[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}