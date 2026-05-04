package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() { // from class: com.tencent.bugly.crashreport.common.info.PlugInBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i11) {
            return new PlugInBean[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f42076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42077b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42078c;

    public PlugInBean(String str, String str2, String str3) {
        this.f42076a = str;
        this.f42077b = str2;
        this.f42078c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f42076a + " plV:" + this.f42077b + " plUUID:" + this.f42078c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f42076a);
        parcel.writeString(this.f42077b);
        parcel.writeString(this.f42078c);
    }

    public PlugInBean(Parcel parcel) {
        this.f42076a = parcel.readString();
        this.f42077b = parcel.readString();
        this.f42078c = parcel.readString();
    }
}
