package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* loaded from: classes8.dex */
public abstract class u implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f48668a;

    public final boolean e(@m80.k p10.d first, @m80.k p10.d second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        if (!kotlin.jvm.internal.g0.g(first.getName(), second.getName())) {
            return false;
        }
        p10.h b11 = first.b();
        for (p10.h b12 = second.b(); b11 != null && b12 != null; b12 = b12.b()) {
            if (b11 instanceof p10.a0) {
                return b12 instanceof p10.a0;
            }
            if (b12 instanceof p10.a0) {
                return false;
            }
            if (b11 instanceof p10.g0) {
                return (b12 instanceof p10.g0) && kotlin.jvm.internal.g0.g(((p10.g0) b11).d(), ((p10.g0) b12).d());
            }
            if ((b12 instanceof p10.g0) || !kotlin.jvm.internal.g0.g(b11.getName(), b12.getName())) {
                return false;
            }
            b11 = b11.b();
        }
        return true;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1) || obj.hashCode() != hashCode()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (u1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        p10.d r11 = r();
        p10.d r12 = u1Var.r();
        if (r12 != null && f(r11) && f(r12)) {
            return g(r12);
        }
        return false;
    }

    public final boolean f(p10.d dVar) {
        return (g30.i.m(dVar) || q20.h.E(dVar)) ? false : true;
    }

    public abstract boolean g(@m80.k p10.d dVar);

    public int hashCode() {
        int i11 = this.f48668a;
        if (i11 != 0) {
            return i11;
        }
        p10.d r11 = r();
        int hashCode = f(r11) ? q20.h.m(r11).hashCode() : System.identityHashCode(this);
        this.f48668a = hashCode;
        return hashCode;
    }

    @Override // e30.u1
    @m80.k
    public abstract p10.d r();
}
