package com.huawei.hms.update.download.api;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateInfo {
    public String mHash;
    public int mNewVersionCode;
    public String mPackageName;
    public int mSize;
    public String mUri;

    public UpdateInfo() {
        this.mNewVersionCode = 0;
        this.mPackageName = "";
        this.mUri = "";
        this.mSize = 0;
        this.mHash = "";
    }

    public boolean isValid() {
        String str;
        return this.mNewVersionCode > 0 && this.mSize > 0 && (str = this.mUri) != null && !str.isEmpty();
    }

    public UpdateInfo(String str, int i11, String str2, int i12, String str3) {
        this.mPackageName = str;
        this.mNewVersionCode = i11;
        this.mUri = str2;
        this.mSize = i12;
        this.mHash = str3;
    }
}
