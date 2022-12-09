public class Test27{
    public static void main(String[] args){

      int[] iArr = {10,9,8,7,6,5,4,3,2,1,0};
      int j = 0  ;
      int i = 0 ;
          for(int x = 0; x < iArr.length ; x++) {
              if(iArr[x]==2){
                  j=x;
                  break;
              } 
              i++;   
          }
            System.out.println(i);
            System.out.println(j);
    }
}
