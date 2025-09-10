package entities;

import java.util.Arrays;

public class SIM {
    private final String phoneNumber;
    private int credit;
    private Call[] lastCalls;
    int callCount;

    public SIM (String phoneNumber){
        this.phoneNumber=phoneNumber;
        this.credit=0;
        this.lastCalls= new Call[5];
    }

    public void setLastCalls(Call lastCall) {
        this.lastCalls[callCount] = lastCall;
        callCount++;
    }

    @Override
    public String toString() {
        return "SIM{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", credit=" + credit + "€" +
                ", lastCalls=" + Arrays.toString(lastCalls) +
                '}';
    }
}
