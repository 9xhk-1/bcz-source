package com.zx.a.I8b7;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.k0.a;
import com.alipay.sdk.m.q0.a;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f46423a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile a1 f46424b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Context f46425c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f46426d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        boolean a(Context context);

        String b(Context context);

        boolean c(Context context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements a {

        /* renamed from: f, reason: collision with root package name */
        public static String f46427f = null;

        /* renamed from: g, reason: collision with root package name */
        public static boolean f46428g = false;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f46429h = false;

        /* renamed from: i, reason: collision with root package name */
        public static final CountDownLatch f46430i = new CountDownLatch(1);

        /* renamed from: a, reason: collision with root package name */
        public final String f46431a;

        /* renamed from: b, reason: collision with root package name */
        public final String f46432b;

        /* renamed from: c, reason: collision with root package name */
        public final String f46433c;

        /* renamed from: d, reason: collision with root package name */
        public final String f46434d;

        /* renamed from: e, reason: collision with root package name */
        public e f46435e;

        public b(String str, String str2, String str3, String str4) {
            this.f46431a = str;
            this.f46432b = str2;
            this.f46433c = str3;
            this.f46434d = str4;
        }

        public int a() {
            return 1;
        }

        public String b() {
            return null;
        }

        @Override // com.zx.a.I8b7.a1.a
        public boolean c(Context context) {
            long longVersionCode;
            if (f46429h) {
                return f46428g;
            }
            boolean z11 = false;
            if (context == null || TextUtils.isEmpty(this.f46431a)) {
                f46428g = false;
            } else {
                try {
                    PackageInfo a11 = i3.a(this.f46431a, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (a11 != null) {
                            longVersionCode = a11.getLongVersionCode();
                            if (longVersionCode >= 1) {
                                return true;
                            }
                        }
                        return false;
                    }
                    if (a11 != null && a11.versionCode >= 1) {
                        z11 = true;
                    }
                    f46428g = z11;
                } catch (Throwable unused) {
                    return false;
                }
            }
            f46429h = true;
            return f46428g;
        }

        public String d(Context context) {
            return null;
        }

        public String e(Context context) {
            return null;
        }

        @Override // com.zx.a.I8b7.a1.a
        public boolean a(Context context) {
            if (context == null || TextUtils.isEmpty(this.f46431a)) {
                return false;
            }
            if (this.f46435e == null) {
                this.f46435e = new e(this.f46434d, f46430i);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(this.f46432b)) {
                intent.setPackage(this.f46431a);
            } else {
                intent.setComponent(new ComponentName(this.f46431a, this.f46432b));
            }
            if (!TextUtils.isEmpty(this.f46433c)) {
                intent.setAction(this.f46433c);
            }
            return this.f46435e.a(context, intent);
        }

        @Override // com.zx.a.I8b7.a1.a
        public String b(Context context) {
            e eVar;
            d dVar;
            e eVar2;
            if (!TextUtils.isEmpty(f46427f) || (eVar = this.f46435e) == null || (dVar = eVar.f46444a) == null) {
                return f46427f;
            }
            try {
                String a11 = dVar.a(d(context), e(context), b(), a());
                f46427f = a11;
                if (!TextUtils.isEmpty(a11) && (eVar2 = this.f46435e) != null) {
                    context.unbindService(eVar2);
                }
            } catch (Throwable unused) {
            }
            return f46427f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a {

        /* renamed from: e, reason: collision with root package name */
        public static String f46436e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f46437f = false;

        /* renamed from: a, reason: collision with root package name */
        public String f46438a;

        /* renamed from: b, reason: collision with root package name */
        public String f46439b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f46440c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46441d = false;

        public c(String str, String str2) {
            this.f46438a = str;
            this.f46439b = str2;
        }

        @Override // com.zx.a.I8b7.a1.a
        public boolean a(Context context) {
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        
            if (r8 != null) goto L13;
         */
        @Override // com.zx.a.I8b7.a1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b(android.content.Context r8) {
            /*
                r7 = this;
                java.lang.String r0 = com.zx.a.I8b7.a1.c.f46436e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L57
                java.lang.String r0 = "content://"
                java.lang.StringBuilder r0 = com.zx.a.I8b7.f3.a(r0)
                java.lang.String r1 = r7.f46438a
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = r7.f46439b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.net.Uri r2 = android.net.Uri.parse(r0)
                r0 = 0
                android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L47
                java.lang.String[] r5 = r7.f46440c     // Catch: java.lang.Throwable -> L47
                r6 = 0
                r3 = 0
                r4 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L47
                if (r8 == 0) goto L44
                r8.moveToFirst()     // Catch: java.lang.Throwable -> L48
                java.lang.String r1 = "value"
                int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L48
                java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L48
                com.zx.a.I8b7.a1.c.f46436e = r1     // Catch: java.lang.Throwable -> L48
            L44:
                if (r8 == 0) goto L57
                goto L4c
            L47:
                r8 = r0
            L48:
                com.zx.a.I8b7.a1.c.f46436e = r0     // Catch: java.lang.Throwable -> L50
                if (r8 == 0) goto L57
            L4c:
                r8.close()
                goto L57
            L50:
                r0 = move-exception
                if (r8 == 0) goto L56
                r8.close()
            L56:
                throw r0
            L57:
                java.lang.String r8 = com.zx.a.I8b7.a1.c.f46436e
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.a1.c.b(android.content.Context):java.lang.String");
        }

        @Override // com.zx.a.I8b7.a1.a
        public boolean c(Context context) {
            if (this.f46441d) {
                return f46437f;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager c11 = w3.c(context);
                f46437f = (c11 == null || c11.resolveContentProvider(this.f46438a, 0) == null) ? false : true;
            } catch (Throwable unused) {
                f46437f = false;
            }
            this.f46441d = true;
            return f46437f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public IBinder f46442a;

        /* renamed from: b, reason: collision with root package name */
        public String f46443b;

        public d(IBinder iBinder, String str) {
            this.f46442a = iBinder;
            this.f46443b = str;
        }

        public String a(String str, String str2, String str3, int i11) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken(this.f46443b);
                    if (!TextUtils.isEmpty(str)) {
                        obtain.writeString(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        obtain.writeString(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        obtain.writeString(str3);
                    }
                    this.f46442a.transact(i11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception unused) {
                    return "";
                }
            } catch (Throwable unused2) {
                obtain.recycle();
                obtain2.recycle();
                return "";
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f46442a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public d f46444a;

        /* renamed from: b, reason: collision with root package name */
        public String f46445b;

        /* renamed from: c, reason: collision with root package name */
        public CountDownLatch f46446c;

        /* renamed from: d, reason: collision with root package name */
        public IBinder f46447d;

        public e(String str, CountDownLatch countDownLatch) {
            this.f46445b = str;
            this.f46446c = countDownLatch;
        }

        public boolean a(Context context, Intent intent) {
            d dVar;
            if (this.f46444a != null) {
                return true;
            }
            try {
                boolean bindService = context.bindService(intent, this, 1);
                this.f46446c.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = this.f46447d;
                String str = this.f46445b;
                if (iBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(str);
                    dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, str);
                }
                this.f46444a = dVar;
                return bindService;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f46447d = iBinder;
                this.f46446c.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f46444a = null;
            this.f46447d = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends b {
        public f() {
            super(a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQ="), a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQuU3VwcGxlbWVudGFyeURJRFNlcnZpY2U="), a("Y29tLmFzdXMubXNhLmFjdGlvbi5BQ0NFU1NfRElE"), a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQuSURpZEFpZGxJbnRlcmZhY2U="));
        }

        @Override // com.zx.a.I8b7.a1.b
        public int a() {
            return 2;
        }

        public static String a(String str) {
            return new String(Base64.decode(str, 0));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends b {
        public g() {
            super("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService", null, "com.coolpad.deviceidsupport.IDeviceIdManager");
        }

        @Override // com.zx.a.I8b7.a1.b
        public int a() {
            return 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends b {
        public h() {
            super("com.huawei.hwid", null, "com.uodis.opendevice.OPENIDS_SERVICE", com.alipay.sdk.m.c.b.f10486a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends c {
        public i() {
            super("com.meizu.flyme.openidsdk", "");
        }

        @Override // com.zx.a.I8b7.a1.c, com.zx.a.I8b7.a1.a
        public String b(Context context) {
            this.f46440c = new String[]{"oaid"};
            return super.b(context);
        }

        @Override // com.zx.a.I8b7.a1.c, com.zx.a.I8b7.a1.a
        public boolean c(Context context) {
            if (super.c(context)) {
                c.f46437f = true;
            } else {
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"support"}, null);
                    if (query == null) {
                        return false;
                    }
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex("value");
                    if (columnIndex >= 0) {
                        String string = query.getString(columnIndex);
                        if (TextUtils.isEmpty(string)) {
                            return false;
                        }
                        c.f46437f = "0".equals(string);
                    } else {
                        c.f46437f = false;
                    }
                } catch (Throwable unused) {
                    c.f46437f = false;
                    return false;
                }
            }
            this.f46441d = true;
            return c.f46437f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j implements a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f46448a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f46449b = false;

        /* renamed from: c, reason: collision with root package name */
        public String f46450c = null;

        @Override // com.zx.a.I8b7.a1.a
        public boolean a(Context context) {
            return true;
        }

        @Override // com.zx.a.I8b7.a1.a
        public String b(Context context) {
            Bundle bundle;
            try {
                if (TextUtils.isEmpty(this.f46450c)) {
                    ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
                    if (acquireContentProviderClient != null) {
                        bundle = acquireContentProviderClient.call("getOAID", null, null);
                        try {
                            Class.forName("android.content.ContentProviderClient").getMethod("close", null).invoke(acquireContentProviderClient, null);
                        } catch (Throwable unused) {
                        }
                    } else {
                        bundle = null;
                    }
                    if (bundle == null) {
                        return this.f46450c;
                    }
                    if (bundle.getInt("code", -1) == 0) {
                        this.f46450c = bundle.getString("id");
                    }
                }
            } catch (Throwable unused2) {
                this.f46450c = null;
            }
            return this.f46450c;
        }

        @Override // com.zx.a.I8b7.a1.a
        public boolean c(Context context) {
            if (this.f46449b) {
                return this.f46448a;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager c11 = w3.c(context);
                this.f46448a = (c11 == null || c11.resolveContentProvider("cn.nubia.identity", 0) == null) ? false : true;
            } catch (Throwable unused) {
                this.f46448a = false;
            }
            this.f46449b = true;
            return this.f46448a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends b {

        /* renamed from: j, reason: collision with root package name */
        public String f46451j;

        /* renamed from: k, reason: collision with root package name */
        public String f46452k;

        public k() {
            super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
        }

        @Override // com.zx.a.I8b7.a1.b
        public String b() {
            return "OUID";
        }

        @Override // com.zx.a.I8b7.a1.b
        public String d(Context context) {
            if (TextUtils.isEmpty(this.f46452k)) {
                this.f46452k = context.getPackageName();
            }
            return this.f46452k;
        }

        @Override // com.zx.a.I8b7.a1.b
        @SuppressLint({"PackageManagerGetSignatures"})
        public String e(Context context) {
            if (TextUtils.isEmpty(this.f46451j)) {
                try {
                    if (TextUtils.isEmpty(this.f46452k)) {
                        this.f46452k = context.getPackageName();
                    }
                    String str = this.f46452k;
                    this.f46452k = str;
                    Signature[] signatureArr = i3.a(str, 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : digest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        this.f46451j = sb2.toString();
                    }
                } catch (Throwable unused) {
                }
            }
            return this.f46451j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends b {
        public l() {
            super("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService", null, a.AbstractBinderC0167a.f10693a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m extends c {
        public m() {
            super("com.vivo.vms.IdProvider", "IdentifierId/OAID");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n implements a {

        /* renamed from: b, reason: collision with root package name */
        public static String f46453b;

        /* renamed from: a, reason: collision with root package name */
        public Class<?> f46454a = null;

        @Override // com.zx.a.I8b7.a1.a
        public boolean a(Context context) {
            return true;
        }

        @Override // com.zx.a.I8b7.a1.a
        public String b(Context context) {
            if (TextUtils.isEmpty(f46453b)) {
                try {
                    f46453b = String.valueOf(this.f46454a.getMethod("getOAID", Context.class).invoke(this.f46454a.newInstance(), context));
                } catch (Throwable unused) {
                    f46453b = null;
                }
            }
            return f46453b;
        }

        @Override // com.zx.a.I8b7.a1.a
        @SuppressLint({"PrivateApi"})
        public boolean c(Context context) {
            try {
                this.f46454a = Class.forName("com.android.id.impl.IdProviderImpl");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o extends b {
        public o() {
            super("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService", null, a.AbstractBinderC0172a.f10967a);
        }
    }

    static {
        a oVar;
        String upperCase = Build.MANUFACTURER.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "LENOVO":
            case "ZUI":
            case "ZUK":
            case "MOTOLORA":
                oVar = new o();
                break;
            case "REALME":
            case "ONEPLUS":
            case "OPPO":
                oVar = new k();
                break;
            case "SAMSUNG":
                oVar = new l();
                break;
            case "XIAOMI":
            case "BLACKSHARK":
            case "REDMI":
                oVar = new n();
                break;
            case "ASUS":
                oVar = new f();
                break;
            case "IQOO":
            case "VIVO":
                oVar = new m();
                break;
            case "HONOR":
            case "HUA_WEI":
            case "HUAWEI":
                oVar = new h();
                break;
            case "MEIZU":
                oVar = new i();
                break;
            case "NUBIA":
                oVar = new j();
                break;
            case "COOLPAD":
                oVar = new g();
                break;
            default:
                oVar = null;
                break;
        }
        f46423a = oVar;
    }
}
