import java.util.Objects;

public class Battery extends EnergyHolder{
    public int chargePercent;
    public double maxTimeOfWorking;
    public double curTimeOfWorking;
    public boolean giveBatteryNotification(){
        if (chargePercent <= 20 & chargePercent > 0){
            return true;
        }
        return false;
    }
    public double giveRestTimeOfWorking(){
        double restTime = chargePercent* curTimeOfWorking / (100 -chargePercent);
        return restTime;
    }
    public Battery(int chargePercent, double maxTimeOfWorking, double curTimeOfWorking, int maxVolume, int timeOfStorage){
        super(maxVolume,timeOfStorage);
        if (chargePercent > 0 & chargePercent <= 100){
            this.chargePercent = chargePercent;
        }
        if (curTimeOfWorking <= maxTimeOfWorking){
            this.maxTimeOfWorking = maxTimeOfWorking;
            this.curTimeOfWorking = curTimeOfWorking;
        }
    }
    @Override
    public String toString(){
        return super.toString() + " Battery: chargePercent: " + chargePercent + " maxTimeOfWorking: " + 
        maxTimeOfWorking + " curTimeOfWorking: " + curTimeOfWorking; 
    }
    @Override
    public int hashCode(){
        return super.hashCode() + Objects.hash(chargePercent)*13 + Objects.hash(maxTimeOfWorking)*43
        + Objects.hash(curTimeOfWorking)*53;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Battery battery = (Battery) o;
        return super.equals(o) & (this.chargePercent == battery.chargePercent)
        &(this.maxTimeOfWorking == battery.maxTimeOfWorking) & (this.curTimeOfWorking == battery.curTimeOfWorking);
    }
}