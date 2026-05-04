package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class s6 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f23997d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f23998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23999b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final t6 f24000c;

    public s6(@m80.k String title, @DrawableRes int i11, @m80.l t6 t6Var) {
        kotlin.jvm.internal.g0.p(title, "title");
        this.f23998a = title;
        this.f23999b = i11;
        this.f24000c = t6Var;
    }

    public static /* synthetic */ s6 e(s6 s6Var, String str, int i11, t6 t6Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = s6Var.f23998a;
        }
        if ((i12 & 2) != 0) {
            i11 = s6Var.f23999b;
        }
        if ((i12 & 4) != 0) {
            t6Var = s6Var.f24000c;
        }
        return s6Var.d(str, i11, t6Var);
    }

    @m80.k
    public final String a() {
        return this.f23998a;
    }

    public final int b() {
        return this.f23999b;
    }

    @m80.l
    public final t6 c() {
        return this.f24000c;
    }

    @m80.k
    public final s6 d(@m80.k String title, @DrawableRes int i11, @m80.l t6 t6Var) {
        kotlin.jvm.internal.g0.p(title, "title");
        return new s6(title, i11, t6Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return kotlin.jvm.internal.g0.g(this.f23998a, s6Var.f23998a) && this.f23999b == s6Var.f23999b && kotlin.jvm.internal.g0.g(this.f24000c, s6Var.f24000c);
    }

    public final int f() {
        return this.f23999b;
    }

    @m80.l
    public final t6 g() {
        return this.f24000c;
    }

    @m80.k
    public final String h() {
        return this.f23998a;
    }

    public int hashCode() {
        int hashCode = ((this.f23998a.hashCode() * 31) + Integer.hashCode(this.f23999b)) * 31;
        t6 t6Var = this.f24000c;
        return hashCode + (t6Var == null ? 0 : t6Var.hashCode());
    }

    @m80.k
    public String toString() {
        return "LayerItem(title=" + this.f23998a + ", icon=" + this.f23999b + ", label=" + this.f24000c + pn.j.f81007d;
    }

    public /* synthetic */ s6(String str, int i11, t6 t6Var, int i12, kotlin.jvm.internal.v vVar) {
        this(str, i11, (i12 & 4) != 0 ? null : t6Var);
    }
}
