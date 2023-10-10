/*
 * データ型の変換を明示的に行うとき、キャストを使う。
 * byteからintのように、表現できる値の幅が大きくなる時は自動で型変換されるが、小さくする場合はキャストで明示する必要がある。
 */

class Cast {
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.1;
        int discount, amount;

        if(price >= 3000) {
            discount = 300;
        } else if( price >= 5000) {
            discount = 500;
        } else {
            discount = 0;
        }

        amount = (int)((price - discount) * (1 + rate));
        System.out.println("税込み金額" + amount + "円");
        if(discount != 0){
            System.out.println("税抜き価格が" + discount + "円割引されました");
        }
    }
}
