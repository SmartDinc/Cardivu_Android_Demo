package net.sdcor.cardivu_android_demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000201H\u0014J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0014J\b\u00107\u001a\u000201H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007\u00a8\u00069"}, d2 = {"Lnet/sdcor/cardivu_android_demo/MainActivity;", "Lnet/sdcor/cardivu_android_demo/BaseActivity;", "Lnet/sdcor/cardivu_android_demo/databinding/ActivityMainBinding;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Lnet/sdcor/cardivu_android_demo/fragment/BottomMenuFragmentAdapter;", "getAdapter", "()Lnet/sdcor/cardivu_android_demo/fragment/BottomMenuFragmentAdapter;", "setAdapter", "(Lnet/sdcor/cardivu_android_demo/fragment/BottomMenuFragmentAdapter;)V", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getBottomNavigationView", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setBottomNavigationView", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "mPreferences", "Landroid/content/SharedPreferences;", "menu_home", "Lnet/sdcor/cardivu_android_demo/fragment/HomeFragment;", "getMenu_home", "()Lnet/sdcor/cardivu_android_demo/fragment/HomeFragment;", "setMenu_home", "(Lnet/sdcor/cardivu_android_demo/fragment/HomeFragment;)V", "menu_measure", "Lnet/sdcor/cardivu_android_demo/fragment/MeasureFragment;", "getMenu_measure", "()Lnet/sdcor/cardivu_android_demo/fragment/MeasureFragment;", "setMenu_measure", "(Lnet/sdcor/cardivu_android_demo/fragment/MeasureFragment;)V", "pager", "Lnet/sdcor/cardivu_android_demo/fragment/ViewPagerFixed;", "getPager", "()Lnet/sdcor/cardivu_android_demo/fragment/ViewPagerFixed;", "setPager", "(Lnet/sdcor/cardivu_android_demo/fragment/ViewPagerFixed;)V", "progress_main", "Landroid/widget/ProgressBar;", "getProgress_main", "()Landroid/widget/ProgressBar;", "setProgress_main", "(Landroid/widget/ProgressBar;)V", "sharedPrefFile", "getSharedPrefFile", "changeBottomMenu", "", "id", "", "init", "onBackPressed", "onDestroy", "onResume", "Companion", "app_debug"})
public final class MainActivity extends net.sdcor.cardivu_android_demo.BaseActivity<net.sdcor.cardivu_android_demo.databinding.ActivityMainBinding> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.cardivu_android_demo.fragment.ViewPagerFixed pager;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.cardivu_android_demo.fragment.BottomMenuFragmentAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.cardivu_android_demo.fragment.HomeFragment menu_home;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.cardivu_android_demo.fragment.MeasureFragment menu_measure;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ProgressBar progress_main;
    private android.content.SharedPreferences mPreferences;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sharedPrefFile = "app_preferences";
    @org.jetbrains.annotations.NotNull()
    public static final net.sdcor.cardivu_android_demo.MainActivity.Companion Companion = null;
    private static final int requestCode_systemPermission = 12041;
    @org.jetbrains.annotations.Nullable()
    private static net.sdcor.cardivu_android_demo.base.OnlyPermission mOnlyPermission;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> PERMISSIONS_Camera;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.cardivu_android_demo.fragment.ViewPagerFixed getPager() {
        return null;
    }
    
    public final void setPager(@org.jetbrains.annotations.Nullable()
    net.sdcor.cardivu_android_demo.fragment.ViewPagerFixed p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomnavigation.BottomNavigationView getBottomNavigationView() {
        return null;
    }
    
    public final void setBottomNavigationView(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomnavigation.BottomNavigationView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.cardivu_android_demo.fragment.BottomMenuFragmentAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    net.sdcor.cardivu_android_demo.fragment.BottomMenuFragmentAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.cardivu_android_demo.fragment.HomeFragment getMenu_home() {
        return null;
    }
    
    public final void setMenu_home(@org.jetbrains.annotations.Nullable()
    net.sdcor.cardivu_android_demo.fragment.HomeFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.cardivu_android_demo.fragment.MeasureFragment getMenu_measure() {
        return null;
    }
    
    public final void setMenu_measure(@org.jetbrains.annotations.Nullable()
    net.sdcor.cardivu_android_demo.fragment.MeasureFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ProgressBar getProgress_main() {
        return null;
    }
    
    public final void setProgress_main(@org.jetbrains.annotations.Nullable()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSharedPrefFile() {
        return null;
    }
    
    @java.lang.Override()
    protected void init() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void changeBottomMenu(int id) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lnet/sdcor/cardivu_android_demo/MainActivity$Companion;", "", "()V", "PERMISSIONS_Camera", "Ljava/util/ArrayList;", "", "getPERMISSIONS_Camera", "()Ljava/util/ArrayList;", "setPERMISSIONS_Camera", "(Ljava/util/ArrayList;)V", "mOnlyPermission", "Lnet/sdcor/cardivu_android_demo/base/OnlyPermission;", "getMOnlyPermission", "()Lnet/sdcor/cardivu_android_demo/base/OnlyPermission;", "setMOnlyPermission", "(Lnet/sdcor/cardivu_android_demo/base/OnlyPermission;)V", "requestCode_systemPermission", "", "getRequestCode_systemPermission", "()I", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getRequestCode_systemPermission() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final net.sdcor.cardivu_android_demo.base.OnlyPermission getMOnlyPermission() {
            return null;
        }
        
        public final void setMOnlyPermission(@org.jetbrains.annotations.Nullable()
        net.sdcor.cardivu_android_demo.base.OnlyPermission p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getPERMISSIONS_Camera() {
            return null;
        }
        
        public final void setPERMISSIONS_Camera(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
    }
}