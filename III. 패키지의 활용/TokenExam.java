import java.util.StringTokenizer;

/**
 * TokenExam
 */
public class TokenExam {

    public static void main(String[] args) {
        String input = "2320 임정훈 18 앱앤미";
        String studentNumber;
        String name;
        int age;
        String club;
        StringTokenizer parse = new StringTokenizer(input);
        studentNumber = parse.nextToken();
        name = parse.nextToken();
        age = Integer.valueOf(parse.nextToken());
        club = parse.nextToken();
        System.out.println(studentNumber+" | "+name+" | "+age+" | "+club);
    }
}