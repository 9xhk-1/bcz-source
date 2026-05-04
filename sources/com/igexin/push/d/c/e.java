package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38446a = 1944742139;

    /* renamed from: b, reason: collision with root package name */
    public int f38447b;

    /* renamed from: c, reason: collision with root package name */
    public int f38448c;

    /* renamed from: d, reason: collision with root package name */
    public int f38449d;

    /* renamed from: e, reason: collision with root package name */
    public int f38450e;

    /* renamed from: f, reason: collision with root package name */
    public int f38451f;

    /* renamed from: g, reason: collision with root package name */
    public int f38452g;

    /* renamed from: h, reason: collision with root package name */
    public byte f38453h;

    /* renamed from: i, reason: collision with root package name */
    public byte f38454i;

    /* renamed from: j, reason: collision with root package name */
    public byte f38455j;

    /* renamed from: k, reason: collision with root package name */
    public byte f38456k;

    /* renamed from: l, reason: collision with root package name */
    public byte f38457l;

    /* renamed from: m, reason: collision with root package name */
    public byte f38458m;

    /* renamed from: n, reason: collision with root package name */
    public byte f38459n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f38460o;

    /* renamed from: p, reason: collision with root package name */
    public int f38461p;

    /* renamed from: q, reason: collision with root package name */
    public int f38462q;

    /* renamed from: r, reason: collision with root package name */
    public int f38463r;

    private int a() {
        int i11 = this.f38450e | this.f38453h | this.f38454i | this.f38455j;
        this.f38450e = i11;
        return i11;
    }

    private int b() {
        int i11 = this.f38452g | this.f38456k | this.f38457l | this.f38458m | this.f38459n;
        this.f38452g = i11;
        return i11;
    }

    private void b(byte b11) {
        this.f38452g = b11 & 255;
        this.f38456k = (byte) (b11 & 3);
        this.f38457l = (byte) (b11 & 4);
        this.f38458m = (byte) (b11 & 8);
        this.f38459n = (byte) (b11 & 16);
    }

    public final void a(byte b11) {
        this.f38450e = b11 & 255;
        this.f38453h = (byte) (b11 & com.baicizhan.main.vld.bonding.j.f25378c);
        this.f38454i = (byte) (b11 & 48);
        this.f38455j = (byte) (b11 & 15);
    }
}
