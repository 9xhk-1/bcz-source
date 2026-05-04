package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f26043c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e0> f26044a;

    /* renamed from: b, reason: collision with root package name */
    public int f26045b;

    public f0(@m80.k List<e0> sentencePages, int i11) {
        kotlin.jvm.internal.g0.p(sentencePages, "sentencePages");
        this.f26044a = sentencePages;
        this.f26045b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f0 d(f0 f0Var, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = f0Var.f26044a;
        }
        if ((i12 & 2) != 0) {
            i11 = f0Var.f26045b;
        }
        return f0Var.c(list, i11);
    }

    @m80.k
    public final List<e0> a() {
        return this.f26044a;
    }

    public final int b() {
        return this.f26045b;
    }

    @m80.k
    public final f0 c(@m80.k List<e0> sentencePages, int i11) {
        kotlin.jvm.internal.g0.p(sentencePages, "sentencePages");
        return new f0(sentencePages, i11);
    }

    @m80.k
    public final List<e0> e() {
        return this.f26044a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.g0.g(this.f26044a, f0Var.f26044a) && this.f26045b == f0Var.f26045b;
    }

    public final int f() {
        return this.f26045b;
    }

    public final void g(int i11) {
        this.f26045b = i11;
    }

    public int hashCode() {
        return (this.f26044a.hashCode() * 31) + Integer.hashCode(this.f26045b);
    }

    @m80.k
    public String toString() {
        return "SentencePages(sentencePages=" + this.f26044a + ", showPage=" + this.f26045b + pn.j.f81007d;
    }

    public /* synthetic */ f0(List list, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(list, (i12 & 2) != 0 ? 0 : i11);
    }
}
