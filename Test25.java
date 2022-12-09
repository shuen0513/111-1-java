public class Test25{
    public static void main(String[] args){

      int[] iArr = {7,3,4,9,6};

          for (int x = 0; x < iArr.length; x++) {
              for (int y = 0; y < iArr.length; y++) {
                   if (iArr[x] < iArr[y]) {
                      int a = iArr[x];
                      iArr[x] =iArr[y];
                      iArr[y] = a;
                   }
              }
          }

          for (int y =0; y<iArr.length; y++){
            System.out.println(">>" + iArr[y]);

        }

    }
}
