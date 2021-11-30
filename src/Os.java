import java.util.Objects;

public class Os extends Version{
    public int year;
    public String name;
    public Os(int year, String name, boolean isUpdated, boolean isUpdateNotDownoloaded){
        super(isUpdated, isUpdateNotDownoloaded);
        this.year = year;
        this.name = name;
    }
    @Override
    public String toString(){
        return super.toString() + "Os: year: " + year + " name: " + name;
    }
    @Override
    public int hashCode(){
        return super.hashCode() + Objects.hash(year)*7 + Objects.hash(name)*3;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Os os = (Os) o;
        return super.equals(o) & (this.year == os.year) & (this.name == os.name);
    }
}