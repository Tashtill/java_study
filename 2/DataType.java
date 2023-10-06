public class DataType {
    public static void main(String[] args){
        /*基本データ型。
        型宣言の段階でメモリの大きさが決まってる。
        変数にはデータそのものが入っている。
        */
        int month = 10;
        float float_num = 10.2f; //float型は最後にfをつける
        double double_num = 9.9; //少数は標準でdouble型として扱われる
        char letter = 'A'; //一文字のchar型は'ではさむ
        /*参照型。
        値を代入するまで必要なメモリの大きさはわからず、データはメモリのべつの場所におかれている。
        変数の中にはデータそのものではなく、データが置いてあるメモリのアドレス（参照値）が格納されている。
        */
        String greeding = "Hello";//先頭は大文字

        System.out.println("month=" + month);
        System.out.println("float_num=" + float_num);
        System.out.println("double_num=" + double_num);
        System.out.println("letter=" + letter);
        System.out.println("greeding=" + greeding);
    }
}
