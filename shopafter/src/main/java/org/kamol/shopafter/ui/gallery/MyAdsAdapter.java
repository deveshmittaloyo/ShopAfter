package org.kamol.shopafter.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import org.kamol.shopafter.R;
import org.kamol.shopafter.data.api.model.Image;
import org.kamol.shopafter.ui.misc.BindableAdapter;

import java.util.Collections;
import java.util.List;

public class MyAdsAdapter extends BindableAdapter<Image> {
  private List<Image> images = Collections.emptyList();
  private final Picasso picasso;

  public MyAdsAdapter(Context context, Picasso picasso) {
    super(context);
    this.picasso = picasso;
  }

  public void replaceWith(List<Image> images) {
    this.images = images;
    notifyDataSetChanged();
  }

  @Override public int getCount() {
    return images.size();
  }

  @Override public Image getItem(int position) {
    return images.get(position);
  }

  @Override public long getItemId(int position) {
    return position;
  }

  @Override public View newView(LayoutInflater inflater, int position, ViewGroup container) {
    return inflater.inflate(R.layout.gallery_myads_view_image, container, false);
  }

  @Override public void bindView(Image item, int position, View view) {
    ((MyAdsItemView) view).bindTo(item, picasso);
  }
}
