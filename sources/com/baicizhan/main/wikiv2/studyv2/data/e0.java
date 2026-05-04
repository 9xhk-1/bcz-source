package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26038d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f26039a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26040b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<d0> f26041c;

    public e0(@m80.k String meanType, @m80.k String mean, @m80.k List<d0> sentences) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(sentences, "sentences");
        this.f26039a = meanType;
        this.f26040b = mean;
        this.f26041c = sentences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 e(e0 e0Var, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e0Var.f26039a;
        }
        if ((i11 & 2) != 0) {
            str2 = e0Var.f26040b;
        }
        if ((i11 & 4) != 0) {
            list = e0Var.f26041c;
        }
        return e0Var.d(str, str2, list);
    }

    @m80.k
    public final String a() {
        return this.f26039a;
    }

    @m80.k
    public final String b() {
        return this.f26040b;
    }

    @m80.k
    public final List<d0> c() {
        return this.f26041c;
    }

    @m80.k
    public final e0 d(@m80.k String meanType, @m80.k String mean, @m80.k List<d0> sentences) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(sentences, "sentences");
        return new e0(meanType, mean, sentences);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.g0.g(this.f26039a, e0Var.f26039a) && kotlin.jvm.internal.g0.g(this.f26040b, e0Var.f26040b) && kotlin.jvm.internal.g0.g(this.f26041c, e0Var.f26041c);
    }

    @m80.k
    public final String f() {
        return this.f26040b;
    }

    @m80.k
    public final String g() {
        return this.f26039a;
    }

    @m80.k
    public final List<d0> h() {
        return this.f26041c;
    }

    public int hashCode() {
        return (((this.f26039a.hashCode() * 31) + this.f26040b.hashCode()) * 31) + this.f26041c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentencePage(meanType=" + this.f26039a + ", mean=" + this.f26040b + ", sentences=" + this.f26041c + pn.j.f81007d;
    }
}
