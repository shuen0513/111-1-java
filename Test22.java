import java.lang.Math;
public class Test22{
    public static void main(String[] args) {
        int mileage = 50 ;
        int money;
        if( mileage <= 7){
            money=85;
        }else{
            mileage-=7;
            money=mileage*5+85;
        }
        System.out.printf("money=%d",money);
	}
}
