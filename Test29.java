public class Test29{
    public static void main(String[] args){

        int[] myArr = {7,5,4,9,8,1,2};
        int imyArr=myArr.length;
        int sum=0;
        int x=0;
        int max=myArr[0] , mini=myArr[0] , average=myArr[0];
            for (int i=0 ;i<myArr.length;i++) {   
                sum+=myArr[i]; 
                average=sum/imyArr;   
                if(myArr[i]>max){
                    max=myArr[i];
                }
                if(myArr[i]<mini){
                    mini=myArr[i];
                }
                for(int j=0;j<myArr.length;j++){
                    if(myArr[i]<myArr[j]){
                    int a = myArr[i];
                    myArr[i]=myArr[j];
                    myArr[j]=a; 
                    x=myArr[imyArr/2];
                    }
                }
            } 
            
            System.out.println("max="+max);
            System.out.println("mini="+mini);
            System.out.println("average="+average);
            System.out.println("median="+x);
    }
}
