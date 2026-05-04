package h5;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58367b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f58368c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<k0> f58369d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<Integer> f58370e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58371f;

    public l0(int i11, int i12, @m80.k String unitName, @m80.k List<k0> lessons, @m80.k List<Integer> finishLessons, boolean z11) {
        kotlin.jvm.internal.g0.p(unitName, "unitName");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(finishLessons, "finishLessons");
        this.f58366a = i11;
        this.f58367b = i12;
        this.f58368c = unitName;
        this.f58369d = lessons;
        this.f58370e = finishLessons;
        this.f58371f = z11;
    }

    public static /* synthetic */ l0 h(l0 l0Var, int i11, int i12, String str, List list, List list2, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = l0Var.f58366a;
        }
        if ((i13 & 2) != 0) {
            i12 = l0Var.f58367b;
        }
        if ((i13 & 4) != 0) {
            str = l0Var.f58368c;
        }
        if ((i13 & 8) != 0) {
            list = l0Var.f58369d;
        }
        if ((i13 & 16) != 0) {
            list2 = l0Var.f58370e;
        }
        if ((i13 & 32) != 0) {
            z11 = l0Var.f58371f;
        }
        List list3 = list2;
        boolean z12 = z11;
        return l0Var.g(i11, i12, str, list, list3, z12);
    }

    public final int a() {
        return this.f58366a;
    }

    public final int b() {
        return this.f58367b;
    }

    @m80.k
    public final String c() {
        return this.f58368c;
    }

    @m80.k
    public final List<k0> d() {
        return this.f58369d;
    }

    @m80.k
    public final List<Integer> e() {
        return this.f58370e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f58366a == l0Var.f58366a && this.f58367b == l0Var.f58367b && kotlin.jvm.internal.g0.g(this.f58368c, l0Var.f58368c) && kotlin.jvm.internal.g0.g(this.f58369d, l0Var.f58369d) && kotlin.jvm.internal.g0.g(this.f58370e, l0Var.f58370e) && this.f58371f == l0Var.f58371f;
    }

    public final boolean f() {
        return this.f58371f;
    }

    @m80.k
    public final l0 g(int i11, int i12, @m80.k String unitName, @m80.k List<k0> lessons, @m80.k List<Integer> finishLessons, boolean z11) {
        kotlin.jvm.internal.g0.p(unitName, "unitName");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(finishLessons, "finishLessons");
        return new l0(i11, i12, unitName, lessons, finishLessons, z11);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f58366a) * 31) + Integer.hashCode(this.f58367b)) * 31) + this.f58368c.hashCode()) * 31) + this.f58369d.hashCode()) * 31) + this.f58370e.hashCode()) * 31) + Boolean.hashCode(this.f58371f);
    }

    @m80.k
    public final List<Integer> i() {
        return this.f58370e;
    }

    public final boolean j() {
        return this.f58371f;
    }

    @m80.k
    public final List<k0> k() {
        return this.f58369d;
    }

    public final int l() {
        return this.f58366a;
    }

    @m80.k
    public final String m() {
        return this.f58368c;
    }

    public final int n() {
        return this.f58367b;
    }

    @m80.k
    public String toString() {
        return "SentenceUnit(unitId=" + this.f58366a + ", unitNo=" + this.f58367b + ", unitName=" + this.f58368c + ", lessons=" + this.f58369d + ", finishLessons=" + this.f58370e + ", hasLocked=" + this.f58371f + ')';
    }
}
