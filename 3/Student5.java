//カプセル化を使ってみる
public class Student5 {
    private String name;
    private int score;
    //メンバ変数はpriateで隠し、メソッドをpublicにすることをカプセル化と呼ぶ。

    public Student5(String n){
        name = n;
    }
    public void setScore(int s){
        if ( 0 <= s && s <= 100){
            score = s;
        }else{ 
            System.out.println("点数が範囲外です");   
        }

    }
    void display(){
        System.out.println(name + "さんの点数 : " + score);
    }
}
