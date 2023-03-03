public class Test35{
    public static void main(String[] args){
        Human human1;
        human1 = new Human("man",180,80);
        Human human2;
        human2 = new Human("man",100,30);

        human1.printHight();
        human2.printHight();

    }
}


class Human{
    String sex;
    int height;
    int weight;

    public Human(String sex,int height,int weight){
        this.sex=sex;
        this.height=height;
        this.weight=weight;
    }

    public void printHight(){
        System.out.println(height);
    }
}
