package web.apexcee.sample.core;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.databinding.BindableItem;

import web.apexcee.sample.ui.utils.Widgets;
import web.apexcee.sample.ui.groupie.FullGrid;
import web.apexcee.sample.ui.groupie.PlainGrid;
import web.apexcee.sample.ui.groupie.RoundedGrid;
import web.apexcee.sample.ui.groupie.TriGrid;
import web.apexcee.sample.core.models.FullGridModel;
import web.apexcee.sample.core.models.GridModel;

public class DynamicViewsCore {

    private final Gson gson;

    public DynamicViewsCore() {
        gson = new Gson();
    }

    public void initialize(RecyclerView recyclerView, LinearLayoutManager layoutManager, String json) {
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(getGroupieAdaptor(json));
    }

    private GroupieAdapter getGroupieAdaptor(String json) {
        GroupieAdapter groupieAdapter = new GroupieAdapter();

        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonArray jsonArray = jsonObject.getAsJsonArray("layout");

        for (JsonElement j : jsonArray) {
            groupieAdapter.add(getWidgetFromType(j));
        }
        return groupieAdapter;
    }

    private BindableItem getWidgetFromType(JsonElement jsonElement) {
        switch (jsonElement.getAsJsonObject().get("type").getAsString()) {
            case Widgets.PLAIN_GRID:
                GridModel gridModel = gson.fromJson(jsonElement, GridModel.class);
                return new PlainGrid(gridModel);
            case Widgets.ROUNDED_GRID:
                GridModel gridModel1 = gson.fromJson(jsonElement, GridModel.class);
                return new RoundedGrid(gridModel1);
            case Widgets.TRI_GRID:
                GridModel gridModel2 = gson.fromJson(jsonElement, GridModel.class);
                return new TriGrid(gridModel2);
            case Widgets.FULL_GRID:
                FullGridModel fullGridModel = gson.fromJson(jsonElement, FullGridModel.class);
                return new FullGrid(fullGridModel);
            default:
                throw new RuntimeException("ViewType not found!");
        }
    }
}
