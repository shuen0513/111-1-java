import java.util.Scanner;

public class Test18 {
    public static void main(String[]args){
        float a = 0.0f;
        float b = 0.8f;

        a+=0.1;
        a+=0.1;
        a+=0.1;
        a+=0.1;
        a+=0.1;
        a+=0.1;
        a+=0.1;  
        a+=0.1;

        //浮點數並非是正確的數可能是0.09999，只能拿來作比大小。

        if(a==b)
            System.out.printf("a == b");
        else
            System.out.printf("a != b ");
    }
}