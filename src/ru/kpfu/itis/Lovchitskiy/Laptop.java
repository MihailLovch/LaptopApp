package ru.kpfu.itis.Lovchitskiy;

import ru.kpfu.itis.Lovchitskiy.Interfaces.CanPlayMusic;

public class Laptop extends Mechanism implements  CanPlayMusic {
    public Os system;
    public Battery battery;
    public Processor processor;
    public String brand;
    @Override
    public String toString(){
        return super.toString() + " Lap: brand:" + brand;  
    }
    public Laptop(String brand, int weight, boolean isDifficult, String inventor, int yearOfInvention){
        super(weight, isDifficult, inventor, yearOfInvention);
        this.brand = brand;
    }

    public void decreaseVolume() {
        System.out.println("Volume level was decreased");
    }

    public void makeASound(){
        System.out.println("Bim!");
    }

    public void increaseVolume() {
        System.out.println("Volume level was increased");
    }
}
