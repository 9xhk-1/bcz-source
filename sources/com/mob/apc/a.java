package com.mob.apc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public Object f40054d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f40055e;

    /* renamed from: a, reason: collision with root package name */
    public int f40051a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f40052b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f40053c = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f40056f = -1;

    public void a(Parcel parcel, int i11) {
        parcel.writeInt(this.f40051a);
        parcel.writeInt(this.f40052b);
        parcel.writeInt(this.f40053c);
        Object obj = this.f40054d;
        if (obj != null) {
            if (obj instanceof Serializable) {
                parcel.writeInt(2);
                parcel.writeSerializable((Serializable) this.f40054d);
            } else if (obj instanceof Parcelable) {
                parcel.writeInt(3);
                parcel.writeParcelable((Parcelable) this.f40054d, i11);
            }
        }
        if (this.f40055e == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeBundle(this.f40055e);
        }
    }

    public String toString() {
        return "APCMessage{what=" + this.f40051a + ", arg1=" + this.f40052b + ", arg2=" + this.f40053c + ", obj=" + this.f40054d + ", data=" + this.f40055e + l50.b.f69928j;
    }

    public a a(Parcel parcel) {
        this.f40051a = parcel.readInt();
        this.f40052b = parcel.readInt();
        this.f40053c = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == 2) {
            this.f40054d = parcel.readSerializable();
            readInt = parcel.readInt();
        } else if (readInt == 3) {
            this.f40054d = parcel.readParcelable(getClass().getClassLoader());
            readInt = parcel.readInt();
        }
        if (readInt == 1) {
            this.f40055e = parcel.readBundle();
        }
        return this;
    }
}
