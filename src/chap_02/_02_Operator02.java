package chap_02;

public class _02_Operator02 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;
        System.out.println(김치찌개 || 계란말이 && 제육볶음);
        System.out.println((5>3) && (3>1));
        System.out.println(!((5>3) && (3<1)));
    }
}
