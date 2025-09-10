package entities;

public class Cart {
    private Client client;
    private double total;

    public Cart (Client client, double total){
        this.client=client;
        Article[] articles;
        this.total=total;
    }
}
