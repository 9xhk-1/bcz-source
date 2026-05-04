package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x extends z implements v, i30.c {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f48682d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1 f48683b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48684c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ x c(a aVar, k2 k2Var, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return aVar.b(k2Var, z11, z12);
        }

        public final boolean a(k2 k2Var) {
            return (k2Var.I0() instanceof f30.r) || (k2Var.I0().r() instanceof p10.c1) || (k2Var instanceof f30.i) || (k2Var instanceof l1);
        }

        @m80.l
        @w00.k
        public final x b(@m80.k k2 type, boolean z11, boolean z12) {
            kotlin.jvm.internal.g0.p(type, "type");
            if (type instanceof x) {
                return (x) type;
            }
            kotlin.jvm.internal.v vVar = null;
            if (!z12 && !d(type, z11)) {
                return null;
            }
            if (type instanceof i0) {
                i0 i0Var = (i0) type;
                kotlin.jvm.internal.g0.g(i0Var.Q0().I0(), i0Var.R0().I0());
            }
            return new x(l0.c(type).M0(false), z11, vVar);
        }

        public final boolean d(k2 k2Var, boolean z11) {
            if (!a(k2Var)) {
                return false;
            }
            if (k2Var instanceof l1) {
                return h2.l(k2Var);
            }
            p10.d r11 = k2Var.I0().r();
            s10.t0 t0Var = r11 instanceof s10.t0 ? (s10.t0) r11 : null;
            if (t0Var == null || t0Var.O0()) {
                return (z11 && (k2Var.I0().r() instanceof p10.c1)) ? h2.l(k2Var) : !f30.s.f50456a.a(k2Var);
            }
            return true;
        }

        public a() {
        }
    }

    public /* synthetic */ x(c1 c1Var, boolean z11, kotlin.jvm.internal.v vVar) {
        this(c1Var, z11);
    }

    @Override // e30.v
    @m80.k
    public r0 C(@m80.k r0 replacement) {
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return g1.e(replacement.L0(), this.f48684c);
    }

    @Override // e30.v
    public boolean E0() {
        return (R0().I0() instanceof f30.r) || (R0().I0().r() instanceof p10.c1);
    }

    @Override // e30.z, e30.r0
    public boolean J0() {
        return false;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        return z11 ? R0().M0(z11) : this;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return new x(R0().O0(newAttributes), this.f48684c);
    }

    @Override // e30.z
    @m80.k
    public c1 R0() {
        return this.f48683b;
    }

    @m80.k
    public final c1 U0() {
        return this.f48683b;
    }

    @Override // e30.z
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public x T0(@m80.k c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return new x(delegate, this.f48684c);
    }

    @Override // e30.c1
    @m80.k
    public String toString() {
        return R0() + " & Any";
    }

    public x(c1 c1Var, boolean z11) {
        this.f48683b = c1Var;
        this.f48684c = z11;
    }
}
