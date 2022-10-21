import java.util.Scanner;

public class Test13{
    public static void main(String[] args) {
        int a=5;
        int b=0;
		    for(int i=0; i<9;i++) {
    			for(int j=0; j<a;j++) {
					if(j<a-2*b-1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
    			System.out.printf("\n");
				
				if(i<4){
					a+=1;
					b+=1;
				}
				else {
					a-=1;
					b-=1;
				}     
			}	
    }
}	