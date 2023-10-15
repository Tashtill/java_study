public class Person_ch4{
    private String name;

    public Person_ch4(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("名前 : " + name);
        System.out.println("名前の表示はスーパークラスPerson_ch4のメソッド");
    }
}