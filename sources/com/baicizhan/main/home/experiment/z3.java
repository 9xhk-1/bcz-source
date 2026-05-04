package com.baicizhan.main.home.experiment;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class z3 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21776e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21780c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f21775d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final z3 f21777f = new z3(0, 0, 0, 6, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final z3 a() {
            return z3.f21777f;
        }

        public a() {
        }
    }

    public z3(@DrawableRes int i11, @DrawableRes int i12, @DrawableRes int i13) {
        this.f21778a = i11;
        this.f21779b = i12;
        this.f21780c = i13;
    }

    public static /* synthetic */ z3 f(z3 z3Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = z3Var.f21778a;
        }
        if ((i14 & 2) != 0) {
            i12 = z3Var.f21779b;
        }
        if ((i14 & 4) != 0) {
            i13 = z3Var.f21780c;
        }
        return z3Var.e(i11, i12, i13);
    }

    public final int b() {
        return this.f21778a;
    }

    public final int c() {
        return this.f21779b;
    }

    public final int d() {
        return this.f21780c;
    }

    @m80.k
    public final z3 e(@DrawableRes int i11, @DrawableRes int i12, @DrawableRes int i13) {
        return new z3(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.f21778a == z3Var.f21778a && this.f21779b == z3Var.f21779b && this.f21780c == z3Var.f21780c;
    }

    public final int g() {
        return this.f21778a;
    }

    public final int h() {
        return this.f21780c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f21778a) * 31) + Integer.hashCode(this.f21779b)) * 31) + Integer.hashCode(this.f21780c);
    }

    public final int i() {
        return this.f21779b;
    }

    @m80.k
    public String toString() {
        return "StatedImage(normal=" + this.f21778a + ", selected=" + this.f21779b + ", pressed=" + this.f21780c + pn.j.f81007d;
    }

    public /* synthetic */ z3(int i11, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
