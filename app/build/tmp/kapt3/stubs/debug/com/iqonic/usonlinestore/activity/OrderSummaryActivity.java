package com.iqonic.usonlinestore.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\"\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u001bH\u0014J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u001bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006+"}, d2 = {"Lcom/iqonic/usonlinestore/activity/OrderSummaryActivity;", "Lcom/iqonic/usonlinestore/AppBaseActivity;", "()V", "cartAdapter", "Lcom/iqonic/usonlinestore/base/BaseRecyclerAdapter;", "Lcom/iqonic/usonlinestore/models/CartResponse;", "Lcom/iqonic/usonlinestore/databinding/ItemCartBinding;", "dialog", "Landroid/app/Dialog;", "mAddressAdapter", "Lcom/iqonic/usonlinestore/models/Address;", "Lcom/iqonic/usonlinestore/databinding/ItemUserAddressBinding;", "mCartModel", "getMCartModel", "()Lcom/iqonic/usonlinestore/models/CartResponse;", "setMCartModel", "(Lcom/iqonic/usonlinestore/models/CartResponse;)V", "mImg", "Ljava/util/ArrayList;", "", "selected", "", "getSelected", "()I", "setSelected", "(I)V", "createOrder", "", "getOffers", "initChangeAddressDialog", "loadAddressList", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setDefaultAddress", "position", "updateAddress", "app_debug"})
public final class OrderSummaryActivity extends com.iqonic.usonlinestore.AppBaseActivity {
    private android.app.Dialog dialog;
    private final java.util.ArrayList<java.lang.String> mImg = null;
    @org.jetbrains.annotations.Nullable()
    private com.iqonic.usonlinestore.models.CartResponse mCartModel;
    private int selected;
    private com.iqonic.usonlinestore.base.BaseRecyclerAdapter<com.iqonic.usonlinestore.models.Address, com.iqonic.usonlinestore.databinding.ItemUserAddressBinding> mAddressAdapter;
    private com.iqonic.usonlinestore.base.BaseRecyclerAdapter<com.iqonic.usonlinestore.models.CartResponse, com.iqonic.usonlinestore.databinding.ItemCartBinding> cartAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.usonlinestore.models.CartResponse getMCartModel() {
        return null;
    }
    
    public final void setMCartModel(@org.jetbrains.annotations.Nullable()
    com.iqonic.usonlinestore.models.CartResponse p0) {
    }
    
    public final int getSelected() {
        return 0;
    }
    
    public final void setSelected(int p0) {
    }
    
    private final void setDefaultAddress(int position) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getOffers() {
    }
    
    private final void initChangeAddressDialog() {
    }
    
    private final void updateAddress() {
    }
    
    private final void loadAddressList() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void createOrder() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public OrderSummaryActivity() {
        super();
    }
}