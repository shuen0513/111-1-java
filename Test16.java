import java.util.Scanner;

public class Test16{
    public static void main(String[] args) {
        for(int a=0;a<6;a++) {
            int c = 1 ; 
            for(int b=6;b>0;b--){
                if(b>a+1) {
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