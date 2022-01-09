package web.apexcee.sample.ui.utils;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class DataBindingUtils {

    @BindingAdapter("image")
    public static void loadImage(ImageView imageView, String image) {
        Glide
                .with(imageView.getContext())
                .load(image)
                .into(imageView);
        //TODO Handle image error
    }

    @BindingAdapter("color")
    public static void applyColor(View view, String color) {
        view.setBackgroundColor(Color.parseColor(color != null ? color : "#FFFFFFFF"));
        //TODO Handle wrong color format
    }

    @BindingAdapter("visibility")
    public static void setVisibility(View view, String string) {
        if (string == null || string.isEmpty()) {
            view.setVisibility(View.GONE);
            return;
        }
        view.setVisibility(View.VISIBLE);
    }
}
