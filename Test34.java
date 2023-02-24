public class Test34{
    public static void main(String[] args){
        Human.printHight(); 
    }
}
class Human{
    int sex;
    static int height=180;
    private int weight=75;

    public static void printHight(){
        System.out.println(height);
    }

    private void printWeight(){
        System.out.println(weight);
    }
}
