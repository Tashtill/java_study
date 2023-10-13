public class Taxi4_2 extends Car4_2 {
    private int price;

    public Taxi4_2(int no){
        super(no);
        price = 0;
    }
    public Taxi4_2(int no, int price){
        super(no);
        this.price = price;
    }

    public void start(){
        price += 420;
    }
    public void run(){
        price += 80;
    }

public void display(){
    super.display();
    System.out.println("料金 : " + price);
}
}