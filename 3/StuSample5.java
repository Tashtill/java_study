class StuSample5 {
    public static void main(String[] args){
        Student5 stu1 = new Student5("村山");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("山本");
        stu2.setScore(200);
        //stu2.score = 200; //not visibleになり、コンパイル時点でエラーを吐く
        stu2.display();
    }
}
