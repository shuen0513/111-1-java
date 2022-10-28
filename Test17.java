import java.util.Scanner;

public class Test17{
    public static void main(String[] args) {
        for(int a=6;a>0;a--) {
            for(int b=1;b<7;b++){
                if(b<a) {
                    System.out.print("*");
                }
                else{
                    System.out.print(b-a+1);
                }
            }
            System.out.printf("%n");
        }
    }
}

