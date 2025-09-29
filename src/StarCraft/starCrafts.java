package StarCraft;
import java.util.Scanner;
public class starCrafts {
    public static void main(String[] args) {
        star1(10);
        star2(7);
//        star3(2);
//            star4();
//        star5();
    }
    public static void star1(int i){
        String star = "*";
        String blank = " ";
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

    public static void star2(int i){
        String star = "*";
        String blank = " ";
        for(int a=1;a<=i;a++){
            for(int c=(((i*2)-1)/2)-a;c>=0;c--){
                System.out.print(blank);
            }
            for(int b=1;b<=(a*2)-1;b++){
                System.out.print(star);
            }
            for(int c=(((i*2)-1)/2)-a;c>=0;c--){
                System.out.print(blank);
            }
            System.out.println();
        }
    }

    public static void star3(int i){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int a=1;a<=n;a++){
            if(a%2!=0){
                for(int c=1;c<=n;c++){
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            else{
                for(int c=1;c<=n;c++){
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void star4(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int a=1;a<=n;a++){
            for(int c=1;c<=a;c++){
                System.out.print(" ");
            }
            for(int b=(n*2)-a*2;b>=0;b--){
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void star5(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int a=0;a<(2*n)-1;a++){

                if(a<n){
                    for(int i=n-a-2;i>=0;i--){
                        System.out.print(i);
                    }
                    for(int i=0;i<(2*a)+1;i++){
                        System.out.print("*");
                    }
                }
                else{
                    for(int i=n;i<a+1;i++){
                        System.out.print(1);
                    }
                    for(int i=0;i>(2*a)+1;i--){
                        System.out.print("*");
                    }
                }

            System.out.println();
        }
    }
}
