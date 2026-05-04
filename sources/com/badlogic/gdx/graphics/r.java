package com.badlogic.gdx.graphics;

import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12491d;

    /* renamed from: e, reason: collision with root package name */
    public int f12492e;

    /* renamed from: f, reason: collision with root package name */
    public String f12493f;

    /* renamed from: g, reason: collision with root package name */
    public int f12494g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12495h;

    public r(int i11, int i12, String str) {
        this(i11, i12, str, 0);
    }

    public static r a() {
        return new r(256, 3, w.f74230z);
    }

    public static r b(int i11) {
        return new r(64, 2, w.A + i11, i11);
    }

    public static r c() {
        return new r(4, 4, f.f11673u1, true, w.f74227w);
    }

    public static r d() {
        return new r(2, 4, f.f11703z1, false, w.f74227w);
    }

    public static r e() {
        return new r(8, 3, w.f74226v);
    }

    public static r f() {
        return new r(1, 3, w.f74225u);
    }

    public static r g() {
        return new r(128, 3, w.f74229y);
    }

    public static r h(int i11) {
        return new r(16, 2, w.f74228x + i11, i11);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return j((r) obj);
        }
        return false;
    }

    public int hashCode() {
        return (((k() * 541) + this.f12489b) * 541) + this.f12493f.hashCode();
    }

    public r i() {
        return new r(this.f12488a, this.f12489b, this.f12491d, this.f12490c, this.f12493f, this.f12494g);
    }

    public boolean j(r rVar) {
        return rVar != null && this.f12488a == rVar.f12488a && this.f12489b == rVar.f12489b && this.f12491d == rVar.f12491d && this.f12490c == rVar.f12490c && this.f12493f.equals(rVar.f12493f) && this.f12494g == rVar.f12494g;
    }

    public int k() {
        return (this.f12495h << 8) + (this.f12494g & 255);
    }

    public int l() {
        int i11 = this.f12491d;
        if (i11 == 5126 || i11 == 5132) {
            return this.f12489b * 4;
        }
        switch (i11) {
            case f.f11667t1 /* 5120 */:
            case f.f11673u1 /* 5121 */:
                return this.f12489b;
            case f.f11679v1 /* 5122 */:
            case f.f11685w1 /* 5123 */:
                return this.f12489b * 2;
            default:
                return 0;
        }
    }

    public r(int i11, int i12, String str, int i13) {
        this(i11, i12, i11 == 4 ? f.f11673u1 : f.f11703z1, i11 == 4, str, i13);
    }

    public r(int i11, int i12, int i13, boolean z11, String str) {
        this(i11, i12, i13, z11, str, 0);
    }

    public r(int i11, int i12, int i13, boolean z11, String str, int i14) {
        this.f12488a = i11;
        this.f12489b = i12;
        this.f12491d = i13;
        this.f12490c = z11;
        this.f12493f = str;
        this.f12494g = i14;
        this.f12495h = Integer.numberOfTrailingZeros(i11);
    }
}
