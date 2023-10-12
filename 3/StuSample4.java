class StuSample4 {
    public static void main(String[] args){
        //staticメソッドを実行するときはクラス名.メソッド名で実行
        Student4.display();

        Student4 stu1 = new Student4("村山");
        Student4.display();

        Student4 stu2 = new Student4("中村");
        Student4.display();
    }
}
