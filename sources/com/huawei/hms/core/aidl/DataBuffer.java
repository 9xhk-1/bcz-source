package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* renamed from: a, reason: collision with root package name */
    private int f35603a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f35604b;
    public Bundle header;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<DataBuffer> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i11) {
            return new DataBuffer[i11];
        }
    }

    public /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    public DataBuffer addBody(Bundle bundle) {
        this.f35604b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f35604b;
    }

    public int getBodySize() {
        return this.f35604b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f35603a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.f35603a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.f35604b);
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f35603a = 1;
        this.f35604b = null;
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.f35603a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.f35604b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f35603a = 1;
        this.f35604b = null;
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f35603a = 1;
        this.f35604b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i11) {
        this.header = null;
        this.f35604b = null;
        this.URI = str;
        this.f35603a = i11;
    }
}
