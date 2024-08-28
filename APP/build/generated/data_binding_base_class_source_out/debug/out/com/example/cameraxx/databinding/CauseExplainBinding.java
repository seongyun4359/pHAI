// Generated by view binder compiler. Do not edit!
package com.example.cameraxx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cameraxx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CauseExplainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView answer1TextView;

  @NonNull
  public final TextView answer2TextView;

  @NonNull
  public final TextView answer3TextView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final TextView questionTextView;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView subtitleTextView;

  @NonNull
  public final TextView titleTextView;

  private CauseExplainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView answer1TextView,
      @NonNull TextView answer2TextView, @NonNull TextView answer3TextView,
      @NonNull ImageButton backButton, @NonNull TextView questionTextView,
      @NonNull ScrollView scrollView, @NonNull TextView subtitleTextView,
      @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.answer1TextView = answer1TextView;
    this.answer2TextView = answer2TextView;
    this.answer3TextView = answer3TextView;
    this.backButton = backButton;
    this.questionTextView = questionTextView;
    this.scrollView = scrollView;
    this.subtitleTextView = subtitleTextView;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CauseExplainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CauseExplainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cause_explain, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CauseExplainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.answer1TextView;
      TextView answer1TextView = ViewBindings.findChildViewById(rootView, id);
      if (answer1TextView == null) {
        break missingId;
      }

      id = R.id.answer2TextView;
      TextView answer2TextView = ViewBindings.findChildViewById(rootView, id);
      if (answer2TextView == null) {
        break missingId;
      }

      id = R.id.answer3TextView;
      TextView answer3TextView = ViewBindings.findChildViewById(rootView, id);
      if (answer3TextView == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.questionTextView;
      TextView questionTextView = ViewBindings.findChildViewById(rootView, id);
      if (questionTextView == null) {
        break missingId;
      }

      id = R.id.scrollView;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.subtitleTextView;
      TextView subtitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (subtitleTextView == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new CauseExplainBinding((ConstraintLayout) rootView, answer1TextView, answer2TextView,
          answer3TextView, backButton, questionTextView, scrollView, subtitleTextView,
          titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
