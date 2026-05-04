package io.openinstall.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import tz.j0;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: io.openinstall.sdk.a$a, reason: collision with other inner class name */
    public static final class C0730a {

        /* renamed from: a, reason: collision with root package name */
        public final String f62581a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f62582b;

        public C0730a(String str, boolean z11) {
            this.f62581a = str;
            this.f62582b = z11;
        }

        public String a() {
            return this.f62581a;
        }

        public boolean b() {
            return this.f62582b;
        }
    }

    public static final class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public final String f62585a = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

        /* renamed from: b, reason: collision with root package name */
        public IBinder f62586b;

        public c(IBinder iBinder) {
            this.f62586b = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f62586b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f62586b;
        }

        public boolean x0(boolean z11) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z11 ? 1 : 0);
                this.f62586b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static C0730a a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        } catch (Exception unused) {
            if (j0.f91313a) {
                j0.b("com.android.vending not found", new Object[0]);
            }
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, bVar, 1)) {
                c cVar = new c(bVar.a());
                return new C0730a(cVar.a(), cVar.x0(true));
            }
            if (j0.f91313a) {
                j0.b("AdvertisingIdClient bindService failed", new Object[0]);
            }
        } catch (Exception unused2) {
            if (j0.f91313a) {
                j0.b("AdvertisingIdClient get AdInfo failed", new Object[0]);
            }
        } finally {
            context.unbindService(bVar);
        }
        return null;
    }

    public static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f62583a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue f62584b;

        public b() {
            this.f62583a = false;
            this.f62584b = new LinkedBlockingQueue(1);
        }

        public IBinder a() throws InterruptedException {
            if (this.f62583a) {
                throw new IllegalStateException();
            }
            this.f62583a = true;
            return (IBinder) this.f62584b.poll(3L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f62584b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
