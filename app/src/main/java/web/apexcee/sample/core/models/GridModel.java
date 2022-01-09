package web.apexcee.sample.core.models;

import java.util.List;

public class GridModel {
    private String color;
    private String heading;
    private List<GridItemModel> items;

    public GridModel(String color, String heading, List<GridItemModel> items) {
        this.color = color;
        this.heading = heading;
        this.items = items;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<GridItemModel> getItems() {
        return items;
    }

    public void setItems(List<GridItemModel> items) {
        this.items = items;
    }
}
