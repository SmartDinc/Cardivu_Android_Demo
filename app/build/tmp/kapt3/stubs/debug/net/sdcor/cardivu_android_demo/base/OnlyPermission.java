package net.sdcor.cardivu_android_demo.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J.\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001aj\b\u0012\u0004\u0012\u00020\b`\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0015R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lnet/sdcor/cardivu_android_demo/base/OnlyPermission;", "", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "(Landroid/app/Activity;Landroid/content/Context;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "requestCode_systemPermission", "", "CheckPermission_Camera", "", "checkSystemPermission", "PERMISSIONS", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isOnlyPermissionCheck", "requestCode", "app_debug"})
public final class OnlyPermission {
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity activity;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private final java.lang.String TAG = null;
    private final int requestCode_systemPermission = 12041;
    
    public OnlyPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.app.Activity getActivity() {
        return null;
    }
    
    protected final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    protected final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final boolean checkSystemPermission(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> PERMISSIONS, boolean isOnlyPermissionCheck, int requestCode) {
        return false;
    }
    
    public final boolean CheckPermission_Camera() {
        return false;
    }
}