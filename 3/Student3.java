class Student3 {
    String name;
    int engScore;
    int mathScore;

    //コンストラクタを使ってみる
    /*
    メソッドの頭文字は小文字で書くことが一般的だが、コンストラクタの場合クラス名と同じにする必要があるので、
    クラス名同様に大文字にする

    自分でコンストラクタを作成した場合はデフォルトコンストラクタは使用できなくなる。
    例えば、"Student3 stu1 = new Student3()"といったコードはコンパイルエラーになる。
    */
    Student3(String n){
        name = n;
    }
    Student3(String n, int e, int m){
        name = n;
        engScore = e;
        mathScore = m;
    }
    void setScore(int e, int m){
        engScore = e;
        mathScore = m;
    }
    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点, 数学" + mathScore + "点");
    }

}
