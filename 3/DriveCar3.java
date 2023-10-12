class DriveCar3 {
    public static void main(String[] args){
        Car3 c1 = new Car3();
        c1.run(60);
        c1.display();

        Car3 c2 = new Car3(3476);
        c2.run(90);
        //c2.speed = 80;
        c2.display();

        Car3.displayCount();

        Car3 c3 = new Car3(8890);
        Car3.displayCount();

        c3.brake();
    }    
}
