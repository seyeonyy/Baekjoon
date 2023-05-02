import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] hangulArr = { '가', '나', '다', '라', '마',
                '거', '너', '더', '러', '머', '버', '서', '어', '저',
                '고', '노', '도', '로', '모', '보', '소', '오', '조',
                '구', '누', '두', '루', '무', '수', '우', '주', '바',
                '사', '아', '자', '배', '하', '허', '호' };

        String[] nums = { "100가 11111", "1가  1111", "000가 1111",
                "000가 1111", "100 가1111", "100가1111 ", "100가 0011",
                "150히 1111", "01가 1111", "200하 1111", "150배 1111",
                "150누 1111"};

        LicensePlate plate = new LicensePlate(hangulArr);
        plate.getFirstNumber(nums);
        for (String n : nums) {
            System.out.println("\n" + n);
            plate.setNumber(n);
            if (plate.getParseError() == false) {
                plate.printInfo();
            }
        }
    }
}
class LicensePlate{
    //202015041 이세연 구름
    private String number;
    private int firstNum, secondNum;
    private char hangul;
    private char[] hangulArray;
    private boolean parseError;
    LicensePlate(char[] hangulArr){
        number = null;
        parseError = false;
    }
    boolean getParseError(){

        return
    }


    void setNumber(String n){
        int hangulSarr = Integer.parseInt(Arrays.toString(n.toCharArray()));
        for(int i = 0; i < hangulSarr; i++){
            if(hangulSarr(i)>= 100 && hangulSarr(i)<=699){
                System.out.println("승용차");
            }
            else if (hangulSarr(i)>= 700 && hangulSarr(i)<= 799) {
                System.out.println("승합차");
            }
            else if(hangulSarr(i)>= 800 && hangulSarr(i)<= 979){
                System.out.println("화물차");
            }
            else if(hangulSarr(i)>= 980 && hangulSarr(i)<= 998){
                System.out.println("특수차");
            }
            else if(hangulSarr(i)>= 998 && hangulSarr(i)<= 999){
                System.out.println("긴급자동차");
            }
        }


    }

    private int hangulSarr(int i) {
    }

    void printInfo(String[] n){
        int hangulSarr = Integer.parseInt(Arrays.toString(n.toCharArray()));
        for(int i = 0; i < hangulSarr; i++){
            if(hangulSarr(i)>= 100 && hangulSarr(i)<=699){
                System.out.println("승용차");
            }
            else if (hangulSarr(i)>= 700 && hangulSarr(i)<= 799) {
                System.out.println("승합차");
            }
            else if(hangulSarr(i)>= 800 && hangulSarr(i)<= 979){
                System.out.println("화물차");
            }
            else if(hangulSarr(i)>= 980 && hangulSarr(i)<= 998){
                System.out.println("특수차");
            }
            else if(hangulSarr(i)>= 998 && hangulSarr(i)<= 999){
                System.out.println("긴급자동차");
            }
        }
        for(int i = 0; i < hangulSarr; i++){
            if(n.equals("배")){
                System.out.println("사업용(택배)");
            }
            else if (n.equals("바") || n.equals("사") || n.equals("아") || n.equals("자")){
                System.out.println("사업용(운수)");
            }
            else if(n.equals("하") || n.equals("허") || n.equals("호")){
                System.out.println("사업용(렌터/리스)");
            }
            else{
                System.out.println("자가용");
            }
        }

    }

    int getFirstNumber(String[] nums){
        for(int i = 0; i < nums.length; i ++){
            String[] n = new String[]{nums[i]};
        }
        String[] m;
        m = n.split(" ");
        if(m.charAt(0) == number){
            System.out.println("오류: 앞번호가 숫자가 아닙니다.");
            return -1;
        }
        else{
            System.out.println("앞번호가 100미만입니다.");
        }
        return Integer.parseInt(m);
    }

    int getSecondNumber(){
        for(int idx = 0;; idx < secondNum; idx++){

        }
        return
    }

    boolean parseNumber(boolean n){

        if()
        return
    }

}
//class NumString {
//    public static boolean isDigit(String num) {
//        if (num == null) {
//            return false;
//        }
//        try {
//            int n = Integer.parseInt(num);
//        }
//        catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//}

