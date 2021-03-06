package ru.kpfu.itis.Lovchitskiy;

import java.util.Objects;

public abstract class ThingMadeByHuman{
    protected String inventor;
    protected int yearOfInvention;
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        ThingMadeByHuman thingMadeByHuman = (ThingMadeByHuman) o;
        return (this.yearOfInvention == thingMadeByHuman.yearOfInvention) && (this.inventor.equals(thingMadeByHuman.inventor)) ;
    }
    @Override
    public String toString(){
        return "ru.kpfu.itis.Lovchitskiy.ThingMadeByHuman: inventor:" + this.inventor + " yearOfInvention:" + this.yearOfInvention;
    }
    @Override
    public int hashCode(){
        return Objects.hash(yearOfInvention)*11+Objects.hash(inventor)*13;
    } 
    public ThingMadeByHuman(String inventor, int yearOfInvention){
        this.yearOfInvention = yearOfInvention;
        this.inventor = inventor;
    }
}