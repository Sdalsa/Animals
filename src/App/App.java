package App; 

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal(); 
        
        System.out.println(animal.setAnimalName());
        System.out.println(animal.getNumoffAnimals());
        System.out.println(animal.setAnimalName());
        System.out.println(animal.getNumoffAnimals());
    }
}
