package com.vivo.push.model;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class InsideNotificationItem extends UPSNotificationMessage {
    private int mAppType;
    private int mDisplayStyle;
    private int mInnerPriority;
    private boolean mIsShowBigPicOnMobileNet;
    private int mMessageType;
    private int mNotifyDisplayStatus;
    private String mReactPackage;
    private String mSuitReactVersion;

    private int parsingNotifyStyle() {
        int i11 = this.mDisplayStyle;
        return ((i11 & 32) == 0 && (i11 & 16) != 0) ? 1 : 0;
    }

    public int getAppType() {
        return this.mAppType;
    }

    public int getDisplayStyle() {
        return this.mDisplayStyle;
    }

    public int getInnerPriority() {
        return this.mInnerPriority;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    public int getNotifyDisplayStatus() {
        return this.mNotifyDisplayStatus;
    }

    public String getReactPackage() {
        return this.mReactPackage;
    }

    public String getSuitReactVersion() {
        return this.mSuitReactVersion;
    }

    public boolean isShowBigPicOnMobileNet() {
        return this.mIsShowBigPicOnMobileNet;
    }

    public void setAppType(int i11) {
        this.mAppType = i11;
    }

    public void setDisplayStyle(int i11) {
        this.mDisplayStyle = i11;
        this.mNotifyDisplayStatus = parsingNotifyStyle();
    }

    public void setInnerPriority(int i11) {
        this.mInnerPriority = i11;
    }

    public void setIsShowBigPicOnMobileNet(boolean z11) {
        this.mIsShowBigPicOnMobileNet = z11;
    }

    public void setMessageType(int i11) {
        this.mMessageType = i11;
    }

    public void setReactPackage(String str) {
        this.mReactPackage = str;
    }

    public void setSuitReactVersion(String str) {
        this.mSuitReactVersion = str;
    }
}
