package org.launchcode.studio7;


public class CD extends BaseDisc implements SpinningDisc {


    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD can spin at a rate between 200-500 rpm.");
    }


}
