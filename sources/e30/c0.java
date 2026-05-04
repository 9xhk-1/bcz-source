package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 extends d2 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f48554e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d2 f48555c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d2 f48556d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final d2 a(@m80.k d2 first, @m80.k d2 second) {
            kotlin.jvm.internal.g0.p(first, "first");
            kotlin.jvm.internal.g0.p(second, "second");
            return first.f() ? second : second.f() ? first : new c0(first, second, null);
        }

        public a() {
        }
    }

    public /* synthetic */ c0(d2 d2Var, d2 d2Var2, kotlin.jvm.internal.v vVar) {
        this(d2Var, d2Var2);
    }

    @w00.o
    @m80.k
    public static final d2 i(@m80.k d2 d2Var, @m80.k d2 d2Var2) {
        return f48554e.a(d2Var, d2Var2);
    }

    @Override // e30.d2
    public boolean a() {
        return this.f48555c.a() || this.f48556d.a();
    }

    @Override // e30.d2
    public boolean b() {
        return this.f48555c.b() || this.f48556d.b();
    }

    @Override // e30.d2
    @m80.k
    public q10.g d(@m80.k q10.g annotations) {
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        return this.f48556d.d(this.f48555c.d(annotations));
    }

    @Override // e30.d2
    @m80.l
    public a2 e(@m80.k r0 key) {
        kotlin.jvm.internal.g0.p(key, "key");
        a2 e11 = this.f48555c.e(key);
        return e11 == null ? this.f48556d.e(key) : e11;
    }

    @Override // e30.d2
    public boolean f() {
        return false;
    }

    @Override // e30.d2
    @m80.k
    public r0 g(@m80.k r0 topLevelType, @m80.k Variance position) {
        kotlin.jvm.internal.g0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.g0.p(position, "position");
        return this.f48556d.g(this.f48555c.g(topLevelType, position), position);
    }

    public c0(d2 d2Var, d2 d2Var2) {
        this.f48555c = d2Var;
        this.f48556d = d2Var2;
    }
}
