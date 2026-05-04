package com.igexin.push.config;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes7.dex */
public class a implements com.igexin.push.core.e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37501a = "com.igexin.push.config.a";

    /* renamed from: b, reason: collision with root package name */
    public static final int f37502b = 63;

    /* renamed from: c, reason: collision with root package name */
    public static final int f37503c = 65;

    /* renamed from: d, reason: collision with root package name */
    public static final int f37504d = 67;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37505e = 68;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37506f = 79;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37507g = 82;

    /* renamed from: h, reason: collision with root package name */
    private static final int f37508h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f37509i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f37510j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f37511k = 15;

    /* renamed from: l, reason: collision with root package name */
    private static final int f37512l = 16;

    /* renamed from: m, reason: collision with root package name */
    private static final int f37513m = 24;

    /* renamed from: n, reason: collision with root package name */
    private static final int f37514n = 26;

    /* renamed from: o, reason: collision with root package name */
    private static final int f37515o = 28;

    /* renamed from: p, reason: collision with root package name */
    private static final int f37516p = 46;

    /* renamed from: q, reason: collision with root package name */
    private static final int f37517q = 47;

    /* renamed from: r, reason: collision with root package name */
    private static final int f37518r = 48;

    /* renamed from: s, reason: collision with root package name */
    private static final int f37519s = 49;

    /* renamed from: t, reason: collision with root package name */
    private static final int f37520t = 60;

    /* renamed from: u, reason: collision with root package name */
    private static final int f37521u = 61;

    /* renamed from: v, reason: collision with root package name */
    private static final int f37522v = 62;

    /* renamed from: w, reason: collision with root package name */
    private static final int f37523w = 69;

    /* renamed from: x, reason: collision with root package name */
    private static final int f37524x = 70;

    /* renamed from: y, reason: collision with root package name */
    private static final int f37525y = 74;

    /* renamed from: z, reason: collision with root package name */
    private static volatile a f37526z;

    /* renamed from: com.igexin.push.config.a$1, reason: invalid class name */
    public class AnonymousClass1 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37527a;

        public AnonymousClass1(String str) {
            this.f37527a = str;
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.b(this.f37409d, 63, this.f37527a);
        }
    }

    /* renamed from: com.igexin.push.config.a$3, reason: invalid class name */
    public class AnonymousClass3 extends com.igexin.push.b.d {
        public AnonymousClass3() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.b(this.f37409d, 15, String.valueOf(d.f37585e));
        }
    }

    /* renamed from: com.igexin.push.config.a$4, reason: invalid class name */
    public class AnonymousClass4 extends com.igexin.push.b.d {
        public AnonymousClass4() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.b(this.f37409d, 16, String.valueOf(d.f37586f));
        }
    }

    /* renamed from: com.igexin.push.config.a$5, reason: invalid class name */
    public class AnonymousClass5 extends com.igexin.push.b.d {
        public AnonymousClass5() {
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.b(this.f37409d, 3, String.valueOf(d.f37584d));
        }
    }

    /* renamed from: com.igexin.push.config.a$6, reason: invalid class name */
    public class AnonymousClass6 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37533a;

        public AnonymousClass6(String str) {
            this.f37533a = str;
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.a(this.f37409d, 26, com.igexin.c.a.a.a.b(this.f37533a.getBytes(), com.igexin.push.core.e.M));
        }
    }

    /* renamed from: com.igexin.push.config.a$7, reason: invalid class name */
    public class AnonymousClass7 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37535a;

        public AnonymousClass7(String str) {
            this.f37535a = str;
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.a(this.f37409d, 24, com.igexin.c.a.a.a.b(this.f37535a.getBytes(), com.igexin.push.core.e.M));
        }
    }

    /* renamed from: com.igexin.push.config.a$9, reason: invalid class name */
    public class AnonymousClass9 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37539a;

        public AnonymousClass9(boolean z11) {
            this.f37539a = z11;
        }

        @Override // com.igexin.push.b.d
        public final void a_() {
            a.b(this.f37409d, 79, String.valueOf(this.f37539a));
        }
    }

    private a() {
    }

    public static a a() {
        if (f37526z == null) {
            synchronized (a.class) {
                try {
                    if (f37526z == null) {
                        f37526z = new a();
                    }
                } finally {
                }
            }
        }
        return f37526z;
    }

    private void c() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass3(), false, true);
    }

    private void d() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass4(), false, true);
    }

    private void e() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass5(), false, true);
    }

    public final void b() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.config.a.2
            @Override // com.igexin.push.b.d
            public final void a_() {
                a.b(this.f37409d, 1, String.valueOf(d.f37582b));
                a.b(this.f37409d, 2, String.valueOf(d.f37583c));
            }
        }, false, true);
    }

    private void a(final long j11) {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.config.a.8
            @Override // com.igexin.push.b.d
            public final void a_() {
                long j12 = j11;
                com.igexin.push.core.e.aH = j12;
                a.b(this.f37409d, 65, String.valueOf(j12));
            }
        }, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x020c  */
    @Override // com.igexin.push.core.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.database.sqlite.SQLiteDatabase r13) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.config.a.b(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase, 1, String.valueOf(d.f37582b));
        b(sQLiteDatabase, 2, String.valueOf(d.f37583c));
        b(sQLiteDatabase, 3, String.valueOf(d.f37584d));
        b(sQLiteDatabase, 15, String.valueOf(d.f37585e));
        b(sQLiteDatabase, 3, String.valueOf(d.f37584d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(SQLiteDatabase sQLiteDatabase, int i11, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i11));
        contentValues.put("value", str);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    private void c(String str) {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass7(str), true, false);
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    private static void a(SQLiteDatabase sQLiteDatabase, int i11) {
        sQLiteDatabase.delete("config", "id = ?", new String[]{String.valueOf(i11)});
    }

    private static void b(SQLiteDatabase sQLiteDatabase, int i11, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i11));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    private void b(String str) {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass6(str), true, false);
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase, int i11, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i11));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    private void a(boolean z11) {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass9(z11), true, false);
    }

    private boolean a(String str) {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(str), false, true);
    }
}
