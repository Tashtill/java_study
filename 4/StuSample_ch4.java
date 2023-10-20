public class StuSample_ch4 {
    public static void main(String[] args){
        final int BASE_NO = 1000; //他の値を代入できない定数として初期化

        Student_ch4 stu1 = new Student_ch4("菅原", BASE_NO+1);
        //Student_ch4 stu2 = new Student_ch4("宮下", BASE_NO+2);

        Person_ch4 psn = stu1; //サブクラスのオブジェクトをスーパークラスに代入。必要なメモリ領域は増加しないので型変換は自動で行われる。
        psn.display();

        //psn.chgStuNo(500); //chgStuNo()はサブクラスのメソッド。psnはスーパークラスなのでこのメソッドは使えない

        if (psn instanceof Student_ch4){
            Student_ch4 stu3 = (Student_ch4)psn;
            stu3.chgStuNo(2001);
            stu3.display(); 
        }
        
        System.out.println(psn instanceof Student_ch4);
        System.out.println(psn instanceof Person_ch4);

    }
}
