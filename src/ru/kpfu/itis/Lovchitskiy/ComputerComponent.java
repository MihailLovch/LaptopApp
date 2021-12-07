package ru.kpfu.itis.Lovchitskiy;

import java.util.Objects;

public abstract class ComputerComponent{
    protected int yearOfRelease;
    protected String brand;
    protected int serialNumber;
    public ComputerComponent(int yearOfRelease, String brand, int serialNumber){
        this.yearOfRelease = yearOfRelease;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString(){
        return "ru.kpfu.itis.Lovchitskiy.ComputerComponent: yearOfRelease: " + yearOfRelease + " brand:" + brand + " serialNumber" + serialNumber;
    }
    @Override
    public int hashCode(){
        return  Objects.hash(yearOfRelease)*3 + Objects.hash(brand)*5 + Objects.hash(serialNumber)*7;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        ComputerComponent computerComponent = (ComputerComponent) o;
        return (this.yearOfRelease == computerComponent.yearOfRelease) & (this.brand.equals(computerComponent.brand)) &
        (this.serialNumber == computerComponent.serialNumber);
    }
}