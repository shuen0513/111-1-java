import java.util.Scanner;

public class Test6{
    public static void main(String[] args) {
        int grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		grade = input.nextInt();
		
        if(grade <=100 & grade >=0) {
            switch(grade/10){
                case 9 :
                case 10:
                    printStr("A");
                    break;
                case 8:
                    printStr("B");
                    break;
                 case 7:
                    printStr("C");
                    break;
                 case 6:
                    printStr("D");
                    break;
                 default:
                    printStr("E");
                    break;
            }
        }
        else{
        printStr("error"); 
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}