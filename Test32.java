
public class Test32{
    public static void main(String[]args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1,0};

        int left=0;
        int right=arr.length-1;
        int med;
        int target = 2;         
        int targetIndex = 0;
        int searchCount = 0;
        //Search

        for(int i = 0;i<3;i++){
            med=(right-left)/2+left;
            if(arr[med] == target){
                targetIndex=med;
                break;
            }
            searchCount++;

            if(target>arr[med]){
                right=med;
            }else{
                left=med; 
            }

            System.out.printf("%d %d %d\n",right,left,med);
        }
        
        System.out.println("The position is "+targetIndex);
        System.out.println("searchCount "+searchCount);
    }
}