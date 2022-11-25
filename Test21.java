
public class Test21{
    public static void main(String[] args) {
		for(int j=-4; j<=4;j++){
			for(int k=-5 ; k<=5; k++){
				if(Math.abs(k)+Math.abs(j)>4){
				    System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
