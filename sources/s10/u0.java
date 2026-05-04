package s10;

import e30.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p10.j1;
import p10.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nValueParameterDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1557#2:135\n1628#2,3:136\n*S KotlinDebug\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n*L\n129#1:135\n129#1:136,3\n*E\n"})
/* loaded from: classes8.dex */
public class u0 extends w0 implements j1 {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f87339m = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public final int f87340g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87341h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87342i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f87343j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final e30.r0 f87344k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final j1 f87345l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final u0 a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @m80.l j1 j1Var, int i11, @m80.k q10.g annotations, @m80.k n20.f name, @m80.k e30.r0 outType, boolean z11, boolean z12, boolean z13, @m80.l e30.r0 r0Var, @m80.k p10.x0 source, @m80.l x00.a<? extends List<? extends l1>> aVar) {
            kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.g0.p(annotations, "annotations");
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(outType, "outType");
            kotlin.jvm.internal.g0.p(source, "source");
            return aVar == null ? new u0(containingDeclaration, j1Var, i11, annotations, name, outType, z11, z12, z13, r0Var, source) : new b(containingDeclaration, j1Var, i11, annotations, name, outType, z11, z12, z13, r0Var, source, aVar);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends u0 {

        /* renamed from: n, reason: collision with root package name */
        @m80.k
        public final yz.c0 f87346n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @m80.l j1 j1Var, int i11, @m80.k q10.g annotations, @m80.k n20.f name, @m80.k e30.r0 outType, boolean z11, boolean z12, boolean z13, @m80.l e30.r0 r0Var, @m80.k p10.x0 source, @m80.k x00.a<? extends List<? extends l1>> destructuringVariables) {
            super(containingDeclaration, j1Var, i11, annotations, name, outType, z11, z12, z13, r0Var, source);
            kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.g0.p(annotations, "annotations");
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(outType, "outType");
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(destructuringVariables, "destructuringVariables");
            this.f87346n = yz.e0.c(destructuringVariables);
        }

        public static final List K0(b bVar) {
            return bVar.L0();
        }

        @m80.k
        public final List<l1> L0() {
            return (List) this.f87346n.getValue();
        }

        @Override // s10.u0, p10.j1
        @m80.k
        public j1 O(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, @m80.k n20.f newName, int i11) {
            kotlin.jvm.internal.g0.p(newOwner, "newOwner");
            kotlin.jvm.internal.g0.p(newName, "newName");
            q10.g annotations = getAnnotations();
            kotlin.jvm.internal.g0.o(annotations, "<get-annotations>(...)");
            e30.r0 type = getType();
            kotlin.jvm.internal.g0.o(type, "getType(...)");
            boolean S = S();
            boolean v02 = v0();
            boolean u02 = u0();
            e30.r0 y02 = y0();
            p10.x0 NO_SOURCE = p10.x0.f78622a;
            kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i11, annotations, newName, type, S, v02, u02, y02, NO_SOURCE, new v0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @m80.l j1 j1Var, int i11, @m80.k q10.g annotations, @m80.k n20.f name, @m80.k e30.r0 outType, boolean z11, boolean z12, boolean z13, @m80.l e30.r0 r0Var, @m80.k p10.x0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(outType, "outType");
        kotlin.jvm.internal.g0.p(source, "source");
        this.f87340g = i11;
        this.f87341h = z11;
        this.f87342i = z12;
        this.f87343j = z13;
        this.f87344k = r0Var;
        this.f87345l = j1Var == null ? this : j1Var;
    }

    @w00.o
    @m80.k
    public static final u0 G0(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @m80.l j1 j1Var, int i11, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.k e30.r0 r0Var, boolean z11, boolean z12, boolean z13, @m80.l e30.r0 r0Var2, @m80.k p10.x0 x0Var, @m80.l x00.a<? extends List<? extends l1>> aVar2) {
        return f87339m.a(aVar, j1Var, i11, gVar, fVar, r0Var, z11, z12, z13, r0Var2, x0Var, aVar2);
    }

    @Override // p10.l1
    public boolean B0() {
        return j1.a.a(this);
    }

    @Override // p10.l1
    public boolean E() {
        return false;
    }

    @m80.l
    public Void H0() {
        return null;
    }

    @Override // s10.w0, p10.z0
    @m80.k
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public j1 c(@m80.k f2 substitutor) {
        kotlin.jvm.internal.g0.p(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p10.j1
    @m80.k
    public j1 O(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, @m80.k n20.f newName, int i11) {
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(newName, "newName");
        q10.g annotations = getAnnotations();
        kotlin.jvm.internal.g0.o(annotations, "<get-annotations>(...)");
        e30.r0 type = getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        boolean S = S();
        boolean v02 = v0();
        boolean u02 = u0();
        e30.r0 y02 = y0();
        p10.x0 NO_SOURCE = p10.x0.f78622a;
        kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
        return new u0(newOwner, null, i11, annotations, newName, type, S, v02, u02, y02, NO_SOURCE);
    }

    @Override // p10.j1
    public boolean S() {
        if (!this.f87341h) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a b11 = b();
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((CallableMemberDescriptor) b11).getKind().isReal();
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<j1> e() {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e11 = b().e();
        kotlin.jvm.internal.g0.o(e11, "getOverriddenDescriptors(...)");
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> collection = e11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.a) it.next()).g().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p10.j1
    public int getIndex() {
        return this.f87340g;
    }

    @Override // p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p LOCAL = p10.o.f78591f;
        kotlin.jvm.internal.g0.o(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p10.l1
    public /* bridge */ /* synthetic */ s20.g t0() {
        return (s20.g) H0();
    }

    @Override // p10.j1
    public boolean u0() {
        return this.f87343j;
    }

    @Override // p10.j1
    public boolean v0() {
        return this.f87342i;
    }

    @Override // p10.h
    public <R, D> R y(@m80.k p10.j<R, D> visitor, D d11) {
        kotlin.jvm.internal.g0.p(visitor, "visitor");
        return visitor.a(this, d11);
    }

    @Override // p10.j1
    @m80.l
    public e30.r0 y0() {
        return this.f87344k;
    }

    @Override // s10.n, p10.h
    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.a b() {
        p10.h b11 = super.b();
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) b11;
    }

    @Override // s10.w0, s10.n
    @m80.k
    public j1 a() {
        j1 j1Var = this.f87345l;
        return j1Var == this ? this : j1Var.a();
    }
}
