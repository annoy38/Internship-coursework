public class AnonymousDemoClass {
    final int count = 5;
    public void createClass(){
        PolygoanClass p1 = new PolygoanClass(){
            @Override
            public void display() {
                int count = 10; //Here we can define another variable, variable name same with final variable
                System.out.println("New Display method: "+count);
            }
        };
        p1.display();
    }
}
