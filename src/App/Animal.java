package App;  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Animal {
    public List<String> regiAnimal = new ArrayList<>(); 

    public List<String>  setAnimalName(){
        System.out.println("What animal do you want to registrer?\nWhen you are done write exit.");
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String s1 = sc.next();
            if(s1.equals("exit")) {
                break;
            }
            regiAnimal.add(s1); 
        }
        return regiAnimal; 
    }
    public List<String> getAnimals() {
        return regiAnimal;
    }
    public int getNumoffAnimals() {
        return getAnimals().size();
    }
}

class Animal_info extends Animal{

} 
