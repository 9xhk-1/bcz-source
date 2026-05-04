package com.tencent.rtmp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXPlayerAuthBuilder {
    int appId;
    int exper = -1;
    String fileId;
    protected boolean isHttps;
    String sign;
    String timeout;

    /* renamed from: us, reason: collision with root package name */
    String f44625us;

    public int getAppId() {
        return this.appId;
    }

    public int getExper() {
        return this.exper;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimeout() {
        return this.timeout;
    }

    public String getUs() {
        return this.f44625us;
    }

    public boolean isHttps() {
        return this.isHttps;
    }

    public void setAppId(int i11) {
        this.appId = i11;
    }

    public void setExper(int i11) {
        this.exper = i11;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setHttps(boolean z11) {
        this.isHttps = z11;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTimeout(String str) {
        this.timeout = str;
    }

    public void setUs(String str) {
        this.f44625us = str;
    }
}
