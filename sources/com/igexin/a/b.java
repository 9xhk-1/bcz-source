package com.igexin.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36994a = "com.igexin.push.extension.distribution.gws.action.guard.WakeCallback";

    /* renamed from: c, reason: collision with root package name */
    private static final int f36995c = 1;

    /* renamed from: b, reason: collision with root package name */
    private IBinder f36996b;

    public b(IBinder iBinder) {
        this.f36996b = iBinder;
    }

    private IBinder a() {
        return this.f36996b;
    }

    public final void a(Bundle bundle) throws RemoteException {
        if (this.f36996b == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(f36994a);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.f36996b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
