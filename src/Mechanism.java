import java.util.Objects;

public abstract class Mechanism extends ThingMadeByHuman{
    protected int weight;
    protected boolean isDifficult;
    @Override
    public String toString(){
        return super.toString() + " Mechanism: weight:" + weight + " isDifficult:" + isDifficult;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Mechanism mechanism = (Mechanism) o;
        return super.equals(o) && (this.weight == mechanism.weight) && (this.isDifficult == mechanism.isDifficult) ;
    }
    @Override
    public int hashCode(){
        return super.hashCode() + Objects.hash(this.weight)*7 + Objects.hash(this.isDifficult)*113;
    } 
    public Mechanism(int weight, boolean isDifficult, String inventor, int yearOfInvention){
        super(inventor, yearOfInvention);
        this.weight = weight;
        this.isDifficult = isDifficult;
    }
}