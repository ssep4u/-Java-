/**
 * ReplaceExam
 */
public class ReplaceExam {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java programming");
        StringBuffer sb2 = null;
        sb2 = sb1.replace(0, 4, "JAVA");
        System.out.println("sb2 = " + sb2);
        
        String s1 = sb1.toString();
        System.out.println(s1);
        int i = s1.indexOf('p');
        System.out.println(i);
    }
}