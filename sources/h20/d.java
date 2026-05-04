package h20;

import a30.m0;
import e30.r0;
import h20.a0;
import h20.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p10.x0;
import s20.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d<A, C> extends e<A, g<? extends A, ? extends C>> implements a30.d<A, C> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.g<x, g<A, C>> f58045c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<A, C> f58046a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap<a0, List<A>> f58047b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f58048c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ HashMap<a0, C> f58049d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap<a0, C> f58050e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h20.d$a$a, reason: collision with other inner class name */
        public final class C0651a extends b implements x.e {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f58051d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0651a(a aVar, a0 signature) {
                super(aVar, signature);
                kotlin.jvm.internal.g0.p(signature, "signature");
                this.f58051d = aVar;
            }

            @Override // h20.x.e
            public x.a b(int i11, n20.b classId, x0 source) {
                kotlin.jvm.internal.g0.p(classId, "classId");
                kotlin.jvm.internal.g0.p(source, "source");
                a0 e11 = a0.f58041b.e(d(), i11);
                List<A> list = this.f58051d.f58047b.get(e11);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f58051d.f58047b.put(e11, list);
                }
                return this.f58051d.f58046a.y(classId, source, list);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements x.c {

            /* renamed from: a, reason: collision with root package name */
            public final a0 f58052a;

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList<A> f58053b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f58054c;

            public b(a aVar, a0 signature) {
                kotlin.jvm.internal.g0.p(signature, "signature");
                this.f58054c = aVar;
                this.f58052a = signature;
                this.f58053b = new ArrayList<>();
            }

            @Override // h20.x.c
            public void a() {
                if (this.f58053b.isEmpty()) {
                    return;
                }
                this.f58054c.f58047b.put(this.f58052a, this.f58053b);
            }

            @Override // h20.x.c
            public x.a c(n20.b classId, x0 source) {
                kotlin.jvm.internal.g0.p(classId, "classId");
                kotlin.jvm.internal.g0.p(source, "source");
                return this.f58054c.f58046a.y(classId, source, this.f58053b);
            }

            public final a0 d() {
                return this.f58052a;
            }
        }

        public a(d<A, C> dVar, HashMap<a0, List<A>> hashMap, x xVar, HashMap<a0, C> hashMap2, HashMap<a0, C> hashMap3) {
            this.f58046a = dVar;
            this.f58047b = hashMap;
            this.f58048c = xVar;
            this.f58049d = hashMap2;
            this.f58050e = hashMap3;
        }

        @Override // h20.x.d
        public x.c a(n20.f name, String desc, Object obj) {
            C I;
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(desc, "desc");
            a0.a aVar = a0.f58041b;
            String b11 = name.b();
            kotlin.jvm.internal.g0.o(b11, "asString(...)");
            a0 a11 = aVar.a(b11, desc);
            if (obj != null && (I = this.f58046a.I(desc, obj)) != null) {
                this.f58050e.put(a11, I);
            }
            return new b(this, a11);
        }

        @Override // h20.x.d
        public x.e b(n20.f name, String desc) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(desc, "desc");
            a0.a aVar = a0.f58041b;
            String b11 = name.b();
            kotlin.jvm.internal.g0.o(b11, "asString(...)");
            return new C0651a(this, aVar.d(b11, desc));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k d30.n storageManager, @m80.k v kotlinClassFinder) {
        super(kotlinClassFinder);
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f58045c = storageManager.b(new h20.a(this));
    }

    public static final Object G(g loadConstantFromProperty, a0 it) {
        kotlin.jvm.internal.g0.p(loadConstantFromProperty, "$this$loadConstantFromProperty");
        kotlin.jvm.internal.g0.p(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    public static final Object K(g loadConstantFromProperty, a0 it) {
        kotlin.jvm.internal.g0.p(loadConstantFromProperty, "$this$loadConstantFromProperty");
        kotlin.jvm.internal.g0.p(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    public static final g L(d dVar, x kotlinClass) {
        kotlin.jvm.internal.g0.p(kotlinClass, "kotlinClass");
        return dVar.H(kotlinClass);
    }

    @Override // h20.e
    @m80.k
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public g<A, C> q(@m80.k x binaryClass) {
        kotlin.jvm.internal.g0.p(binaryClass, "binaryClass");
        return this.f58045c.invoke(binaryClass);
    }

    public final boolean F(@m80.k n20.b annotationClassId, @m80.k Map<n20.f, ? extends s20.g<?>> arguments) {
        kotlin.jvm.internal.g0.p(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        if (!kotlin.jvm.internal.g0.g(annotationClassId, m10.a.f71762a.a())) {
            return false;
        }
        s20.g<?> gVar = arguments.get(n20.f.f("value"));
        s20.t tVar = gVar instanceof s20.t ? (s20.t) gVar : null;
        if (tVar == null) {
            return false;
        }
        t.b b11 = tVar.b();
        t.b.C1127b c1127b = b11 instanceof t.b.C1127b ? (t.b.C1127b) b11 : null;
        if (c1127b == null) {
            return false;
        }
        return w(c1127b.b());
    }

    public final g<A, C> H(x xVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        xVar.c(new a(this, hashMap, xVar, hashMap3, hashMap2), r(xVar));
        return new g<>(hashMap, hashMap2, hashMap3);
    }

    @m80.l
    public abstract C I(@m80.k String str, @m80.k Object obj);

    public final C J(m0 m0Var, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, r0 r0Var, x00.p<? super g<? extends A, ? extends C>, ? super a0, ? extends C> pVar) {
        C invoke;
        x p11 = p(m0Var, e.f58056b.a(m0Var, true, true, k20.b.B.d(property.getFlags()), m20.i.f(property), v(), u()));
        if (p11 == null) {
            return null;
        }
        a0 s11 = s(property, m0Var.b(), m0Var.d(), annotatedCallableKind, p11.b().d().d(n.f58122b.a()));
        if (s11 == null || (invoke = pVar.invoke(this.f58045c.invoke(p11), s11)) == null) {
            return null;
        }
        return n10.q.d(r0Var) ? M(invoke) : invoke;
    }

    @m80.l
    public abstract C M(@m80.k C c11);

    @Override // a30.d
    @m80.l
    public C a(@m80.k m0 container, @m80.k ProtoBuf.Property proto, @m80.k r0 expectedType) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(expectedType, "expectedType");
        return J(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, c.f58044a);
    }

    @Override // a30.d
    @m80.l
    public C c(@m80.k m0 container, @m80.k ProtoBuf.Property proto, @m80.k r0 expectedType) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(expectedType, "expectedType");
        return J(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, b.f58043a);
    }
}
