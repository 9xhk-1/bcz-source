package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f42661a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private static u f42662b;

    /* renamed from: c, reason: collision with root package name */
    private Context f42663c;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f42666f;

    /* renamed from: e, reason: collision with root package name */
    private Map<Integer, Map<String, t>> f42665e = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private String f42664d = aa.b().f42187d;

    private u(Context context) {
        this.f42663c = context;
        this.f42666f = context.getSharedPreferences("crashrecord", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> T d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f42663c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r4 = "crashrecord"
            java.io.File r3 = r3.getDir(r4, r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            if (r6 != 0) goto L1c
            monitor-exit(r5)
            return r0
        L1c:
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.lang.Object r2 = r6.readObject()     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            monitor-exit(r5)
            return r2
        L31:
            r6 = move-exception
            goto L60
        L33:
            r2 = move-exception
            goto L51
        L35:
            r2 = move-exception
            r6 = r0
            goto L51
        L38:
            r6 = r0
        L39:
            java.lang.String r2 = "get object error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.al.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.al.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
            goto L42
        L51:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L56:
            throw r2     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L57:
            java.lang.String r6 = "readCrashRecord error"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.u.d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean c(int i11) {
        try {
            try {
                List<t> d11 = d(i11);
                if (d11 == null) {
                    return false;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (t tVar : d11) {
                    String str = tVar.f42655b;
                    if (str != null && str.equalsIgnoreCase(this.f42664d) && tVar.f42657d > 0) {
                        arrayList.add(tVar);
                    }
                    if (tVar.f42656c + 86400000 < currentTimeMillis) {
                        arrayList2.add(tVar);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    d11.removeAll(arrayList2);
                    a(i11, (int) d11);
                    return false;
                }
                if (arrayList.size() <= 0 || ((t) arrayList.get(arrayList.size() - 1)).f42656c + 86400000 >= currentTimeMillis) {
                    return true;
                }
                d11.clear();
                a(i11, (int) d11);
                return false;
            } catch (Exception unused) {
                al.e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean b(final int i11) {
        boolean z11;
        z11 = true;
        try {
            z11 = this.f42666f.getBoolean(i11 + "_" + this.f42664d, true);
            ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.u.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean c11 = u.this.c(i11);
                    u.this.f42666f.edit().putBoolean(i11 + "_" + u.this.f42664d, !c11).commit();
                }
            });
        } catch (Exception unused) {
            al.e("canInit error", new Object[0]);
            return z11;
        }
        return z11;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f42662b == null) {
                    f42662b = new u(context);
                }
                uVar = f42662b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            uVar = f42662b;
        }
        return uVar;
    }

    public static /* synthetic */ boolean b(t tVar, t tVar2) {
        String str = tVar.f42658e;
        if (str != null && !str.equalsIgnoreCase(tVar2.f42658e)) {
            return true;
        }
        String str2 = tVar.f42659f;
        return !(str2 == null || str2.equalsIgnoreCase(tVar2.f42659f)) || tVar.f42657d <= 0;
    }

    public final void a(final int i11) {
        ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f42667a = 1004;

            @Override // java.lang.Runnable
            public final void run() {
                t tVar;
                try {
                    if (TextUtils.isEmpty(u.this.f42664d)) {
                        return;
                    }
                    List<t> d11 = u.this.d(this.f42667a);
                    if (d11 == null) {
                        d11 = new ArrayList();
                    }
                    if (u.this.f42665e.get(Integer.valueOf(this.f42667a)) == null) {
                        u.this.f42665e.put(Integer.valueOf(this.f42667a), new HashMap());
                    }
                    if (((Map) u.this.f42665e.get(Integer.valueOf(this.f42667a))).get(u.this.f42664d) == null) {
                        tVar = new t();
                        tVar.f42654a = this.f42667a;
                        tVar.f42660g = u.f42661a;
                        tVar.f42655b = u.this.f42664d;
                        tVar.f42659f = aa.b().f42198o;
                        tVar.f42658e = aa.b().f42191h;
                        tVar.f42656c = System.currentTimeMillis();
                        tVar.f42657d = i11;
                        ((Map) u.this.f42665e.get(Integer.valueOf(this.f42667a))).put(u.this.f42664d, tVar);
                    } else {
                        tVar = (t) ((Map) u.this.f42665e.get(Integer.valueOf(this.f42667a))).get(u.this.f42664d);
                        tVar.f42657d = i11;
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z11 = false;
                    for (t tVar2 : d11) {
                        if (u.a(tVar2, tVar)) {
                            tVar2.f42657d = tVar.f42657d;
                            z11 = true;
                        }
                        if (u.b(tVar2, tVar)) {
                            arrayList.add(tVar2);
                        }
                    }
                    d11.removeAll(arrayList);
                    if (!z11) {
                        d11.add(tVar);
                    }
                    u.this.a(this.f42667a, (int) d11);
                } catch (Exception unused) {
                    al.e("saveCrashRecord failed", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[Catch: all -> 0x002a, Exception -> 0x0050, TRY_ENTER, TryCatch #1 {Exception -> 0x0050, blocks: (B:9:0x0006, B:15:0x0025, B:30:0x004c, B:31:0x004f, B:22:0x0043), top: B:8:0x0006, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ObjectOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> void a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f42663c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.writeObject(r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            monitor-exit(r4)
            return
        L2a:
            r5 = move-exception
            goto L59
        L2c:
            r5 = move-exception
            goto L4a
        L2e:
            r5 = move-exception
            goto L37
        L30:
            r6 = move-exception
            r2 = r5
            r5 = r6
            goto L4a
        L34:
            r6 = move-exception
            r2 = r5
            r5 = r6
        L37:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "open record file error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.al.a(r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r4)
            return
        L4a:
            if (r2 == 0) goto L4f
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
        L4f:
            throw r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
        L50:
            java.lang.String r5 = "writeCrashRecord error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2a
            com.tencent.bugly.proguard.al.e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.u.a(int, java.util.List):void");
    }

    public static /* synthetic */ boolean a(t tVar, t tVar2) {
        String str;
        return tVar.f42660g == tVar2.f42660g && (str = tVar.f42655b) != null && str.equalsIgnoreCase(tVar2.f42655b);
    }
}
