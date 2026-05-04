package e30;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final f2 f48583b = g(d2.f48570b);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f48584c = false;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d2 f48585a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements x00.l<n20.c, Boolean> {
        private static /* synthetic */ void a(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // x00.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@m80.k n20.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(o.a.Q));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48586a;

        static {
            int[] iArr = new int[d.values().length];
            f48586a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48586a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48586a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public f2(@m80.k d2 d2Var) {
        if (d2Var == null) {
            a(7);
        }
        this.f48585a = d2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e30.f2.a(int):void");
    }

    public static void b(int i11, a2 a2Var, d2 d2Var) {
        if (i11 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(a2Var) + "; substitution: " + o(d2Var));
    }

    @m80.k
    public static Variance c(@m80.k Variance variance, @m80.k a2 a2Var) {
        if (variance == null) {
            a(35);
        }
        if (a2Var == null) {
            a(36);
        }
        if (!a2Var.a()) {
            return d(variance, a2Var.b());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            a(37);
        }
        return variance2;
    }

    @m80.k
    public static Variance d(@m80.k Variance variance, @m80.k Variance variance2) {
        if (variance == null) {
            a(38);
        }
        if (variance2 == null) {
            a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    public static d e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    @m80.k
    public static f2 f(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(6);
        }
        return g(v1.i(r0Var.I0(), r0Var.G0()));
    }

    @m80.k
    public static f2 g(@m80.k d2 d2Var) {
        if (d2Var == null) {
            a(0);
        }
        return new f2(d2Var);
    }

    @m80.k
    public static f2 h(@m80.k d2 d2Var, @m80.k d2 d2Var2) {
        if (d2Var == null) {
            a(3);
        }
        if (d2Var2 == null) {
            a(4);
        }
        return g(c0.i(d2Var, d2Var2));
    }

    @m80.k
    public static q10.g i(@m80.k q10.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.a0(o.a.Q) ? gVar : new q10.o(gVar, new a());
    }

    @m80.k
    public static a2 l(@m80.k r0 r0Var, @m80.k a2 a2Var, @m80.l p10.c1 c1Var, @m80.k a2 a2Var2) {
        if (r0Var == null) {
            a(26);
        }
        if (a2Var == null) {
            a(27);
        }
        if (a2Var2 == null) {
            a(28);
        }
        if (!r0Var.getAnnotations().a0(o.a.Q)) {
            if (a2Var == null) {
                a(29);
            }
            return a2Var;
        }
        u1 I0 = a2Var.getType().I0();
        if (!(I0 instanceof f30.n)) {
            return a2Var;
        }
        a2 b11 = ((f30.n) I0).b();
        Variance b12 = b11.b();
        d e11 = e(a2Var2.b(), b12);
        d dVar = d.OUT_IN_IN_POSITION;
        return e11 == dVar ? new c2(b11.getType()) : (c1Var != null && e(c1Var.j(), b12) == dVar) ? new c2(b11.getType()) : a2Var;
    }

    public static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (o30.d.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    @m80.k
    public d2 j() {
        d2 d2Var = this.f48585a;
        if (d2Var == null) {
            a(8);
        }
        return d2Var;
    }

    public boolean k() {
        return this.f48585a.f();
    }

    @m80.k
    public f2 m() {
        d2 d2Var = this.f48585a;
        return ((d2Var instanceof m0) && d2Var.b()) ? new f2(new m0(((m0) this.f48585a).j(), ((m0) this.f48585a).i(), false)) : this;
    }

    @m80.k
    public r0 n(@m80.k r0 r0Var, @m80.k Variance variance) {
        if (r0Var == null) {
            a(9);
        }
        if (variance == null) {
            a(10);
        }
        if (k()) {
            if (r0Var == null) {
                a(11);
            }
            return r0Var;
        }
        try {
            r0 type = u(new c2(variance, r0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e11) {
            g30.g d11 = g30.i.d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e11.getMessage());
            if (d11 == null) {
                a(13);
            }
            return d11;
        }
    }

    @m80.l
    public r0 p(@m80.k r0 r0Var, @m80.k Variance variance) {
        if (r0Var == null) {
            a(14);
        }
        if (variance == null) {
            a(15);
        }
        a2 q11 = q(new c2(variance, j().g(r0Var, variance)));
        if (q11 == null) {
            return null;
        }
        return q11.getType();
    }

    @m80.l
    public a2 q(@m80.k a2 a2Var) {
        if (a2Var == null) {
            a(16);
        }
        a2 t11 = t(a2Var);
        return (this.f48585a.a() || this.f48585a.b()) ? k30.d.e(t11, this.f48585a.b()) : t11;
    }

    public final a2 r(a2 a2Var, int i11) throws c {
        r0 type = a2Var.getType();
        Variance b11 = a2Var.b();
        if (type.I0().r() instanceof p10.c1) {
            return a2Var;
        }
        c1 b12 = g1.b(type);
        r0 p11 = b12 != null ? m().p(b12, Variance.INVARIANT) : null;
        r0 b13 = e2.b(type, s(type.I0().getParameters(), type.G0(), i11), this.f48585a.d(type.getAnnotations()));
        if ((b13 instanceof c1) && (p11 instanceof c1)) {
            b13 = g1.j((c1) b13, (c1) p11);
        }
        return new c2(b11, b13);
    }

    public final List<a2> s(List<p10.c1> list, List<a2> list2, int i11) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z11 = false;
        for (int i12 = 0; i12 < list.size(); i12++) {
            p10.c1 c1Var = list.get(i12);
            a2 a2Var = list2.get(i12);
            a2 u11 = u(a2Var, c1Var, i11 + 1);
            int i13 = b.f48586a[e(c1Var.j(), u11.b()).ordinal()];
            if (i13 == 1 || i13 == 2) {
                u11 = h2.s(c1Var);
            } else if (i13 == 3) {
                Variance j11 = c1Var.j();
                Variance variance = Variance.INVARIANT;
                if (j11 != variance && !u11.a()) {
                    u11 = new c2(variance, u11.getType());
                }
            }
            if (u11 != a2Var) {
                z11 = true;
            }
            arrayList.add(u11);
        }
        return !z11 ? list2 : arrayList;
    }

    @m80.l
    public a2 t(@m80.k a2 a2Var) {
        if (a2Var == null) {
            a(17);
        }
        if (k()) {
            return a2Var;
        }
        try {
            return u(a2Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final a2 u(@m80.k a2 a2Var, @m80.l p10.c1 c1Var, int i11) throws c {
        if (a2Var == null) {
            a(18);
        }
        b(i11, a2Var, this.f48585a);
        if (!a2Var.a()) {
            r0 type = a2Var.getType();
            if (type instanceof i2) {
                i2 i2Var = (i2) type;
                k2 V = i2Var.V();
                r0 p02 = i2Var.p0();
                a2 u11 = u(new c2(a2Var.b(), V), c1Var, i11 + 1);
                return u11.a() ? u11 : new c2(u11.b(), j2.d(u11.getType().L0(), p(p02, a2Var.b())));
            }
            if (!e0.a(type) && !(type.L0() instanceof b1)) {
                a2 e11 = this.f48585a.e(type);
                a2 l11 = e11 != null ? l(type, e11, c1Var, a2Var) : null;
                Variance b11 = a2Var.b();
                if (l11 == null && l0.b(type) && !t1.b(type)) {
                    i0 a11 = l0.a(type);
                    int i12 = i11 + 1;
                    a2 u12 = u(new c2(b11, a11.Q0()), c1Var, i12);
                    a2 u13 = u(new c2(b11, a11.R0()), c1Var, i12);
                    Variance b12 = u12.b();
                    if (u12.getType() != a11.Q0() || u13.getType() != a11.R0()) {
                        return new c2(b12, u0.e(e2.a(u12.getType()), e2.a(u13.getType())));
                    }
                } else if (!n10.j.n0(type) && !v0.a(type)) {
                    if (l11 != null) {
                        d e12 = e(b11, l11.b());
                        if (!r20.e.f(type)) {
                            int i13 = b.f48586a[e12.ordinal()];
                            if (i13 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i13 == 2) {
                                return new c2(Variance.OUT_VARIANCE, type.I0().q().I());
                            }
                        }
                        v a12 = t1.a(type);
                        if (l11.a()) {
                            return l11;
                        }
                        r0 C = a12 != null ? a12.C(l11.getType()) : h2.q(l11.getType(), type.J0());
                        if (!type.getAnnotations().isEmpty()) {
                            C = j30.e.D(C, new q10.n(C.getAnnotations(), i(this.f48585a.d(type.getAnnotations()))));
                        }
                        if (e12 == d.NO_CONFLICT) {
                            b11 = d(b11, l11.b());
                        }
                        return new c2(b11, C);
                    }
                    a2Var = r(a2Var, i11);
                    if (a2Var == null) {
                        a(25);
                    }
                }
            }
        }
        return a2Var;
    }
}
