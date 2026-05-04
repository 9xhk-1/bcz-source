package g30;

import a00.h0;
import a00.v1;
import e30.a2;
import e30.r0;
import e30.u1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;
import m80.l;
import p10.a0;
import p10.q0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f52687a = new i();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a0 f52688b = d.f52668a;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f52689c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final r0 f52690d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final r0 f52691e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final q0 f52692f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Set<q0> f52693g;

    static {
        String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        g0.o(format, "format(...)");
        n20.f k11 = n20.f.k(format);
        g0.o(k11, "special(...)");
        f52689c = new a(k11);
        f52690d = d(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f52691e = d(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        e eVar = new e();
        f52692f = eVar;
        f52693g = v1.f(eVar);
    }

    @o
    @k
    public static final f a(@k ErrorScopeKind kind, boolean z11, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        return z11 ? new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new f(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @o
    @k
    public static final f b(@k ErrorScopeKind kind, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @o
    @k
    public static final g d(@k ErrorTypeKind kind, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        return f52687a.g(kind, h0.J(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @o
    public static final boolean m(@l p10.h hVar) {
        if (hVar == null) {
            return false;
        }
        i iVar = f52687a;
        return iVar.n(hVar) || iVar.n(hVar.b()) || hVar == f52688b;
    }

    @o
    public static final boolean o(@l r0 r0Var) {
        if (r0Var == null) {
            return false;
        }
        u1 I0 = r0Var.I0();
        return (I0 instanceof h) && ((h) I0).e() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @k
    public final g c(@k ErrorTypeKind kind, @k u1 typeConstructor, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(typeConstructor, "typeConstructor");
        g0.p(formatParams, "formatParams");
        return f(kind, h0.J(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @k
    public final h e(@k ErrorTypeKind kind, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        return new h(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @k
    public final g f(@k ErrorTypeKind kind, @k List<? extends a2> arguments, @k u1 typeConstructor, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(arguments, "arguments");
        g0.p(typeConstructor, "typeConstructor");
        g0.p(formatParams, "formatParams");
        return new g(typeConstructor, b(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @k
    public final g g(@k ErrorTypeKind kind, @k List<? extends a2> arguments, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(arguments, "arguments");
        g0.p(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @k
    public final a h() {
        return f52689c;
    }

    @k
    public final a0 i() {
        return f52688b;
    }

    @k
    public final Set<q0> j() {
        return f52693g;
    }

    @k
    public final r0 k() {
        return f52691e;
    }

    @k
    public final r0 l() {
        return f52690d;
    }

    public final boolean n(p10.h hVar) {
        return hVar instanceof a;
    }

    @k
    public final String p(@k r0 type) {
        g0.p(type, "type");
        j30.e.A(type);
        u1 I0 = type.I0();
        g0.n(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((h) I0).f(0);
    }
}
