package com.bun.miitmdid;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class w extends n {

    /* renamed from: g, reason: collision with root package name */
    public static int f28984g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static int f28985h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static int f28986i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static int f28987j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static int f28988k = 7;

    /* renamed from: l, reason: collision with root package name */
    public IBinder f28989l = null;

    /* renamed from: m, reason: collision with root package name */
    public Context f28990m;

    public w(Context context) {
        i0.a("QikuIdmanager", "QikuProvider");
        this.f28990m = context;
        b();
    }

    @Override // com.bun.miitmdid.n
    public g a() {
        return null;
    }

    public void b() {
        try {
            Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            if (declaredMethod != null) {
                i0.a("QikuIdmanager", "getService success");
                this.f28989l = (IBinder) declaredMethod.invoke(null, "qikuid");
            }
        } catch (Exception e11) {
            Log.e("QikuIdmanager", "Failure get qikuid service", e11);
        }
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public String getAAID() {
        i0.a("QikuIdmanager", "getAAID start");
        if (this.f28989l == null) {
            return null;
        }
        i0.a("QikuIdmanager", "mIBinder != null");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f28989l.transact(f28987j, obtain, obtain2, 0);
            this.f28961d = obtain2.readString();
            i0.a("QikuIdmanager", "getAAID : " + this.f28961d);
            return this.f28961d;
        } catch (RemoteException e11) {
            i0.a("QikuIdmanager", "getAAID RemoteException");
            e11.printStackTrace();
            return null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public String getOAID() {
        i0.a("QikuIdmanager", "getOAID start");
        if (this.f28989l == null) {
            return null;
        }
        i0.a("QikuIdmanager", "mIBinder != null");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f28989l.transact(f28985h, obtain, obtain2, 0);
            this.f28959b = obtain2.readString();
            i0.a("QikuIdmanager", "getOAID : " + this.f28959b);
            return this.f28959b;
        } catch (RemoteException e11) {
            i0.a("QikuIdmanager", "getOAID RemoteException");
            e11.printStackTrace();
            return null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public String getVAID() {
        i0.a("QikuIdmanager", "getVAID start");
        if (this.f28989l == null) {
            return null;
        }
        i0.a("QikuIdmanager", "mIBinder != null");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f28989l.transact(f28986i, obtain, obtain2, 0);
            this.f28960c = obtain2.readString();
            i0.a("QikuIdmanager", "getVAID : " + this.f28960c);
            return this.f28960c;
        } catch (RemoteException e11) {
            i0.a("QikuIdmanager", "getVAID RemoteException");
            e11.printStackTrace();
            return null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public boolean isLimited() {
        i0.a("QikuIdmanager", "isLimited start");
        if (this.f28989l != null) {
            i0.a("QikuIdmanager", "mIBinder != null");
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                this.f28989l.transact(9, obtain, obtain2, 0);
                this.f28963f = obtain2.readInt() != 0;
                i0.a("QikuIdmanager", "islimited : " + this.f28963f);
                return this.f28963f;
            } catch (RemoteException e11) {
                i0.a("QikuIdmanager", "isLimited RemoteException");
                e11.printStackTrace();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return false;
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public boolean isSupported() {
        i0.a("QikuIdmanager", "isSupported start");
        if (this.f28989l != null) {
            i0.a("QikuIdmanager", "mIBinder != null");
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                this.f28989l.transact(f28984g, obtain, obtain2, 0);
                int readInt = obtain2.readInt();
                i0.a("QikuIdmanager", "isSupported : " + readInt);
                boolean z11 = true;
                if (readInt != 1) {
                    z11 = false;
                }
                this.f28962e = z11;
                return z11;
            } catch (RemoteException e11) {
                i0.a("QikuIdmanager", "isSupported RemoteException");
                e11.printStackTrace();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return false;
    }

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public void shutDown() {
        if (this.f28989l != null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    i0.a("QikuIdmanager", "shutDown");
                    this.f28989l.transact(f28988k, obtain, obtain2, 0);
                } catch (RemoteException e11) {
                    e11.printStackTrace();
                }
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
    }
}
