package ru.kpfu.itis.Lovchitskiy;

import ru.kpfu.itis.Lovchitskiy.Interfaces.Chargeable;
import ru.kpfu.itis.Lovchitskiy.Interfaces.GivesNotifications;

import java.util.Objects;

public class Battery extends EnergyHolder implements GivesNotifications, Chargeable {
    public int chargePercent;
    public double maxTimeOfWorking;
    public double curTimeOfWorking;
    public boolean giveBatteryNotification(){
        return chargePercent <= 20 & chargePercent > 0;
    }
    public double giveRestTimeOfWorking(){
        return chargePercent* curTimeOfWorking / (100 -chargePercent);
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
        return super.toString() + " ru.kpfu.itis.Lovchitskiy.Battery: chargePercent: " + chargePercent + " maxTimeOfWorking: " +
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

    public void startCharging() {
        System.out.println("Is charging now!");
    }
}