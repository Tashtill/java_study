class Car2 {
    int no;
    int speed;

    Car2(){
        no = 0;
    }
    Car2(int n){
        if (String.valueOf(n).length() == 4){
            no = n;
        }else{
            no = 0;
        }
    }


    void run(int s){
        speed = s;
    }
    void brake(){
        speed = 0;
    }
    void brake(int s){
        speed -= s;
        if (speed<0){
            speed = 0;
        }
    }

    void display(){
        System.out.println("ナンバー" + no + "のスピード : " + speed);
    }
}
