package com.tencent.rtmp;

import java.util.Map;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXLivePlayConfig {
    String mCacheFolderPath;
    protected Map<String, String> mHeaders;
    int mMaxCacheItems;
    float mCacheTime = 5.0f;
    float mMaxAutoAdjustCacheTime = 5.0f;
    float mMinAutoAdjustCacheTime = 1.0f;
    int mVideoBlockThreshold = 800;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    boolean mAutoAdjustCacheTime = true;
    boolean mEnableAec = false;
    boolean mEnableNearestIP = true;
    boolean mEnableMessage = false;
    boolean mEnableMetaData = false;
    String mFlvSessionKey = "";
    int mRtmpChannelType = 0;
    boolean mAutoRotate = true;

    public void enableAEC(boolean z11) {
        this.mEnableAec = z11;
    }

    public void setAutoAdjustCacheTime(boolean z11) {
        this.mAutoAdjustCacheTime = z11;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheTime(float f11) {
        this.mCacheTime = f11;
    }

    public void setConnectRetryCount(int i11) {
        this.mConnectRetryCount = i11;
    }

    public void setConnectRetryInterval(int i11) {
        this.mConnectRetryInterval = i11;
    }

    public void setEnableMessage(boolean z11) {
        this.mEnableMessage = z11;
    }

    public void setEnableMetaData(boolean z11) {
        this.mEnableMetaData = z11;
    }

    @Deprecated
    public void setEnableNearestIP(boolean z11) {
        this.mEnableNearestIP = z11;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    @Deprecated
    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxAutoAdjustCacheTime(float f11) {
        this.mMaxAutoAdjustCacheTime = f11;
    }

    @Deprecated
    public void setMaxCacheItems(int i11) {
        this.mMaxCacheItems = i11;
    }

    public void setMinAutoAdjustCacheTime(float f11) {
        this.mMinAutoAdjustCacheTime = f11;
    }

    @Deprecated
    public void setRtmpChannelType(int i11) {
        this.mRtmpChannelType = i11;
    }

    public void setVideoBlockThreshold(int i11) {
        this.mVideoBlockThreshold = i11;
    }

    public String toString() {
        return "{mCacheTime=" + this.mCacheTime + ", mMaxAutoAdjustCacheTime=" + this.mMaxAutoAdjustCacheTime + ", mMinAutoAdjustCacheTime=" + this.mMinAutoAdjustCacheTime + ", mAutoAdjustCacheTime=" + this.mAutoAdjustCacheTime + ", mVideoBlockThreshold=" + this.mVideoBlockThreshold + ", mConnectRetryCount=" + this.mConnectRetryCount + ", mConnectRetryInterval=" + this.mConnectRetryInterval + ", mEnableAec=" + this.mEnableAec + ", mEnableMessage=" + this.mEnableMessage + ", mEnableMetaData=" + this.mEnableMetaData + b.f69928j;
    }
}
