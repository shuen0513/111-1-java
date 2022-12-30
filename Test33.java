
public class Test33{
    public static void main(String[]args) {
       int[][] data={{1,2,3,4},{5,6,7,8}};
       System.out.println(data.length);
       System.out.println(data[1].length);      
        for(int i=0 ; i<data.length;i++){
            for(int j=0 ;j<data[1].length;j++){
                System.out.printf("%d%n",data[i][j]);
            }
        }
    }
}