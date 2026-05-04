package ta0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ua0.b f90409a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final cb0.b f90410b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h10.d<?> f90411c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final za0.a f90412d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ya0.a f90413e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f90414f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public za0.d f90415g;

    public d(@k ua0.b logger, @k cb0.b scope, @k h10.d<?> clazz, @l za0.a aVar, @l ya0.a aVar2) {
        g0.p(logger, "logger");
        g0.p(scope, "scope");
        g0.p(clazz, "clazz");
        this.f90409a = logger;
        this.f90410b = scope;
        this.f90411c = clazz;
        this.f90412d = aVar;
        this.f90413e = aVar2;
        this.f90414f = "t:'" + fb0.b.a(clazz) + "' - q:'" + aVar + '\'';
    }

    @k
    public final h10.d<?> a() {
        return this.f90411c;
    }

    @k
    public final String b() {
        return this.f90414f;
    }

    @k
    public final ua0.b c() {
        return this.f90409a;
    }

    @l
    public final ya0.a d() {
        return this.f90413e;
    }

    @l
    public final za0.a e() {
        return this.f90412d;
    }

    @k
    public final cb0.b f() {
        return this.f90410b;
    }

    @l
    public final za0.d g() {
        return this.f90415g;
    }

    @k
    public final d h(@k cb0.b s11) {
        g0.p(s11, "s");
        d dVar = new d(this.f90409a, s11, this.f90411c, this.f90412d, this.f90413e);
        dVar.f90415g = s11.F();
        return dVar;
    }

    public final void i(@l za0.d dVar) {
        this.f90415g = dVar;
    }

    public /* synthetic */ d(ua0.b bVar, cb0.b bVar2, h10.d dVar, za0.a aVar, ya0.a aVar2, int i11, v vVar) {
        this(bVar, bVar2, dVar, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? null : aVar2);
    }
}
