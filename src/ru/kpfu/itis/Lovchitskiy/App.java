package ru.kpfu.itis.Lovchitskiy;

public class App{
    public static void main(String[] args){
        Laptop lap1 = new Laptop("ogo", 12, true, "me", 2012);
        Laptop lap2 = new Laptop("ogo", 12, true, "me", 2012);
        System.out.println(lap1.hashCode());
        System.out.println(lap2.hashCode());
        // System.out.println(lap.system.getIsUpdated());

        // lap.battery.giveBatteryNotification();

        // System.out.printf( "%.2f %n",lap.battery.giveRestTimeOfWorking());

        // lap.processor.checkTemperature();
        // System.out.println(lap.processor.isLapWorking);


        // lap.system.version.downoloadNewVersion();
        // System.out.println(lap.system.version.getIsUpdated());
        // lap.system.version.setIsUpdated(false);
        // System.out.println(lap.system.version.getIsUpdated());
    }
}