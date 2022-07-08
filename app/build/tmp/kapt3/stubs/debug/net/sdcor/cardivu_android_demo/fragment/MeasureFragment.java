package net.sdcor.cardivu_android_demo.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000204H\u0016J\u0012\u0010C\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J&\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010L\u001a\u00020AH\u0002J\u0006\u0010M\u001a\u00020AR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?\u00a8\u0006N"}, d2 = {"Lnet/sdcor/cardivu_android_demo/fragment/MeasureFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CompanyClient", "", "getCompanyClient", "()Ljava/lang/String;", "CompanyCode", "getCompanyCode", "CompanyKey", "getCompanyKey", "CountIDX", "", "getCountIDX", "()I", "setCountIDX", "(I)V", "LAST_IDX", "getLAST_IDX", "setLAST_IDX", "MeasureTime", "getMeasureTime", "START_IDX", "getSTART_IDX", "setSTART_IDX", "TAG", "getTAG", "lastBPM", "", "getLastBPM", "()F", "setLastBPM", "(F)V", "mCameraManager", "Lnet/sdcor/cardivu_android_demo/sdapi/CameraManager;", "mHeartDataListener", "Lnet/sdcor/sdapi/imageprocmodule/HeartDataListener;", "getMHeartDataListener", "()Lnet/sdcor/sdapi/imageprocmodule/HeartDataListener;", "setMHeartDataListener", "(Lnet/sdcor/sdapi/imageprocmodule/HeartDataListener;)V", "mSD_ServerAlgorithmus", "Lnet/sdcor/sdapi/server/SD_ServerAlgorithmus;", "getMSD_ServerAlgorithmus", "()Lnet/sdcor/sdapi/server/SD_ServerAlgorithmus;", "setMSD_ServerAlgorithmus", "(Lnet/sdcor/sdapi/server/SD_ServerAlgorithmus;)V", "measureBtn", "Landroid/widget/Button;", "measure_top", "Landroidx/constraintlayout/widget/ConstraintLayout;", "primaryBaseActivity", "Landroid/content/Context;", "processingThread", "Lnet/sdcor/sdapi/imageprocmodule/ProcessingThread;", "progressBarBpm", "Landroid/widget/ProgressBar;", "textViewBpmValue", "Landroid/widget/TextView;", "textViewProgressBpm", "timeFormat", "Ljava/text/SimpleDateFormat;", "getTimeFormat", "()Ljava/text/SimpleDateFormat;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "startMEASURE", "stopMEASURE", "app_debug"})
public final class MeasureFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat timeFormat = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CompanyCode = "CompanyCode";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CompanyKey = "CompanyKey";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CompanyClient = "CompanyClient_Key";
    private int START_IDX = 0;
    private int LAST_IDX = 0;
    private final int MeasureTime = 300;
    private float lastBPM = 0.0F;
    private int CountIDX = 0;
    private android.widget.ProgressBar progressBarBpm;
    private android.widget.TextView textViewProgressBpm;
    private android.widget.TextView textViewBpmValue;
    private android.widget.Button measureBtn;
    private androidx.constraintlayout.widget.ConstraintLayout measure_top;
    private net.sdcor.cardivu_android_demo.sdapi.CameraManager mCameraManager;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.sdapi.imageprocmodule.HeartDataListener mHeartDataListener;
    @org.jetbrains.annotations.Nullable()
    private net.sdcor.sdapi.server.SD_ServerAlgorithmus mSD_ServerAlgorithmus;
    private net.sdcor.sdapi.imageprocmodule.ProcessingThread processingThread;
    private android.content.Context primaryBaseActivity;
    
    public MeasureFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getTimeFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompanyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompanyKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompanyClient() {
        return null;
    }
    
    public final int getSTART_IDX() {
        return 0;
    }
    
    public final void setSTART_IDX(int p0) {
    }
    
    public final int getLAST_IDX() {
        return 0;
    }
    
    public final void setLAST_IDX(int p0) {
    }
    
    public final int getMeasureTime() {
        return 0;
    }
    
    public final float getLastBPM() {
        return 0.0F;
    }
    
    public final void setLastBPM(float p0) {
    }
    
    public final int getCountIDX() {
        return 0;
    }
    
    public final void setCountIDX(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.sdapi.imageprocmodule.HeartDataListener getMHeartDataListener() {
        return null;
    }
    
    public final void setMHeartDataListener(@org.jetbrains.annotations.Nullable()
    net.sdcor.sdapi.imageprocmodule.HeartDataListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.sdcor.sdapi.server.SD_ServerAlgorithmus getMSD_ServerAlgorithmus() {
        return null;
    }
    
    public final void setMSD_ServerAlgorithmus(@org.jetbrains.annotations.Nullable()
    net.sdcor.sdapi.server.SD_ServerAlgorithmus p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void startMEASURE() {
    }
    
    public final void stopMEASURE() {
    }
}