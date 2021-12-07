package ru.kpfu.itis.Lovchitskiy;

import ru.kpfu.itis.Lovchitskiy.Interfaces.Updatable;

import java.util.Objects;

public class Version implements Updatable {
    protected boolean isUpdated;
    protected boolean isUpdateNotDownloaded;
    public void downloadNewVersion(){
        if (!isUpdateNotDownloaded){
            System.out.println("System is already updated.");
        }else{
            isUpdated = true;
            isUpdateNotDownloaded = false;
        }
    }
    public boolean checkNewUpdate(){
        return isUpdateNotDownloaded;
    }
    public void setIsUpdated(boolean isUpdated){
        this.isUpdated = isUpdated;
    }
    public void setIsUpdateNotDownloaded(boolean isUpdateNotDownloaded){
        this.isUpdateNotDownloaded = this.isUpdateNotDownloaded;
    }
    public boolean getIsUpdated(){
        return isUpdated;
    }
    public boolean getIsUpdateNotDownloaded(){
        return isUpdateNotDownloaded;
    }
    public Version(boolean isUpdated, boolean isUpdateNotDownloaded){
        this.isUpdated = isUpdated;
        this.isUpdateNotDownloaded = isUpdateNotDownloaded;
    }
    @Override
    public int hashCode(){
        return 19* Objects.hash(isUpdated) + 23 * Objects.hash(isUpdateNotDownloaded);
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
        return (this.isUpdated == version.isUpdated) & (this.isUpdateNotDownloaded == version.isUpdateNotDownloaded);
    }
    @Override
    public String toString(){
        return "ru.kpfu.itis.Lovchitskiy.Version: isUpdated: " + isUpdated + " isUpdateNotDownloaded: "+ isUpdateNotDownloaded + " ";
    }
}