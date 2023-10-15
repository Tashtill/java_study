public final class Student_ch4 extends Person_ch4 {
    private int stuNo;

    public Student_ch4(String name, int stuNo){
        super(name); // super()やthis()はコンストラクタの先頭に書く。これがないとコンパイル時にsuper();が先頭に勝手に挿入される。
        this.stuNo = stuNo;
    }

    public void chgStuNo(int stuNo){
        this.stuNo = stuNo;
    }
    public int getNo(){
        return stuNo;
    }
    public void display(){ //Person_ch4にあるdisplayメソッドをオーバーライドした
        super.display(); //スーパークラス中のdisplayメソッドを呼び出す。オーバーライドした場合に同じ処理を書かなくて済む
        System.out.println("学籍番号 : " + stuNo);
        System.out.println("学籍番号の表示はサブクラスStudent_ch4のメソッド");

        //System.out.println("学籍番号の表示はサブクラスで再定義");
    }
}
