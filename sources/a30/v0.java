package a30;

import a00.l1;
import e30.a2;
import e30.c2;
import e30.g1;
import e30.h1;
import e30.j1;
import e30.q1;
import e30.r1;
import e30.u1;
import e30.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p10.b1;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1557#2:301\n1628#2,3:302\n1567#2:305\n1598#2,4:306\n1557#2:311\n1628#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o f1865a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final v0 f1866b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f1867c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f1868d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.l<Integer, p10.d> f1869e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x00.l<Integer, p10.d> f1870f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Map<Integer, c1> f1871g;

    public v0(@m80.k o c11, @m80.l v0 v0Var, @m80.k List<ProtoBuf.TypeParameter> typeParameterProtos, @m80.k String debugName, @m80.k String containerPresentableName) {
        Map<Integer, c1> linkedHashMap;
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.g0.p(debugName, "debugName");
        kotlin.jvm.internal.g0.p(containerPresentableName, "containerPresentableName");
        this.f1865a = c11;
        this.f1866b = v0Var;
        this.f1867c = debugName;
        this.f1868d = containerPresentableName;
        this.f1869e = c11.h().h(new q0(this));
        this.f1870f = c11.h().h(new r0(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = l1.z();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i11 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new c30.r0(this.f1865a, typeParameter, i11));
                i11++;
            }
        }
        this.f1871g = linkedHashMap;
    }

    public static final int A(ProtoBuf.Type it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.getArgumentCount();
    }

    public static final p10.d f(v0 v0Var, int i11) {
        return v0Var.g(i11);
    }

    public static final List<ProtoBuf.Type.Argument> p(ProtoBuf.Type type, v0 v0Var) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        kotlin.jvm.internal.g0.o(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type j11 = k20.f.j(type, v0Var.f1865a.j());
        List<ProtoBuf.Type.Argument> p11 = j11 != null ? p(j11, v0Var) : null;
        if (p11 == null) {
            p11 = a00.h0.J();
        }
        return a00.r0.I4(list, p11);
    }

    public static /* synthetic */ e30.c1 q(v0 v0Var, ProtoBuf.Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return v0Var.o(type, z11);
    }

    public static final List r(v0 v0Var, ProtoBuf.Type type) {
        return v0Var.f1865a.c().d().d(type, v0Var.f1865a.g());
    }

    public static final p10.d v(v0 v0Var, int i11) {
        return v0Var.i(i11);
    }

    public static final p10.b y(v0 v0Var, ProtoBuf.Type type, int i11) {
        n20.b a11 = k0.a(v0Var.f1865a.g(), i11);
        List<Integer> J3 = q30.k0.J3(q30.k0.N1(q30.x.t(type, new t0(v0Var)), u0.f1863a));
        int E0 = q30.k0.E0(q30.x.t(a11, new PropertyReference1() { // from class: a30.v0.a
            @Override // h10.p
            public Object get(Object obj) {
                return ((n20.b) obj).e();
            }

            @Override // kotlin.jvm.internal.CallableReference, h10.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public h10.h getOwner() {
                return kotlin.jvm.internal.o0.d(n20.b.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (J3.size() < E0) {
            J3.add(0);
        }
        return v0Var.f1865a.c().r().d(a11, J3);
    }

    public static final ProtoBuf.Type z(v0 v0Var, ProtoBuf.Type it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return k20.f.j(it, v0Var.f1865a.j());
    }

    public final p10.d g(int i11) {
        n20.b a11 = k0.a(this.f1865a.g(), i11);
        return a11.i() ? this.f1865a.c().b(a11) : p10.t.c(this.f1865a.c().q(), a11);
    }

    public final e30.c1 h(int i11) {
        if (k0.a(this.f1865a.g(), i11).i()) {
            return this.f1865a.c().o().a();
        }
        return null;
    }

    public final p10.d i(int i11) {
        n20.b a11 = k0.a(this.f1865a.g(), i11);
        if (a11.i()) {
            return null;
        }
        return p10.t.f(this.f1865a.c().q(), a11);
    }

    public final e30.c1 j(e30.r0 r0Var, e30.r0 r0Var2) {
        n10.j o11 = j30.e.o(r0Var);
        q10.g annotations = r0Var.getAnnotations();
        e30.r0 k11 = n10.i.k(r0Var);
        List<e30.r0> e11 = n10.i.e(r0Var);
        List h22 = a00.r0.h2(n10.i.m(r0Var), 1);
        ArrayList arrayList = new ArrayList(a00.i0.d0(h22, 10));
        Iterator it = h22.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        return n10.i.b(o11, annotations, k11, e11, arrayList, null, r0Var2, true).M0(r0Var.J0());
    }

    public final e30.c1 k(r1 r1Var, u1 u1Var, List<? extends a2> list, boolean z11) {
        List<? extends a2> list2;
        e30.c1 l11;
        int size;
        int size2 = u1Var.getParameters().size() - list.size();
        if (size2 != 0) {
            l11 = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                u1 o11 = u1Var.q().X(size).o();
                kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
                list2 = list;
                l11 = e30.u0.m(r1Var, o11, list2, z11, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            l11 = l(r1Var, u1Var, list2, z11);
        }
        return l11 == null ? g30.i.f52687a.f(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, u1Var, new String[0]) : l11;
    }

    public final e30.c1 l(r1 r1Var, u1 u1Var, List<? extends a2> list, boolean z11) {
        e30.c1 m11 = e30.u0.m(r1Var, u1Var, list, z11, null, 16, null);
        if (n10.i.q(m11)) {
            return t(m11);
        }
        return null;
    }

    @m80.k
    public final List<c1> m() {
        return a00.r0.a6(this.f1871g.values());
    }

    public final c1 n(int i11) {
        c1 c1Var = this.f1871g.get(Integer.valueOf(i11));
        if (c1Var != null) {
            return c1Var;
        }
        v0 v0Var = this.f1866b;
        if (v0Var != null) {
            return v0Var.n(i11);
        }
        return null;
    }

    @m80.k
    public final e30.c1 o(@m80.k ProtoBuf.Type proto, boolean z11) {
        e30.c1 c1Var;
        e30.c1 j11;
        kotlin.jvm.internal.g0.p(proto, "proto");
        e30.c1 h11 = proto.hasClassName() ? h(proto.getClassName()) : proto.hasTypeAliasName() ? h(proto.getTypeAliasName()) : null;
        if (h11 != null) {
            return h11;
        }
        u1 x11 = x(proto);
        if (g30.i.m(x11.r())) {
            return g30.i.f52687a.c(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, x11, x11.toString());
        }
        c30.b bVar = new c30.b(this.f1865a.h(), new s0(this, proto));
        r1 s11 = s(this.f1865a.c().v(), bVar, x11, this.f1865a.e());
        List<ProtoBuf.Type.Argument> p11 = p(proto, this);
        ArrayList arrayList = new ArrayList(a00.i0.d0(p11, 10));
        int i11 = 0;
        for (Object obj : p11) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            List<c1> parameters = x11.getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            arrayList.add(w((c1) a00.r0.b3(parameters, i11), (ProtoBuf.Type.Argument) obj));
            i11 = i12;
        }
        List<? extends a2> a62 = a00.r0.a6(arrayList);
        p10.d r11 = x11.r();
        if (z11 && (r11 instanceof b1)) {
            e30.u0 u0Var = e30.u0.f48669a;
            e30.c1 c11 = e30.u0.c((b1) r11, a62);
            c1Var = c11.M0(e30.v0.b(c11) || proto.getNullable()).O0(s(this.f1865a.c().v(), q10.g.A0.a(a00.r0.E4(bVar, c11.getAnnotations())), x11, this.f1865a.e()));
        } else if (k20.b.f65163a.d(proto.getFlags()).booleanValue()) {
            c1Var = k(s11, x11, a62, proto.getNullable());
        } else {
            e30.c1 m11 = e30.u0.m(s11, x11, a62, proto.getNullable(), null, 16, null);
            if (k20.b.f65164b.d(proto.getFlags()).booleanValue()) {
                c1Var = x.a.c(e30.x.f48682d, m11, true, false, 4, null);
                if (c1Var == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + m11 + '\'').toString());
                }
            } else {
                c1Var = m11;
            }
        }
        ProtoBuf.Type a11 = k20.f.a(proto, this.f1865a.j());
        return (a11 == null || (j11 = g1.j(c1Var, o(a11, false))) == null) ? c1Var : j11;
    }

    public final r1 s(List<? extends q1> list, q10.g gVar, u1 u1Var, p10.h hVar) {
        List<? extends q1> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((q1) it.next()).a(gVar, u1Var, hVar));
        }
        return r1.f48652b.i(a00.i0.f0(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.g0.g(r2, r3) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e30.c1 t(e30.r0 r6) {
        /*
            r5 = this;
            java.util.List r0 = n10.i.m(r6)
            java.lang.Object r0 = a00.r0.A3(r0)
            e30.a2 r0 = (e30.a2) r0
            r1 = 0
            if (r0 == 0) goto L7e
            e30.r0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7e
        L14:
            e30.u1 r2 = r0.I0()
            p10.d r2 = r2.r()
            if (r2 == 0) goto L23
            n20.c r2 = u20.e.o(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.G0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7b
            n20.c r3 = n10.o.f74024v
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r3 != 0) goto L42
            n20.c r3 = a30.w0.a()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L42
            goto L7b
        L42:
            java.util.List r0 = r0.G0()
            java.lang.Object r0 = a00.r0.m5(r0)
            e30.a2 r0 = (e30.a2) r0
            e30.r0 r0 = r0.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            a30.o r2 = r5.f1865a
            p10.h r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r3 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 == 0) goto L69
            n20.c r1 = u20.e.k(r2)
        L69:
            n20.c r2 = a30.p0.f1846a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L76
            e30.c1 r6 = r5.j(r6, r0)
            return r6
        L76:
            e30.c1 r6 = r5.j(r6, r0)
            return r6
        L7b:
            e30.c1 r6 = (e30.c1) r6
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.v0.t(e30.r0):e30.c1");
    }

    @m80.k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1867c);
        if (this.f1866b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f1866b.f1867c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @m80.k
    public final e30.r0 u(@m80.k ProtoBuf.Type proto) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return o(proto, true);
        }
        String string = this.f1865a.g().getString(proto.getFlexibleTypeCapabilitiesId());
        e30.c1 q11 = q(this, proto, false, 2, null);
        ProtoBuf.Type f11 = k20.f.f(proto, this.f1865a.j());
        kotlin.jvm.internal.g0.m(f11);
        return this.f1865a.c().m().a(proto, string, q11, q(this, f11, false, 2, null));
    }

    public final a2 w(c1 c1Var, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return c1Var == null ? new h1(this.f1865a.c().q().q()) : new j1(c1Var);
        }
        n0 n0Var = n0.f1824a;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        kotlin.jvm.internal.g0.o(projection, "getProjection(...)");
        Variance c11 = n0Var.c(projection);
        ProtoBuf.Type p11 = k20.f.p(argument, this.f1865a.j());
        return p11 == null ? new c2(g30.i.d(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new c2(c11, u(p11));
    }

    public final u1 x(ProtoBuf.Type type) {
        p10.d invoke;
        Object obj;
        if (type.hasClassName()) {
            invoke = this.f1869e.invoke(Integer.valueOf(type.getClassName()));
            if (invoke == null) {
                invoke = y(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            invoke = n(type.getTypeParameter());
            if (invoke == null) {
                return g30.i.f52687a.e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.f1868d);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f1865a.g().getString(type.getTypeParameterName());
            Iterator<T> it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.g0.g(((c1) obj).getName().b(), string)) {
                    break;
                }
            }
            invoke = (c1) obj;
            if (invoke == null) {
                return g30.i.f52687a.e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f1865a.e().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return g30.i.f52687a.e(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            invoke = this.f1870f.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (invoke == null) {
                invoke = y(this, type, type.getTypeAliasName());
            }
        }
        u1 o11 = invoke.o();
        kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
        return o11;
    }
}
