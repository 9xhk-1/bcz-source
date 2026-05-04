package f30;

import e30.k2;
import e30.r0;
import f30.f;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements p {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g f50453c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f f50454d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final OverridingUtil f50455e;

    public q(@m80.k g kotlinTypeRefiner, @m80.k f kotlinTypePreparator) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        g0.p(kotlinTypePreparator, "kotlinTypePreparator");
        this.f50453c = kotlinTypeRefiner;
        this.f50454d = kotlinTypePreparator;
        OverridingUtil m11 = OverridingUtil.m(d());
        g0.o(m11, "createWithTypeRefiner(...)");
        this.f50455e = m11;
    }

    @Override // f30.e
    public boolean a(@m80.k r0 subtype, @m80.k r0 supertype) {
        g0.p(subtype, "subtype");
        g0.p(supertype, "supertype");
        return g(a.b(true, false, null, f(), d(), 6, null), subtype.L0(), supertype.L0());
    }

    @Override // f30.e
    public boolean b(@m80.k r0 a11, @m80.k r0 b11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        return e(a.b(false, false, null, f(), d(), 6, null), a11.L0(), b11.L0());
    }

    @Override // f30.p
    @m80.k
    public OverridingUtil c() {
        return this.f50455e;
    }

    @Override // f30.p
    @m80.k
    public g d() {
        return this.f50453c;
    }

    public final boolean e(@m80.k TypeCheckerState typeCheckerState, @m80.k k2 a11, @m80.k k2 b11) {
        g0.p(typeCheckerState, "<this>");
        g0.p(a11, "a");
        g0.p(b11, "b");
        return kotlin.reflect.jvm.internal.impl.types.b.f67667a.m(typeCheckerState, a11, b11);
    }

    @m80.k
    public f f() {
        return this.f50454d;
    }

    public final boolean g(@m80.k TypeCheckerState typeCheckerState, @m80.k k2 subType, @m80.k k2 superType) {
        g0.p(typeCheckerState, "<this>");
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.b.v(kotlin.reflect.jvm.internal.impl.types.b.f67667a, typeCheckerState, subType, superType, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i11, kotlin.jvm.internal.v vVar) {
        this(gVar, (i11 & 2) != 0 ? f.a.f50431a : fVar);
    }
}
