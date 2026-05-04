package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class ha {

    /* renamed from: a, reason: collision with other field name */
    private static am f486a = new am(true);

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f45704a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static long f485a = System.currentTimeMillis();

    /* renamed from: a, reason: collision with other field name */
    private static final Object f488a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static List<a> f490a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with other field name */
    private static String f489a = "";

    /* renamed from: a, reason: collision with other field name */
    private static com.xiaomi.push.providers.a f487a = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f45705a;

        /* renamed from: a, reason: collision with other field name */
        public long f491a;

        /* renamed from: a, reason: collision with other field name */
        public String f492a;

        /* renamed from: b, reason: collision with root package name */
        public int f45706b;

        /* renamed from: b, reason: collision with other field name */
        public long f493b;

        /* renamed from: b, reason: collision with other field name */
        public String f494b;

        public a(String str, long j11, int i11, int i12, String str2, long j12) {
            this.f492a = str;
            this.f491a = j11;
            this.f45705a = i11;
            this.f45706b = i12;
            this.f494b = str2;
            this.f493b = j12;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f492a, this.f492a) && TextUtils.equals(aVar.f494b, this.f494b) && aVar.f45705a == this.f45705a && aVar.f45706b == this.f45706b && Math.abs(aVar.f491a - this.f491a) <= 5000;
        }
    }

    public static int a(Context context) {
        if (f45704a == -1) {
            f45704a = b(context);
        }
        return f45704a;
    }

    private static int b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getType();
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f859a) {
                try {
                    SQLiteDatabase writableDatabase = m6003a(context).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        for (a aVar : list) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("package_name", aVar.f492a);
                            contentValues.put("message_ts", Long.valueOf(aVar.f491a));
                            contentValues.put("network_type", Integer.valueOf(aVar.f45705a));
                            contentValues.put("bytes", Long.valueOf(aVar.f493b));
                            contentValues.put("rcv", Integer.valueOf(aVar.f45706b));
                            contentValues.put("imsi", aVar.f494b);
                            writableDatabase.insert("traffic", null, contentValues);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            com.xiaomi.channel.commonutils.logger.b.a(th4);
        }
    }

    private static long a(int i11, long j11, boolean z11, long j12, boolean z12) {
        if (z11 && z12) {
            long j13 = f485a;
            f485a = j12;
            if (j12 - j13 > 30000 && j11 > 1024) {
                return j11 * 2;
            }
        }
        return (j11 * (i11 == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m6003a(Context context) {
        com.xiaomi.push.providers.a aVar = f487a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f487a = aVar2;
        return aVar2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized String m6004a(Context context) {
        synchronized (ha.class) {
            if (TextUtils.isEmpty(f489a)) {
                return "";
            }
            return f489a;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6006a(Context context) {
        f45704a = b(context);
    }

    private static void a(Context context, String str, long j11, boolean z11, long j12) {
        int a11;
        boolean isEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (a11 = a(context))) {
            return;
        }
        synchronized (f488a) {
            try {
                isEmpty = f490a.isEmpty();
                a(new a(str, j12, a11, z11 ? 1 : 0, a11 == 0 ? m6004a(context) : "", j11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (isEmpty) {
            f486a.a(new hb(context), 5000L);
        }
    }

    public static void a(Context context, String str, long j11, boolean z11, boolean z12, long j12) {
        a(context, str, a(a(context), j11, z11, j12, z12), z11, j12);
    }

    private static void a(a aVar) {
        for (a aVar2 : f490a) {
            if (aVar2.a(aVar)) {
                aVar2.f493b += aVar.f493b;
                return;
            }
        }
        f490a.add(aVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized void m6007a(String str) {
        synchronized (ha.class) {
            if (!j.m6177d() && !TextUtils.isEmpty(str)) {
                f489a = str;
            }
        }
    }
}
