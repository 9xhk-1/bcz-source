package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26019d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f26020a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26021b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Pair<Integer, Integer> f26022c;

    public b0(@m80.k String meanType, @m80.k String mean, @m80.l Pair<Integer, Integer> pair) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        this.f26020a = meanType;
        this.f26021b = mean;
        this.f26022c = pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 e(b0 b0Var, String str, String str2, Pair pair, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b0Var.f26020a;
        }
        if ((i11 & 2) != 0) {
            str2 = b0Var.f26021b;
        }
        if ((i11 & 4) != 0) {
            pair = b0Var.f26022c;
        }
        return b0Var.d(str, str2, pair);
    }

    @m80.k
    public final String a() {
        return this.f26020a;
    }

    @m80.k
    public final String b() {
        return this.f26021b;
    }

    @m80.l
    public final Pair<Integer, Integer> c() {
        return this.f26022c;
    }

    @m80.k
    public final b0 d(@m80.k String meanType, @m80.k String mean, @m80.l Pair<Integer, Integer> pair) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        return new b0(meanType, mean, pair);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.g0.g(this.f26020a, b0Var.f26020a) && kotlin.jvm.internal.g0.g(this.f26021b, b0Var.f26021b) && kotlin.jvm.internal.g0.g(this.f26022c, b0Var.f26022c);
    }

    @m80.l
    public final Pair<Integer, Integer> f() {
        return this.f26022c;
    }

    @m80.k
    public final String g() {
        return this.f26021b;
    }

    @m80.k
    public final String h() {
        return this.f26020a;
    }

    public int hashCode() {
        int hashCode = ((this.f26020a.hashCode() * 31) + this.f26021b.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.f26022c;
        return hashCode + (pair == null ? 0 : pair.hashCode());
    }

    @m80.k
    public String toString() {
        return "NormalMean(meanType=" + this.f26020a + ", mean=" + this.f26021b + ", bold=" + this.f26022c + pn.j.f81007d;
    }
}
