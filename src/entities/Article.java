package entities;

public class Article {
    private final int ArticleId;
    private String description;
    private double price;
    private int inventory;

    public Article (int ArticleId, String description, double price, int inventory){
        this.ArticleId = ArticleId;
        this.description=description;
        this.price=price;
        this.inventory=inventory;
    }
}
