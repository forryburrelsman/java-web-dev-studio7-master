package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
   // private ArrayList<String> contents;

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        diskType = aType;
        capacityUsed = checkCapacity(someUsedCapacity);
        remainingCapacity = spaceLeft();
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }


    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String diskInfo() {
        return String.format("\nDisk name: %s\nDisk type: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, diskType, storageCapacity, capacityUsed, remainingCapacity);
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity;
    }


    //setContents
//    public void setContents(){
//        while (usedCapacity < storageCapacity){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("enter a song title you want to add to disc.");
//            String song = scan.nextLine();
//            contents.add(song);
//            usedCapacity = usedCapacity + 31;
//            System.out.println(song + " added. Enter 'again' to add another song or enter 'DONE' to burn the CD.");
//            String choice = scan.nextLine();
//            if (choice == "DONE"){
//                break;
//            }
//        }
//         if (usedCapacity >= storageCapacity) {
//             System.out.println("Max capacity reached");
//         }
//     }


}