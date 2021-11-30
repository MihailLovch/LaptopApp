import java.util.Objects;

public class Laptop extends Mechanism{
    public Os system;
    public Battery battery;
    public Processor processor;
    public String brand;
    public String toString(){
        return super.toString() + " Lap: brand:" + brand;  
    }
    public Laptop(String brand, int weight, boolean isDifficult, String inventor, int yearOfInvention){
        super(weight, isDifficult, inventor, yearOfInvention);
        this.brand = brand;
    }
}
