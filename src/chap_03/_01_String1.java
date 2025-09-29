package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s  ="I like Java and Py and C";
        System.out.println(s.length()+"\t"+s);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
//        System.out.println((s.contains("c#"))?"제정신이냐":"제정신이군");
        System.out.println((s.indexOf("java"))==-1?true:false);
        System.out.println(s.lastIndexOf("and"));

//        getStar(args);
    }

    public static void getStar(String[] args) {
        int n = 3; // 높이 (위쪽 삼각형 기준)

        // 위쪽
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽
        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void getStar2(int[] args) {
        String star = "*";
        String blank = "1";
        int i=3;
        for(int a=0;a<i;a++){
            blank = blank+star;
            System.out.println(blank);
            if(a==i-1){
                for(int c=a;c>=0;c--){
                    blank = blank.substring(0,(c+1));
                    System.out.println(blank);
                }
            }
        }
    }
}
