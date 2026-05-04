package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f48569a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final d2 f48570b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d2 {
        @Override // e30.d2
        public /* bridge */ /* synthetic */ a2 e(r0 r0Var) {
            return (a2) i(r0Var);
        }

        @Override // e30.d2
        public boolean f() {
            return true;
        }

        public Void i(r0 key) {
            kotlin.jvm.internal.g0.p(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends d2 {
        public c() {
        }

        @Override // e30.d2
        public boolean a() {
            return false;
        }

        @Override // e30.d2
        public boolean b() {
            return false;
        }

        @Override // e30.d2
        public q10.g d(q10.g annotations) {
            kotlin.jvm.internal.g0.p(annotations, "annotations");
            return d2.this.d(annotations);
        }

        @Override // e30.d2
        public a2 e(r0 key) {
            kotlin.jvm.internal.g0.p(key, "key");
            return d2.this.e(key);
        }

        @Override // e30.d2
        public boolean f() {
            return d2.this.f();
        }

        @Override // e30.d2
        public r0 g(r0 topLevelType, Variance position) {
            kotlin.jvm.internal.g0.p(topLevelType, "topLevelType");
            kotlin.jvm.internal.g0.p(position, "position");
            return d2.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @m80.k
    public final f2 c() {
        f2 g11 = f2.g(this);
        kotlin.jvm.internal.g0.o(g11, "create(...)");
        return g11;
    }

    @m80.k
    public q10.g d(@m80.k q10.g annotations) {
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        return annotations;
    }

    @m80.l
    public abstract a2 e(@m80.k r0 r0Var);

    public boolean f() {
        return false;
    }

    @m80.k
    public r0 g(@m80.k r0 topLevelType, @m80.k Variance position) {
        kotlin.jvm.internal.g0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.g0.p(position, "position");
        return topLevelType;
    }

    @m80.k
    public final d2 h() {
        return new c();
    }
}
