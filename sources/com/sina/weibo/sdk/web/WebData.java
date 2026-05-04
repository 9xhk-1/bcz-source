package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WebData implements Parcelable, Serializable {
    public static final Parcelable.Creator<WebData> CREATOR = new a();
    private static final long serialVersionUID = -4038177938155795889L;

    /* renamed from: a, reason: collision with root package name */
    public AuthInfo f41599a;

    /* renamed from: b, reason: collision with root package name */
    public int f41600b;

    /* renamed from: c, reason: collision with root package name */
    public String f41601c;

    /* renamed from: d, reason: collision with root package name */
    public String f41602d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<WebData> {
        @Override // android.os.Parcelable.Creator
        public final WebData createFromParcel(Parcel parcel) {
            return new WebData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebData[] newArray(int i11) {
            return new WebData[i11];
        }
    }

    public WebData(AuthInfo authInfo, int i11, String str, String str2) {
        this.f41599a = authInfo;
        this.f41600b = i11;
        this.f41601c = str;
        this.f41602d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f41599a, i11);
        parcel.writeInt(this.f41600b);
        parcel.writeString(this.f41601c);
        parcel.writeString(this.f41602d);
    }

    public WebData(Parcel parcel) {
        this.f41599a = (AuthInfo) parcel.readParcelable(AuthInfo.class.getClassLoader());
        this.f41600b = parcel.readInt();
        this.f41601c = parcel.readString();
        this.f41602d = parcel.readString();
    }
}
