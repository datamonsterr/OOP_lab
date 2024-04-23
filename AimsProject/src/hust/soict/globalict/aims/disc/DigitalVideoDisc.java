package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    // constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    // generate getters and setters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " : " + cost + "$";
    }

    public boolean isMatch(String title) {
        boolean titleMatch = this.title.toLowerCase().contains(title.toLowerCase());
        boolean categoryMatch = this.category.toLowerCase().contains(title.toLowerCase());
        return titleMatch || categoryMatch;
    }

    public boolean isMatch(float maxCost) {
        return cost <= maxCost;
    }

    public boolean isMatch(float minCost, float maxCost) {
        return cost >= minCost && cost <= maxCost;
    }
}
