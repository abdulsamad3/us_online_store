// Generated by data binding compiler. Do not edit!
package com.iqonic.usonlinestore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqonic.usonlinestore.R;
import com.iqonic.usonlinestore.base.BaseRecyclerAdapter;
import com.iqonic.usonlinestore.models.Reward;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRewardBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout rlMainReward;

  @NonNull
  public final ImageView scratchView;

  @Bindable
  protected Reward mModel;

  @Bindable
  protected BaseRecyclerAdapter.OnClickListener mCallback;

  protected ItemRewardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout rlMainReward, ImageView scratchView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rlMainReward = rlMainReward;
    this.scratchView = scratchView;
  }

  public abstract void setModel(@Nullable Reward model);

  @Nullable
  public Reward getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable BaseRecyclerAdapter.OnClickListener callback);

  @Nullable
  public BaseRecyclerAdapter.OnClickListener getCallback() {
    return mCallback;
  }

  @NonNull
  public static ItemRewardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_reward, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRewardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRewardBinding>inflateInternal(inflater, R.layout.item_reward, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRewardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_reward, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRewardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRewardBinding>inflateInternal(inflater, R.layout.item_reward, null, false, component);
  }

  public static ItemRewardBinding bind(@NonNull View view) {
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
  public static ItemRewardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRewardBinding)bind(component, view, R.layout.item_reward);
  }
}
