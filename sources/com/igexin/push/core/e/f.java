package com.igexin.push.core.e;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.push.g.g;
import com.igexin.push.g.j;

/* loaded from: classes7.dex */
public class f implements a {
    private static final int A = 48;
    private static final int B = 49;
    private static final int C = 50;
    private static final int D = 51;
    private static final int E = 53;
    private static final int F = 54;
    private static final int G = 60;
    private static final int H = 61;
    private static final int I = 63;
    private static final int J = 64;
    private static final int K = 65;
    private static final int L = 66;
    private static final int M = 67;
    private static volatile f N = null;

    /* renamed from: a, reason: collision with root package name */
    public static final String f38080a = "com.igexin.push.core.e.f";

    /* renamed from: c, reason: collision with root package name */
    private static final int f38081c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f38082d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f38083e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f38084f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f38085g = 6;

    /* renamed from: h, reason: collision with root package name */
    private static final int f38086h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final int f38087i = 12;

    /* renamed from: j, reason: collision with root package name */
    private static final int f38088j = 13;

    /* renamed from: k, reason: collision with root package name */
    private static final int f38089k = 14;

    /* renamed from: l, reason: collision with root package name */
    private static final int f38090l = 15;

    /* renamed from: m, reason: collision with root package name */
    private static final int f38091m = 16;

    /* renamed from: n, reason: collision with root package name */
    private static final int f38092n = 17;

    /* renamed from: o, reason: collision with root package name */
    private static final int f38093o = 18;

    /* renamed from: p, reason: collision with root package name */
    private static final int f38094p = 20;

    /* renamed from: q, reason: collision with root package name */
    private static final int f38095q = 21;

    /* renamed from: r, reason: collision with root package name */
    private static final int f38096r = 22;

    /* renamed from: s, reason: collision with root package name */
    private static final int f38097s = 23;

    /* renamed from: t, reason: collision with root package name */
    private static final int f38098t = 25;

    /* renamed from: u, reason: collision with root package name */
    private static final int f38099u = 30;

    /* renamed from: v, reason: collision with root package name */
    private static final int f38100v = 31;

    /* renamed from: w, reason: collision with root package name */
    private static final int f38101w = 32;

    /* renamed from: x, reason: collision with root package name */
    private static final int f38102x = 40;

    /* renamed from: y, reason: collision with root package name */
    private static final int f38103y = 46;

    /* renamed from: z, reason: collision with root package name */
    private static final int f38104z = 47;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38105b;

    /* renamed from: com.igexin.push.core.e.f$1, reason: invalid class name */
    public class AnonymousClass1 extends com.igexin.push.b.d {
        public AnonymousClass1() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.this.c(this.f37409d);
            j.b();
        }
    }

    /* renamed from: com.igexin.push.core.e.f$12, reason: invalid class name */
    public class AnonymousClass12 extends com.igexin.push.b.d {
        public AnonymousClass12() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.a();
            f.b(this.f37409d, 8, String.valueOf(com.igexin.push.core.e.R));
        }
    }

    /* renamed from: com.igexin.push.core.e.f$13, reason: invalid class name */
    public class AnonymousClass13 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38112a;

        public AnonymousClass13(String str) {
            this.f38112a = str;
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            f.a();
            f.b(this.f37409d, 3, this.f38112a);
        }
    }

    /* renamed from: com.igexin.push.core.e.f$17, reason: invalid class name */
    public class AnonymousClass17 extends com.igexin.push.b.d {
        public AnonymousClass17() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.a();
            f.b(this.f37409d, 67, String.valueOf(com.igexin.push.core.e.J));
        }
    }

    /* renamed from: com.igexin.push.core.e.f$20, reason: invalid class name */
    public class AnonymousClass20 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38126b;

        public AnonymousClass20(String str, String str2) {
            this.f38125a = str;
            this.f38126b = str2;
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            if (!TextUtils.isEmpty(this.f38125a)) {
                f.a();
                f.b(this.f37409d, 53, this.f38125a);
            }
            if (TextUtils.isEmpty(this.f38126b)) {
                return;
            }
            f.a();
            f.b(this.f37409d, 54, this.f38126b);
        }
    }

    /* renamed from: com.igexin.push.core.e.f$21, reason: invalid class name */
    public class AnonymousClass21 extends com.igexin.push.b.d {
        public AnonymousClass21() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            f.a();
            f.b(this.f37409d, 60, String.valueOf(com.igexin.push.core.e.f38026c));
        }
    }

    /* renamed from: com.igexin.push.core.e.f$25, reason: invalid class name */
    public class AnonymousClass25 extends com.igexin.push.b.d {
        public AnonymousClass25() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            f.a();
            f.b(this.f37409d, 64, String.valueOf(com.igexin.push.core.e.f38022ax));
        }
    }

    /* renamed from: com.igexin.push.core.e.f$27, reason: invalid class name */
    public class AnonymousClass27 extends com.igexin.push.b.d {
        public AnonymousClass27() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            f.a();
            f.a(this.f37409d, 66, com.igexin.c.a.a.a.b(com.igexin.push.a.f37298j.getBytes(), com.igexin.push.core.e.M));
        }
    }

    /* renamed from: com.igexin.push.core.e.f$28, reason: invalid class name */
    public class AnonymousClass28 extends com.igexin.push.b.d {
        public AnonymousClass28() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            f.a();
            f.e(this.f37409d);
        }
    }

    /* renamed from: com.igexin.push.core.e.f$3, reason: invalid class name */
    public class AnonymousClass3 extends com.igexin.push.b.d {
        public AnonymousClass3() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.a();
            f.b(this.f37409d, 13, com.igexin.push.core.e.V);
        }
    }

    /* renamed from: com.igexin.push.core.e.f$31, reason: invalid class name */
    public class AnonymousClass31 extends com.igexin.push.b.d {
        public AnonymousClass31() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.a();
            f.b(this.f37409d, 51, com.igexin.push.core.e.C);
        }
    }

    /* renamed from: com.igexin.push.core.e.f$5, reason: invalid class name */
    public class AnonymousClass5 extends com.igexin.push.b.d {
        public AnonymousClass5() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            f.a();
            f.b(this.f37409d, 16, String.valueOf(com.igexin.push.core.e.X));
        }
    }

    private f() {
    }

    public static f a() {
        if (N == null) {
            synchronized (f.class) {
                try {
                    if (N == null) {
                        N = new f();
                    }
                } finally {
                }
            }
        }
        return N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r10 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r10 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.database.sqlite.SQLiteDatabase r10, int r11) {
        /*
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "runtime"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.String r2 = "id="
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.String r5 = r2.concat(r11)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            if (r10 == 0) goto L37
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            if (r11 == 0) goto L37
            int r11 = r10.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r10.close()
            return r11
        L30:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L4a
        L34:
            r0 = move-exception
            r11 = r0
            goto L43
        L37:
            if (r10 == 0) goto L49
        L39:
            r10.close()
            goto L49
        L3d:
            r0 = move-exception
            r11 = r0
            goto L4a
        L40:
            r0 = move-exception
            r11 = r0
            r10 = r1
        L43:
            com.igexin.c.a.c.a.a(r11)     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L49
            goto L39
        L49:
            return r1
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.f.b(android.database.sqlite.SQLiteDatabase, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x003c, B:10:0x0076, B:15:0x0019), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d() {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = com.igexin.push.core.e.D     // Catch: java.lang.Throwable -> L17
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L17
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L19
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L17
            r4 = 8
            if (r3 > r4) goto L3c
            goto L19
        L17:
            r1 = move-exception
            goto L82
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "V"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r3.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = com.igexin.push.core.e.f38030g     // Catch: java.lang.Throwable -> L17
            r3.append(r4)     // Catch: java.lang.Throwable -> L17
            r3.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = com.igexin.c.b.a.b(r3)     // Catch: java.lang.Throwable -> L17
            r1.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "A-"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L17
            r3.append(r1)     // Catch: java.lang.Throwable -> L17
            r3.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17
            r1.append(r4)     // Catch: java.lang.Throwable -> L17
            r1.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = com.igexin.push.core.e.f38030g     // Catch: java.lang.Throwable -> L17
            r1.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = com.igexin.c.b.a.b(r1)     // Catch: java.lang.Throwable -> L17
            r3.append(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L17
            com.igexin.push.core.e.L = r1     // Catch: java.lang.Throwable -> L17
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L17
            r2 = 64
            if (r1 < r2) goto L81
            java.lang.String r1 = com.igexin.push.core.e.L     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 62
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> L17
            com.igexin.push.core.e.L = r1     // Catch: java.lang.Throwable -> L17
        L81:
            return
        L82:
            com.igexin.c.a.c.a.a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A-V"
            r1.<init>(r2)
            java.lang.String r2 = com.igexin.push.core.e.f38030g
            r1.append(r2)
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r2 = com.igexin.push.core.e.f38030g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.igexin.c.b.a.b(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.igexin.push.core.e.L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.f.d():void");
    }

    public static /* synthetic */ void e() {
        j.b();
        String d11 = j.d();
        if (d11 == null || d11.length() <= 5) {
            j.f();
        }
    }

    private void f() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(), false, true);
    }

    private static void g() {
        j.b();
        String d11 = j.d();
        if (d11 == null || d11.length() <= 5) {
            j.f();
        }
    }

    private static void h() {
        String str = com.igexin.push.core.e.A;
        com.igexin.c.a.c.a.a(f38080a + "| found a duplicate cid " + com.igexin.push.core.e.A, new Object[0]);
        com.igexin.push.core.e.L = null;
        d();
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a().new AnonymousClass13(com.igexin.push.core.e.L), false, true);
        a().b();
        com.igexin.push.core.e.f38041r = 0;
        com.igexin.push.f.b.e.g().f38572a = SystemClock.elapsedRealtime();
    }

    private void i() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass25(), false, true);
    }

    private void j() {
        if (TextUtils.isEmpty(g.f38691c)) {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass27(), true, false);
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass28(), true, false);
        }
    }

    private static void k(SQLiteDatabase sQLiteDatabase) {
        String b11 = b(sQLiteDatabase, 3);
        if (!TextUtils.isEmpty(b11)) {
            if (b11.equals("null")) {
                b11 = null;
            }
            com.igexin.push.core.e.L = b11;
        }
        String str = com.igexin.push.core.e.L;
    }

    private static void l(SQLiteDatabase sQLiteDatabase) {
        byte[] a11 = a(sQLiteDatabase, 1);
        if (a11 != null) {
            try {
                String str = new String(a11);
                com.igexin.push.core.e.f38049z = str.equals("null") ? 0L : Long.parseLong(str);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            com.igexin.c.a.c.a.a(f38080a + "|db version changed, save session = " + com.igexin.push.core.e.f38049z, new Object[0]);
        }
    }

    private static void m(SQLiteDatabase sQLiteDatabase) {
        byte[] a11 = a(sQLiteDatabase, 20);
        if (a11 != null) {
            String str = new String(a11);
            if (str.equals("null")) {
                str = null;
            }
            com.igexin.push.core.e.B = str;
            com.igexin.push.core.e.A = str;
            com.igexin.c.a.c.a.a(f38080a + "|db version changed, save cid = " + str, new Object[0]);
        }
    }

    private static void n(SQLiteDatabase sQLiteDatabase) {
        byte[] a11 = a(sQLiteDatabase, 66);
        if (a11 != null) {
            String str = new String(a11);
            if (TextUtils.isEmpty(str)) {
                com.igexin.c.a.c.a.a(f38080a, "readRedirectAes null");
                return;
            }
            g.f38691c = str;
            com.igexin.c.a.c.a.b(f38080a, " readRedirectAes set success " + g.f38691c);
        }
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
        byte[] b11 = com.igexin.c.a.a.a.b(String.valueOf(com.igexin.push.core.e.f38049z).getBytes(), com.igexin.push.core.e.M);
        long j11 = com.igexin.push.core.e.f38049z;
        a(sQLiteDatabase, 1, b11);
        b(sQLiteDatabase, 4, String.valueOf(com.igexin.push.core.e.f38043t));
        b(sQLiteDatabase, 8, String.valueOf(com.igexin.push.core.e.R));
        b(sQLiteDatabase, 32, String.valueOf(com.igexin.push.core.e.U));
        b(sQLiteDatabase, 3, com.igexin.push.core.e.L);
        b(sQLiteDatabase, 12, String.valueOf(com.igexin.push.core.e.T));
        a(sQLiteDatabase, 20, com.igexin.c.a.a.a.b(com.igexin.push.core.e.A.getBytes(), com.igexin.push.core.e.M));
        b(sQLiteDatabase, 2, com.igexin.push.core.e.H);
        a(sQLiteDatabase, 25, com.igexin.c.a.a.a.b(com.igexin.push.core.e.M.getBytes(), com.igexin.c.b.a.b(com.igexin.push.core.e.f38035l.getPackageName())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (com.igexin.push.core.e.M != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r10 = com.igexin.push.core.e.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r10 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r10 = com.igexin.push.core.b.f37716am;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        com.igexin.push.core.e.M = com.igexin.c.b.a.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        com.igexin.c.a.c.a.a(com.igexin.push.core.e.f.f38080a + "|storageKey = " + com.igexin.push.core.e.M, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.database.sqlite.SQLiteDatabase r10) {
        /*
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "runtime"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r5 = "id=?"
            java.lang.String r2 = "25"
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r1 == 0) goto L45
            boolean r10 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r10 == 0) goto L45
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            byte[] r0 = r1.getBlob(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            android.content.Context r2 = com.igexin.push.core.ServiceManager.f37612b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r2 = com.igexin.c.b.a.b(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            byte[] r0 = com.igexin.c.a.a.a.a(r0, r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            com.igexin.push.core.e.M = r10     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            goto L45
        L3f:
            r0 = move-exception
            r10 = r0
            goto L80
        L42:
            r0 = move-exception
            r10 = r0
            goto L4b
        L45:
            if (r1 == 0) goto L51
        L47:
            r1.close()
            goto L51
        L4b:
            com.igexin.c.a.c.a.a(r10)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L51
            goto L47
        L51:
            java.lang.String r10 = com.igexin.push.core.e.M
            if (r10 != 0) goto L61
            java.lang.String r10 = com.igexin.push.core.e.D
            if (r10 != 0) goto L5b
            java.lang.String r10 = "cantgetimei"
        L5b:
            java.lang.String r10 = com.igexin.c.b.a.b(r10)
            com.igexin.push.core.e.M = r10
        L61:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = com.igexin.push.core.e.f.f38080a
            r10.append(r0)
            java.lang.String r0 = "|storageKey = "
            r10.append(r0)
            java.lang.String r0 = com.igexin.push.core.e.M
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.igexin.c.a.c.a.a(r10, r0)
            return
        L80:
            if (r1 == 0) goto L85
            r1.close()
        L85:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.f.d(android.database.sqlite.SQLiteDatabase):void");
    }

    private void f(SQLiteDatabase sQLiteDatabase) {
        this.f38105b = true;
        d(sQLiteDatabase);
        byte[] a11 = a(sQLiteDatabase, 1);
        if (a11 != null) {
            try {
                String str = new String(a11);
                com.igexin.push.core.e.f38049z = str.equals("null") ? 0L : Long.parseLong(str);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            com.igexin.c.a.c.a.a(f38080a + "|db version changed, save session = " + com.igexin.push.core.e.f38049z, new Object[0]);
        }
        byte[] a12 = a(sQLiteDatabase, 20);
        if (a12 != null) {
            String str2 = new String(a12);
            if (str2.equals("null")) {
                str2 = null;
            }
            com.igexin.push.core.e.B = str2;
            com.igexin.push.core.e.A = str2;
            com.igexin.c.a.c.a.a(f38080a + "|db version changed, save cid = " + str2, new Object[0]);
        }
        String b11 = b(sQLiteDatabase, 3);
        if (!TextUtils.isEmpty(b11)) {
            if (b11.equals("null")) {
                b11 = null;
            }
            com.igexin.push.core.e.L = b11;
        }
        String str3 = com.igexin.push.core.e.L;
        String b12 = b(sQLiteDatabase, 2);
        if (!TextUtils.isEmpty(b12)) {
            if (b12.equals("null")) {
                b12 = null;
            }
            com.igexin.push.core.e.H = b12;
        }
        String b13 = b(sQLiteDatabase, 46);
        if (!TextUtils.isEmpty(b13)) {
            if (b13.equals("null")) {
                b13 = null;
            }
            com.igexin.push.core.e.I = b13;
        }
        String b14 = b(sQLiteDatabase, 48);
        if (!TextUtils.isEmpty(b14)) {
            if (b14.equals("null")) {
                b14 = null;
            }
            com.igexin.push.core.e.K = b14;
        }
        String b15 = b(sQLiteDatabase, 51);
        if (TextUtils.isEmpty(b15) || b15.length() == 13) {
            return;
        }
        com.igexin.push.core.e.C = b15.equals("null") ? null : b15;
    }

    private static void g(SQLiteDatabase sQLiteDatabase) {
        String b11 = b(sQLiteDatabase, 2);
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        if (b11.equals("null")) {
            b11 = null;
        }
        com.igexin.push.core.e.H = b11;
    }

    private static void h(SQLiteDatabase sQLiteDatabase) {
        String b11 = b(sQLiteDatabase, 51);
        if (TextUtils.isEmpty(b11) || b11.length() == 13) {
            return;
        }
        if (b11.equals("null")) {
            b11 = null;
        }
        com.igexin.push.core.e.C = b11;
    }

    private static void i(SQLiteDatabase sQLiteDatabase) {
        String b11 = b(sQLiteDatabase, 46);
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        if (b11.equals("null")) {
            b11 = null;
        }
        com.igexin.push.core.e.I = b11;
    }

    private static void j(SQLiteDatabase sQLiteDatabase) {
        String b11 = b(sQLiteDatabase, 48);
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        if (b11.equals("null")) {
            b11 = null;
        }
        com.igexin.push.core.e.K = b11;
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x040b, code lost:
    
        if (com.igexin.push.core.e.f38049z != 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x040d, code lost:
    
        r3 = com.igexin.push.g.j.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0413, code lost:
    
        if (r3 == 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0415, code lost:
    
        com.igexin.push.core.e.f38049z = r3;
        a(r2, r14, com.igexin.push.g.g.a(java.lang.String.valueOf(r3).getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0428, code lost:
    
        if (com.igexin.push.core.e.A != null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x042a, code lost:
    
        r0 = com.igexin.push.g.j.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x042e, code lost:
    
        if (r0 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0430, code lost:
    
        com.igexin.push.core.e.B = r0;
        com.igexin.push.core.e.A = r0;
        a(r2, r12, com.igexin.push.g.g.a(r0.getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0441, code lost:
    
        if (com.igexin.push.core.e.A != null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0443, code lost:
    
        r3 = com.igexin.push.core.e.f38049z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0447, code lost:
    
        if (r3 == 0) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0449, code lost:
    
        com.igexin.push.core.e.B = com.igexin.c.b.a.b(java.lang.String.valueOf(r3));
        com.igexin.push.core.e.a(com.igexin.push.core.e.f38049z);
        a(r2, r12, com.igexin.push.g.g.a(com.igexin.push.core.e.A.getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x046d, code lost:
    
        if ("cfcd208495d565ef66e7dff9f98764da".equals(com.igexin.push.core.e.A) != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x046f, code lost:
    
        r0 = com.igexin.push.core.e.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0471, code lost:
    
        if (r0 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0479, code lost:
    
        if (r0.matches("([a-f]|[0-9]){32}") != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x047c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x04a2, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.f38012an) != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x04aa, code lost:
    
        if ("null".equals(com.igexin.push.core.e.f38012an) == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04bd, code lost:
    
        r0 = com.igexin.push.g.j.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04c4, code lost:
    
        if (com.igexin.push.core.e.H != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04c6, code lost:
    
        if (r0 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04cc, code lost:
    
        if (r0.length() <= 5) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04ce, code lost:
    
        com.igexin.push.core.e.H = r0;
        b(r2, 2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0404, code lost:
    
        if (r5 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04d6, code lost:
    
        if (com.igexin.push.core.e.L != null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04d8, code lost:
    
        d();
        b(r2, 3, com.igexin.push.core.e.L);
        r0 = com.igexin.push.core.e.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04e3, code lost:
    
        r0 = com.igexin.push.core.e.d.a(com.igexin.push.core.e.f38035l);
        r3 = r0.c();
        r5 = r3.optString("token", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04f3, code lost:
    
        if (r5 == null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04fb, code lost:
    
        if (r5.equals(com.igexin.push.core.e.I) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04fd, code lost:
    
        com.igexin.push.core.e.I = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0505, code lost:
    
        if (r3.optBoolean("isForce") == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0507, code lost:
    
        c("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x050a, code lost:
    
        r3 = com.igexin.push.core.e.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x050c, code lost:
    
        if (r3 == null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x050e, code lost:
    
        b(r3);
        r0.a(new org.json.JSONObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x051b, code lost:
    
        if (r20.f38105b == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x051d, code lost:
    
        r20.f38105b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0525, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.M) != false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0527, code lost:
    
        a(r2, 25, com.igexin.c.a.a.a.b(com.igexin.push.core.e.M.getBytes(), com.igexin.c.b.a.b(com.igexin.push.core.e.f38035l.getPackageName())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0540, code lost:
    
        r5 = com.igexin.push.core.e.f38049z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0544, code lost:
    
        if (r5 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0546, code lost:
    
        a(r2, r14, com.igexin.push.g.g.a(java.lang.String.valueOf(r5).getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x055b, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.A) != false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x055d, code lost:
    
        a(r2, r12, com.igexin.push.g.g.a(com.igexin.push.core.e.A.getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0570, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.H) != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0578, code lost:
    
        if (com.igexin.push.core.e.H.length() <= 5) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x057a, code lost:
    
        b(r2, 2, com.igexin.push.core.e.H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0586, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.L) != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0588, code lost:
    
        b(r2, 3, com.igexin.push.core.e.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0594, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.I) != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0596, code lost:
    
        b(r2, 46, com.igexin.push.core.e.I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x05a3, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.C) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05a5, code lost:
    
        b(r2, 51, com.igexin.push.core.e.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x05b2, code lost:
    
        if (android.text.TextUtils.isEmpty(com.igexin.push.core.e.K) != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05b4, code lost:
    
        b(r2, 48, com.igexin.push.core.e.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x04ac, code lost:
    
        r0 = com.igexin.c.b.a.a();
        com.igexin.push.core.e.f38012an = r0;
        a(r2, 14, com.igexin.push.g.g.a(r0.getBytes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0482, code lost:
    
        if (com.igexin.push.core.e.f38049z == 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03e4, code lost:
    
        if (r5 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0484, code lost:
    
        a().a(com.igexin.push.core.e.f38049z);
        com.igexin.push.core.e.B = com.igexin.push.core.e.A;
        com.igexin.push.g.j.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0495, code lost:
    
        r7 = null;
        com.igexin.push.core.e.B = null;
        com.igexin.push.core.e.A = "null";
        com.igexin.push.core.e.f38049z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03e6, code lost:
    
        r5.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05be  */
    @Override // com.igexin.push.core.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.database.sqlite.SQLiteDatabase r21) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.f.b(android.database.sqlite.SQLiteDatabase):void");
    }

    public final boolean c() {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.23
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 2, com.igexin.push.core.e.H);
                f.a(this.f37409d, 1, f.f(String.valueOf(com.igexin.push.core.e.f38049z)));
                f.a(this.f37409d, 20, f.f(com.igexin.push.core.e.A));
                f.b(this.f37409d, 3, com.igexin.push.core.e.L);
                f.e();
            }
        }, false, true);
    }

    public final void e(long j11) {
        if (com.igexin.push.core.e.f38023ay != j11) {
            com.igexin.push.core.e.f38023ay = j11;
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.26
                @Override // com.igexin.push.b.d
                public final void a_() throws Exception {
                    f.a();
                    f.b(this.f37409d, 65, String.valueOf(com.igexin.push.core.e.f38023ay));
                }
            }, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(SQLiteDatabase sQLiteDatabase, int i11, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i11));
        contentValues.put("value", str);
        sQLiteDatabase.replace(com.igexin.push.core.b.Z, null, contentValues);
    }

    private boolean c(int i11) {
        if (com.igexin.push.core.e.J == i11) {
            return false;
        }
        com.igexin.push.core.e.J = i11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass17(), false, true);
    }

    public static /* synthetic */ void e(SQLiteDatabase sQLiteDatabase) {
        byte[] a11 = a(sQLiteDatabase, 66);
        if (a11 != null) {
            String str = new String(a11);
            if (TextUtils.isEmpty(str)) {
                com.igexin.c.a.c.a.a(f38080a, "readRedirectAes null");
                return;
            }
            g.f38691c = str;
            com.igexin.c.a.c.a.b(f38080a, " readRedirectAes set success " + g.f38691c);
        }
    }

    private boolean f(long j11) {
        if (j11 == com.igexin.push.core.e.R) {
            return false;
        }
        com.igexin.push.core.e.R = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass12(), false, true);
    }

    private boolean g(long j11) {
        if (com.igexin.push.core.e.T == j11) {
            return false;
        }
        com.igexin.push.core.e.T = j11;
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.34
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 12, String.valueOf(com.igexin.push.core.e.T));
            }
        }, false, true);
        return true;
    }

    private boolean h(long j11) {
        if (com.igexin.push.core.e.X == j11) {
            return false;
        }
        com.igexin.push.core.e.X = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass5(), false, true);
    }

    private boolean i(long j11) {
        if (com.igexin.push.core.e.U == j11) {
            return false;
        }
        com.igexin.push.core.e.U = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.14
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 32, String.valueOf(com.igexin.push.core.e.U));
            }
        }, false, true);
    }

    private boolean j(long j11) {
        if (com.igexin.push.core.e.f38026c == j11) {
            return false;
        }
        com.igexin.push.core.e.f38026c = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass21(), false, true);
    }

    public final boolean d(long j11) {
        if (com.igexin.push.core.e.f38021aw == j11) {
            return false;
        }
        com.igexin.push.core.e.f38021aw = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.24
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                f.a();
                f.b(this.f37409d, 63, String.valueOf(com.igexin.push.core.e.f38021aw));
            }
        }, false, true);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i11, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i11));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace(com.igexin.push.core.b.Z, null, contentValues);
    }

    public static /* synthetic */ byte[] f(String str) {
        return g.a(str.getBytes());
    }

    private static byte[] g(String str) {
        return g.a(str.getBytes());
    }

    private boolean h(String str) {
        com.igexin.push.core.e.C = str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass31(), false, true);
    }

    private boolean i(String str) {
        if (str.equals(com.igexin.push.core.e.V)) {
            return false;
        }
        com.igexin.push.core.e.V = str;
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass3(), false, true);
        return true;
    }

    private boolean j(String str) {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass13(str), false, true);
    }

    public final boolean b() {
        com.igexin.push.core.e.f38049z = 0L;
        com.igexin.push.core.e.A = "null";
        d();
        return c();
    }

    public final boolean c(long j11) {
        if (com.igexin.push.core.e.Q == j11) {
            return false;
        }
        com.igexin.push.core.e.Q = j11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.15
            @Override // com.igexin.push.b.d
            public final void a_() {
                if (this.f37409d != null) {
                    f.a();
                    f.b(this.f37409d, 6, String.valueOf(com.igexin.push.core.e.Q));
                }
            }
        }, false, true);
    }

    public final boolean d(String str) {
        if (str.equals(com.igexin.push.core.e.Z)) {
            return false;
        }
        com.igexin.push.core.e.Z = str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.6
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 17, String.valueOf(com.igexin.push.core.e.Z));
            }
        }, false, true);
    }

    public final boolean e(final String str) {
        com.igexin.push.core.e.f38027d = str.equals("null") ? null : str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.22
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                f.a();
                f.a(this.f37409d, 61, g.a(str.getBytes()));
            }
        }, false, true);
    }

    public final void a(boolean z11) {
        com.igexin.push.core.e.W = z11;
        com.igexin.c.a.c.a.a(z11);
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.4
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 15, String.valueOf(com.igexin.push.core.e.W));
            }
        }, false, true);
    }

    public final boolean b(int i11) {
        if (com.igexin.push.core.e.aA == i11) {
            return false;
        }
        com.igexin.push.core.e.aA = i11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.16
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 47, String.valueOf(com.igexin.push.core.e.aA));
            }
        }, false, true);
    }

    public final boolean c(String str) {
        com.igexin.push.core.e.K = str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.33
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 48, com.igexin.push.core.e.K);
            }
        }, false, true);
    }

    public final boolean a(int i11) {
        com.igexin.push.core.e.f38000ab = i11;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.7
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 18, String.valueOf(com.igexin.push.core.e.f38000ab));
            }
        }, false, true);
    }

    public final boolean b(final long j11) {
        com.igexin.push.core.e.f38013ao = j11;
        com.igexin.c.a.c.a.a(f38080a + "|save idc config failed time : " + j11, new Object[0]);
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.2
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 21, String.valueOf(j11));
            }
        }, false, true);
    }

    public final boolean c(final String str, final boolean z11) {
        if (str == null) {
            return false;
        }
        String str2 = str.equals("null") ? null : str;
        if (z11 && !TextUtils.equals(com.igexin.push.core.e.f38019au, str)) {
            com.igexin.push.core.e.f38019au = str2;
        } else {
            if (z11 || TextUtils.equals(com.igexin.push.core.e.f38018at, str)) {
                return false;
            }
            com.igexin.push.core.e.f38018at = str2;
        }
        com.igexin.c.a.c.a.a(f38080a + "|saveLastRedirectCmList isMobile = " + z11 + ", lastRedirectCmList = " + str, new Object[0]);
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.19
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                f.a();
                f.a(this.f37409d, z11 ? 50 : 49, f.f(str));
            }
        }, false, true);
    }

    public final boolean a(long j11) {
        com.igexin.push.core.e.a(j11);
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.29
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.a(this.f37409d, 1, g.a(String.valueOf(com.igexin.push.core.e.f38049z).getBytes()));
                f.a();
                f.a(this.f37409d, 20, f.f(com.igexin.push.core.e.A));
                j.b();
            }
        }, false, true);
    }

    public final boolean b(String str) {
        com.igexin.push.core.e.I = str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.32
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 46, com.igexin.push.core.e.I);
            }
        }, false, true);
    }

    public final boolean a(String str) {
        com.igexin.push.core.e.H = str;
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.30
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 2, com.igexin.push.core.e.H);
                String d11 = j.d();
                if (d11 == null || d11.length() <= 5) {
                    j.f();
                }
            }
        }, false, true);
    }

    public final boolean b(final String str, boolean z11) {
        com.igexin.c.a.b.e a11;
        com.igexin.push.b.d dVar;
        if (str == null) {
            return false;
        }
        if (z11) {
            if (!str.equals(com.igexin.push.core.e.f38014ap)) {
                com.igexin.push.core.e.f38014ap = str.equals("null") ? null : str;
                a11 = com.igexin.c.a.b.e.a();
                dVar = new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.10
                    @Override // com.igexin.push.b.d
                    public final void a_() throws Exception {
                        f.a();
                        f.a(this.f37409d, 23, f.f(str));
                    }
                };
                return a11.a((com.igexin.c.a.d.f) dVar, false, true);
            }
            return false;
        }
        if (!str.equals(com.igexin.push.core.e.f38015aq)) {
            com.igexin.push.core.e.f38015aq = str.equals("null") ? null : str;
            a11 = com.igexin.c.a.b.e.a();
            dVar = new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.11
                @Override // com.igexin.push.b.d
                public final void a_() throws Exception {
                    f.a();
                    f.a(this.f37409d, 22, f.f(str));
                }
            };
            return a11.a((com.igexin.c.a.d.f) dVar, false, true);
        }
        return false;
    }

    private boolean a(String str, String str2) {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass20(str, str2), false, true);
    }

    public final boolean b(final boolean z11) {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.18
            @Override // com.igexin.push.b.d
            public final void a_() {
                f.a();
                f.b(this.f37409d, 40, String.valueOf(z11));
            }
        }, false, true);
    }

    private boolean a(String str, String str2, long j11) {
        com.igexin.push.core.e.f38049z = j11;
        if (TextUtils.isEmpty(com.igexin.push.core.e.H)) {
            com.igexin.push.core.e.H = str2;
        }
        com.igexin.push.core.e.A = str;
        return c();
    }

    public final boolean a(final String str, boolean z11) {
        com.igexin.c.a.b.e a11;
        com.igexin.push.b.d dVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (z11) {
            if (!str.equals(com.igexin.push.core.e.f38016ar)) {
                com.igexin.push.core.e.f38016ar = str.equals("null") ? null : str;
                a11 = com.igexin.c.a.b.e.a();
                dVar = new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.8
                    @Override // com.igexin.push.b.d
                    public final void a_() throws Exception {
                        f.a();
                        f.a(this.f37409d, 31, f.f(str));
                    }
                };
                return a11.a((com.igexin.c.a.d.f) dVar, false, true);
            }
            return false;
        }
        if (!str.equals(com.igexin.push.core.e.f38017as)) {
            com.igexin.push.core.e.f38017as = str.equals("null") ? null : str;
            a11 = com.igexin.c.a.b.e.a();
            dVar = new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.f.9
                @Override // com.igexin.push.b.d
                public final void a_() throws Exception {
                    f.a();
                    f.a(this.f37409d, 30, f.f(str));
                }
            };
            return a11.a((com.igexin.c.a.d.f) dVar, false, true);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r10 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r10 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(android.database.sqlite.SQLiteDatabase r10, int r11) {
        /*
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "runtime"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r2 = "id="
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r5 = r2.concat(r11)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r10 == 0) goto L3d
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            if (r11 == 0) goto L3d
            int r11 = r10.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            byte[] r11 = r10.getBlob(r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            java.lang.String r0 = com.igexin.push.core.e.M     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            byte[] r11 = com.igexin.c.a.a.a.a(r11, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r10.close()
            return r11
        L36:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L50
        L3a:
            r0 = move-exception
            r11 = r0
            goto L49
        L3d:
            if (r10 == 0) goto L4f
        L3f:
            r10.close()
            goto L4f
        L43:
            r0 = move-exception
            r11 = r0
            goto L50
        L46:
            r0 = move-exception
            r11 = r0
            r10 = r1
        L49:
            com.igexin.c.a.c.a.a(r11)     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L4f
            goto L3f
        L4f:
            return r1
        L50:
            if (r1 == 0) goto L55
            r1.close()
        L55:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.f.a(android.database.sqlite.SQLiteDatabase, int):byte[]");
    }
}
