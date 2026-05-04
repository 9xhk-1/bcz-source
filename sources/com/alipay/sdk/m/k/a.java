package com.alipay.sdk.m.k;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.u.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.k.a$a, reason: collision with other inner class name */
    public static final class C0164a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10634a = "RecordPref";

        /* renamed from: b, reason: collision with root package name */
        public static final String f10635b = "alipay_cashier_statistic_record";

        public static synchronized String a(Context context, String str, String str2) {
            synchronized (C0164a.class) {
                try {
                    com.alipay.sdk.m.u.e.b(f10634a, "stat append " + str2 + " , " + str);
                    if (context != null && !TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = UUID.randomUUID().toString();
                        }
                        C0165a a11 = a(context);
                        if (a11.f10636a.size() > 20) {
                            a11.f10636a.clear();
                        }
                        a11.f10636a.put(str2, str);
                        a(context, a11);
                        return str2;
                    }
                    return null;
                } finally {
                }
            }
        }

        public static synchronized String b(Context context) {
            synchronized (C0164a.class) {
                com.alipay.sdk.m.u.e.b(f10634a, "stat peek");
                if (context == null) {
                    return null;
                }
                C0165a a11 = a(context);
                if (a11.f10636a.isEmpty()) {
                    return null;
                }
                try {
                    return a11.f10636a.entrySet().iterator().next().getValue();
                } catch (Throwable th2) {
                    com.alipay.sdk.m.u.e.a(th2);
                    return null;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.k.a$a$a, reason: collision with other inner class name */
        public static final class C0165a {

            /* renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f10636a = new LinkedHashMap<>();

            public C0165a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f10636a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th2) {
                    com.alipay.sdk.m.u.e.a(th2);
                    return new JSONArray().toString();
                }
            }

            public C0165a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
                        this.f10636a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th2) {
                    com.alipay.sdk.m.u.e.a(th2);
                }
            }
        }

        public static synchronized int a(Context context, String str) {
            synchronized (C0164a.class) {
                com.alipay.sdk.m.u.e.b(f10634a, "stat remove " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    C0165a a11 = a(context);
                    if (a11.f10636a.isEmpty()) {
                        return 0;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : a11.f10636a.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a11.f10636a.remove((String) it.next());
                        }
                        a(context, a11);
                        return arrayList.size();
                    } catch (Throwable th2) {
                        com.alipay.sdk.m.u.e.a(th2);
                        int size = a11.f10636a.size();
                        a(context, new C0165a());
                        return size;
                    }
                }
                return 0;
            }
        }

        public static synchronized C0165a a(Context context) {
            synchronized (C0164a.class) {
                try {
                    String a11 = j.a(null, context, f10635b, null);
                    if (TextUtils.isEmpty(a11)) {
                        return new C0165a();
                    }
                    return new C0165a(a11);
                } catch (Throwable th2) {
                    com.alipay.sdk.m.u.e.a(th2);
                    return new C0165a();
                }
            }
        }

        public static synchronized void a(Context context, C0165a c0165a) {
            synchronized (C0164a.class) {
                if (c0165a == null) {
                    try {
                        c0165a = new C0165a();
                    } finally {
                    }
                }
                j.b(null, context, f10635b, c0165a.a());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.k.a$b$a, reason: collision with other inner class name */
        public static class RunnableC0166a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f10637a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f10638b;

            public RunnableC0166a(String str, Context context) {
                this.f10637a = str;
                this.f10638b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f10637a) || b.b(this.f10638b, this.f10637a)) {
                    for (int i11 = 0; i11 < 4; i11++) {
                        String b11 = C0164a.b(this.f10638b);
                        if (TextUtils.isEmpty(b11) || !b.b(this.f10638b, b11)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized boolean b(Context context, String str) {
            synchronized (b.class) {
                try {
                    com.alipay.sdk.m.u.e.b(com.alipay.sdk.m.l.a.A, "stat sub " + str);
                    try {
                        if ((com.alipay.sdk.m.m.a.D().e() ? new com.alipay.sdk.m.q.d() : new com.alipay.sdk.m.q.e()).a((com.alipay.sdk.m.s.a) null, context, str) == null) {
                            return false;
                        }
                        C0164a.a(context, str);
                        return true;
                    } catch (Throwable th2) {
                        com.alipay.sdk.m.u.e.a(th2);
                        return false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public static synchronized void a(Context context, com.alipay.sdk.m.k.b bVar, String str, String str2) {
            synchronized (b.class) {
                if (context == null || bVar == null || str == null) {
                    return;
                }
                a(context, bVar.a(str), str2);
            }
        }

        public static synchronized void a(Context context) {
            synchronized (b.class) {
                a(context, null, null);
            }
        }

        public static synchronized void a(Context context, String str, String str2) {
            synchronized (b.class) {
                if (context == null) {
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        C0164a.a(context, str, str2);
                    }
                    new Thread(new RunnableC0166a(str, context)).start();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10639a = "alipay_cashier_ap_seq_v";

        public static synchronized long a(Context context) {
            long a11;
            synchronized (c.class) {
                a11 = d.a(context, f10639a);
            }
            return a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {
        /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|5|(5:7|8|9|10|11)|17|8|9|10|11) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static synchronized long a(android.content.Context r6, java.lang.String r7) {
            /*
                java.lang.Class<com.alipay.sdk.m.k.a$d> r0 = com.alipay.sdk.m.k.a.d.class
                monitor-enter(r0)
                r1 = 0
                java.lang.String r2 = com.alipay.sdk.m.u.j.a(r1, r6, r7, r1)     // Catch: java.lang.Throwable -> L13
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L13
                if (r3 != 0) goto L13
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = 0
            L15:
                r4 = 1
                long r2 = r2 + r4
                java.lang.String r4 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L1f
                com.alipay.sdk.m.u.j.b(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L1f
            L1f:
                monitor-exit(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.k.a.d.a(android.content.Context, java.lang.String):long");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10640a = "alipay_cashier_statistic_v";

        public static synchronized long a(Context context) {
            long a11;
            synchronized (e.class) {
                a11 = d.a(context, f10640a);
            }
            return a11;
        }
    }

    public static synchronized void a(Context context, com.alipay.sdk.m.s.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            try {
                C0164a.a(context, aVar.f11024l.a(str), str2);
            } finally {
            }
        }
    }

    public static synchronized void b(Context context, com.alipay.sdk.m.s.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            b.a(context, aVar.f11024l, str, str2);
        }
    }

    public static void b(com.alipay.sdk.m.s.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f11024l.b(str, str2, str3);
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            b.a(context);
        }
    }

    public static void a(com.alipay.sdk.m.s.a aVar, String str, Throwable th2) {
        if (aVar == null || th2 == null) {
            return;
        }
        aVar.f11024l.a(str, th2.getClass().getSimpleName(), th2);
    }

    public static void a(com.alipay.sdk.m.s.a aVar, String str, String str2, Throwable th2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f11024l.a(str, str2, th2, str3);
    }

    public static void a(com.alipay.sdk.m.s.a aVar, String str, String str2, Throwable th2) {
        if (aVar == null) {
            return;
        }
        aVar.f11024l.a(str, str2, th2);
    }

    public static void a(com.alipay.sdk.m.s.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f11024l.a(str, str2, str3);
    }

    public static void a(com.alipay.sdk.m.s.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.f11024l.a(str, str2);
    }
}
