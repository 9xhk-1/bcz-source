package com.getui.gtc.dim.c;

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
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.k0.a;
import com.alipay.sdk.m.q0.a;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    static final a f29929a;

    /* renamed from: b, reason: collision with root package name */
    static Context f29930b = null;

    /* renamed from: c, reason: collision with root package name */
    static boolean f29931c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final String f29932d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile d f29933e;

    public interface a {
        boolean a(Context context);

        String b(Context context);

        boolean c(Context context);
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        String f29934a;

        /* renamed from: b, reason: collision with root package name */
        e f29935b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29936c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29937d = false;

        /* renamed from: e, reason: collision with root package name */
        private final CountDownLatch f29938e = new CountDownLatch(1);

        /* renamed from: f, reason: collision with root package name */
        private final String f29939f;

        /* renamed from: g, reason: collision with root package name */
        private final String f29940g;

        /* renamed from: h, reason: collision with root package name */
        private final String f29941h;

        /* renamed from: i, reason: collision with root package name */
        private final String f29942i;

        public b(String str, String str2, String str3, String str4) {
            this.f29939f = str;
            this.f29940g = str2;
            this.f29941h = str3;
            this.f29942i = str4;
        }

        public String a() {
            return null;
        }

        public int b() {
            return 1;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public boolean c(Context context) {
            if (context == null || TextUtils.isEmpty(this.f29939f)) {
                return false;
            }
            if (this.f29935b == null) {
                this.f29935b = new e(this.f29942i, this.f29938e);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(this.f29940g)) {
                intent.setPackage(this.f29939f);
            } else {
                intent.setComponent(new ComponentName(this.f29939f, this.f29940g));
            }
            if (!TextUtils.isEmpty(this.f29941h)) {
                intent.setAction(this.f29941h);
            }
            return this.f29935b.a(context, intent);
        }

        public String d(Context context) {
            return null;
        }

        public String e(Context context) {
            return null;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public boolean a(Context context) {
            long longVersionCode;
            if (this.f29937d) {
                return this.f29936c;
            }
            if (context == null || TextUtils.isEmpty(this.f29939f)) {
                this.f29936c = false;
            } else {
                try {
                    PackageInfo a11 = com.getui.gtc.dim.e.d.a(this.f29939f, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = a11.getLongVersionCode();
                        return longVersionCode >= 1;
                    }
                    this.f29936c = a11.versionCode > 0;
                } catch (Throwable unused) {
                    return false;
                }
            }
            this.f29937d = true;
            return this.f29936c;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public String b(Context context) {
            e eVar;
            C0353d c0353d;
            e eVar2;
            if (!TextUtils.isEmpty(this.f29934a) || (eVar = this.f29935b) == null || (c0353d = eVar.f29951a) == null) {
                return this.f29934a;
            }
            try {
                String a11 = c0353d.a(d(context), e(context), a(), b());
                this.f29934a = a11;
                if (!TextUtils.isEmpty(a11) && (eVar2 = this.f29935b) != null) {
                    context.unbindService(eVar2);
                }
            } catch (Throwable unused) {
            }
            return this.f29934a;
        }
    }

    public static class c implements a {

        /* renamed from: b, reason: collision with root package name */
        protected static boolean f29943b = false;

        /* renamed from: d, reason: collision with root package name */
        private static String f29944d;

        /* renamed from: a, reason: collision with root package name */
        String[] f29945a;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f29946c = false;

        /* renamed from: e, reason: collision with root package name */
        private String f29947e;

        /* renamed from: f, reason: collision with root package name */
        private String f29948f;

        public c(String str, String str2) {
            this.f29947e = str;
            this.f29948f = str2;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public boolean a(Context context) {
            if (this.f29946c) {
                return f29943b;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                f29943b = (packageManager == null || packageManager.resolveContentProvider(this.f29947e, 0) == null) ? false : true;
            } catch (Throwable unused) {
                f29943b = false;
            }
            this.f29946c = true;
            return f29943b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r8 == null) goto L18;
         */
        @Override // com.getui.gtc.dim.c.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b(android.content.Context r8) {
            /*
                r7 = this;
                java.lang.String r0 = com.getui.gtc.dim.c.d.c.f29944d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L58
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "content://"
                r0.<init>(r1)
                java.lang.String r1 = r7.f29947e
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = r7.f29948f
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.net.Uri r2 = android.net.Uri.parse(r0)
                r0 = 0
                android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L4b
                java.lang.String[] r5 = r7.f29945a     // Catch: java.lang.Throwable -> L4b
                r6 = 0
                r3 = 0
                r4 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4b
                if (r8 == 0) goto L45
                r8.moveToFirst()     // Catch: java.lang.Throwable -> L4c
                java.lang.String r1 = "value"
                int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L4c
                com.getui.gtc.dim.c.d.c.f29944d = r1     // Catch: java.lang.Throwable -> L4c
            L45:
                if (r8 == 0) goto L58
            L47:
                r8.close()
                goto L58
            L4b:
                r8 = r0
            L4c:
                com.getui.gtc.dim.c.d.c.f29944d = r0     // Catch: java.lang.Throwable -> L51
                if (r8 == 0) goto L58
                goto L47
            L51:
                r0 = move-exception
                if (r8 == 0) goto L57
                r8.close()
            L57:
                throw r0
            L58:
                java.lang.String r8 = com.getui.gtc.dim.c.d.c.f29944d
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.c.d.c.b(android.content.Context):java.lang.String");
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final boolean c(Context context) {
            return true;
        }
    }

    /* renamed from: com.getui.gtc.dim.c.d$d, reason: collision with other inner class name */
    public static class C0353d implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f29949a;

        /* renamed from: b, reason: collision with root package name */
        private String f29950b;

        private C0353d(IBinder iBinder, String str) {
            this.f29949a = iBinder;
            this.f29950b = str;
        }

        public static C0353d a(IBinder iBinder, String str) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(str);
            return queryLocalInterface instanceof C0353d ? (C0353d) queryLocalInterface : new C0353d(iBinder, str);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f29949a;
        }

        public final String a(String str, String str2, String str3, int i11) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken(this.f29950b);
                    if (!TextUtils.isEmpty(str)) {
                        obtain.writeString(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        obtain.writeString(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        obtain.writeString(str3);
                    }
                    this.f29949a.transact(i11, obtain, obtain2, 0);
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
    }

    public static class e implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        C0353d f29951a;

        /* renamed from: b, reason: collision with root package name */
        IBinder f29952b;

        /* renamed from: c, reason: collision with root package name */
        private String f29953c;

        /* renamed from: d, reason: collision with root package name */
        private CountDownLatch f29954d;

        public e(String str, CountDownLatch countDownLatch) {
            this.f29953c = str;
            this.f29954d = countDownLatch;
        }

        public final boolean a(Context context, Intent intent) {
            if (context == null) {
                return false;
            }
            if (this.f29951a != null) {
                return true;
            }
            try {
                boolean bindService = context.bindService(intent, this, 1);
                this.f29954d.await(1L, TimeUnit.SECONDS);
                this.f29951a = C0353d.a(this.f29952b, this.f29953c);
                return bindService;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f29952b = iBinder;
                this.f29954d.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f29951a = null;
            this.f29952b = null;
        }
    }

    public static class f extends b {
        public f() {
            super(a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQ="), a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQuU3VwcGxlbWVudGFyeURJRFNlcnZpY2U="), a("Y29tLmFzdXMubXNhLmFjdGlvbi5BQ0NFU1NfRElE"), a("Y29tLmFzdXMubXNhLlN1cHBsZW1lbnRhcnlESUQuSURpZEFpZGxJbnRlcmZhY2U="));
        }

        private static String a(String str) {
            return new String(Base64.decode(str, 0));
        }

        @Override // com.getui.gtc.dim.c.d.b
        public final int b() {
            return 2;
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }
    }

    public static class g extends b {
        public g() {
            super("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService", null, "com.coolpad.deviceidsupport.IDeviceIdManager");
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b
        public final int b() {
            return 2;
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }
    }

    public static class h extends b {
        public h() {
            super("com.huawei.hwid", null, "com.uodis.opendevice.OPENIDS_SERVICE", com.alipay.sdk.m.c.b.f10486a);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }
    }

    public static class i extends b {

        /* renamed from: c, reason: collision with root package name */
        final CountDownLatch f29955c;

        public i() {
            super("com.hihonor.id", null, "com.hihonor.id.HnOaIdService", "com.hihonor.cloudservice.oaid.IOAIDService");
            this.f29955c = new CountDownLatch(1);
        }

        public static boolean c() {
            PackageInfo a11;
            long longVersionCode;
            try {
                a11 = com.getui.gtc.dim.e.d.a("com.hihonor.id", 0);
            } catch (Throwable unused) {
            }
            if (Build.VERSION.SDK_INT < 28) {
                return a11.versionCode > 0;
            }
            longVersionCode = a11.getLongVersionCode();
            return longVersionCode >= 1;
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final String b(Context context) {
            e eVar;
            e eVar2;
            if (!TextUtils.isEmpty(this.f29934a) || (eVar = this.f29935b) == null || eVar.f29951a == null) {
                return this.f29934a;
            }
            try {
                IBinder iBinder = eVar.f29952b;
                a aVar = new a() { // from class: com.getui.gtc.dim.c.d.i.1
                    @Override // com.getui.gtc.dim.c.d.i.a
                    public final void a(int i11, Bundle bundle) {
                        if (i11 == 0 && bundle != null) {
                            i.this.f29934a = bundle.getString("oa_id_flag");
                        }
                        i.this.f29955c.countDown();
                    }
                };
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    obtain.writeStrongBinder(aVar.asBinder());
                    iBinder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    this.f29955c.await(1L, TimeUnit.SECONDS);
                    if (!TextUtils.isEmpty(this.f29934a) && (eVar2 = this.f29935b) != null) {
                        context.unbindService(eVar2);
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            return this.f29934a;
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }

        public static abstract class a extends Binder implements IInterface {
            public a() {
                attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
            }

            public abstract void a(int i11, Bundle bundle);

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
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this;
            }
        }
    }

    public static class j extends c {
        public j() {
            super("com.meizu.flyme.openidsdk", "");
        }

        @Override // com.getui.gtc.dim.c.d.c, com.getui.gtc.dim.c.d.a
        public final boolean a(Context context) {
            if (super.a(context)) {
                c.f29943b = true;
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
                        c.f29943b = "0".equals(string);
                    } else {
                        c.f29943b = false;
                    }
                } catch (Throwable unused) {
                    c.f29943b = false;
                    return false;
                }
            }
            this.f29946c = true;
            return c.f29943b;
        }

        @Override // com.getui.gtc.dim.c.d.c, com.getui.gtc.dim.c.d.a
        public final String b(Context context) {
            this.f29945a = new String[]{"oaid"};
            return super.b(context);
        }
    }

    public static class k implements a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29957a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f29958b;

        /* renamed from: c, reason: collision with root package name */
        private String f29959c;

        private k() {
            this.f29957a = false;
            this.f29958b = false;
            this.f29959c = null;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final boolean a(Context context) {
            if (this.f29958b) {
                return this.f29957a;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                this.f29957a = (packageManager == null || packageManager.resolveContentProvider("cn.nubia.identity", 0) == null) ? false : true;
            } catch (Throwable unused) {
                this.f29957a = false;
            }
            this.f29958b = true;
            return this.f29957a;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final String b(Context context) {
            Bundle bundle;
            try {
                if (TextUtils.isEmpty(this.f29959c)) {
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
                        return this.f29959c;
                    }
                    if (bundle.getInt("code", -1) == 0) {
                        this.f29959c = bundle.getString("id");
                    }
                }
            } catch (Throwable unused2) {
                this.f29959c = null;
            }
            return this.f29959c;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final boolean c(Context context) {
            return true;
        }

        public /* synthetic */ k(byte b11) {
            this();
        }
    }

    public static class l extends b {

        /* renamed from: c, reason: collision with root package name */
        private String f29960c;

        /* renamed from: d, reason: collision with root package name */
        private String f29961d;

        public l() {
            super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
        }

        @Override // com.getui.gtc.dim.c.d.b
        public final String a() {
            return "OUID";
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }

        @Override // com.getui.gtc.dim.c.d.b
        public final String d(Context context) {
            if (TextUtils.isEmpty(this.f29961d)) {
                this.f29961d = context.getPackageName();
            }
            return this.f29961d;
        }

        @Override // com.getui.gtc.dim.c.d.b
        @SuppressLint({"PackageManagerGetSignatures"})
        public final String e(Context context) {
            if (TextUtils.isEmpty(this.f29960c)) {
                try {
                    String d11 = d(context);
                    this.f29961d = d11;
                    Signature[] signatureArr = com.getui.gtc.dim.e.d.a(d11, 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : digest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        this.f29960c = sb2.toString();
                    }
                } catch (Throwable unused) {
                }
            }
            return this.f29960c;
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }
    }

    public static class m extends b {
        public m() {
            super("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService", null, a.AbstractBinderC0167a.f10693a);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }
    }

    public static class n extends c {
        public n() {
            super("com.vivo.vms.IdProvider", "IdentifierId/OAID");
        }
    }

    public static class o implements a {

        /* renamed from: b, reason: collision with root package name */
        private static String f29962b;

        /* renamed from: a, reason: collision with root package name */
        private Class<?> f29963a = null;

        @Override // com.getui.gtc.dim.c.d.a
        @SuppressLint({"PrivateApi"})
        public final boolean a(Context context) {
            try {
                this.f29963a = Class.forName("com.android.id.impl.IdProviderImpl");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final String b(Context context) {
            if (TextUtils.isEmpty(f29962b)) {
                try {
                    f29962b = String.valueOf(this.f29963a.getMethod("getOAID", Context.class).invoke(this.f29963a.newInstance(), context));
                } catch (Throwable unused) {
                    f29962b = null;
                }
            }
            return f29962b;
        }

        @Override // com.getui.gtc.dim.c.d.a
        public final boolean c(Context context) {
            return true;
        }
    }

    public static class p extends b {
        public p() {
            super("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService", null, a.AbstractBinderC0172a.f10967a);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean a(Context context) {
            return super.a(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ String b(Context context) {
            return super.b(context);
        }

        @Override // com.getui.gtc.dim.c.d.b, com.getui.gtc.dim.c.d.a
        public final /* bridge */ /* synthetic */ boolean c(Context context) {
            return super.c(context);
        }
    }

    static {
        byte b11;
        a pVar;
        String upperCase = Build.MANUFACTURER.toUpperCase();
        f29932d = upperCase;
        upperCase.getClass();
        b11 = 0;
        switch (upperCase) {
            case "LENOVO":
            case "ZUI":
            case "ZUK":
            case "MOTOLORA":
                pVar = new p();
                break;
            case "REALME":
            case "ONEPLUS":
            case "OPPO":
                pVar = new l();
                break;
            case "SAMSUNG":
                pVar = new m();
                break;
            case "XIAOMI":
            case "BLACKSHARK":
            case "REDMI":
                pVar = new o();
                break;
            case "ASUS":
                pVar = new f();
                break;
            case "IQOO":
            case "VIVO":
                pVar = new n();
                break;
            case "HONOR":
                pVar = new i();
                break;
            case "MEIZU":
                pVar = new j();
                break;
            case "NUBIA":
                pVar = new k(b11);
                break;
            case "COOLPAD":
                pVar = new g();
                break;
            case "HUA_WEI":
            case "HUAWEI":
                pVar = new h();
                break;
            default:
                pVar = null;
                break;
        }
        f29929a = pVar;
    }

    public static d a() {
        if (f29933e == null) {
            synchronized (d.class) {
                try {
                    if (f29933e == null) {
                        f29933e = new d();
                    }
                } finally {
                }
            }
        }
        return f29933e;
    }

    public static boolean b() {
        a aVar;
        try {
            Context context = f29930b;
            if (context == null || (aVar = f29929a) == null) {
                return false;
            }
            return aVar.a(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        a aVar;
        try {
            Context context = f29930b;
            if (context != null && (aVar = f29929a) != null && f29931c) {
                return aVar.b(context);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
