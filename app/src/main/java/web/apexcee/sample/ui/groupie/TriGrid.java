package web.apexcee.sample.ui.groupie;

import androidx.annotation.NonNull;

import com.xwray.groupie.databinding.BindableItem;

import web.apexcee.sample.R;
import web.apexcee.sample.databinding.WidgetTriGridBinding;
import web.apexcee.sample.core.models.GridModel;

public class TriGrid extends BindableItem<WidgetTriGridBinding> {

    private final GridModel gridModel;

    public TriGrid(GridModel gridModel) {
        this.gridModel = gridModel;
    }

    @Override
    public void bind(@NonNull WidgetTriGridBinding widgetTriGridBinding, int i) {
        widgetTriGridBinding.setModel(gridModel);
    }

    @Override
    public int getLayout() {
        return R.layout.widget_tri_grid;
    }
}
