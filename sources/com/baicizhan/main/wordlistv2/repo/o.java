package com.baicizhan.main.wordlistv2.repo;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f27980d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f27981a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27982b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27983c;

    public o() {
        this(0, false, 0, 7, null);
    }

    public static /* synthetic */ o e(o oVar, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = oVar.f27981a;
        }
        if ((i13 & 2) != 0) {
            z11 = oVar.f27982b;
        }
        if ((i13 & 4) != 0) {
            i12 = oVar.f27983c;
        }
        return oVar.d(i11, z11, i12);
    }

    public final int a() {
        return this.f27981a;
    }

    public final boolean b() {
        return this.f27982b;
    }

    public final int c() {
        return this.f27983c;
    }

    @m80.k
    public final o d(int i11, boolean z11, int i12) {
        return new o(i11, z11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f27981a == oVar.f27981a && this.f27982b == oVar.f27982b && this.f27983c == oVar.f27983c;
    }

    public final boolean f() {
        return this.f27982b;
    }

    public final int g() {
        return this.f27983c;
    }

    public final int h() {
        return this.f27981a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f27981a) * 31) + Boolean.hashCode(this.f27982b)) * 31) + Integer.hashCode(this.f27983c);
    }

    @m80.k
    public String toString() {
        return "WordListExtraData(wordCounts=" + this.f27981a + ", hideMean=" + this.f27982b + ", showTypeIndex=" + this.f27983c + pn.j.f81007d;
    }

    public o(int i11, boolean z11, int i12) {
        this.f27981a = i11;
        this.f27982b = z11;
        this.f27983c = i12;
    }

    public /* synthetic */ o(int i11, boolean z11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? 0 : i12);
    }
}
