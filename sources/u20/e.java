package u20;

import a00.h0;
import a00.i0;
import e30.c1;
import e30.r0;
import f30.c0;
import f30.g;
import f30.t;
import h10.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m80.k;
import n10.j;
import n20.f;
import o30.b;
import p10.a0;
import p10.b0;
import p10.h1;
import p10.j1;
import p10.q0;
import p10.u;
import q30.k0;
import q30.m;
import q30.x;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDescriptorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n+ 2 ClassKind.kt\norg/jetbrains/kotlin/descriptors/ClassKindKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,469:1\n34#2:470\n827#3:471\n855#3,2:472\n1611#3,9:474\n1863#3:483\n1864#3:485\n1620#3:486\n827#3:487\n855#3,2:488\n827#3:492\n855#3,2:493\n360#3,7:496\n1755#3,3:503\n2632#3,3:506\n1557#3:509\n1628#3,3:510\n1#4:484\n1#4:495\n1310#5,2:490\n*S KotlinDebug\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n*L\n148#1:470\n167#1:471\n167#1:472,2\n168#1:474,9\n168#1:483\n168#1:485\n168#1:486\n175#1:487\n175#1:488,2\n236#1:492\n236#1:493,2\n306#1:496,7\n452#1:503,3\n458#1:506,3\n208#1:509\n208#1:510,3\n168#1:484\n229#1:490,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f91568a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements l<j1, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91569a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j1 p02) {
            g0.p(p02, "p0");
            return Boolean.valueOf(p02.S());
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h getOwner() {
            return o0.d(j1.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends b.AbstractC0924b<CallableMemberDescriptor, CallableMemberDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<CallableMemberDescriptor> f91570a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<CallableMemberDescriptor, Boolean> f91571b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref.ObjectRef<CallableMemberDescriptor> objectRef, l<? super CallableMemberDescriptor, Boolean> lVar) {
            this.f91570a = objectRef;
            this.f91571b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o30.b.AbstractC0924b, o30.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(CallableMemberDescriptor current) {
            g0.p(current, "current");
            if (this.f91570a.element == null && this.f91571b.invoke(current).booleanValue()) {
                this.f91570a.element = current;
            }
        }

        @Override // o30.b.AbstractC0924b, o30.b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(CallableMemberDescriptor current) {
            g0.p(current, "current");
            return this.f91570a.element == null;
        }

        @Override // o30.b.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor a() {
            return this.f91570a.element;
        }
    }

    static {
        f f11 = f.f("value");
        g0.o(f11, "identifier(...)");
        f91568a = f11;
    }

    public static final m A(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        g0.m(callableMemberDescriptor);
        return z(callableMemberDescriptor, z11);
    }

    @m80.l
    public static final p10.b B(@k a0 a0Var, @k n20.c topLevelClassFqName, @k x10.b location) {
        g0.p(a0Var, "<this>");
        g0.p(topLevelClassFqName, "topLevelClassFqName");
        g0.p(location, "location");
        topLevelClassFqName.d();
        n20.c e11 = topLevelClassFqName.e();
        g0.o(e11, "parent(...)");
        x20.k r11 = a0Var.h0(e11).r();
        f g11 = topLevelClassFqName.g();
        g0.o(g11, "shortName(...)");
        p10.d h11 = r11.h(g11, location);
        if (h11 instanceof p10.b) {
            return (p10.b) h11;
        }
        return null;
    }

    public static final p10.h a(p10.h it) {
        g0.p(it, "it");
        return it.b();
    }

    public static final boolean f(@k j1 j1Var) {
        g0.p(j1Var, "<this>");
        Boolean e11 = o30.b.e(a00.g0.l(j1Var), u20.a.f91564a, a.f91569a);
        g0.o(e11, "ifAny(...)");
        return e11.booleanValue();
    }

    public static final Iterable g(j1 j1Var) {
        Collection<j1> e11 = j1Var.e();
        ArrayList arrayList = new ArrayList(i0.d0(e11, 10));
        Iterator<T> it = e11.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).a());
        }
        return arrayList;
    }

    @m80.l
    public static final CallableMemberDescriptor h(@k CallableMemberDescriptor callableMemberDescriptor, boolean z11, @k l<? super CallableMemberDescriptor, Boolean> predicate) {
        g0.p(callableMemberDescriptor, "<this>");
        g0.p(predicate, "predicate");
        return (CallableMemberDescriptor) o30.b.b(a00.g0.l(callableMemberDescriptor), new c(z11), new b(new Ref.ObjectRef(), predicate));
    }

    public static /* synthetic */ CallableMemberDescriptor i(CallableMemberDescriptor callableMemberDescriptor, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return h(callableMemberDescriptor, z11, lVar);
    }

    public static final Iterable j(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> e11;
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.a() : null;
        }
        return (callableMemberDescriptor == null || (e11 = callableMemberDescriptor.e()) == null) ? h0.J() : e11;
    }

    @m80.l
    public static final n20.c k(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        n20.d p11 = p(hVar);
        if (!p11.f()) {
            p11 = null;
        }
        if (p11 != null) {
            return p11.l();
        }
        return null;
    }

    @m80.l
    public static final p10.b l(@k q10.c cVar) {
        g0.p(cVar, "<this>");
        p10.d r11 = cVar.getType().I0().r();
        if (r11 instanceof p10.b) {
            return (p10.b) r11;
        }
        return null;
    }

    @k
    public static final j m(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        return s(hVar).q();
    }

    @m80.l
    public static final n20.b n(@m80.l p10.d dVar) {
        p10.h b11;
        n20.b n11;
        if (dVar != null && (b11 = dVar.b()) != null) {
            if (b11 instanceof p10.g0) {
                n20.c d11 = ((p10.g0) b11).d();
                f name = dVar.getName();
                g0.o(name, "getName(...)");
                return new n20.b(d11, name);
            }
            if ((b11 instanceof p10.e) && (n11 = n((p10.d) b11)) != null) {
                f name2 = dVar.getName();
                g0.o(name2, "getName(...)");
                return n11.d(name2);
            }
        }
        return null;
    }

    @k
    public static final n20.c o(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        n20.c n11 = q20.h.n(hVar);
        g0.o(n11, "getFqNameSafe(...)");
        return n11;
    }

    @k
    public static final n20.d p(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        n20.d m11 = q20.h.m(hVar);
        g0.o(m11, "getFqName(...)");
        return m11;
    }

    @m80.l
    public static final u<c1> q(@m80.l p10.b bVar) {
        h1<c1> i02 = bVar != null ? bVar.i0() : null;
        if (i02 instanceof u) {
            return (u) i02;
        }
        return null;
    }

    @k
    public static final g r(@k a0 a0Var) {
        g0.p(a0Var, "<this>");
        t tVar = (t) a0Var.A0(f30.h.a());
        c0 c0Var = tVar != null ? (c0) tVar.a() : null;
        return c0Var instanceof c0.a ? ((c0.a) c0Var).b() : g.a.f50432a;
    }

    @k
    public static final a0 s(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        a0 g11 = q20.h.g(hVar);
        g0.o(g11, "getContainingModule(...)");
        return g11;
    }

    @m80.l
    public static final b0<c1> t(@m80.l p10.b bVar) {
        h1<c1> i02 = bVar != null ? bVar.i0() : null;
        if (i02 instanceof b0) {
            return (b0) i02;
        }
        return null;
    }

    @k
    public static final m<p10.h> u(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        return k0.J0(v(hVar), 1);
    }

    @k
    public static final m<p10.h> v(@k p10.h hVar) {
        g0.p(hVar, "<this>");
        return x.t(hVar, u20.b.f91565a);
    }

    @k
    public static final CallableMemberDescriptor w(@k CallableMemberDescriptor callableMemberDescriptor) {
        g0.p(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.f)) {
            return callableMemberDescriptor;
        }
        q0 j02 = ((kotlin.reflect.jvm.internal.impl.descriptors.f) callableMemberDescriptor).j0();
        g0.o(j02, "getCorrespondingProperty(...)");
        return j02;
    }

    @m80.l
    public static final p10.b x(@k p10.b bVar) {
        g0.p(bVar, "<this>");
        for (r0 r0Var : bVar.s().I0().c()) {
            if (!j.b0(r0Var)) {
                p10.d r11 = r0Var.I0().r();
                if (q20.h.w(r11)) {
                    g0.n(r11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (p10.b) r11;
                }
            }
        }
        return null;
    }

    public static final boolean y(@k a0 a0Var) {
        c0 c0Var;
        g0.p(a0Var, "<this>");
        t tVar = (t) a0Var.A0(f30.h.a());
        return (tVar == null || (c0Var = (c0) tVar.a()) == null || !c0Var.a()) ? false : true;
    }

    @k
    public static final m<CallableMemberDescriptor> z(@k CallableMemberDescriptor callableMemberDescriptor, boolean z11) {
        g0.p(callableMemberDescriptor, "<this>");
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor.a();
        }
        m C = x.C(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
        g0.o(e11, "getOverriddenDescriptors(...)");
        return k0.T2(C, k0.k1(a00.r0.E1(e11), new d(z11)));
    }
}
