package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes8.dex */
class aq implements at {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f45258a;

    /* renamed from: a, reason: collision with other field name */
    private Context f140a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f141a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f139a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile String f143a = null;

    /* renamed from: b, reason: collision with other field name */
    private volatile boolean f144b = false;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f45259b = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f142a = new Object();

    public static class b {
        public static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.alipay.sdk.m.c.b.f10486a);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public static boolean m5726a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.alipay.sdk.m.c.b.f10486a);
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public aq(Context context) {
        this.f140a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f141a;
        if (serviceConnection != null) {
            try {
                this.f140a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a, reason: collision with other method in class */
    public String mo5724a() {
        a("getOAID");
        return this.f143a;
    }

    private void a() {
        boolean z11;
        this.f141a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            z11 = this.f140a.bindService(intent, this.f141a, 1);
        } catch (Exception unused) {
            z11 = false;
        }
        this.f139a = z11 ? 1 : 2;
    }

    private void a(String str) {
        if (this.f139a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f142a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m5639a("huawei's " + str + " wait...");
                this.f142a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo5725a() {
        return f45258a;
    }

    public static boolean a(Context context) {
        boolean z11;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z11 = (packageInfo.applicationInfo.flags & 1) != 0;
            f45258a = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z11;
    }

    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new as(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
