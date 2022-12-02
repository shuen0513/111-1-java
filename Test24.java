public class Test24{
    public static void main(String[] args){
        //Car mycar=new car();
        Car[]mycar=new Car[4];//[]:代表陣列

        for(int x=0;x<10;x++){
            myCar[x]=new Car();
            myCar[x].whee11=x;
            myCar[x].whee12=x+1;
            myCar[x].whee13=x+2;
            myCar[x].whee14=x+3;
            int z = myCar[x].lanuch(7);
            System.out.println(z);
        }
    }
}
