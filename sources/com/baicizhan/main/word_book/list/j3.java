package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class j3 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f27234c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f27235a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f27236b;

    public j3(int i11, @m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f27235a = i11;
        this.f27236b = name;
    }

    public static /* synthetic */ j3 d(j3 j3Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = j3Var.f27235a;
        }
        if ((i12 & 2) != 0) {
            str = j3Var.f27236b;
        }
        return j3Var.c(i11, str);
    }

    public final int a() {
        return this.f27235a;
    }

    @m80.k
    public final String b() {
        return this.f27236b;
    }

    @m80.k
    public final j3 c(int i11, @m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new j3(i11, name);
    }

    public final int e() {
        return this.f27235a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f27235a == j3Var.f27235a && kotlin.jvm.internal.g0.g(this.f27236b, j3Var.f27236b);
    }

    @m80.k
    public final String f() {
        return this.f27236b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27235a) * 31) + this.f27236b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordBookTag(id=" + this.f27235a + ", name=" + this.f27236b + pn.j.f81007d;
    }
}
