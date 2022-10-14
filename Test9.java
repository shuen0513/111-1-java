import java.util.Scanner;

public class Test8{
    public static void main(String[] args) {
    int row = 0 ;
	
		while(row < 9 ) {
          
		  int star = 0 ;
          int t ;
          t = row;
          if (row > 4){
            t = 8-row;
          } 
		  while(star<=t){
				System.out.print("*");
				star=star+1;
		  }
          System.out.println("");			
          row +=1;
      
        }
    }
}
    
