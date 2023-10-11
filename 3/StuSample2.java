//オーバーロードの実践

class StuSample2 {
    public static void main(String[] args){
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setData("菅原");
        stu1.setScore(80,70);
        stu1.display();

        stu2.setData("宮下", 90, 80);
        stu2.display();
    }
    
}
