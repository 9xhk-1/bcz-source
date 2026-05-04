package com.tencent.rtmp;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXVodPlayConfig {
    String mCacheFolderPath;
    Map<String, String> mHeaders;
    int mMaxCacheItems;
    int mPlayerType;
    int progressInterval;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    int mTimeout = 10;
    boolean enableAccurateSeek = true;
    boolean autoRotate = true;
    boolean smoothSwitchBitrate = false;
    String cacheMp4ExtName = "mp4";
    int maxBufferSize = 0;

    public void setAutoRotate(boolean z11) {
        this.autoRotate = z11;
    }

    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheMp4ExtName(String str) {
        this.cacheMp4ExtName = str;
    }

    public void setConnectRetryCount(int i11) {
        this.mConnectRetryCount = i11;
    }

    public void setConnectRetryInterval(int i11) {
        this.mConnectRetryInterval = i11;
    }

    public void setEnableAccurateSeek(boolean z11) {
        this.enableAccurateSeek = z11;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxBufferSize(int i11) {
        this.maxBufferSize = i11;
    }

    public void setMaxCacheItems(int i11) {
        this.mMaxCacheItems = i11;
    }

    public void setPlayerType(int i11) {
        this.mPlayerType = i11;
    }

    public void setProgressInterval(int i11) {
        this.progressInterval = i11;
    }

    public void setSmoothSwitchBitrate(boolean z11) {
        this.smoothSwitchBitrate = z11;
    }

    public void setTimeout(int i11) {
        this.mTimeout = i11;
    }
}
