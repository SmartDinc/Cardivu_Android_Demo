// Generated by data binding compiler. Do not edit!
package net.sdcor.cardivu_android_demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import net.sdcor.cardivu_android_demo.R;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final TextView buttonIsPerm;

  @NonNull
  public final TextView companyNameTextview;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView textViewBpm;

  @NonNull
  public final TextView textViewSdnn;

  @NonNull
  public final TextView textViewStress;

  @NonNull
  public final TextView textViewTime;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView buttonIsPerm, TextView companyNameTextview, ImageView imageView,
      LinearLayout linearLayout, TextView textView11, TextView textView12, TextView textView8,
      TextView textView9, TextView textViewBpm, TextView textViewSdnn, TextView textViewStress,
      TextView textViewTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonIsPerm = buttonIsPerm;
    this.companyNameTextview = companyNameTextview;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.textViewBpm = textViewBpm;
    this.textViewSdnn = textViewSdnn;
    this.textViewStress = textViewStress;
    this.textViewTime = textViewTime;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
