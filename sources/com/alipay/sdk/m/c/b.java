package com.alipay.sdk.m.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements com.alipay.sdk.m.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10486a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b, reason: collision with root package name */
    public static final int f10487b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10488c = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public IBinder f10491a;

        public c(IBinder iBinder) {
            this.f10491a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f10491a;
        }

        public String d() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f10486a);
                this.f10491a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean e() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f10486a);
                this.f10491a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // com.alipay.sdk.m.b.b
    public String a(Context context) {
        ServiceConnectionC0163b serviceConnectionC0163b = new ServiceConnectionC0163b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0163b, 1)) {
            try {
                return new c(serviceConnectionC0163b.a()).d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0163b);
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.c.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC0163b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10489a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f10490b;

        public ServiceConnectionC0163b() {
            this.f10489a = false;
            this.f10490b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.f10489a) {
                throw new IllegalStateException();
            }
            this.f10489a = true;
            return this.f10490b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f10490b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
