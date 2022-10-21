import java.util.Scanner;


public class Test11{
    public static void main(String[] args) {
        int row = 0 ;
        int d =7;
		    String star = "*";
        
		
        while (row < 9) {
			int b = 4 - row;
            if (row <5){
				while (b > 0){
				    System.out.print(" ");
				    b= b - 1;
			    }
			    System.out.println(star);
				star= star + "**";
				row = row + 1 ;
            }
            else{
				b = 9 - row;
				star = star.substring(0,d );
				d-=2;
				while (b <= 4){
				    System.out.print(" ");
				    b= b + 1;
			    }
			    System.out.println(star);
      			
      			row = row + 1 ;
            } 
        }    
    }
}