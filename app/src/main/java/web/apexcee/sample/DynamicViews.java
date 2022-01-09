package web.apexcee.sample;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import web.apexcee.sample.core.DynamicViewsCore;

public class DynamicViews {

    private final RecyclerView recyclerView;
    private final LinearLayoutManager layoutManager;
    private final String json;

    public DynamicViews(RecyclerView recyclerView, String json) {
        this.recyclerView = recyclerView;
        this.json = json;

        layoutManager = new LinearLayoutManager(recyclerView.getContext());

        DynamicViewsCore dynamicViewsCore = new DynamicViewsCore();
        dynamicViewsCore.initialize(recyclerView, layoutManager, json);
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public LinearLayoutManager getLayoutManager() {
        return layoutManager;
    }

    public String getJson() {
        return json;
    }
}
