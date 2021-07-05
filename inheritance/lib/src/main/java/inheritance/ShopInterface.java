package inheritance;

public interface ShopInterface {
    String getName();
    String getDescription();
    int getNumberOfDollarSigns();

    void addReview(Review review);
    void updateNumberOfDollarSigns();
}
