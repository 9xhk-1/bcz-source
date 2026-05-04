package n10;

import e30.j1;
import e30.r0;
import e30.r1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import n10.o;
import p10.a0;
import p10.c1;
import p10.f0;
import p10.t;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1557#2:226\n1628#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f0 f73992a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f73993b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f73994c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a f73995d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a f73996e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final a f73997f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final a f73998g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final a f73999h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final a f74000i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final a f74001j;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f73991l = {o0.u(new PropertyReference1Impl(o0.d(n.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(n.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f73990k = new b(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f74002a;

        public a(int i11) {
            this.f74002a = i11;
        }

        @m80.k
        public final p10.b a(@m80.k n types, @m80.k h10.n<?> property) {
            g0.p(types, "types");
            g0.p(property, "property");
            return types.c(m30.a.a(property.getName()), this.f74002a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1755#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.l
        public final r0 a(@m80.k a0 module) {
            g0.p(module, "module");
            p10.b b11 = t.b(module, o.a.f74074w0);
            if (b11 == null) {
                return null;
            }
            r1 j11 = r1.f48652b.j();
            List<c1> parameters = b11.o().getParameters();
            g0.o(parameters, "getParameters(...)");
            Object m52 = a00.r0.m5(parameters);
            g0.o(m52, "single(...)");
            return e30.u0.h(j11, b11, a00.g0.l(new j1((c1) m52)));
        }

        public b() {
        }
    }

    public n(@m80.k a0 module, @m80.k f0 notFoundClasses) {
        g0.p(module, "module");
        g0.p(notFoundClasses, "notFoundClasses");
        this.f73992a = notFoundClasses;
        this.f73993b = e0.b(LazyThreadSafetyMode.PUBLICATION, new m(module));
        this.f73994c = new a(1);
        this.f73995d = new a(1);
        this.f73996e = new a(1);
        this.f73997f = new a(2);
        this.f73998g = new a(3);
        this.f73999h = new a(1);
        this.f74000i = new a(2);
        this.f74001j = new a(3);
    }

    public static final x20.k f(a0 a0Var) {
        return a0Var.h0(o.f74026x).r();
    }

    public final p10.b c(String str, int i11) {
        n20.f f11 = n20.f.f(str);
        g0.o(f11, "identifier(...)");
        p10.d h11 = e().h(f11, NoLookupLocation.FROM_REFLECTION);
        p10.b bVar = h11 instanceof p10.b ? (p10.b) h11 : null;
        return bVar == null ? this.f73992a.d(new n20.b(o.f74026x, f11), a00.g0.l(Integer.valueOf(i11))) : bVar;
    }

    @m80.k
    public final p10.b d() {
        return this.f73994c.a(this, f73991l[0]);
    }

    public final x20.k e() {
        return (x20.k) this.f73993b.getValue();
    }
}
