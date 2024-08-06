// Generated by view binder compiler. Do not edit!
package com.example.tasbeeh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tasbeeh.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView islamicTV;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ImageView sebBody;

  @NonNull
  public final ImageView sebHead;

  @NonNull
  public final TextView tabehCountTV;

  @NonNull
  public final TextView tasbehCount;

  @NonNull
  public final TextView zikr;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView islamicTV,
      @NonNull ConstraintLayout main, @NonNull ImageView sebBody, @NonNull ImageView sebHead,
      @NonNull TextView tabehCountTV, @NonNull TextView tasbehCount, @NonNull TextView zikr) {
    this.rootView = rootView;
    this.islamicTV = islamicTV;
    this.main = main;
    this.sebBody = sebBody;
    this.sebHead = sebHead;
    this.tabehCountTV = tabehCountTV;
    this.tasbehCount = tasbehCount;
    this.zikr = zikr;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.islamicTV;
      TextView islamicTV = ViewBindings.findChildViewById(rootView, id);
      if (islamicTV == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.seb_body;
      ImageView sebBody = ViewBindings.findChildViewById(rootView, id);
      if (sebBody == null) {
        break missingId;
      }

      id = R.id.seb_head;
      ImageView sebHead = ViewBindings.findChildViewById(rootView, id);
      if (sebHead == null) {
        break missingId;
      }

      id = R.id.tabeh_countTV;
      TextView tabehCountTV = ViewBindings.findChildViewById(rootView, id);
      if (tabehCountTV == null) {
        break missingId;
      }

      id = R.id.tasbeh_count;
      TextView tasbehCount = ViewBindings.findChildViewById(rootView, id);
      if (tasbehCount == null) {
        break missingId;
      }

      id = R.id.zikr;
      TextView zikr = ViewBindings.findChildViewById(rootView, id);
      if (zikr == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, islamicTV, main, sebBody, sebHead,
          tabehCountTV, tasbehCount, zikr);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}