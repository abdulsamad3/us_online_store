// Generated by data binding compiler. Do not edit!
package com.iqonic.usonlinestore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqonic.usonlinestore.R;
import com.iqonic.usonlinestore.base.BaseRecyclerAdapter;
import com.iqonic.usonlinestore.models.SubCategory;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFaqSubheadingBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvSubCategory;

  @Bindable
  protected SubCategory mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemFaqSubheadingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvSubCategory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvSubCategory = tvSubCategory;
  }

  public abstract void setModel(@Nullable SubCategory model);

  @Nullable
  public SubCategory getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemFaqSubheadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_subheading, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqSubheadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFaqSubheadingBinding>inflateInternal(inflater, R.layout.item_faq_subheading, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFaqSubheadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_faq_subheading, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFaqSubheadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFaqSubheadingBinding>inflateInternal(inflater, R.layout.item_faq_subheading, null, false, component);
  }

  public static ItemFaqSubheadingBinding bind(@NonNull View view) {
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
  public static ItemFaqSubheadingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFaqSubheadingBinding)bind(component, view, R.layout.item_faq_subheading);
  }
}
