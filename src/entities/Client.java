package entities;

public class Client {
    private final int clientId;
    private String name;
    private String email;
    private final String dateSubscription;

    public Client (int clientId, String name, String email, String dateSubscription){
        this.clientId=clientId;
        this.name=name;
        this.email=email;
        this.dateSubscription=dateSubscription;
    }
}
