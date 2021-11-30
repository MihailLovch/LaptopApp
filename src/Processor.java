import java.util.Objects;

public class Processor extends ComputerComponent{
    public int temperature;
    public boolean isLapWorking;
    private int criticalTemp;
    public void checkTemperature(){
        System.out.println("Current GPU temperature : " + temperature);
        if (temperature >= criticalTemp){
            isLapWorking = false;
            System.out.println("Too high GPU temperature.Automatic shutdown.");
        }
    }

    public Processor(int temperature, boolean isLapWorking, int criticalTemp, int yearOfRelease, String brand, int serialNumber){
        super(yearOfRelease, brand, serialNumber);
        this.temperature = temperature;
        this.isLapWorking = isLapWorking;
        this.criticalTemp = criticalTemp;
    }
    @Override
    public String toString(){
        return super.toString() + " Processor: temperature: " + temperature + " isLapWorking: " + isLapWorking +
        " criticalTemp: " + criticalTemp;
    }
    @Override
    public int hashCode(){
        return super.hashCode() + Objects.hash(temperature)*3 + Objects.hash(isLapWorking)*5 + Objects.hash(criticalTemp)*7;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Processor processor = (Processor) o;
        return super.equals(o) & (this.temperature == processor.temperature) & 
        (this.isLapWorking == processor.isLapWorking) & (this.criticalTemp == processor.criticalTemp);
    }
}