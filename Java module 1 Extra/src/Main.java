interface BeforeTheChange{
    int a = 5;
    int b = 7;
}
class AfterTheChange{
    private int a = 5;
    private int b = 7;
    private int c;
    public AfterTheChange(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void change(){
        c = a;
        a = b;
        b = c;
        System.out.println("After the change a = " + a);
        System.out.println("After the change b = " + b);
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Before the change a = " + BeforeTheChange.a);
        System.out.println("Before the change b = " + BeforeTheChange.b);

        AfterTheChange afterTheChange = new AfterTheChange(5, 7);
        afterTheChange.change();
    }
}