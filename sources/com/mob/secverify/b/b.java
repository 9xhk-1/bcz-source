package com.mob.secverify.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mob.secverify.a.j;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.e.g;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private long f40696b;

    /* renamed from: c, reason: collision with root package name */
    private d f40697c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<j> f40695a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private String f40698d = UUID.randomUUID().toString();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.b.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40699a;

        static {
            int[] iArr = new int[d.values().length];
            f40699a = iArr;
            try {
                iArr[d.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40699a[d.PREVERIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40699a[d.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private static final ArrayList<j> f40700a = new ArrayList<>();

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ArrayList arrayList = (ArrayList) message.obj;
            if (arrayList != null) {
                f40700a.addAll(arrayList);
            }
            if (message.what == 1) {
                ArrayList<j> arrayList2 = f40700a;
                if (arrayList2.isEmpty()) {
                    return;
                }
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(arrayList2);
                arrayList2.clear();
                final boolean z11 = message.arg1 == 2;
                new Thread() { // from class: com.mob.secverify.b.b.a.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            b.b((ArrayList<j>) arrayList3, z11);
                        } catch (Throwable unused) {
                        }
                    }
                }.start();
            }
        }
    }

    public b(d dVar) {
        this.f40696b = 0L;
        this.f40697c = dVar;
        this.f40696b = SystemClock.uptimeMillis();
    }

    public void b(String str, String str2) {
        a(str, true, false, false, null, false, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.util.ArrayList<com.mob.secverify.a.j> r7, boolean r8) {
        /*
            if (r7 == 0) goto Le8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La
            goto Le8
        La:
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L28
            java.io.File r8 = new java.io.File
            android.content.Context r2 = com.mob.MobSDK.getContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = ".preverfy_xhs"
            r8.<init>(r2, r3)
            boolean r2 = r8.exists()
            if (r2 != 0) goto L28
            r8.createNewFile()     // Catch: java.io.IOException -> L26
        L26:
            r8 = r0
            goto L29
        L28:
            r8 = r1
        L29:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            com.mob.secverify.a.j r4 = (com.mob.secverify.a.j) r4
            r4.a(r8)
            boolean r5 = r4.p()
            if (r5 == 0) goto L4f
            com.mob.secverify.common.exception.VerifyException r5 = r4.c()
            r4.a(r5, r0)
            goto L5f
        L4f:
            r5 = 200(0xc8, float:2.8E-43)
            r4.a(r5)
            java.lang.String r6 = "success"
            r4.b(r6)
            r4.b(r5)
            r4.c(r6)
        L5f:
            com.mob.secverify.c.a r5 = com.mob.secverify.c.a.a()
            java.util.HashMap r4 = r5.a(r4)
            r2.add(r4)
            goto L32
        L6b:
            r7.clear()
            java.util.ArrayList r7 = b()
            if (r7 == 0) goto L80
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L80
            r2.addAll(r7)
            r7.clear()
        L80:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r8 = "list"
            r7.put(r8, r2)
            java.lang.String r8 = com.mob.secverify.e.g.g()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto Laa
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r3 = 4
            java.lang.String r3 = com.mob.secverify.c.c.a(r3)
            r8.append(r3)
            java.lang.String r3 = "api/log"
            r8.append(r3)
            java.lang.String r8 = r8.toString()
        Laa:
            r3 = 0
            com.mob.secverify.d.a r4 = com.mob.secverify.d.a.a(r1)     // Catch: java.lang.Throwable -> Lb6
            r4.a(r7, r8)     // Catch: java.lang.Throwable -> Lb6
            com.mob.secverify.e.g.a(r3)     // Catch: java.lang.Throwable -> Lb6
            goto Le8
        Lb6:
            com.mob.tools.utils.Hashon r7 = new com.mob.tools.utils.Hashon     // Catch: java.lang.Throwable -> Le5
            r7.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r7 = r7.fromObject(r2)     // Catch: java.lang.Throwable -> Le5
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Le5
            if (r8 != 0) goto Le8
            java.lang.String[] r7 = com.mob.secverify.e.b.b(r7)     // Catch: java.lang.Throwable -> Le5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5
            r8.<init>()     // Catch: java.lang.Throwable -> Le5
            r1 = r7[r1]     // Catch: java.lang.Throwable -> Le5
            r8.append(r1)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r1 = "&&"
            r8.append(r1)     // Catch: java.lang.Throwable -> Le5
            r7 = r7[r0]     // Catch: java.lang.Throwable -> Le5
            r8.append(r7)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Le5
            com.mob.secverify.e.g.a(r7)     // Catch: java.lang.Throwable -> Le5
            goto Le8
        Le5:
            com.mob.secverify.e.g.a(r3)
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.b.b.b(java.util.ArrayList, boolean):void");
    }

    public void a(String str, String str2) {
        a(str, true, false, false, null, true, str2);
    }

    public void a(String str) {
        a(str, true, false, false, null, false, "");
    }

    public void a(String str, VerifyException verifyException, String str2) {
        a(str, verifyException, true, str2);
    }

    public void a(String str, VerifyException verifyException, boolean z11, String str2) {
        a(str, false, false, false, verifyException, z11, str2);
    }

    public void a(String str, boolean z11, boolean z12, boolean z13, VerifyException verifyException, boolean z14, String str2) {
        if (this.f40696b == 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f40696b;
        j jVar = new j(this.f40697c, str);
        jVar.a(this.f40698d);
        jVar.c(uptimeMillis);
        jVar.b(uptimeMillis);
        jVar.a(System.currentTimeMillis());
        jVar.b(!z11);
        jVar.d(str2);
        if (z13) {
            jVar.c(z12);
        }
        if (verifyException != null) {
            jVar.a(verifyException);
        }
        this.f40695a.add(jVar);
        if (z14) {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r5 = this;
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            java.util.ArrayList<com.mob.secverify.a.j> r1 = r5.f40695a
            r0.obj = r1
            int[] r1 = com.mob.secverify.b.b.AnonymousClass1.f40699a
            com.mob.secverify.b.d r2 = r5.f40697c
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L22
            r3 = 2
            if (r1 == r3) goto L1d
            r3 = 3
            if (r1 == r3) goto L1f
            goto L33
        L1d:
            r0.arg1 = r3
        L1f:
            r0.what = r2
            goto L33
        L22:
            r1 = 0
            r0.what = r1
            com.mob.secverify.b.b$a r1 = new com.mob.secverify.b.b$a
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.sendEmptyMessageDelayed(r2, r3)
        L33:
            com.mob.secverify.b.b$a r1 = new com.mob.secverify.b.b$a
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.b.b.a():void");
    }

    private static ArrayList<HashMap<String, Object>> b() {
        try {
            String b11 = g.b();
            if (!TextUtils.isEmpty(b11)) {
                String[] split = b11.split("&&");
                if (split.length == 2) {
                    String str = split[0];
                    return (ArrayList) new Hashon().fromJson(com.mob.secverify.e.b.a(com.mob.secverify.pure.core.ope.a.a.a.a(str), split[1]).trim(), ArrayList.class);
                }
                g.a((String) null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
