// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button countButton;

  @NonNull
  public final Button randomButton;

  @NonNull
  public final TextView textviewFirst;

  @NonNull
  public final Button toastButton;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button countButton,
      @NonNull Button randomButton, @NonNull TextView textviewFirst, @NonNull Button toastButton) {
    this.rootView = rootView;
    this.countButton = countButton;
    this.randomButton = randomButton;
    this.textviewFirst = textviewFirst;
    this.toastButton = toastButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.count_button;
      Button countButton = ViewBindings.findChildViewById(rootView, id);
      if (countButton == null) {
        break missingId;
      }

      id = R.id.random_button;
      Button randomButton = ViewBindings.findChildViewById(rootView, id);
      if (randomButton == null) {
        break missingId;
      }

      id = R.id.textview_first;
      TextView textviewFirst = ViewBindings.findChildViewById(rootView, id);
      if (textviewFirst == null) {
        break missingId;
      }

      id = R.id.toast_button;
      Button toastButton = ViewBindings.findChildViewById(rootView, id);
      if (toastButton == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, countButton, randomButton,
          textviewFirst, toastButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
