// This class handles the storage, conversion and formatting of currency.

public class Latinum {
    // stores entire balance in smallest unit, slips.
    private int totalSlips;

    // initiates totalSlips
    public Latinum(int totalSlips) {
        this.totalSlips = totalSlips;
    }

    // retrieves balance in slips
    public int getTotalSlips(){
        return totalSlips;
    }

    // adds to total balance
    public void add(int slips) {
        totalSlips += slips;
    }

    // subtracts from balance but won't go below zero.
    public void subtract(int slips) {
        totalSlips = Math.max(0, totalSlips - slips);
    }

    // converts slips into other denominations: bars, slips, strips. presents in 000.00.00 format
    public String formattedLatinumBalance() {
        int bars = totalSlips / 10000;
        int strips = (totalSlips % 10000) / 100;
        int slips = totalSlips % 100;
        return String.format("%02d bars, %02d strips, %02d slips", bars, strips, slips);
    }

    // converts separate denoms into total number of slips
    public static int toSlips(int bars, int strips, int slips) {
        return bars * 10000 + strips * 100 + slips;
    }
}
