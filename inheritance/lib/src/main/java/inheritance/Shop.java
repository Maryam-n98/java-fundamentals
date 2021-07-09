package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopInterface{
   String name;
   String description;
    int numberOfDollarSigns;
    private List<Review> review = new ArrayList<>();


    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getNumberOfDollarSigns() {
        return this.numberOfDollarSigns;
    }

    @Override
    public void addReview(Review review) {
        this.review.add(review);
        updateNumberOfDollarSigns();

    }

    public List<Review> getReview() {
        return review;
    }

    @Override
    public void updateNumberOfDollarSigns() {
        double newNumberOfDollarSigns =0;
        for (int i=0; i< getReview().size();i++){
            newNumberOfDollarSigns += getReview().get(i).getNumberOfStars();


        }
        this.numberOfDollarSigns = (int)newNumberOfDollarSigns/review.size();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }
}
