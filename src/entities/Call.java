package entities;

public class Call {
    private int duration;
    private final String phoneNumber;
    private final SIM sim;

    public Call(SIM sim, int minutes, String phoneNumber) {
        this.sim=sim;
        this.duration=minutes;
        this.phoneNumber= phoneNumber;
        sim.setLastCalls(this);
    }

    @Override
    public String toString() {
        return "Call{" +
                "duration=" + duration +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
