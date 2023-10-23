public class Main {
    public static void main(String[] args) {
        DogClass<AnimalClass> dogClass = new DogClass<>(new AnimalClass("Dog", "Meat", "GeuGeu"));
        CatClass<AnimalClass> catClass = new CatClass<>(new AnimalClass("Cat", "Milk", "Meow"));

        dogClass.makeSound(dogClass.getDog().getAnimalSound());
        catClass.makeSound(catClass.getCat().getAnimalSound());
        catClass.foodPrice("Bread");
        dogClass.dogFoodPrice("Chicken");
    }
}