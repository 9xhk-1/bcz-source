package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26048d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<x> f26049a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<b0> f26050b;

    /* renamed from: c, reason: collision with root package name */
    public int f26051c;

    public h0(@m80.k List<x> exam, @m80.k List<b0> allMean, int i11) {
        kotlin.jvm.internal.g0.p(exam, "exam");
        kotlin.jvm.internal.g0.p(allMean, "allMean");
        this.f26049a = exam;
        this.f26050b = allMean;
        this.f26051c = i11;
        List<x> list = exam;
        if (list == null || list.isEmpty()) {
            this.f26051c = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h0 e(h0 h0Var, List list, List list2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = h0Var.f26049a;
        }
        if ((i12 & 2) != 0) {
            list2 = h0Var.f26050b;
        }
        if ((i12 & 4) != 0) {
            i11 = h0Var.f26051c;
        }
        return h0Var.d(list, list2, i11);
    }

    @m80.k
    public final List<x> a() {
        return this.f26049a;
    }

    @m80.k
    public final List<b0> b() {
        return this.f26050b;
    }

    public final int c() {
        return this.f26051c;
    }

    @m80.k
    public final h0 d(@m80.k List<x> exam, @m80.k List<b0> allMean, int i11) {
        kotlin.jvm.internal.g0.p(exam, "exam");
        kotlin.jvm.internal.g0.p(allMean, "allMean");
        return new h0(exam, allMean, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.g0.g(this.f26049a, h0Var.f26049a) && kotlin.jvm.internal.g0.g(this.f26050b, h0Var.f26050b) && this.f26051c == h0Var.f26051c;
    }

    @m80.k
    public final List<b0> f() {
        return this.f26050b;
    }

    @m80.k
    public final List<x> g() {
        return this.f26049a;
    }

    public final int h() {
        return this.f26051c;
    }

    public int hashCode() {
        return (((this.f26049a.hashCode() * 31) + this.f26050b.hashCode()) * 31) + Integer.hashCode(this.f26051c);
    }

    public final void i(int i11) {
        this.f26051c = i11;
    }

    @m80.k
    public String toString() {
        return "SplitMeans(exam=" + this.f26049a + ", allMean=" + this.f26050b + ", showType=" + this.f26051c + pn.j.f81007d;
    }

    public /* synthetic */ h0(List list, List list2, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(list, list2, (i12 & 4) != 0 ? 0 : i11);
    }
}
