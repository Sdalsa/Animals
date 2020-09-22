package App;  
import java.util.ArrayList;
import java.util.List;
import java.util.*; 

public class Animal {
    public String zebra; 
    public String lion; 
    public String dog; 

    public String getAnimals() {
        return this.zebra + "\n " + this.lion + "\n " + this.dog;
    }
    public int getNumoffAnimals() {
        List<String> numOffAnimals = new ArrayList<>(); 
        numOffAnimals.add(this.zebra); 
        numOffAnimals.add(this.lion); 
        numOffAnimals.add(this.dog); 
        return numOffAnimals.size();
    }
}
