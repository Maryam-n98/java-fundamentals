package inheritance;

public class Review implements ReviewInterface {

    public String body;
    public String author;
    public int numberOfStars;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }


    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getNumberOfStars() {
        return this.numberOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }

}
