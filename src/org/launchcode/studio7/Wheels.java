package org.launchcode.studio7;

public class Wheels implements SpinningDisc{
    private int diameter;
    private String wheelType;
    private String usage;


    public Wheels(int aDiameter, String aWheelType, String aUsage){
        diameter = aDiameter;
        wheelType = aWheelType;
        usage = aUsage;
    }


    @Override
    public void spinDisc() {
        System.out.println("Wheels can have many different sizes and purposes, therefore can spin at a wide range of speeds.\n");
    }

    public void getWheelInfo(){
        System.out.println("This is a "+wheelType+" wheel. It's diameter measures at "+diameter+
                " in. and is used for "+usage+".");
    }
   //make Wheels abstract and extend it to classes called Bike, Truck, etc.

}
