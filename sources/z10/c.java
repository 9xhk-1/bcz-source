package z10;

import a00.l1;
import a00.r0;
import e30.c1;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes8.dex */
public class c implements a20.g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f100599f = {o0.u(new PropertyReference1Impl(o0.d(c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n20.c f100600a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x0 f100601b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.i f100602c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final f20.b f100603d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f100604e;

    public c(@m80.k b20.k c11, @m80.l f20.a aVar, @m80.k n20.c fqName) {
        x0 NO_SOURCE;
        Collection<f20.b> arguments;
        g0.p(c11, "c");
        g0.p(fqName, "fqName");
        this.f100600a = fqName;
        if (aVar == null || (NO_SOURCE = c11.a().t().a(aVar)) == null) {
            NO_SOURCE = x0.f78622a;
            g0.o(NO_SOURCE, "NO_SOURCE");
        }
        this.f100601b = NO_SOURCE;
        this.f100602c = c11.e().f(new b(c11, this));
        this.f100603d = (aVar == null || (arguments = aVar.getArguments()) == null) ? null : (f20.b) r0.J2(arguments);
        boolean z11 = false;
        if (aVar != null && aVar.h()) {
            z11 = true;
        }
        this.f100604e = z11;
    }

    public static final c1 f(b20.k kVar, c cVar) {
        c1 s11 = kVar.d().q().o(cVar.d()).s();
        g0.o(s11, "getDefaultType(...)");
        return s11;
    }

    @Override // q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        return l1.z();
    }

    @m80.l
    public final f20.b c() {
        return this.f100603d;
    }

    @Override // q10.c
    @m80.k
    public n20.c d() {
        return this.f100600a;
    }

    @Override // q10.c
    @m80.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c1 getType() {
        return (c1) d30.m.a(this.f100602c, this, f100599f[0]);
    }

    @Override // q10.c
    @m80.k
    public x0 getSource() {
        return this.f100601b;
    }

    @Override // a20.g
    public boolean h() {
        return this.f100604e;
    }
}
