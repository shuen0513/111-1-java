public class Test26{
    public static void main(String[] args){

      int[] iArr = {9,8,7,6,5};

          for (int x = 0; x < iArr.length-1; x++) {//x=0~3
              for (int y = 0; y < iArr.length-x-1; y++) {//y=0~3
                   if (iArr[y] < iArr[y+1]) {
                      int a = iArr[y];
                      iArr[y] =iArr[y+1]; 
                      iArr[y+1] = a;
                   }
              }
          }

          for (int y =0; y<iArr.length; y++){
            System.out.println(">>" + iArr[y]);
        }

    }
}
