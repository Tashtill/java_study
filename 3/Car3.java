class Car3 {
    private int no;
    private int speed;
    static private int count = 0;

    public Car3(){
        no = 0;
        count++;
        System.out.println("ナンバー" + no + "を作成しました");
    }
    public Car3(int n){
        if (String.valueOf(n).length() == 4){
            no = n;
        }else{
            no = 0;
        }
        count++;
        System.out.println("ナンバー" + no + "を作成しました");
    }


    public void run(int s){
        speed = s;
    }
    public void brake(){
        speed = 0;
    }
    public void brake(int s){
        speed -= s;
        if (speed<0){
            speed = 0;
        }
    }

    public void display(){
        System.out.println("ナンバー" + no + "のスピード : " + speed);
    }

    public static void displayCount(){ //メソッドでもstaticにしないと実行用クラスでエラーになる
        System.out.println("作成済みのインスタンス数 : " + count);
    }
}
