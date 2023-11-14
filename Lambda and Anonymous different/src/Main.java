public class Main {
    public static void main(String[] args) {
        final int count = 7;
        AnonymousDemoClass an = new AnonymousDemoClass();
        an.createClass();
        SodiumClass s = ()->{
            int count = 8; //In Lambda function we can't define value as name final variable name but in anonymous class we can make variable like final variable name
            System.out.println("new Value: "+count);
        };
        s.print();
    }
}