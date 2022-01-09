package web.apexcee.sample.ui.groupie;

import androidx.annotation.NonNull;

import com.xwray.groupie.databinding.BindableItem;

import web.apexcee.sample.R;
import web.apexcee.sample.databinding.WidgetRoundedGridBinding;
import web.apexcee.sample.core.models.GridModel;

public class RoundedGrid extends BindableItem<WidgetRoundedGridBinding> {

    private final GridModel gridModel;

    public RoundedGrid(GridModel gridModel) {
        this.gridModel = gridModel;
    }

    @Override
    public void bind(@NonNull WidgetRoundedGridBinding widgetRoundedGridBinding, int i) {
        widgetRoundedGridBinding.setModel(gridModel);
    }

    @Override
    public int getLayout() {
        return R.layout.widget_rounded_grid;
    }
}
