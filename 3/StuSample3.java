class StuSample3 {
    public static void main(String[] args){
        Student3 stu1 = new Student3("菅原", 90, 80);
        Student3 stu2 = new Student3("宮本");

        stu1.display();

        stu2.setScore(80, 70);
        stu2.display();
    }
    
}