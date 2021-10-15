package org.launchcode.studio7;

public class DVD extends BaseDisc implements SpinningDisc {


    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD can spin at a rate between 570-1600 rpm.");
    }


}
