/**
 * IntegerEqualExam
 */
public class IntegerEqualExam {

    public static void main(String[] args) {
        Integer in1 = new Integer(100);
        Integer in2 = new Integer(100);
        Integer in3 = new Integer(200);
        System.out.println("in1.equals(in2) --> "+in1.equals(in2));
        System.out.println("in1.equals(in3) --> " + in1.equals(in3));
        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in3);
        System.out.println(in1+200);
        System.out.println(in1 == in2);
        System.out.println(Integer.valueOf("123"));
        System.out.println(Integer.parseInt("123"));
    }
}