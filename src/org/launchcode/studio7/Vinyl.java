package org.launchcode.studio7;

public class Vinyl extends BaseDisc implements SpinningDisc {


    public Vinyl(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Vinyl record spins at a speed of 33.5 rpm.");
    }




}
