package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public abstract class c extends com.igexin.c.a.d.b {

    /* renamed from: p, reason: collision with root package name */
    public static final int f38429p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f38430q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f38431r = 25;

    /* renamed from: s, reason: collision with root package name */
    public static final int f38432s = 26;

    /* renamed from: t, reason: collision with root package name */
    public static final int f38433t = 27;

    /* renamed from: u, reason: collision with root package name */
    public static final int f38434u = 16;

    /* renamed from: v, reason: collision with root package name */
    public static final int f38435v = 17;

    /* renamed from: w, reason: collision with root package name */
    public static final int f38436w = 33;

    /* renamed from: x, reason: collision with root package name */
    public static final int f38437x = 192;

    /* renamed from: m, reason: collision with root package name */
    public int f38438m;

    /* renamed from: n, reason: collision with root package name */
    public byte f38439n;

    /* renamed from: o, reason: collision with root package name */
    public byte f38440o = 11;

    public static int a(String str) {
        if (str.equals("UTF-8")) {
            return 1;
        }
        if (str.equals("UTF-16")) {
            return 2;
        }
        if (str.equals(n60.c.f74536d)) {
            return 16;
        }
        if (str.equals(n60.c.f74537e)) {
            return 17;
        }
        if (str.equals("GBK")) {
            return 25;
        }
        if (str.equals(kp.k.f68582c)) {
            return 26;
        }
        if (str.equals("GB18030")) {
            return 27;
        }
        return str.equals("ISO-8859-1") ? 33 : 1;
    }

    public abstract void a(byte[] bArr);

    public abstract byte[] b();

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return this.f38438m;
    }

    public static String a(byte b11) {
        int i11 = b11 & 63;
        if (i11 == 1) {
            return "UTF-8";
        }
        if (i11 == 2) {
            return "UTF-16";
        }
        if (i11 == 16) {
            return n60.c.f74536d;
        }
        if (i11 == 17) {
            return n60.c.f74537e;
        }
        if (i11 == 33) {
            return "ISO-8859-1";
        }
        switch (i11) {
        }
        return "UTF-8";
    }

    @Override // com.igexin.c.a.d.a.a
    public void a() {
    }
}
