public class Student_ch4 extends Person_ch4 {
    private int stuNo;

    public Student_ch4(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }

    public Student_ch4(String name){
        this(name, 999);
    }


    public void setStuNo(int num){
        stuNo = num;
    }
    public int getNo(){
        return stuNo;
    }
    public void display(){ //Person_ch4にあるdisplayメソッドをオーバーライドした
        super.display(); //スーパークラス中のdisplayメソッドを呼び出す。オーバーライドした場合に同じ処理を書かなくて済む
        System.out.println("学籍番号 : " + stuNo);
        System.out.println("学籍番号の表示はサブクラスで再定義");
    }
}
