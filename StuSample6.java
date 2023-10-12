public class StuSample6 {
    public static void main(String[] args){
        Student6 stu = new Student6();

        //スーパークラスのメソッド
        stu.setName("菅原");
        stu.display();

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
