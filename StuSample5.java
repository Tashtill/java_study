public class StuSample5 {
    public static void main(String[] args){
        Student5 stu = new Student5();

        //スーパークラスのメソッド
        stu.setName("菅原");
        stu.display();

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
