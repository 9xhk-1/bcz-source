package com.igexin.push.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38732a = "us";

    /* renamed from: b, reason: collision with root package name */
    public static final String f38733b = "ups";

    /* renamed from: c, reason: collision with root package name */
    public static final String f38734c = "uis";

    /* renamed from: d, reason: collision with root package name */
    public static final String f38735d = "ua";

    /* renamed from: e, reason: collision with root package name */
    public static final String f38736e = "sc";

    /* renamed from: f, reason: collision with root package name */
    public static final String f38737f = "it";

    /* renamed from: g, reason: collision with root package name */
    public static final String f38738g = "logkey2";

    /* renamed from: h, reason: collision with root package name */
    public static final String f38739h = "hwBadgeNum";

    /* renamed from: i, reason: collision with root package name */
    public static final String f38740i = "vivoBadgeNum";

    /* renamed from: j, reason: collision with root package name */
    public static final String f38741j = "oppoBadgeNum";

    /* renamed from: k, reason: collision with root package name */
    public static String f38742k = "idvph";

    /* renamed from: l, reason: collision with root package name */
    public static final String f38743l = "lkm";

    /* renamed from: m, reason: collision with root package name */
    public static final String f38744m = "emgph";

    /* renamed from: n, reason: collision with root package name */
    public static final String f38745n = "secnph";

    /* renamed from: o, reason: collision with root package name */
    private static final String f38746o = "SpUtils";

    /* renamed from: p, reason: collision with root package name */
    private static final String f38747p = "getui_sp";

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x000a, B:49:0x002e, B:5:0x0050, B:7:0x0056, B:9:0x0064, B:11:0x006c, B:13:0x0072, B:14:0x0076, B:15:0x0079, B:17:0x007f, B:19:0x0093, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:25:0x00a8, B:27:0x00ae, B:29:0x00c2, B:30:0x00c5, B:32:0x00cb, B:34:0x00e0), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x000a, B:49:0x002e, B:5:0x0050, B:7:0x0056, B:9:0x0064, B:11:0x006c, B:13:0x0072, B:14:0x0076, B:15:0x0079, B:17:0x007f, B:19:0x0093, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:25:0x00a8, B:27:0x00ae, B:29:0x00c2, B:30:0x00c5, B:32:0x00cb, B:34:0x00e0), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x000a, B:49:0x002e, B:5:0x0050, B:7:0x0056, B:9:0x0064, B:11:0x006c, B:13:0x0072, B:14:0x0076, B:15:0x0079, B:17:0x007f, B:19:0x0093, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:25:0x00a8, B:27:0x00ae, B:29:0x00c2, B:30:0x00c5, B:32:0x00cb, B:34:0x00e0), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x000a, B:49:0x002e, B:5:0x0050, B:7:0x0056, B:9:0x0064, B:11:0x006c, B:13:0x0072, B:14:0x0076, B:15:0x0079, B:17:0x007f, B:19:0x0093, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:25:0x00a8, B:27:0x00ae, B:29:0x00c2, B:30:0x00c5, B:32:0x00cb, B:34:0x00e0), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r10, android.content.Intent r11) {
        /*
            java.lang.String r0 = "ua"
            java.lang.String r1 = "uis"
            java.lang.String r2 = "ups"
            java.lang.String r3 = "us"
            java.lang.String r4 = ""
            java.lang.Object r5 = b(r10, r3, r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Le4
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le4
            if (r6 != 0) goto L50
            java.lang.Class r6 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<com.igexin.sdk.PushService> r7 = com.igexin.sdk.PushService.class
            boolean r6 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L50
            a(r10, r3, r4)     // Catch: java.lang.Throwable -> L27
            r5 = r4
            goto L50
        L27:
            r5 = move-exception
            r6 = r4
            goto L2e
        L2a:
            r6 = move-exception
            r9 = r6
            r6 = r5
            r5 = r9
        L2e:
            java.lang.String r7 = "SpUtils"
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> Le4
            com.igexin.c.a.c.a.a(r7, r8)     // Catch: java.lang.Throwable -> Le4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            java.lang.String r8 = "SpUtils|"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Le4
            r7.append(r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> Le4
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Le4
            com.igexin.c.a.c.a.a(r5, r7)     // Catch: java.lang.Throwable -> Le4
            r5 = r6
        L50:
            boolean r6 = r11.hasExtra(r3)     // Catch: java.lang.Throwable -> Le4
            if (r6 == 0) goto L79
            java.lang.String r6 = r11.getStringExtra(r3)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r6 = com.igexin.c.b.a.b(r6, r4)     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r5.equals(r6)     // Catch: java.lang.Throwable -> Le4
            if (r7 != 0) goto L79
            java.lang.String r7 = com.igexin.push.core.b.f37719ap     // Catch: java.lang.Throwable -> Le4
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto L76
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le4
            if (r5 != 0) goto L79
            a(r10, r3, r4)     // Catch: java.lang.Throwable -> Le4
            goto L79
        L76:
            a(r10, r3, r6)     // Catch: java.lang.Throwable -> Le4
        L79:
            boolean r3 = r11.hasExtra(r2)     // Catch: java.lang.Throwable -> Le4
            if (r3 == 0) goto La8
            java.lang.String r3 = r11.getStringExtra(r2)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = com.igexin.c.b.a.b(r3, r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r5 = b(r10, r2, r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Le4
            boolean r6 = r5.equals(r3)     // Catch: java.lang.Throwable -> Le4
            if (r6 != 0) goto La8
            java.lang.String r6 = com.igexin.push.core.b.f37719ap     // Catch: java.lang.Throwable -> Le4
            boolean r6 = r6.equals(r3)     // Catch: java.lang.Throwable -> Le4
            if (r6 == 0) goto La5
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le4
            if (r3 != 0) goto La8
            a(r10, r2, r4)     // Catch: java.lang.Throwable -> Le4
            goto La8
        La5:
            a(r10, r2, r3)     // Catch: java.lang.Throwable -> Le4
        La8:
            boolean r2 = r11.hasExtra(r1)     // Catch: java.lang.Throwable -> Le4
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = b(r10, r1, r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r11.getStringExtra(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = com.igexin.c.b.a.b(r3, r4)     // Catch: java.lang.Throwable -> Le4
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Le4
            if (r2 != 0) goto Lc5
            a(r10, r1, r3)     // Catch: java.lang.Throwable -> Le4
        Lc5:
            boolean r1 = r11.hasExtra(r0)     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto Le3
            com.igexin.push.core.ServiceManager.getInstance()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = com.igexin.push.core.ServiceManager.d(r10)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r11 = r11.getStringExtra(r0)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r11 = com.igexin.c.b.a.b(r11, r4)     // Catch: java.lang.Throwable -> Le4
            boolean r1 = r1.equals(r11)     // Catch: java.lang.Throwable -> Le4
            if (r1 != 0) goto Le3
            a(r10, r0, r11)     // Catch: java.lang.Throwable -> Le4
        Le3:
            return
        Le4:
            r10 = move-exception
            com.igexin.c.a.c.a.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.o.a(android.content.Context, android.content.Intent):void");
    }

    public static Object b(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f38747p, 0);
        return obj instanceof String ? sharedPreferences.getString(str, (String) obj) : obj instanceof Integer ? Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue())) : obj instanceof Boolean ? Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue())) : obj instanceof Float ? Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue())) : obj instanceof Long ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    public static void a(Context context, String str, Object obj) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f38747p, 0).edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    public static boolean a(Context context) {
        try {
            String str = (String) b(context, "us", "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Class.forName(str);
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(f38746o, e11.toString());
            com.igexin.c.a.c.a.a("SpUtils|" + e11.toString(), new Object[0]);
            return false;
        }
    }
}
