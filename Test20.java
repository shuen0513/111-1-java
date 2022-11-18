
public class Test20{
    public static void main(String[] args) {
        int a = 6;
		int b = 6;
        
		for(int c=0; c<9;c++){
			for(int d=1 ; d<=11; d++){
				if(d<a || d>b){
					System.out.print("*");
				}else{
					System.out.print(" ");	
				}
			}
            
			System.out.println();
            if(c<4){
				a=a-1;
				b=b+1;
			}else{
				a=a+1;
				b=b-1;
			}
		}
	}
}
