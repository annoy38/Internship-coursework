public class DogClass<T>{
    private T dog;
    DogClass(T dog){
        this.dog = dog;
    }
    /*  */
    public T getDog(){
        return dog;
    }
    void makeSound(String dogSound){
        System.out.println(dogSound);
    }

    public <V> void dogFoodPrice(V foodPrice){
        if(foodPrice.equals("Meat")){
            System.out.println(500);
        } else if (foodPrice.equals("Chicken")) {
            System.out.println(300);
        }
    }
}
