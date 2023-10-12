class DriveCar2 {
    public static void main(String[] args){
        Car2 c1 = new Car2();
        c1.run(60);
        c1.display();

        Car2 c2 = new Car2(3476);
        c2.run(90);
        c2.display();
    }    
}
