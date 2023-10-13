public class StuSample_ch4 {
    public static void main(String[] args){
        Student_ch4 stu = new Student_ch4();

        //スーパークラスのメソッド
        stu.setName("菅原");
        stu.display();

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.display();
    }
}
