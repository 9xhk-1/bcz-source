package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
class ba implements at {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f45289a;

    /* renamed from: a, reason: collision with other field name */
    private Context f164a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f165a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f163a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f166a = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f167a = new Object();

    public class a {

        /* renamed from: a, reason: collision with other field name */
        String f168a;

        /* renamed from: b, reason: collision with root package name */
        String f45291b;

        /* renamed from: c, reason: collision with root package name */
        String f45292c;

        /* renamed from: d, reason: collision with root package name */
        String f45293d;

        private a() {
            this.f168a = null;
            this.f45291b = null;
            this.f45292c = null;
            this.f45293d = null;
        }
    }

    public static class c {
        public static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ba(Context context) {
        this.f164a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f164a.getPackageManager().getPackageInfo(this.f164a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: collision with other method in class */
    public void m5745b() {
        ServiceConnection serviceConnection = this.f165a;
        if (serviceConnection != null) {
            try {
                this.f164a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public String mo5724a() {
        a("getOAID");
        if (this.f166a == null) {
            return null;
        }
        return this.f166a.f45291b;
    }

    private void a() {
        boolean z11;
        this.f165a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            z11 = this.f164a.bindService(intent, this.f165a, 1);
        } catch (Exception unused) {
            z11 = false;
        }
        this.f163a = z11 ? 1 : 2;
    }

    private void a(String str) {
        if (this.f163a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f167a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m5639a("oppo's " + str + " wait...");
                this.f167a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public boolean mo5725a() {
        return f45289a;
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z11 = (packageInfo.applicationInfo.flags & 1) != 0;
                f45289a = longVersionCode >= 1;
                if (z11) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ba.this.f166a != null) {
                return;
            }
            new Thread(new bc(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
