package s10;

import e30.c1;
import e30.f2;
import e30.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.b1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1#2:239\n1557#3:240\n1628#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n*L\n87#1:240\n87#1:241,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s0 extends s implements q0 {

    @m80.k
    public final d30.n E;

    @m80.k
    public final b1 F;

    @m80.k
    public final d30.j G;

    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.b H;
    public static final /* synthetic */ h10.n<Object>[] J = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(s0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    @m80.k
    public static final a I = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1567#2:239\n1598#2,4:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n*L\n209#1:239\n209#1:240,4\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final q0 b(@m80.k d30.n storageManager, @m80.k b1 typeAliasDescriptor, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.b constructor) {
            kotlin.reflect.jvm.internal.impl.descriptors.b c11;
            List<p10.t0> J;
            kotlin.jvm.internal.g0.p(storageManager, "storageManager");
            kotlin.jvm.internal.g0.p(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.g0.p(constructor, "constructor");
            f2 c12 = c(typeAliasDescriptor);
            if (c12 == null || (c11 = constructor.c(c12)) == null) {
                return null;
            }
            q10.g annotations = constructor.getAnnotations();
            CallableMemberDescriptor.Kind kind = constructor.getKind();
            kotlin.jvm.internal.g0.o(kind, "getKind(...)");
            p10.x0 source = typeAliasDescriptor.getSource();
            kotlin.jvm.internal.g0.o(source, "getSource(...)");
            s0 s0Var = new s0(storageManager, typeAliasDescriptor, c11, null, annotations, kind, source, null);
            List<j1> J0 = s.J0(s0Var, constructor.g(), c12);
            if (J0 == null) {
                return null;
            }
            c1 c13 = e30.l0.c(c11.getReturnType().L0());
            c1 s11 = typeAliasDescriptor.s();
            kotlin.jvm.internal.g0.o(s11, "getDefaultType(...)");
            c1 j11 = g1.j(c13, s11);
            p10.t0 d02 = constructor.d0();
            p10.t0 i11 = d02 != null ? q20.g.i(s0Var, c12.n(d02.getType(), Variance.INVARIANT), q10.g.A0.b()) : null;
            p10.b l11 = typeAliasDescriptor.l();
            if (l11 != null) {
                List<p10.t0> z02 = constructor.z0();
                kotlin.jvm.internal.g0.o(z02, "getContextReceiverParameters(...)");
                List<p10.t0> list = z02;
                J = new ArrayList<>(a00.i0.d0(list, 10));
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        a00.h0.b0();
                    }
                    p10.t0 t0Var = (p10.t0) obj;
                    e30.r0 n11 = c12.n(t0Var.getType(), Variance.INVARIANT);
                    y20.h value = t0Var.getValue();
                    kotlin.jvm.internal.g0.n(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    J.add(q20.g.c(l11, n11, ((y20.f) value).a(), q10.g.A0.b(), i12));
                    i12 = i13;
                }
            } else {
                J = a00.h0.J();
            }
            s0Var.M0(i11, null, J, typeAliasDescriptor.t(), J0, j11, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return s0Var;
        }

        public final f2 c(b1 b1Var) {
            if (b1Var.l() == null) {
                return null;
            }
            return f2.f(b1Var.a0());
        }

        public a() {
        }
    }

    public /* synthetic */ s0(d30.n nVar, b1 b1Var, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, q0 q0Var, q10.g gVar, CallableMemberDescriptor.Kind kind, p10.x0 x0Var, kotlin.jvm.internal.v vVar) {
        this(nVar, b1Var, bVar, q0Var, gVar, kind, x0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s0 m1(s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        d30.n nVar = s0Var.E;
        b1 k12 = s0Var.k1();
        q10.g annotations = bVar.getAnnotations();
        CallableMemberDescriptor.Kind kind = bVar.getKind();
        kotlin.jvm.internal.g0.o(kind, "getKind(...)");
        p10.x0 source = s0Var.k1().getSource();
        kotlin.jvm.internal.g0.o(source, "getSource(...)");
        s0 s0Var2 = new s0(nVar, k12, bVar, s0Var, annotations, kind, source);
        f2 c11 = I.c(s0Var.k1());
        if (c11 == null) {
            return null;
        }
        p10.t0 d02 = bVar.d0();
        p10.t0 c12 = d02 != null ? d02.c(c11) : null;
        List<p10.t0> z02 = bVar.z0();
        kotlin.jvm.internal.g0.o(z02, "getContextReceiverParameters(...)");
        List<p10.t0> list = z02;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((p10.t0) it.next()).c(c11));
        }
        s0Var2.M0(null, c12, arrayList, s0Var.k1().t(), s0Var.g(), s0Var.getReturnType(), Modality.FINAL, s0Var.k1().getVisibility());
        return s0Var2;
    }

    @Override // s10.q0
    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.b H() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    @m80.k
    public p10.b L() {
        p10.b L = H().L();
        kotlin.jvm.internal.g0.o(L, "getConstructedClass(...)");
        return L;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    /* renamed from: g1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q0 g0(@m80.k p10.h newOwner, @m80.k Modality modality, @m80.k p10.p visibility, @m80.k CallableMemberDescriptor.Kind kind, boolean z11) {
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(modality, "modality");
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.e build = n().r(newOwner).q(modality).m(visibility).s(kind).f(z11).build();
        kotlin.jvm.internal.g0.n(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (q0) build;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public e30.r0 getReturnType() {
        e30.r0 returnType = super.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        return returnType;
    }

    @Override // s10.s
    @m80.k
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public s0 G0(@m80.k p10.h newOwner, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.l n20.f fVar, @m80.k q10.g annotations, @m80.k p10.x0 source) {
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(source, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new s0(this.E, k1(), H(), this, annotations, kind2, source);
    }

    @Override // s10.n, p10.h
    @m80.k
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public b1 b() {
        return k1();
    }

    @Override // s10.s, s10.n
    @m80.k
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public q0 a() {
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = super.a();
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (q0) a11;
    }

    @m80.k
    public b1 k1() {
        return this.F;
    }

    @Override // s10.s, p10.z0
    @m80.l
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public q0 c(@m80.k f2 substitutor) {
        kotlin.jvm.internal.g0.p(substitutor, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.e c11 = super.c(substitutor);
        kotlin.jvm.internal.g0.n(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        s0 s0Var = (s0) c11;
        f2 f11 = f2.f(s0Var.getReturnType());
        kotlin.jvm.internal.g0.o(f11, "create(...)");
        kotlin.reflect.jvm.internal.impl.descriptors.b c12 = H().a().c(f11);
        if (c12 == null) {
            return null;
        }
        s0Var.H = c12;
        return s0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public boolean n0() {
        return H().n0();
    }

    public s0(d30.n nVar, b1 b1Var, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, q0 q0Var, q10.g gVar, CallableMemberDescriptor.Kind kind, p10.x0 x0Var) {
        super(b1Var, q0Var, gVar, n20.h.f74309j, kind, x0Var);
        this.E = nVar;
        this.F = b1Var;
        Q0(k1().k0());
        this.G = nVar.e(new r0(this, bVar));
        this.H = bVar;
    }
}
