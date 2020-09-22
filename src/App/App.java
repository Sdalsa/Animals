package App; 

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal(); 
        animal.dog = "goldenretriver"; 
        animal.lion = "lion"; 
        animal.zebra = "zebra"; 

        System.out.println("The clarified animals: \n " + animal.getAnimals());
        System.out.println("The number of animals: " + Integer.toString(animal.getNumoffAnimals()));
    }
}
