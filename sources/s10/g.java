package s10;

import e30.h2;
import e30.k2;
import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.b1;
import p10.c1;
import s10.s0;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbstractTypeAliasDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1611#2,9:130\n1863#2:139\n1864#2:141\n1620#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n*L\n69#1:130,9\n69#1:139\n69#1:141\n69#1:142\n69#1:140\n*E\n"})
/* loaded from: classes8.dex */
public abstract class g extends n implements b1 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f87164j = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(g.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.n f87165e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final p10.p f87166f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d30.i f87167g;

    /* renamed from: h, reason: collision with root package name */
    public List<? extends c1> f87168h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final a f87169i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements u1 {
        public a() {
        }

        @Override // e30.u1
        public Collection<e30.r0> c() {
            Collection<e30.r0> c11 = r().x0().I0().c();
            kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
            return c11;
        }

        @Override // e30.u1
        public u1 d(f30.g kotlinTypeRefiner) {
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // e30.u1
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b1 r() {
            return g.this;
        }

        @Override // e30.u1
        public List<c1> getParameters() {
            return g.this.M0();
        }

        @Override // e30.u1
        public n10.j q() {
            return u20.e.m(r());
        }

        @Override // e30.u1
        public boolean s() {
            return true;
        }

        public String toString() {
            return "[typealias " + r().getName().b() + l50.b.f69930l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k d30.n storageManager, @m80.k p10.h containingDeclaration, @m80.k q10.g annotations, @m80.k n20.f name, @m80.k p10.x0 sourceElement, @m80.k p10.p visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(sourceElement, "sourceElement");
        kotlin.jvm.internal.g0.p(visibilityImpl, "visibilityImpl");
        this.f87165e = storageManager;
        this.f87166f = visibilityImpl;
        this.f87167g = storageManager.f(new d(this));
        this.f87169i = new a();
    }

    public static final e30.c1 I0(g gVar, f30.g gVar2) {
        p10.d f11 = gVar2.f(gVar);
        if (f11 != null) {
            return f11.s();
        }
        return null;
    }

    public static final Collection J0(g gVar) {
        return gVar.L0();
    }

    public static final Boolean O0(g gVar, k2 k2Var) {
        boolean z11;
        kotlin.jvm.internal.g0.m(k2Var);
        if (!e30.v0.a(k2Var)) {
            p10.d r11 = k2Var.I0().r();
            if ((r11 instanceof c1) && !kotlin.jvm.internal.g0.g(((c1) r11).b(), gVar)) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }

    @m80.k
    public final e30.c1 H0() {
        x20.k kVar;
        p10.b l11 = l();
        if (l11 == null || (kVar = l11.J()) == null) {
            kVar = k.c.f97119b;
        }
        e30.c1 v11 = h2.v(this, kVar, new f(this));
        kotlin.jvm.internal.g0.o(v11, "makeUnsubstitutedType(...)");
        return v11;
    }

    @Override // s10.n
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public b1 a() {
        p10.k a11 = super.a();
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (b1) a11;
    }

    @m80.k
    public final Collection<q0> L0() {
        p10.b l11 = l();
        if (l11 == null) {
            return a00.h0.J();
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f11 = l11.f();
        kotlin.jvm.internal.g0.o(f11, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : f11) {
            s0.a aVar = s0.I;
            d30.n nVar = this.f87165e;
            kotlin.jvm.internal.g0.m(bVar);
            q0 b11 = aVar.b(nVar, this, bVar);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return arrayList;
    }

    @m80.k
    public abstract List<c1> M0();

    public final void N0(@m80.k List<? extends c1> declaredTypeParameters) {
        kotlin.jvm.internal.g0.p(declaredTypeParameters, "declaredTypeParameters");
        this.f87168h = declaredTypeParameters;
    }

    @m80.k
    public final d30.n e0() {
        return this.f87165e;
    }

    @Override // p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        return this.f87166f;
    }

    @Override // p10.e
    public boolean i() {
        return h2.c(x0(), new e(this));
    }

    @Override // p10.x
    public boolean isExternal() {
        return false;
    }

    @Override // p10.x
    @m80.k
    public Modality k() {
        return Modality.FINAL;
    }

    @Override // p10.x
    public boolean k0() {
        return false;
    }

    @Override // p10.d
    @m80.k
    public u1 o() {
        return this.f87169i;
    }

    @Override // p10.x
    public boolean q0() {
        return false;
    }

    @Override // p10.e
    @m80.k
    public List<c1> t() {
        List list = this.f87168h;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.g0.S("declaredTypeParametersImpl");
        return null;
    }

    @Override // s10.m
    @m80.k
    public String toString() {
        return "typealias " + getName().b();
    }

    @Override // p10.h
    public <R, D> R y(@m80.k p10.j<R, D> visitor, D d11) {
        kotlin.jvm.internal.g0.p(visitor, "visitor");
        return visitor.g(this, d11);
    }
}
