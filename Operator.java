class Operator {
    public static void main(String[] args){
        //コマンドラインから入力したデータ(文字列型)をint型に変換し計算
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("a="+ a + ", b=" + b);
        System.out.println("a / b =" + a/b);
        System.out.println("a % b = " + a/b);
        System.out.println("(a>3) && (b>3)=" + ((a>3) && (b>3))); //and
        System.out.println("(a>3) || (b>3)=" + ((a>3) || (b>3))); //or

    }
    
}
