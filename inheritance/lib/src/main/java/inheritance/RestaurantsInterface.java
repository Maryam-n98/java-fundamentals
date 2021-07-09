package inheritance;

public interface RestaurantsInterface {
    String getName();
     int getStars();
   double getPriceCategory();

   void addReview(Review review);
   void updateNumberOfStars();
}
