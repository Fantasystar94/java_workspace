package chap_01;

public class _03_Variables
{
    public static void main(String[] args) {
        String name;
        name = "야스오";
        String status = "과학";
        System.out.println(name+" "+status);
        System.out.println("배송이 완료되었습니다");
        double score = 90.5;
        char grade = 'a';
        name = "강백호";
        System.out.println(name+ score+grade);
        boolean aa = true;
        if(aa){
            aa=false;
            System.out.println(aa);
        }
        double d = 3.1456598;
        float f = 3.1412312312565F;
        System.out.println(f);
        System.out.println(d);

        long i = 1000000000000L;
        long l = 1_000_000_000;
        System.out.println(l);

//        int, long, float, boolean, double, char, String,
    }
}
