package org.kamol.shopafter.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.kamol.shopafter.BaseFragment;
import org.kamol.shopafter.R;

import timber.log.Timber;

public class MyAdsFragment extends BaseFragment {
  static final String TAG = "MyAdsFragment";

  public static MyAdsFragment newInstance() {
    return new MyAdsFragment();
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
    return inflater.inflate(R.layout.gallery_myads_view, container, false);
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    Timber.d("MyAdsFragment in onActivityResult");
  }

  @Override public void onResume() {
    super.onResume();
    Timber.d("MyAdsFragment in onResume");
  }
}
