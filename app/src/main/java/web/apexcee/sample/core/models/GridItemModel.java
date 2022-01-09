package web.apexcee.sample.core.models;

public class GridItemModel {
    private String name;
    private String image;
    private String color;
    private String price;

    public GridItemModel(String name, String image, String color, String price) {
        this.name = (name == null ? "" : name);
        this.image = image;
        this.color = color;
        this.price = (price == null ? "" : price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
