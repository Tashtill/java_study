class Branch2{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        switch(num){
            case 1:
                System.out.println("ケース１");
                break;
            case 2:
                System.out.println("ケース２");
                break;
            case 3:
                System.out.println("ケース3");
                break;
            default: //いずれのケースの値とも一致しない場合に実行
                System.out.println("ケース１, ケース2, ケース3");
        }
    }
}