public class AnimalClass{
    String animalName;
    String animalFood;
    String animalSound;

    AnimalClass(String animalName, String animalFood, String animalSound){
        this.animalName = animalName;
        this.animalFood = animalFood;
        this.animalSound = animalSound;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }
}
