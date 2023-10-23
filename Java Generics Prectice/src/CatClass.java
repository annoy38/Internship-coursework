public class CatClass <T>{
    private T cat;

    CatClass(T cat){
        this.cat = cat;
    }
    public T getCat(){
        return cat;
    }
    void makeSound(String catSound){
        System.out.println(catSound);
    }

    public <V> void foodPrice(V foodName){
        if ("Milk".equals(foodName)) {
            System.out.println(150);
        } else if ("Bread".equals(foodName)) {
            System.out.println(200);
        } else if ("Corn".equals(foodName)) {
            System.out.println(100);
        }
    }
}
