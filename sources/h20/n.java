package h20;

import a00.v1;
import a00.w1;
import c30.m0;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDeserializedDescriptorResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n125#1,14:154\n125#1,14:168\n1#2:182\n*S KotlinDebug\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n*L\n56#1:154,14\n68#1:168,14\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f58122b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Set<KotlinClassHeader.Kind> f58123c = v1.f(KotlinClassHeader.Kind.CLASS);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<KotlinClassHeader.Kind> f58124d = w1.u(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final m20.e f58125e = new m20.e(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final m20.e f58126f = new m20.e(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final m20.e f58127g = new m20.e(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public a30.m f58128a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final m20.e a() {
            return n.f58127g;
        }

        public a() {
        }
    }

    public static final Collection d() {
        return a00.h0.J();
    }

    @m80.l
    public final x20.k c(@m80.k p10.g0 descriptor, @m80.k x kotlinClass) {
        String[] g11;
        Pair<m20.f, ProtoBuf.Package> pair;
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(kotlinClass, "kotlinClass");
        String[] m11 = m(kotlinClass, f58124d);
        if (m11 == null || (g11 = kotlinClass.b().g()) == null) {
            return null;
        }
        try {
            try {
                pair = m20.i.m(m11, g11);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.b().d().h(h())) {
                throw th2;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        m20.f component1 = pair.component1();
        ProtoBuf.Package component2 = pair.component2();
        r rVar = new r(kotlinClass, component2, component1, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new m0(descriptor, component2, component1, kotlinClass.b().d(), rVar, f(), "scope for " + rVar + " in " + descriptor, m.f58121a);
    }

    public final DeserializedContainerAbiStability e(x xVar) {
        return f().g().b() ? DeserializedContainerAbiStability.STABLE : xVar.b().j() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    @m80.k
    public final a30.m f() {
        a30.m mVar = this.f58128a;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.g0.S("components");
        return null;
    }

    public final a30.x<m20.e> g(x xVar) {
        if (i() || xVar.b().d().h(h())) {
            return null;
        }
        return new a30.x<>(xVar.b().d(), m20.e.f71807i, h(), h().k(xVar.b().d().j()), xVar.getLocation(), xVar.a());
    }

    public final m20.e h() {
        return o30.c.a(f().g());
    }

    public final boolean i() {
        return f().g().g();
    }

    public final boolean j(x xVar) {
        return !f().g().e() && xVar.b().i() && kotlin.jvm.internal.g0.g(xVar.b().d(), f58126f);
    }

    public final boolean k(x xVar) {
        return (f().g().c() && (xVar.b().i() || kotlin.jvm.internal.g0.g(xVar.b().d(), f58125e))) || j(xVar);
    }

    @m80.l
    public final a30.h l(@m80.k x kotlinClass) {
        String[] g11;
        Pair<m20.f, ProtoBuf.Class> pair;
        kotlin.jvm.internal.g0.p(kotlinClass, "kotlinClass");
        String[] m11 = m(kotlinClass, f58123c);
        if (m11 == null || (g11 = kotlinClass.b().g()) == null) {
            return null;
        }
        try {
            try {
                pair = m20.i.i(m11, g11);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.b().d().h(h())) {
                throw th2;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new a30.h(pair.component1(), pair.component2(), kotlinClass.b().d(), new z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final String[] m(x xVar, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader b11 = xVar.b();
        String[] a11 = b11.a();
        if (a11 == null) {
            a11 = b11.b();
        }
        if (a11 == null || !set.contains(b11.c())) {
            return null;
        }
        return a11;
    }

    @m80.l
    public final p10.b n(@m80.k x kotlinClass) {
        kotlin.jvm.internal.g0.p(kotlinClass, "kotlinClass");
        a30.h l11 = l(kotlinClass);
        if (l11 == null) {
            return null;
        }
        return f().f().e(kotlinClass.a(), l11);
    }

    public final void o(@m80.k a30.m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<set-?>");
        this.f58128a = mVar;
    }

    public final void p(@m80.k k components) {
        kotlin.jvm.internal.g0.p(components, "components");
        o(components.a());
    }
}
