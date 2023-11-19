public class Student4_7 implements Englishable{
    private String name;

    public Student4_7(String name){
        this.name = name;
    }

    public void display_name(){
        System.out.println("名前" + name);
    }

    public void displayEng(){
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name" + name);
    }
}