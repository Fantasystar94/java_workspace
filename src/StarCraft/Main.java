package StarCraft;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        2442 문제
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        String star = "*";
//        String blank = " ";
//        for(int a=1;a<=n;a++){
//            for(int c=1;c<=n-a;c++){
//                System.out.print(c);
//            }
//            for(int b=1;b<=(a*2)-1;b++){
//                System.out.print(star);
//            }
//            System.out.println();
//        }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int a=1;a<=n;a++){

            for(int c=0;c<a-1;c++){
                System.out.print(" ");
            }
            for(int b=(n*2)-(a*2);b>=0;b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
