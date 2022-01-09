package web.apexcee.sample.ui.groupie;

import androidx.annotation.NonNull;

import com.xwray.groupie.databinding.BindableItem;

import web.apexcee.sample.R;
import web.apexcee.sample.databinding.WidgetFullGridBinding;
import web.apexcee.sample.core.models.FullGridModel;

public class FullGrid extends BindableItem<WidgetFullGridBinding> {

    private final FullGridModel fullGridModel;

    public FullGrid(FullGridModel fullGridModel) {
        this.fullGridModel = fullGridModel;
    }

    @Override
    public void bind(@NonNull WidgetFullGridBinding widgetFullGridBinding, int i) {
        widgetFullGridBinding.setModel(fullGridModel);
    }

    @Override
    public int getLayout() {
        return R.layout.widget_full_grid;
    }
}
