package h20;

import a30.m0;
import h20.a0;
import h20.e.a;
import h20.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import m20.d;
import n20.b;
import p10.x0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,338:1\n1557#2:339\n1628#2,3:340\n1557#2:343\n1628#2,3:344\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n197#1:339\n197#1:340,3\n201#1:343\n201#1:344,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class e<A, S extends a<? extends A>> implements a30.g<A> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f58056b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v f58057a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<A> {
        @m80.k
        public abstract Map<a0, List<A>> a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final x a(@m80.k m0 container, boolean z11, boolean z12, @m80.l Boolean bool, boolean z13, @m80.k v kotlinClassFinder, @m80.k m20.e jvmMetadataVersion) {
            m0.a h11;
            kotlin.jvm.internal.g0.p(container, "container");
            kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
            kotlin.jvm.internal.g0.p(jvmMetadataVersion, "jvmMetadataVersion");
            if (z11) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof m0.a) {
                    m0.a aVar = (m0.a) container;
                    if (aVar.g() == ProtoBuf.Class.Kind.INTERFACE) {
                        n20.b e11 = aVar.e();
                        n20.f f11 = n20.f.f("DefaultImpls");
                        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
                        return w.b(kotlinClassFinder, e11.d(f11), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof m0.b)) {
                    x0 c11 = container.c();
                    r rVar = c11 instanceof r ? (r) c11 : null;
                    v20.d f12 = rVar != null ? rVar.f() : null;
                    if (f12 != null) {
                        b.a aVar2 = n20.b.f74280d;
                        String f13 = f12.f();
                        kotlin.jvm.internal.g0.o(f13, "getInternalName(...)");
                        return w.b(kotlinClassFinder, aVar2.c(new n20.c(u30.f0.y2(f13, '/', '.', false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z12 && (container instanceof m0.a)) {
                m0.a aVar3 = (m0.a) container;
                if (aVar3.g() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (h11 = aVar3.h()) != null && (h11.g() == ProtoBuf.Class.Kind.CLASS || h11.g() == ProtoBuf.Class.Kind.ENUM_CLASS || (z13 && (h11.g() == ProtoBuf.Class.Kind.INTERFACE || h11.g() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    x0 c12 = h11.c();
                    z zVar = c12 instanceof z ? (z) c12 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof m0.b) || !(container.c() instanceof r)) {
                return null;
            }
            x0 c13 = container.c();
            kotlin.jvm.internal.g0.n(c13, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            r rVar2 = (r) c13;
            x g11 = rVar2.g();
            return g11 == null ? w.b(kotlinClassFinder, rVar2.d(), jvmMetadataVersion) : g11;
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f58058a = new c("PROPERTY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f58059b = new c("BACKING_FIELD", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f58060c = new c("DELEGATE_FIELD", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f58061d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ m00.a f58062e;

        static {
            c[] a11 = a();
            f58061d = a11;
            f58062e = m00.c.c(a11);
        }

        public c(String str, int i11) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f58058a, f58059b, f58060c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f58061d.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58063a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58063a = iArr;
        }
    }

    public e(@m80.k v kotlinClassFinder) {
        kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f58057a = kotlinClassFinder;
    }

    public static /* synthetic */ List o(e eVar, m0 m0Var, a0 a0Var, boolean z11, boolean z12, Boolean bool, boolean z13, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        if ((i11 & 16) != 0) {
            bool = null;
        }
        if ((i11 & 32) != 0) {
            z13 = false;
        }
        return eVar.n(m0Var, a0Var, z11, z12, bool, z13);
    }

    public static /* synthetic */ a0 t(e eVar, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, k20.c cVar, k20.g gVar, AnnotatedCallableKind annotatedCallableKind, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return eVar.s(nVar, cVar, gVar, annotatedCallableKind, z11);
    }

    public final x A(m0.a aVar) {
        x0 c11 = aVar.c();
        z zVar = c11 instanceof z ? (z) c11 : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    @Override // a30.g
    @m80.k
    public List<A> b(@m80.k m0.a container) {
        kotlin.jvm.internal.g0.p(container, "container");
        x A = A(container);
        if (A != null) {
            ArrayList arrayList = new ArrayList(1);
            A.d(new C0652e(this, arrayList), r(A));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // a30.g
    @m80.k
    public List<A> d(@m80.k ProtoBuf.Type proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.f67476f);
        kotlin.jvm.internal.g0.o(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(a00.i0.d0(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            kotlin.jvm.internal.g0.m(annotation);
            arrayList.add(g(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> e(@m80.k ProtoBuf.TypeParameter proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.f67478h);
        kotlin.jvm.internal.g0.o(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(a00.i0.d0(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            kotlin.jvm.internal.g0.m(annotation);
            arrayList.add(g(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> f(@m80.k m0 container, @m80.k ProtoBuf.Property proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        return z(container, proto, c.f58059b);
    }

    @Override // a30.g
    @m80.k
    public abstract A g(@m80.k ProtoBuf.Annotation annotation, @m80.k k20.c cVar);

    @Override // a30.g
    @m80.k
    public List<A> h(@m80.k m0 container, @m80.k ProtoBuf.Property proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        return z(container, proto, c.f58060c);
    }

    @Override // a30.g
    @m80.k
    public List<A> i(@m80.k m0 container, @m80.k ProtoBuf.EnumEntry proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        return o(this, container, a0.f58041b.a(container.b().getString(proto.getName()), m20.b.b(((m0.a) container).e().b())), false, false, null, false, 60, null);
    }

    @Override // a30.g
    @m80.k
    public List<A> j(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n proto, @m80.k AnnotatedCallableKind kind) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        a0 t11 = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return t11 != null ? o(this, container, a0.f58041b.e(t11, 0), false, false, null, false, 60, null) : a00.h0.J();
    }

    @Override // a30.g
    @m80.k
    public List<A> k(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n proto, @m80.k AnnotatedCallableKind kind) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return z(container, (ProtoBuf.Property) proto, c.f58058a);
        }
        a0 t11 = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return t11 == null ? a00.h0.J() : o(this, container, t11, false, false, null, false, 60, null);
    }

    @Override // a30.g
    @m80.k
    public List<A> l(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, @m80.k AnnotatedCallableKind kind, int i11, @m80.k ProtoBuf.ValueParameter proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(callableProto, "callableProto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(proto, "proto");
        a0 t11 = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (t11 == null) {
            return a00.h0.J();
        }
        return o(this, container, a0.f58041b.e(t11, i11 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    public final int m(m0 m0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar) {
        if (nVar instanceof ProtoBuf.Function) {
            return k20.f.g((ProtoBuf.Function) nVar) ? 1 : 0;
        }
        if (nVar instanceof ProtoBuf.Property) {
            return k20.f.h((ProtoBuf.Property) nVar) ? 1 : 0;
        }
        if (!(nVar instanceof ProtoBuf.Constructor)) {
            throw new UnsupportedOperationException("Unsupported message: " + nVar.getClass());
        }
        kotlin.jvm.internal.g0.n(m0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        m0.a aVar = (m0.a) m0Var;
        if (aVar.g() == ProtoBuf.Class.Kind.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    public final List<A> n(m0 m0Var, a0 a0Var, boolean z11, boolean z12, Boolean bool, boolean z13) {
        x p11 = p(m0Var, f58056b.a(m0Var, z11, z12, bool, z13, this.f58057a, u()));
        if (p11 == null) {
            return a00.h0.J();
        }
        List<A> list = q(p11).a().get(a0Var);
        return list == null ? a00.h0.J() : list;
    }

    @m80.l
    public final x p(@m80.k m0 container, @m80.l x xVar) {
        kotlin.jvm.internal.g0.p(container, "container");
        if (xVar != null) {
            return xVar;
        }
        if (container instanceof m0.a) {
            return A((m0.a) container);
        }
        return null;
    }

    @m80.k
    public abstract S q(@m80.k x xVar);

    @m80.l
    public byte[] r(@m80.k x kotlinClass) {
        kotlin.jvm.internal.g0.p(kotlinClass, "kotlinClass");
        return null;
    }

    @m80.l
    public final a0 s(@m80.k kotlin.reflect.jvm.internal.impl.protobuf.n proto, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.k AnnotatedCallableKind kind, boolean z11) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            a0.a aVar = a0.f58041b;
            d.b b11 = m20.i.f71820a.b((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (b11 == null) {
                return null;
            }
            return aVar.b(b11);
        }
        if (proto instanceof ProtoBuf.Function) {
            a0.a aVar2 = a0.f58041b;
            d.b e11 = m20.i.f71820a.e((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (e11 == null) {
                return null;
            }
            return aVar2.b(e11);
        }
        if (proto instanceof ProtoBuf.Property) {
            GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f67474d;
            kotlin.jvm.internal.g0.o(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) k20.e.a((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i11 = d.f58063a[kind.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return f.a((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z11);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                a0.a aVar3 = a0.f58041b;
                JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                kotlin.jvm.internal.g0.o(setter, "getSetter(...)");
                return aVar3.c(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                a0.a aVar4 = a0.f58041b;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                kotlin.jvm.internal.g0.o(getter, "getGetter(...)");
                return aVar4.c(nameResolver, getter);
            }
        }
        return null;
    }

    @m80.k
    public abstract m20.e u();

    @m80.k
    public final v v() {
        return this.f58057a;
    }

    public final boolean w(@m80.k n20.b classId) {
        x b11;
        kotlin.jvm.internal.g0.p(classId, "classId");
        return classId.e() != null && kotlin.jvm.internal.g0.g(classId.h().b(), "Container") && (b11 = w.b(this.f58057a, classId, u())) != null && m10.a.f71762a.c(b11);
    }

    @m80.l
    public abstract x.a x(@m80.k n20.b bVar, @m80.k x0 x0Var, @m80.k List<A> list);

    @m80.l
    public final x.a y(@m80.k n20.b annotationClassId, @m80.k x0 source, @m80.k List<A> result) {
        kotlin.jvm.internal.g0.p(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(result, "result");
        if (m10.a.f71762a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }

    public final List<A> z(m0 m0Var, ProtoBuf.Property property, c cVar) {
        Boolean d11 = k20.b.B.d(property.getFlags());
        kotlin.jvm.internal.g0.o(d11, "get(...)");
        d11.booleanValue();
        boolean f11 = m20.i.f(property);
        if (cVar == c.f58058a) {
            a0 b11 = f.b(property, m0Var.b(), m0Var.d(), false, true, false, 40, null);
            return b11 == null ? a00.h0.J() : o(this, m0Var, b11, true, false, d11, f11, 8, null);
        }
        a0 b12 = f.b(property, m0Var.b(), m0Var.d(), true, false, false, 48, null);
        if (b12 == null) {
            return a00.h0.J();
        }
        return k0.n3(b12.a(), "$delegate", false, 2, null) != (cVar == c.f58060c) ? a00.h0.J() : n(m0Var, b12, true, true, d11, f11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h20.e$e, reason: collision with other inner class name */
    public static final class C0652e implements x.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<A, S> f58064a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList<A> f58065b;

        public C0652e(e<A, S> eVar, ArrayList<A> arrayList) {
            this.f58064a = eVar;
            this.f58065b = arrayList;
        }

        @Override // h20.x.c
        public x.a c(n20.b classId, x0 source) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            kotlin.jvm.internal.g0.p(source, "source");
            return this.f58064a.y(classId, source, this.f58065b);
        }

        @Override // h20.x.c
        public void a() {
        }
    }
}
