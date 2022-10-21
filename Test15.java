import java.util.Scanner;

public class Test15{
    public static void main(String[] args) {
        for(int a=6;a>0;a--) {
            int c=1;
            for(int b=0;b<6;b++){
                if(b<a-1) {
                System.out.print("*");
                }else{
                System.out.print(c);
                c++;
                }
            }
            System.out.printf("%n");
        }
    }
}