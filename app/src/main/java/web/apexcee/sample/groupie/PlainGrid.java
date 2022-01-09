package web.apexcee.sample.groupie;

import androidx.annotation.NonNull;

import com.xwray.groupie.databinding.BindableItem;

import web.apexcee.sample.R;
import web.apexcee.sample.databinding.WidgetPlainGridBinding;
import web.apexcee.sample.models.GridModel;

public class PlainGrid extends BindableItem<WidgetPlainGridBinding> {

    private final GridModel gridModel;

    public PlainGrid(GridModel gridModel) {
        this.gridModel = gridModel;
    }

    @Override
    public void bind(@NonNull WidgetPlainGridBinding widgetPlainGridBinding, int i) {
        widgetPlainGridBinding.setModel(gridModel);
    }

    @Override
    public int getLayout() {
        return R.layout.widget_plain_grid;
    }
}
