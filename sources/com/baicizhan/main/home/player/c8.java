package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c8 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f23524e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f23525a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f23526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23527c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f23528d;

    public c8(@DrawableRes int i11, @m80.k String title, boolean z11, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        this.f23525a = i11;
        this.f23526b = title;
        this.f23527c = z11;
        this.f23528d = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c8 f(c8 c8Var, int i11, String str, boolean z11, x00.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c8Var.f23525a;
        }
        if ((i12 & 2) != 0) {
            str = c8Var.f23526b;
        }
        if ((i12 & 4) != 0) {
            z11 = c8Var.f23527c;
        }
        if ((i12 & 8) != 0) {
            aVar = c8Var.f23528d;
        }
        return c8Var.e(i11, str, z11, aVar);
    }

    public final int a() {
        return this.f23525a;
    }

    @m80.k
    public final String b() {
        return this.f23526b;
    }

    public final boolean c() {
        return this.f23527c;
    }

    @m80.k
    public final x00.a<yz.g2> d() {
        return this.f23528d;
    }

    @m80.k
    public final c8 e(@DrawableRes int i11, @m80.k String title, boolean z11, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        return new c8(i11, title, z11, onClick);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return this.f23525a == c8Var.f23525a && kotlin.jvm.internal.g0.g(this.f23526b, c8Var.f23526b) && this.f23527c == c8Var.f23527c && kotlin.jvm.internal.g0.g(this.f23528d, c8Var.f23528d);
    }

    public final boolean g() {
        return this.f23527c;
    }

    public final int h() {
        return this.f23525a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f23525a) * 31) + this.f23526b.hashCode()) * 31) + Boolean.hashCode(this.f23527c)) * 31) + this.f23528d.hashCode();
    }

    @m80.k
    public final x00.a<yz.g2> i() {
        return this.f23528d;
    }

    @m80.k
    public final String j() {
        return this.f23526b;
    }

    @m80.k
    public String toString() {
        return "Tool(icon=" + this.f23525a + ", title=" + this.f23526b + ", dot=" + this.f23527c + ", onClick=" + this.f23528d + pn.j.f81007d;
    }

    public /* synthetic */ c8(int i11, String str, boolean z11, x00.a aVar, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, str, (i12 & 4) != 0 ? false : z11, aVar);
    }
}
