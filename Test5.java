import java.util.Scanner;

public class Test5{
    public static void main(String[] args) {
        int grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		grade = input.nextInt();
		
        if(grade <=100 && grade >=90){
            System.out.println("A");
        }
        else if(grade <=89 && grade >=80){
            System.out.println("B");  
        }   
        else if(grade <=79 && grade >=70){
            System.out.println("C");  
        }   
        else if(grade <=69 && grade >=60){
            System.out.println("D");    
        }
        else {
            System.out.println("E");
        }
    }
}