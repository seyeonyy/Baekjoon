import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }
        }
        if(sentence.charAt(0) == ' ' && sentence.charAt(sentence.length()-1) == ' '){
            count -= 1;
        }
        if(sentence.charAt(0) != ' ' && sentence.charAt(sentence.length()-1) != ' '){
            count += 1;
        }
        System.out.println(count);
    }
}