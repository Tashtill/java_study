public class Student_ch4 extends Person_ch4 {
    private int stuNo = 999;

    public void setStuNo(int num){
        stuNo = num;
    }
    public int getNo(){
        return stuNo;
    }
    public void display(){ //Person_ch4にあるdisplayメソッドをオーバーライドした
        System.out.println("名前 : " + getName());
        System.out.println("学籍番号 : " + stuNo);
        System.out.println("学籍番号の表示はサブクラスで再定義");
    }
}
