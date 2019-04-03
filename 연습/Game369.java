/**
 * Game369
 */
public class Game369 {

    public static void main(String[] args) {
        System.out.println("369게임");
        //1~100까지 반복
        for (int i = 1; i <= 100; i++) {
            // System.out.println(i);
            //숫자 -> 3, 6, 9 개수 세기
            int count = count_369(i);
            if (count == 0) {
                System.out.println(i);
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print("짝");
                }
                System.out.println();
            }
        }

    }
    private static int count_369(int number) {
        int count = 0;
        //int -> String
        String numberString = String.valueOf(number);
        //String -> 하나씩 char
        for (int i = 0; i < numberString.length(); i++) {
            char ch = numberString.charAt(i);
            if (ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        //3 or 6 or 9라면 count++
        return count;
    }
}