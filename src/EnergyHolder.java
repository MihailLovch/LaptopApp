import java.util.Objects;

public abstract class EnergyHolder{
    protected int maxVolume;
    protected int timeOfStorage;
    public EnergyHolder(int maxVolume, int timeOfStorage){
        this.maxVolume = maxVolume;
        this.timeOfStorage = timeOfStorage;
    }
    @Override
    public String toString(){
        return "EnergyHolder: maxVolume: " + maxVolume + " timeOfStorage: "+ timeOfStorage; 
    }
    @Override
    public int hashCode(){
        return super.hashCode() + Objects.hash(maxVolume)*43 + Objects.hash(timeOfStorage)*53;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        EnergyHolder energyHolder = (EnergyHolder) o;
        return (this.maxVolume == energyHolder.maxVolume) & (this.timeOfStorage == energyHolder.timeOfStorage);
    }
}