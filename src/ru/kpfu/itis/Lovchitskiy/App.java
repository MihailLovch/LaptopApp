package ru.kpfu.itis.Lovchitskiy;

public class App{
    public static void main(String[] args){
        Laptop lap = new Laptop("Lenovo", 5, true, "Messi", 2005);
        Laptop lap1 = new Laptop("Lenovo", 5, true, "Messi", 2005);
        lap.system = new Os(2020, "Windows", true, false);
        lap.battery = new Battery(19, 5.0 , 2.0, 45000, 5);
        lap.processor = new Processor(91 , true, 92,2000, "Intel", 7);
        Battery bat = new Battery(19, 5.0, 2.0, 4500, 5);
        Battery bat2 = new Battery(19, 5.0, 2.0, 4500, 5);
        System.out.print(bat.equals(bat2));

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