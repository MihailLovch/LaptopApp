import java.util.Objects;

public class Version{
    protected boolean isUpdated;
    protected boolean isUpdateNotDownoloaded;
    public void downoloadNewVersion(){
        if (!isUpdateNotDownoloaded){
            System.out.println("System is already updated.");
        }else{
            isUpdated = true;
            isUpdateNotDownoloaded = false;
        }
    }
    public void setIsUpdated(boolean isUpdated){
        this.isUpdated = isUpdated;
    }
    public void setIsUpdateNotDownoloaded(boolean isUpdateNotDownoloaded){
        this.isUpdateNotDownoloaded = isUpdateNotDownoloaded;
    }
    public boolean getIsUpdated(){
        return isUpdated;
    }
    public boolean getIsUpdateNotDonwoloaded(){
        return isUpdateNotDownoloaded;
    }
    public Version(boolean isUpdated, boolean isUpdateNotDownoloaded){
        this.isUpdated = isUpdated;
        this.isUpdateNotDownoloaded = isUpdateNotDownoloaded;
    }
    @Override
    public int hashCode(){
        return super.hashCode() + 19* Objects.hash(isUpdated) + 23 * Objects.hash(isUpdateNotDownoloaded);
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Version version = (Version) o;
        return (this.isUpdated == version.isUpdated) & (this.isUpdateNotDownoloaded == version.isUpdateNotDownoloaded);
    }
    @Override
    public String toString(){
        return "Version: isUpdated: " + isUpdated + " isUpdateNotDownoloaded: "+ isUpdateNotDownoloaded + " ";
    }
}