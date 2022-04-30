package Data;

public class Technology {
    private String name;
    private String price;
    private String rate;
    private String datePublished;
    private String colour;
    private String description;
    private String image;
    private String weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public Technology(String name, String price, String rate, String datePublished, String colour, String description, String image, String weight, String brand ) {
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.datePublished = datePublished;
        this.colour = colour;
        this.description = description;
        this.image = image;
        this.weight = weight;
        this.brand = brand;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
