package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements RestaurantsInterface {
    private String name;
    private Integer stars;
    private double priceCategory;
    private List<Review> review = new ArrayList<>();


    public Restaurant(String name, Integer stars, double priceCategory) {
        this.name = name;
        if (stars>5){
            this.stars=5;
        }else if(stars<0){
            this.stars=0;
        }else {
            this.stars= stars;
        }
        this.priceCategory = priceCategory;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStars() {
        return this.stars;
    }

    @Override
    public double getPriceCategory() {
        return this.priceCategory;
    }

    @Override
    public void addReview(Review review) {
        this.review.add(review);
        updateNumberOfStars();
    }

    public List<Review> getReview() {
        return review;
    }

    @Override
    public void updateNumberOfStars() {
      double newNumberOfStars =0;
      for (int i=0; i< getReview().size();i++){
          newNumberOfStars += getReview().get(i).getNumberOfStars();


      }
      this.stars = (int)newNumberOfStars/review.size();
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }


}
