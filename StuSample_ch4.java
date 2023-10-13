public class StuSample_ch4 {
    public static void main(String[] args){
        final int BASE_NO = 1000; //他の値を代入できない定数として初期化

        Student_ch4 stu1 = new Student_ch4("菅原", BASE_NO+1);
        Student_ch4 stu2 = new Student_ch4("宮下", BASE_NO+2);

        //スーパークラスのメソッド
        // stu.setName("菅原");
        stu1.display();

        //サブクラスのメソッド
        //stu2.setStuNo(1);
        stu2.display();
    }
}
