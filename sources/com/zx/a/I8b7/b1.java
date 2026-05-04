package com.zx.a.I8b7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f46466a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile b1 f46467b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Context f46468c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f46469d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public String f46470a;

        /* renamed from: e, reason: collision with root package name */
        public final String f46474e;

        /* renamed from: g, reason: collision with root package name */
        public final String f46476g;

        /* renamed from: h, reason: collision with root package name */
        public final String f46477h;

        /* renamed from: i, reason: collision with root package name */
        public d f46478i;

        /* renamed from: b, reason: collision with root package name */
        public boolean f46471b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46472c = false;

        /* renamed from: d, reason: collision with root package name */
        public final CountDownLatch f46473d = new CountDownLatch(1);

        /* renamed from: f, reason: collision with root package name */
        public final String f46475f = null;

        public b(String str, String str2, String str3, String str4) {
            this.f46474e = str;
            this.f46476g = str3;
            this.f46477h = str4;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public IBinder f46479a;

        public c(IBinder iBinder, String str) {
            this.f46479a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f46479a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public c f46480a;

        /* renamed from: b, reason: collision with root package name */
        public String f46481b;

        /* renamed from: c, reason: collision with root package name */
        public CountDownLatch f46482c;

        /* renamed from: d, reason: collision with root package name */
        public IBinder f46483d;

        public d(String str, CountDownLatch countDownLatch) {
            this.f46481b = str;
            this.f46482c = countDownLatch;
        }

        public boolean a(Context context, Intent intent) {
            c cVar;
            if (this.f46480a != null) {
                return true;
            }
            try {
                boolean bindService = context.bindService(intent, this, 1);
                this.f46482c.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = this.f46483d;
                String str = this.f46481b;
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(str);
                    cVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, str);
                }
                this.f46480a = cVar;
                return bindService;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f46483d = iBinder;
                this.f46482c.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f46480a = null;
            this.f46483d = null;
        }
    }

    static {
        String upperCase = Build.MANUFACTURER.toUpperCase();
        upperCase.getClass();
        f46466a = !upperCase.equals(SystemUtils.PRODUCT_HONOR) ? null : new e();
    }

    public final boolean a() {
        a aVar;
        long longVersionCode;
        try {
            if (f46468c == null || (aVar = f46466a) == null) {
                return false;
            }
            b bVar = (b) aVar;
            if (bVar.f46472c) {
                return bVar.f46471b;
            }
            if (TextUtils.isEmpty(bVar.f46474e)) {
                bVar.f46471b = false;
            } else {
                PackageInfo a11 = i3.a(bVar.f46474e, 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    longVersionCode = a11.getLongVersionCode();
                    return longVersionCode >= 1;
                }
                bVar.f46471b = a11.versionCode >= 1;
            }
            bVar.f46472c = true;
            return bVar.f46471b;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends b {

        /* renamed from: j, reason: collision with root package name */
        public final CountDownLatch f46484j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends b {
            public a() {
            }
        }

        public e() {
            super("com.hihonor.id", null, "com.hihonor.id.HnOaIdService", "com.hihonor.cloudservice.oaid.IOAIDService");
            this.f46484j = new CountDownLatch(1);
        }

        public String a(Context context) {
            d dVar;
            d dVar2;
            if (!TextUtils.isEmpty(this.f46470a) || (dVar = this.f46478i) == null || dVar.f46480a == null) {
                return this.f46470a;
            }
            try {
                IBinder iBinder = dVar.f46483d;
                a aVar = new a();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    obtain.writeStrongBinder(aVar);
                    iBinder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    this.f46484j.await(1L, TimeUnit.SECONDS);
                    if (!TextUtils.isEmpty(this.f46470a) && (dVar2 = this.f46478i) != null) {
                        context.unbindService(dVar2);
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            return this.f46470a;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class b extends Binder implements IInterface {
            public b() {
                attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
            }

            @Override // android.os.Binder
            public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
                if (i11 != 2) {
                    if (i11 != 1598968902) {
                        return super.onTransact(i11, parcel, parcel2, i12);
                    }
                    parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    return true;
                }
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                a aVar = (a) this;
                if (readInt == 0 && bundle != null) {
                    e.this.f46470a = bundle.getString("oa_id_flag");
                }
                e.this.f46484j.countDown();
                parcel2.writeNoException();
                return true;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this;
            }
        }
    }
}
