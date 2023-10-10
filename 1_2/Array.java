class Array {
    public static void main(String[] args){
        int[] score = new int[3]; //配列の宣言 new 中身のデータ型[データ数]で宣言可能
        score[0] = 6; //添え字は0からはじまる
        score[1] = 2;
        score[2] = 10;

        String[] name = {"カレー", "ピザ", "寿司"}; //初期化を行うパターン

        System.out.println(name[0] + "の点数は" + score[0]);

        int[][] scores = {{1,2,3},{3,4,5}}; //int[][]とすれば2次元配列も可能。多次元も同様。
        System.out.println(scores[0][2]);
        System.out.println(scores.length);
        System.out.println(scores[0].length);
    }
    
}
