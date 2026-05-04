package com.alipay.sdk.m.i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static volatile f f10594g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f10595h = false;

    /* renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f10601f;

    /* renamed from: a, reason: collision with root package name */
    public a f10596a = new a("udid");

    /* renamed from: b, reason: collision with root package name */
    public a f10597b = new a("oaid");

    /* renamed from: d, reason: collision with root package name */
    public a f10599d = new a("vaid");

    /* renamed from: c, reason: collision with root package name */
    public a f10598c = new a("aaid");

    /* renamed from: e, reason: collision with root package name */
    public c f10600e = new c();

    public static d a(Cursor cursor) {
        d dVar = new d(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return dVar;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return dVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            dVar.f10591a = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            dVar.f10592b = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            dVar.f10593c = cursor.getLong(columnIndex3);
            return dVar;
        }
        a("parseExpired fail, index < 0.");
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.content.Context r9, com.alipay.sdk.m.i0.a r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r10.f10585c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            java.lang.String r0 = r10.f10585c     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L84
            com.alipay.sdk.m.i0.d r3 = a(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r7 = r3.f10591a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r10.a(r7)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            long r4 = r3.f10593c     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r10.a(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            int r4 = r3.f10592b     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r10.a(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r5 = r10.f10585c     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r5 = " errorCode : "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            int r10 = r10.f10586d     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r4.append(r10)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            a(r10)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            int r10 = r3.f10592b     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r3) goto L94
            r8.b(r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            boolean r10 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r10 != 0) goto L94
            boolean r9 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r10 = "not support, forceQuery isSupported: "
        L72:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r9 = r10.concat(r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            goto L91
        L7b:
            r0 = move-exception
            r9 = r0
            r7 = r1
            goto Lbc
        L7f:
            r0 = move-exception
            r9 = r0
            r10 = r7
            r7 = r1
            goto L9e
        L84:
            boolean r10 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r10 == 0) goto L94
            boolean r9 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r10 = "forceQuery isSupported : "
            goto L72
        L91:
            a(r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
        L94:
            if (r1 == 0) goto L97
            goto Lb7
        L97:
            return r7
        L98:
            r0 = move-exception
            r9 = r0
            goto Lbc
        L9b:
            r0 = move-exception
            r9 = r0
            r10 = r7
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "queryId, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L98
            r0.append(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L98
            a(r9)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto Lbb
            r1 = r7
            r7 = r10
        Lb7:
            r1.close()
            r10 = r7
        Lbb:
            return r10
        Lbc:
            if (r7 == 0) goto Lc1
            r7.close()
        Lc1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.i0.f.b(android.content.Context, com.alipay.sdk.m.i0.a):java.lang.String");
    }

    public static final f a() {
        if (f10594g == null) {
            synchronized (f.class) {
                try {
                    if (f10594g == null) {
                        f10594g = new f();
                    }
                } finally {
                }
            }
        }
        return f10594g;
    }

    public static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            a("getAppVersion, Exception : " + e11.getMessage());
            return null;
        }
    }

    private synchronized void b(Context context) {
        if (this.f10601f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f10601f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.a()) {
                return aVar.f10584b;
            }
            if (a(context, true)) {
                return b(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    public static String a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static void a(String str) {
        if (f10595h) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void a(boolean z11) {
        f10595h = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ("0".equals(r9.f10591a) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r8 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r9) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r9 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r8 == 0) goto L40
            com.alipay.sdk.m.i0.d r9 = a(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            int r0 = r9.f10592b     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L3b
            java.lang.String r0 = "0"
            java.lang.String r9 = r9.f10591a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r9 == 0) goto L3c
            goto L3b
        L35:
            r0 = move-exception
            r9 = r0
            goto L5e
        L38:
            r0 = move-exception
            r9 = r0
            goto L43
        L3b:
            r7 = 1
        L3c:
            r8.close()
            return r7
        L40:
            if (r8 == 0) goto L5d
            goto L5a
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "querySupport, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L35
            r0.append(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L35
            a(r9)     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L5d
        L5a:
            r8.close()
        L5d:
            return r7
        L5e:
            if (r8 == 0) goto L63
            r8.close()
        L63:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.i0.f.a(android.content.Context):boolean");
    }

    public final boolean a(Context context, boolean z11) {
        if (this.f10600e.a() && !z11) {
            return this.f10600e.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String a11 = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(a11)) {
            return false;
        }
        String b11 = b(packageManager, a11);
        if (this.f10600e.a() && this.f10600e.a(b11)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(b11)));
            return this.f10600e.b();
        }
        this.f10600e.b(b11);
        boolean a12 = a(context);
        a("query support, result : ".concat(String.valueOf(a12)));
        this.f10600e.a(a12);
        return a12;
    }
}
