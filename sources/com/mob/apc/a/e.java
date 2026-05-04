package com.mob.apc.a;

import android.os.Parcel;
import com.mob.apc.APCException;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public com.mob.apc.a f40079a;

    /* renamed from: b, reason: collision with root package name */
    public String f40080b;

    /* renamed from: e, reason: collision with root package name */
    public long f40083e;

    /* renamed from: d, reason: collision with root package name */
    public APCException f40082d = null;

    /* renamed from: c, reason: collision with root package name */
    public String f40081c = com.mob.apc.b.a().getPackageName();

    public e(com.mob.apc.a aVar, String str, long j11) {
        this.f40083e = -1L;
        this.f40079a = aVar;
        this.f40080b = str;
        this.f40083e = j11;
    }

    public void a(Parcel parcel, int i11) {
        parcel.writeLong(this.f40083e);
        if (this.f40079a != null) {
            parcel.writeInt(1);
            this.f40079a.a(parcel, i11);
        }
        if (this.f40080b != null) {
            parcel.writeInt(2);
            parcel.writeString(this.f40080b);
        }
        this.f40081c = com.mob.apc.b.a().getPackageName();
        parcel.writeInt(3);
        parcel.writeString(this.f40081c);
    }

    public String toString() {
        return "InnerMessage{apcMessage=" + this.f40079a + ", businessID='" + this.f40080b + "', pkg='" + this.f40081c + '\'' + l50.b.f69928j;
    }

    public static e a(Parcel parcel) {
        e eVar = new e(null, null, parcel.readLong());
        int readInt = parcel.readInt();
        if (readInt == 1) {
            eVar.f40079a = new com.mob.apc.a().a(parcel);
            readInt = parcel.readInt();
        }
        if (readInt == 2) {
            eVar.f40080b = parcel.readString();
            readInt = parcel.readInt();
        }
        if (readInt == 3) {
            eVar.f40081c = parcel.readString();
        }
        return eVar;
    }
}
