package a30;

import a00.l1;
import a30.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.b;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p10.b1;
import p10.c1;
import p10.j1;
import q10.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1567#3:373\n1598#3,4:374\n1577#3,11:378\n1872#3,2:389\n1874#3:392\n1588#3:393\n1557#3:394\n1628#3,3:395\n1567#3:398\n1598#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o f1777a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f f1778b;

    public j0(@m80.k o c11) {
        kotlin.jvm.internal.g0.p(c11, "c");
        this.f1777a = c11;
        this.f1778b = new f(c11.c().q(), c11.c().r());
    }

    public static final List C(j0 j0Var, m0 m0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind, int i11, ProtoBuf.ValueParameter valueParameter) {
        return a00.r0.a6(j0Var.f1777a.c().d().l(m0Var, nVar, annotatedCallableKind, i11, valueParameter));
    }

    public static final List k(j0 j0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        m0 i11 = j0Var.i(j0Var.f1777a.e());
        List a62 = i11 != null ? a00.r0.a6(j0Var.f1777a.c().d().k(i11, nVar, annotatedCallableKind)) : null;
        return a62 == null ? a00.h0.J() : a62;
    }

    public static final List n(j0 j0Var, boolean z11, ProtoBuf.Property property) {
        m0 i11 = j0Var.i(j0Var.f1777a.e());
        List a62 = i11 != null ? z11 ? a00.r0.a6(j0Var.f1777a.c().d().h(i11, property)) : a00.r0.a6(j0Var.f1777a.c().d().f(i11, property)) : null;
        return a62 == null ? a00.h0.J() : a62;
    }

    public static final List p(j0 j0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        m0 i11 = j0Var.i(j0Var.f1777a.e());
        List<q10.c> j11 = i11 != null ? j0Var.f1777a.c().d().j(i11, nVar, annotatedCallableKind) : null;
        return j11 == null ? a00.h0.J() : j11;
    }

    public static final d30.j v(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        return j0Var.f1777a.h().e(new h0(j0Var, property, n0Var));
    }

    public static final s20.g w(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        m0 i11 = j0Var.i(j0Var.f1777a.e());
        kotlin.jvm.internal.g0.m(i11);
        d<q10.c, s20.g<?>> d11 = j0Var.f1777a.c().d();
        e30.r0 returnType = n0Var.getReturnType();
        kotlin.jvm.internal.g0.o(returnType, "getReturnType(...)");
        return d11.a(i11, property, returnType);
    }

    public static final d30.j x(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        return j0Var.f1777a.h().e(new i0(j0Var, property, n0Var));
    }

    public static final s20.g y(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        m0 i11 = j0Var.i(j0Var.f1777a.e());
        kotlin.jvm.internal.g0.m(i11);
        d<q10.c, s20.g<?>> d11 = j0Var.f1777a.c().d();
        e30.r0 returnType = n0Var.getReturnType();
        kotlin.jvm.internal.g0.o(returnType, "getReturnType(...)");
        return d11.c(i11, property, returnType);
    }

    public final p10.t0 A(ProtoBuf.Type type, o oVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, int i11) {
        return q20.g.b(aVar, oVar.i().u(type), null, q10.g.A0.b(), i11);
    }

    public final List<j1> B(List<ProtoBuf.ValueParameter> list, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        p10.h e11 = this.f1777a.e();
        kotlin.jvm.internal.g0.n(e11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) e11;
        p10.h b11 = aVar.b();
        kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
        m0 i11 = i(b11);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                a00.h0.b0();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            q10.g b12 = (i11 == null || !k20.b.f65165c.d(flags).booleanValue()) ? q10.g.A0.b() : new c30.s0(this.f1777a.h(), new g0(this, i11, nVar, annotatedCallableKind, i12, valueParameter));
            n20.f b13 = k0.b(this.f1777a.g(), valueParameter.getName());
            e30.r0 u11 = this.f1777a.i().u(k20.f.q(valueParameter, this.f1777a.j()));
            Boolean d11 = k20.b.H.d(flags);
            kotlin.jvm.internal.g0.o(d11, "get(...)");
            boolean booleanValue = d11.booleanValue();
            Boolean d12 = k20.b.I.d(flags);
            kotlin.jvm.internal.g0.o(d12, "get(...)");
            boolean booleanValue2 = d12.booleanValue();
            Boolean d13 = k20.b.J.d(flags);
            kotlin.jvm.internal.g0.o(d13, "get(...)");
            boolean booleanValue3 = d13.booleanValue();
            ProtoBuf.Type t11 = k20.f.t(valueParameter, this.f1777a.j());
            e30.r0 u12 = t11 != null ? this.f1777a.i().u(t11) : null;
            p10.x0 NO_SOURCE = p10.x0.f78622a;
            kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = aVar;
            arrayList.add(new s10.u0(aVar2, null, i12, b12, b13, u11, booleanValue, booleanValue2, booleanValue3, u12, NO_SOURCE));
            aVar = aVar2;
            i12 = i13;
        }
        return a00.r0.a6(arrayList);
    }

    public final m0 i(p10.h hVar) {
        if (hVar instanceof p10.g0) {
            return new m0.b(((p10.g0) hVar).d(), this.f1777a.g(), this.f1777a.j(), this.f1777a.d());
        }
        if (hVar instanceof c30.n) {
            return ((c30.n) hVar).d1();
        }
        return null;
    }

    public final q10.g j(kotlin.reflect.jvm.internal.impl.protobuf.n nVar, int i11, AnnotatedCallableKind annotatedCallableKind) {
        return !k20.b.f65165c.d(i11).booleanValue() ? q10.g.A0.b() : new c30.s0(this.f1777a.h(), new d0(this, nVar, annotatedCallableKind));
    }

    public final p10.t0 l() {
        p10.h e11 = this.f1777a.e();
        p10.b bVar = e11 instanceof p10.b ? (p10.b) e11 : null;
        if (bVar != null) {
            return bVar.W();
        }
        return null;
    }

    public final q10.g m(ProtoBuf.Property property, boolean z11) {
        return !k20.b.f65165c.d(property.getFlags()).booleanValue() ? q10.g.A0.b() : new c30.s0(this.f1777a.h(), new e0(this, z11, property));
    }

    public final q10.g o(kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        return new c30.b(this.f1777a.h(), new f0(this, nVar, annotatedCallableKind));
    }

    public final void q(c30.o0 o0Var, p10.t0 t0Var, p10.t0 t0Var2, List<? extends p10.t0> list, List<? extends c1> list2, List<? extends j1> list3, e30.r0 r0Var, Modality modality, p10.p pVar, Map<? extends a.InterfaceC0792a<?>, ?> map) {
        o0Var.j1(t0Var, t0Var2, list, list2, list3, r0Var, modality, pVar, map);
    }

    @m80.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.b r(@m80.k ProtoBuf.Constructor proto, boolean z11) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        p10.h e11 = this.f1777a.e();
        kotlin.jvm.internal.g0.n(e11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        p10.b bVar = (p10.b) e11;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        c30.d dVar = new c30.d(bVar, null, j(proto, flags, annotatedCallableKind), z11, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f1777a.g(), this.f1777a.j(), this.f1777a.k(), this.f1777a.d(), null, 1024, null);
        j0 f11 = o.b(this.f1777a, dVar, a00.h0.J(), null, null, null, null, 60, null).f();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        kotlin.jvm.internal.g0.o(valueParameterList, "getValueParameterList(...)");
        dVar.l1(f11.B(valueParameterList, proto, annotatedCallableKind), o0.a(n0.f1824a, k20.b.f65166d.d(proto.getFlags())));
        dVar.b1(bVar.s());
        dVar.R0(bVar.q0());
        dVar.T0(!k20.b.f65177o.d(proto.getFlags()).booleanValue());
        return dVar;
    }

    @m80.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.g s(@m80.k ProtoBuf.Function proto) {
        e30.r0 u11;
        kotlin.jvm.internal.g0.p(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : t(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        q10.g j11 = j(proto, flags, annotatedCallableKind);
        q10.g o11 = k20.f.g(proto) ? o(proto, annotatedCallableKind) : q10.g.A0.b();
        c30.o0 o0Var = new c30.o0(this.f1777a.e(), null, j11, k0.b(this.f1777a.g(), proto.getName()), o0.b(n0.f1824a, k20.b.f65178p.d(flags)), proto, this.f1777a.g(), this.f1777a.j(), kotlin.jvm.internal.g0.g(u20.e.o(this.f1777a.e()).c(k0.b(this.f1777a.g(), proto.getName())), p0.f1846a) ? k20.h.f65196b.b() : this.f1777a.k(), this.f1777a.d(), null, 1024, null);
        o oVar = this.f1777a;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.g0.o(typeParameterList, "getTypeParameterList(...)");
        o b11 = o.b(oVar, o0Var, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type k11 = k20.f.k(proto, this.f1777a.j());
        p10.t0 i11 = (k11 == null || (u11 = b11.i().u(k11)) == null) ? null : q20.g.i(o0Var, u11, o11);
        p10.t0 l11 = l();
        List<ProtoBuf.Type> c11 = k20.f.c(proto, this.f1777a.j());
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : c11) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                a00.h0.b0();
            }
            p10.t0 A = A((ProtoBuf.Type) obj, b11, o0Var, i12);
            if (A != null) {
                arrayList.add(A);
            }
            i12 = i13;
        }
        List<c1> m11 = b11.i().m();
        j0 f11 = b11.f();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        kotlin.jvm.internal.g0.o(valueParameterList, "getValueParameterList(...)");
        List<j1> B = f11.B(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        e30.r0 u12 = b11.i().u(k20.f.m(proto, this.f1777a.j()));
        n0 n0Var = n0.f1824a;
        q(o0Var, i11, l11, arrayList, m11, B, u12, n0Var.b(k20.b.f65167e.d(flags)), o0.a(n0Var, k20.b.f65166d.d(flags)), l1.z());
        o0Var.a1(k20.b.f65179q.d(flags).booleanValue());
        o0Var.X0(k20.b.f65180r.d(flags).booleanValue());
        o0Var.S0(k20.b.f65183u.d(flags).booleanValue());
        o0Var.Z0(k20.b.f65181s.d(flags).booleanValue());
        o0Var.d1(k20.b.f65182t.d(flags).booleanValue());
        o0Var.c1(k20.b.f65184v.d(flags).booleanValue());
        o0Var.R0(k20.b.f65185w.d(flags).booleanValue());
        o0Var.T0(!k20.b.f65186x.d(flags).booleanValue());
        Pair<a.InterfaceC0792a<?>, Object> a11 = this.f1777a.c().h().a(proto, o0Var, this.f1777a.j(), b11.i());
        if (a11 != null) {
            o0Var.P0(a11.getFirst(), a11.getSecond());
        }
        return o0Var;
    }

    public final int t(int i11) {
        return (i11 & 63) + ((i11 >> 8) << 6);
    }

    @m80.k
    public final p10.q0 u(@m80.k ProtoBuf.Property proto) {
        o oVar;
        b.d<ProtoBuf.Visibility> dVar;
        b.d<ProtoBuf.Modality> dVar2;
        s10.l0 l0Var;
        s10.l0 l0Var2;
        boolean z11;
        s10.m0 m0Var;
        e30.r0 u11;
        kotlin.jvm.internal.g0.p(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : t(proto.getOldFlags());
        p10.h e11 = this.f1777a.e();
        q10.g j11 = j(proto, flags, AnnotatedCallableKind.PROPERTY);
        n0 n0Var = n0.f1824a;
        Modality b11 = n0Var.b(k20.b.f65167e.d(flags));
        p10.p a11 = o0.a(n0Var, k20.b.f65166d.d(flags));
        Boolean d11 = k20.b.f65187y.d(flags);
        kotlin.jvm.internal.g0.o(d11, "get(...)");
        boolean booleanValue = d11.booleanValue();
        n20.f b12 = k0.b(this.f1777a.g(), proto.getName());
        CallableMemberDescriptor.Kind b13 = o0.b(n0Var, k20.b.f65178p.d(flags));
        Boolean d12 = k20.b.C.d(flags);
        kotlin.jvm.internal.g0.o(d12, "get(...)");
        boolean booleanValue2 = d12.booleanValue();
        Boolean d13 = k20.b.B.d(flags);
        kotlin.jvm.internal.g0.o(d13, "get(...)");
        boolean booleanValue3 = d13.booleanValue();
        Boolean d14 = k20.b.E.d(flags);
        kotlin.jvm.internal.g0.o(d14, "get(...)");
        boolean booleanValue4 = d14.booleanValue();
        Boolean d15 = k20.b.F.d(flags);
        kotlin.jvm.internal.g0.o(d15, "get(...)");
        boolean booleanValue5 = d15.booleanValue();
        Boolean d16 = k20.b.G.d(flags);
        kotlin.jvm.internal.g0.o(d16, "get(...)");
        int i11 = flags;
        c30.n0 n0Var2 = new c30.n0(e11, null, j11, b11, a11, booleanValue, b12, b13, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d16.booleanValue(), proto, this.f1777a.g(), this.f1777a.j(), this.f1777a.k(), this.f1777a.d());
        o oVar2 = this.f1777a;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.g0.o(typeParameterList, "getTypeParameterList(...)");
        o b14 = o.b(oVar2, n0Var2, typeParameterList, null, null, null, null, 60, null);
        Boolean d17 = k20.b.f65188z.d(i11);
        kotlin.jvm.internal.g0.o(d17, "get(...)");
        boolean booleanValue6 = d17.booleanValue();
        q10.g o11 = (booleanValue6 && k20.f.h(proto)) ? o(proto, AnnotatedCallableKind.PROPERTY_GETTER) : q10.g.A0.b();
        e30.r0 u12 = b14.i().u(k20.f.n(proto, this.f1777a.j()));
        List<c1> m11 = b14.i().m();
        p10.t0 l11 = l();
        ProtoBuf.Type l12 = k20.f.l(proto, this.f1777a.j());
        p10.t0 i12 = (l12 == null || (u11 = b14.i().u(l12)) == null) ? null : q20.g.i(n0Var2, u11, o11);
        List<ProtoBuf.Type> d18 = k20.f.d(proto, this.f1777a.j());
        ArrayList arrayList = new ArrayList(a00.i0.d0(d18, 10));
        int i13 = 0;
        for (Object obj : d18) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                a00.h0.b0();
            }
            arrayList.add(A((ProtoBuf.Type) obj, b14, n0Var2, i13));
            i13 = i14;
        }
        n0Var2.X0(u12, m11, l11, i12, arrayList);
        Boolean d19 = k20.b.f65165c.d(i11);
        kotlin.jvm.internal.g0.o(d19, "get(...)");
        boolean booleanValue7 = d19.booleanValue();
        b.d<ProtoBuf.Visibility> dVar3 = k20.b.f65166d;
        ProtoBuf.Visibility d21 = dVar3.d(i11);
        b.d<ProtoBuf.Modality> dVar4 = k20.b.f65167e;
        int b15 = k20.b.b(booleanValue7, d21, dVar4.d(i11), false, false, false);
        if (booleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : b15;
            Boolean d22 = k20.b.K.d(getterFlags);
            kotlin.jvm.internal.g0.o(d22, "get(...)");
            boolean booleanValue8 = d22.booleanValue();
            Boolean d23 = k20.b.L.d(getterFlags);
            kotlin.jvm.internal.g0.o(d23, "get(...)");
            boolean booleanValue9 = d23.booleanValue();
            Boolean d24 = k20.b.M.d(getterFlags);
            kotlin.jvm.internal.g0.o(d24, "get(...)");
            boolean booleanValue10 = d24.booleanValue();
            q10.g j12 = j(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (booleanValue8) {
                n0 n0Var3 = n0.f1824a;
                dVar = dVar3;
                oVar = b14;
                dVar2 = dVar4;
                l0Var = new s10.l0(n0Var2, j12, n0Var3.b(dVar4.d(getterFlags)), o0.a(n0Var3, dVar3.d(getterFlags)), !booleanValue8, booleanValue9, booleanValue10, n0Var2.getKind(), null, p10.x0.f78622a);
            } else {
                oVar = b14;
                dVar = dVar3;
                dVar2 = dVar4;
                l0Var = q20.g.d(n0Var2, j12);
                kotlin.jvm.internal.g0.m(l0Var);
            }
            l0Var.L0(n0Var2.getReturnType());
        } else {
            oVar = b14;
            dVar = dVar3;
            dVar2 = dVar4;
            l0Var = null;
        }
        if (k20.b.A.d(i11).booleanValue()) {
            if (proto.hasSetterFlags()) {
                b15 = proto.getSetterFlags();
            }
            int i15 = b15;
            Boolean d25 = k20.b.K.d(i15);
            kotlin.jvm.internal.g0.o(d25, "get(...)");
            boolean booleanValue11 = d25.booleanValue();
            Boolean d26 = k20.b.L.d(i15);
            kotlin.jvm.internal.g0.o(d26, "get(...)");
            boolean booleanValue12 = d26.booleanValue();
            Boolean d27 = k20.b.M.d(i15);
            kotlin.jvm.internal.g0.o(d27, "get(...)");
            boolean booleanValue13 = d27.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            q10.g j13 = j(proto, i15, annotatedCallableKind);
            if (booleanValue11) {
                n0 n0Var4 = n0.f1824a;
                l0Var2 = l0Var;
                z11 = true;
                s10.m0 m0Var2 = new s10.m0(n0Var2, j13, n0Var4.b(dVar2.d(i15)), o0.a(n0Var4, dVar.d(i15)), !booleanValue11, booleanValue12, booleanValue13, n0Var2.getKind(), null, p10.x0.f78622a);
                m0Var = m0Var2;
                m0Var.M0((j1) a00.r0.m5(o.b(oVar, m0Var2, a00.h0.J(), null, null, null, null, 60, null).f().B(a00.g0.l(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                l0Var2 = l0Var;
                z11 = true;
                s10.m0 e12 = q20.g.e(n0Var2, j13, q10.g.A0.b());
                kotlin.jvm.internal.g0.m(e12);
                m0Var = e12;
            }
        } else {
            l0Var2 = l0Var;
            z11 = true;
            m0Var = null;
        }
        if (k20.b.D.d(i11).booleanValue()) {
            n0Var2.H0(new b0(this, proto, n0Var2));
        }
        p10.h e13 = this.f1777a.e();
        p10.b bVar = e13 instanceof p10.b ? (p10.b) e13 : null;
        if ((bVar != null ? bVar.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            n0Var2.H0(new c0(this, proto, n0Var2));
        }
        n0Var2.R0(l0Var2, m0Var, new s10.r(m(proto, false), n0Var2), new s10.r(m(proto, z11), n0Var2));
        return n0Var2;
    }

    @m80.k
    public final b1 z(@m80.k ProtoBuf.TypeAlias proto) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        g.a aVar = q10.g.A0;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        kotlin.jvm.internal.g0.o(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            f fVar = this.f1778b;
            kotlin.jvm.internal.g0.m(annotation);
            arrayList.add(fVar.a(annotation, this.f1777a.g()));
        }
        c30.p0 p0Var = new c30.p0(this.f1777a.h(), this.f1777a.e(), aVar.a(arrayList), k0.b(this.f1777a.g(), proto.getName()), o0.a(n0.f1824a, k20.b.f65166d.d(proto.getFlags())), proto, this.f1777a.g(), this.f1777a.j(), this.f1777a.k(), this.f1777a.d());
        o oVar = this.f1777a;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        kotlin.jvm.internal.g0.o(typeParameterList, "getTypeParameterList(...)");
        o b11 = o.b(oVar, p0Var, typeParameterList, null, null, null, null, 60, null);
        p0Var.R0(b11.i().m(), b11.i().o(k20.f.r(proto, this.f1777a.j()), false), b11.i().o(k20.f.e(proto, this.f1777a.j()), false));
        return p0Var;
    }
}
