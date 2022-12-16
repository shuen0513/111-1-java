public class Test28{
    public static void main(String[] args){

        int[] myArr = {7,5,4,8,1,2};
        int imyArr=myArr.length;

            for(int j = 0 ; j<myArr.length/2 ; j++ ){
                int x = 0;
                x=myArr[j];
                myArr[j]=myArr[imyArr-1];
                myArr[imyArr-1]=x;
                imyArr-=1;
            }
            for( int i= 0 ; i < myArr.length ; i++ ) {
                System.out.println(myArr[i]);
            }
    }
}
