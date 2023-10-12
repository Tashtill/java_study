public class Student5 extends Person {
    private int stuNo;

    public Student5(){
        super();
    }

    public void setStuNo(int n){
        stuNo = n;
    }
    public void displayStuNo(){
        System.out.println("学籍番号 : " + stuNo);
    }
}
