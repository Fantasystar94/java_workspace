package chap_02;

public class _03_Operator03 {
    public static void main(String[] args) {
        //삼항연산자
        //결과 = 조건 ? 참의 경우 결과값 : 거짓일 경우 결과값
        int a = (5>1)?1:0;
        System.out.println(a);
        int x = 5;
        int y = 3;
        int max = (x<y) ? x: y;
        System.out.println(max);

        boolean b = (x==y)? false: true;
        System.out.println(b);
        String c = (x!=y)? "달라요" : "같아요";
        System.out.println(c);
    }
}
