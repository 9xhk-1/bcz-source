package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import gw.f;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AuthInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AuthInfo> CREATOR = new a();
    private static final long serialVersionUID = 6421253895937667193L;
    private String app_key;
    private String hash;
    private String package_name;
    private String redirect_url;
    private String scope;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<AuthInfo> {
        @Override // android.os.Parcelable.Creator
        public final AuthInfo createFromParcel(Parcel parcel) {
            return new AuthInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthInfo[] newArray(int i11) {
            return new AuthInfo[i11];
        }
    }

    public AuthInfo(Context context, String str, String str2, String str3) {
        this.app_key = str;
        this.redirect_url = str2;
        this.scope = str3;
        String packageName = context.getPackageName();
        this.package_name = packageName;
        this.hash = f.c(context, packageName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppKey() {
        return this.app_key;
    }

    public String getHash() {
        return this.hash;
    }

    public String getPackageName() {
        return this.package_name;
    }

    public String getRedirectUrl() {
        return this.redirect_url;
    }

    public String getScope() {
        return this.scope;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.app_key);
        parcel.writeString(this.redirect_url);
        parcel.writeString(this.scope);
        parcel.writeString(this.package_name);
        parcel.writeString(this.hash);
    }

    public AuthInfo(Parcel parcel) {
        this.app_key = parcel.readString();
        this.redirect_url = parcel.readString();
        this.scope = parcel.readString();
        this.package_name = parcel.readString();
        this.hash = parcel.readString();
    }
}
