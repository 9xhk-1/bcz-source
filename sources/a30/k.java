package a30;

import a00.v1;
import java.util.Iterator;
import java.util.Set;
import k20.h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import n10.o;
import n20.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n295#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f1779c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<n20.b> f1780d;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1781a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<a, p10.b> f1782b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final n20.b f1783a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final h f1784b;

        public a(@m80.k n20.b classId, @m80.l h hVar) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            this.f1783a = classId;
            this.f1784b = hVar;
        }

        @m80.l
        public final h a() {
            return this.f1784b;
        }

        @m80.k
        public final n20.b b() {
            return this.f1783a;
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f1783a, ((a) obj).f1783a);
        }

        public int hashCode() {
            return this.f1783a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Set<n20.b> a() {
            return k.f1780d;
        }

        public b() {
        }
    }

    static {
        b.a aVar = n20.b.f74280d;
        n20.c l11 = o.a.f74035d.l();
        kotlin.jvm.internal.g0.o(l11, "toSafe(...)");
        f1780d = v1.f(aVar.c(l11));
    }

    public k(@m80.k m components) {
        kotlin.jvm.internal.g0.p(components, "components");
        this.f1781a = components;
        this.f1782b = components.u().h(new j(this));
    }

    public static final p10.b c(k kVar, a key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return kVar.d(key);
    }

    public static /* synthetic */ p10.b f(k kVar, n20.b bVar, h hVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            hVar = null;
        }
        return kVar.e(bVar, hVar);
    }

    public final p10.b d(a aVar) {
        Object obj;
        o a11;
        n20.b b11 = aVar.b();
        Iterator<r10.b> it = this.f1781a.l().iterator();
        while (it.hasNext()) {
            p10.b c11 = it.next().c(b11);
            if (c11 != null) {
                return c11;
            }
        }
        if (f1780d.contains(b11)) {
            return null;
        }
        h a12 = aVar.a();
        if (a12 == null && (a12 = this.f1781a.e().a(b11)) == null) {
            return null;
        }
        k20.c a13 = a12.a();
        ProtoBuf.Class b12 = a12.b();
        k20.a c12 = a12.c();
        p10.x0 d11 = a12.d();
        n20.b e11 = b11.e();
        if (e11 != null) {
            p10.b f11 = f(this, e11, null, 2, null);
            c30.n nVar = f11 instanceof c30.n ? (c30.n) f11 : null;
            if (nVar == null || !nVar.f1(b11.h())) {
                return null;
            }
            a11 = nVar.Y0();
        } else {
            Iterator<T> it2 = p10.l0.c(this.f1781a.s(), b11.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                p10.g0 g0Var = (p10.g0) obj;
                if (!(g0Var instanceof q) || ((q) g0Var).F0(b11.h())) {
                    break;
                }
            }
            p10.g0 g0Var2 = (p10.g0) obj;
            if (g0Var2 == null) {
                return null;
            }
            m mVar = this.f1781a;
            ProtoBuf.TypeTable typeTable = b12.getTypeTable();
            kotlin.jvm.internal.g0.o(typeTable, "getTypeTable(...)");
            k20.g gVar = new k20.g(typeTable);
            h.a aVar2 = k20.h.f65196b;
            ProtoBuf.VersionRequirementTable versionRequirementTable = b12.getVersionRequirementTable();
            kotlin.jvm.internal.g0.o(versionRequirementTable, "getVersionRequirementTable(...)");
            a11 = mVar.a(g0Var2, a13, gVar, aVar2.a(versionRequirementTable), c12, null);
            c12 = c12;
        }
        return new c30.n(a11, b12, a13, c12, d11);
    }

    @m80.l
    public final p10.b e(@m80.k n20.b classId, @m80.l h hVar) {
        kotlin.jvm.internal.g0.p(classId, "classId");
        return this.f1782b.invoke(new a(classId, hVar));
    }
}
