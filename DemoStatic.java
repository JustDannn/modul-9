package modul9;

public class DemoStatic {
    private int privateInt;
    private static  int staticInt;
    static int counter =0;

    public static void count(){
        counter++;
    }
    public DemoStatic(int pr, int si){
        privateInt=pr;
        staticInt=si;
    }

    @Override
    public String toString() {
        return "privateInt" + privateInt + ", staticInt=" + staticInt;
    }

    public static void main(String[] args) {
        DemoStatic s1 = new DemoStatic(4,4);
        System.out.println("s1: "+s1);

        DemoStatic s2 = new DemoStatic(8,2);
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);

        DemoStatic s3 = new DemoStatic(2,3);
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);

        for (int i = 0; i<10; i++){
            if (i%2==0){
                DemoStatic.count();
            }
        }
        System.out.println("Counter:"+ DemoStatic.counter);
    }
}
