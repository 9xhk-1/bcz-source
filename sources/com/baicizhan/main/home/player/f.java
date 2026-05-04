package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23584f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f23586a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f23587b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f23588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23589d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f23583e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final f f23585g = new f(0, "", "", 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f a() {
            return f.f23585g;
        }

        public a() {
        }
    }

    public f(int i11, @m80.k String name, @m80.k String cover, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        this.f23586a = i11;
        this.f23587b = name;
        this.f23588c = cover;
        this.f23589d = i12;
    }

    public static /* synthetic */ f g(f fVar, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f23586a;
        }
        if ((i13 & 2) != 0) {
            str = fVar.f23587b;
        }
        if ((i13 & 4) != 0) {
            str2 = fVar.f23588c;
        }
        if ((i13 & 8) != 0) {
            i12 = fVar.f23589d;
        }
        return fVar.f(i11, str, str2, i12);
    }

    public final int b() {
        return this.f23586a;
    }

    @m80.k
    public final String c() {
        return this.f23587b;
    }

    @m80.k
    public final String d() {
        return this.f23588c;
    }

    public final int e() {
        return this.f23589d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23586a == fVar.f23586a && kotlin.jvm.internal.g0.g(this.f23587b, fVar.f23587b) && kotlin.jvm.internal.g0.g(this.f23588c, fVar.f23588c) && this.f23589d == fVar.f23589d;
    }

    @m80.k
    public final f f(int i11, @m80.k String name, @m80.k String cover, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        return new f(i11, name, cover, i12);
    }

    @m80.k
    public final String h() {
        return this.f23588c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f23586a) * 31) + this.f23587b.hashCode()) * 31) + this.f23588c.hashCode()) * 31) + Integer.hashCode(this.f23589d);
    }

    public final int i() {
        return this.f23586a;
    }

    @m80.k
    public final String j() {
        return this.f23587b;
    }

    public final int k() {
        return this.f23589d;
    }

    @m80.k
    public String toString() {
        return "BookInfo(id=" + this.f23586a + ", name=" + this.f23587b + ", cover=" + this.f23588c + ", wordsCount=" + this.f23589d + pn.j.f81007d;
    }
}
