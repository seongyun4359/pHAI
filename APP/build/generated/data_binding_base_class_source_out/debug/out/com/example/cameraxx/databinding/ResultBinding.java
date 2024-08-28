// Generated by view binder compiler. Do not edit!
package com.example.cameraxx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cameraxx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ResultBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar ProgressBar;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnRetake;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView tvStatus;

  @NonNull
  public final TextView tvTitle;

  private ResultBinding(@NonNull RelativeLayout rootView, @NonNull ProgressBar ProgressBar,
      @NonNull Button btnHome, @NonNull Button btnRetake, @NonNull CardView cardView,
      @NonNull TextView tvStatus, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ProgressBar = ProgressBar;
    this.btnHome = btnHome;
    this.btnRetake = btnRetake;
    this.cardView = cardView;
    this.tvStatus = tvStatus;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ResultBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ProgressBar;
      ProgressBar ProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (ProgressBar == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnRetake;
      Button btnRetake = ViewBindings.findChildViewById(rootView, id);
      if (btnRetake == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.tvStatus;
      TextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ResultBinding((RelativeLayout) rootView, ProgressBar, btnHome, btnRetake, cardView,
          tvStatus, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
