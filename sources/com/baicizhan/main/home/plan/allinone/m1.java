package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22262d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f22263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22264b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f22265c;

    public m1(int i11, int i12, @m80.k a action) {
        kotlin.jvm.internal.g0.p(action, "action");
        this.f22263a = i11;
        this.f22264b = i12;
        this.f22265c = action;
    }

    public static /* synthetic */ m1 e(m1 m1Var, int i11, int i12, a aVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = m1Var.f22263a;
        }
        if ((i13 & 2) != 0) {
            i12 = m1Var.f22264b;
        }
        if ((i13 & 4) != 0) {
            aVar = m1Var.f22265c;
        }
        return m1Var.d(i11, i12, aVar);
    }

    public final int a() {
        return this.f22263a;
    }

    public final int b() {
        return this.f22264b;
    }

    @m80.k
    public final a c() {
        return this.f22265c;
    }

    @m80.k
    public final m1 d(int i11, int i12, @m80.k a action) {
        kotlin.jvm.internal.g0.p(action, "action");
        return new m1(i11, i12, action);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f22263a == m1Var.f22263a && this.f22264b == m1Var.f22264b && kotlin.jvm.internal.g0.g(this.f22265c, m1Var.f22265c);
    }

    @m80.k
    public final a f() {
        return this.f22265c;
    }

    public final int g() {
        return this.f22264b;
    }

    public final int h() {
        return this.f22263a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22263a) * 31) + Integer.hashCode(this.f22264b)) * 31) + this.f22265c.hashCode();
    }

    @m80.k
    public String toString() {
        return "StudyModel(numerator=" + this.f22263a + ", denominator=" + this.f22264b + ", action=" + this.f22265c + pn.j.f81007d;
    }
}
