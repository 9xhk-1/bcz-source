package p20;

import a00.h0;
import a00.i0;
import a00.x1;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import e30.a2;
import e30.g1;
import e30.h2;
import e30.k2;
import e30.l2;
import e30.u1;
import e30.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import n10.o;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.junit.jupiter.api.j2;
import p10.b1;
import p10.c1;
import p10.f0;
import p10.j1;
import p10.l1;
import p10.n0;
import p10.p0;
import p10.q0;
import p10.r0;
import p10.s0;
import p10.t0;
import p20.m;
import s20.t;
import u30.k0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n152#1,10:1226\n152#1,10:1236\n2632#2,3:1246\n774#2:1249\n865#2,2:1250\n1557#2:1252\n1628#2,3:1253\n774#2:1256\n865#2,2:1257\n1557#2:1259\n1628#2,3:1260\n1557#2:1263\n1628#2,3:1264\n1611#2,9:1268\n1863#2:1277\n1864#2:1279\n1620#2:1280\n2632#2,3:1281\n2632#2,3:1284\n774#2:1287\n865#2,2:1288\n1628#2,3:1290\n1#3:1267\n1#3:1278\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n138#1:1226,10\n145#1:1236,10\n200#1:1246,3\n501#1:1249\n501#1:1250,2\n502#1:1252\n502#1:1253,3\n504#1:1256\n504#1:1257,2\n504#1:1259\n504#1:1260,3\n506#1:1263\n506#1:1264,3\n515#1:1268,9\n515#1:1277\n515#1:1279\n515#1:1280\n606#1:1281,3\n608#1:1284,3\n824#1:1287\n824#1:1288,2\n847#1:1290,3\n515#1:1278\n*E\n"})
/* loaded from: classes8.dex */
public final class t extends m implements u {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final x f78760m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final c0 f78761n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements p10.j<g2, StringBuilder> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: p20.t$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0971a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78763a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f78763a = iArr;
            }
        }

        public a() {
        }

        public void A(@m80.k j1 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.D2(descriptor, true, builder, true);
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 a(j1 j1Var, StringBuilder sb2) {
            A(j1Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 b(p10.a0 a0Var, StringBuilder sb2) {
            q(a0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 c(p10.g0 g0Var, StringBuilder sb2) {
            r(g0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 d(c1 c1Var, StringBuilder sb2) {
            z(c1Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 e(kotlin.reflect.jvm.internal.impl.descriptors.c cVar, StringBuilder sb2) {
            o(cVar, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 f(t0 t0Var, StringBuilder sb2) {
            x(t0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 g(b1 b1Var, StringBuilder sb2) {
            y(b1Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 h(q0 q0Var, StringBuilder sb2) {
            u(q0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 i(p10.b bVar, StringBuilder sb2) {
            n(bVar, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 j(r0 r0Var, StringBuilder sb2) {
            v(r0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 k(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
            p(eVar, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 l(n0 n0Var, StringBuilder sb2) {
            s(n0Var, sb2);
            return g2.f100423a;
        }

        @Override // p10.j
        public /* bridge */ /* synthetic */ g2 m(s0 s0Var, StringBuilder sb2) {
            w(s0Var, sb2);
            return g2.f100423a;
        }

        public void n(@m80.k p10.b descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.E1(descriptor, builder);
        }

        public void o(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.c constructorDescriptor, @m80.k StringBuilder builder) {
            g0.p(constructorDescriptor, "constructorDescriptor");
            g0.p(builder, "builder");
            t.this.J1(constructorDescriptor, builder);
        }

        public void p(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.R1(descriptor, builder);
        }

        public void q(@m80.k p10.a0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.b2(descriptor, builder, true);
        }

        public void r(@m80.k p10.g0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.f2(descriptor, builder);
        }

        public void s(@m80.k n0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.h2(descriptor, builder);
        }

        public final void t(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, StringBuilder sb2, String str) {
            int i11 = C0971a.f78763a[t.this.R0().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    p(fVar, sb2);
                    return;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            t.this.y1(fVar, sb2);
            sb2.append(str + " for ");
            t tVar = t.this;
            q0 j02 = fVar.j0();
            g0.o(j02, "getCorrespondingProperty(...)");
            tVar.j2(j02, sb2);
        }

        public void u(@m80.k q0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.j2(descriptor, builder);
        }

        public void v(@m80.k r0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(@m80.k s0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(@m80.k t0 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(@m80.k b1 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.s2(descriptor, builder);
        }

        public void z(@m80.k c1 descriptor, @m80.k StringBuilder builder) {
            g0.p(descriptor, "descriptor");
            g0.p(builder, "builder");
            t.this.y2(descriptor, builder, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78764a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78765b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78764a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f78765b = iArr2;
        }
    }

    public t(@m80.k x options) {
        g0.p(options, "options");
        this.f78760m = options;
        options.r0();
        this.f78761n = e0.c(new n(this));
    }

    public static /* synthetic */ void C1(t tVar, StringBuilder sb2, q10.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        tVar.B1(sb2, aVar, annotationUseSiteTarget);
    }

    public static /* synthetic */ void C2(t tVar, l1 l1Var, StringBuilder sb2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        tVar.B2(l1Var, sb2, z11);
    }

    public static final CharSequence K1(j1 j1Var) {
        return "";
    }

    public static final CharSequence q2(t tVar, e30.r0 r0Var) {
        g0.m(r0Var);
        return tVar.W(r0Var);
    }

    public static final CharSequence s0(t tVar, a2 it) {
        g0.p(it, "it");
        if (it.a()) {
            return "*";
        }
        e30.r0 type = it.getType();
        g0.o(type, "getType(...)");
        String W = tVar.W(type);
        if (it.b() == Variance.INVARIANT) {
            return W;
        }
        return it.b() + ' ' + W;
    }

    public static final t v0(t tVar) {
        m Y = tVar.Y(s.f78759a);
        g0.n(Y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (t) Y;
    }

    public static final Object v2(e30.r0 it) {
        g0.p(it, "it");
        return it instanceof e30.l1 ? ((e30.l1) it).R0() : it;
    }

    public static final g2 w0(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.f(x1.C(withOptions.c(), h0.Q(o.a.C, o.a.D)));
        return g2.f100423a;
    }

    public static /* synthetic */ void x2(t tVar, StringBuilder sb2, e30.r0 r0Var, u1 u1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            u1Var = r0Var.I0();
        }
        tVar.w2(sb2, r0Var, u1Var);
    }

    public boolean A0() {
        return this.f78760m.B();
    }

    public final List<String> A1(q10.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b B;
        List<j1> g11;
        Map<n20.f, s20.g<?>> a11 = cVar.a();
        List list = null;
        p10.b l11 = X0() ? u20.e.l(cVar) : null;
        if (l11 != null && (B = l11.B()) != null && (g11 = B.g()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : g11) {
                if (((j1) obj).S()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((j1) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = h0.J();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!a11.containsKey((n20.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i0.d0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((n20.f) it2.next()).b() + " = ...");
        }
        Set<Map.Entry<n20.f, s20.g<?>>> entrySet = a11.entrySet();
        ArrayList arrayList5 = new ArrayList(i0.d0(entrySet, 10));
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            n20.f fVar = (n20.f) entry.getKey();
            s20.g<?> gVar = (s20.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!list.contains(fVar) ? I1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        return a00.r0.v5(a00.r0.I4(arrayList4, arrayList5));
    }

    public final void A2(List<? extends c1> list, StringBuilder sb2, boolean z11) {
        if (q1() || list.isEmpty()) {
            return;
        }
        sb2.append(v1());
        z2(sb2, list);
        sb2.append(r1());
        if (z11) {
            sb2.append(" ");
        }
    }

    public boolean B0() {
        return this.f78760m.C();
    }

    public final void B1(StringBuilder sb2, q10.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (K0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<n20.c> c11 = aVar instanceof e30.r0 ? c() : F0();
            x00.l<q10.c, Boolean> z02 = z0();
            for (q10.c cVar : aVar.getAnnotations()) {
                if (!a00.r0.a2(c11, cVar.d()) && !u1(cVar) && (z02 == null || z02.invoke(cVar).booleanValue())) {
                    sb2.append(R(cVar, annotationUseSiteTarget));
                    if (E0()) {
                        sb2.append('\n');
                        g0.o(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public final void B2(l1 l1Var, StringBuilder sb2, boolean z11) {
        if (z11 || !(l1Var instanceof j1)) {
            sb2.append(U1(l1Var.E() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @m80.k
    public p20.a C0() {
        return this.f78760m.D();
    }

    @m80.l
    public x00.l<j1, String> D0() {
        return this.f78760m.E();
    }

    public final void D1(p10.e eVar, StringBuilder sb2) {
        List<c1> t11 = eVar.t();
        g0.o(t11, "getDeclaredTypeParameters(...)");
        List<c1> parameters = eVar.o().getParameters();
        g0.o(parameters, "getParameters(...)");
        if (l1() && eVar.i() && parameters.size() > t11.size()) {
            sb2.append(" /*captured type parameters: ");
            z2(sb2, parameters.subList(t11.size(), parameters.size()));
            sb2.append(r60.e.f83303c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2(p10.j1 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.U1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.l1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            C1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.v0()
            java.lang.String r3 = "crossinline"
            r8.a2(r11, r2, r3)
            boolean r2 = r9.u0()
            java.lang.String r3 = "noinline"
            r8.a2(r11, r2, r3)
            boolean r2 = r8.a1()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = r9.b()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.b r2 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.n0()
            if (r2 != r7) goto L60
            r5 = r7
            goto L61
        L60:
            r5 = r6
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.x0()
            java.lang.String r3 = "actual"
            r8.a2(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.F2(r1, r2, r3, r4, r5)
            x00.l r0 = r8.D0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.d()
            if (r0 == 0) goto L85
            boolean r0 = r9.S()
            goto L89
        L85:
            boolean r0 = u20.e.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = r7
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            x00.l r2 = r8.D0()
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.t.D2(p10.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    public boolean E0() {
        return this.f78760m.F();
    }

    public final void E1(p10.b bVar, StringBuilder sb2) {
        kotlin.reflect.jvm.internal.impl.descriptors.b B;
        boolean z11 = bVar.getKind() == ClassKind.ENUM_ENTRY;
        if (!f1()) {
            List<t0> l02 = bVar.l0();
            g0.o(l02, "getContextReceivers(...)");
            L1(l02, sb2);
            C1(this, sb2, bVar, null, 2, null);
            if (!z11) {
                p10.p visibility = bVar.getVisibility();
                g0.o(visibility, "getVisibility(...)");
                G2(visibility, sb2);
            }
            if ((bVar.getKind() != ClassKind.INTERFACE || bVar.k() != Modality.ABSTRACT) && (!bVar.getKind().isSingleton() || bVar.k() != Modality.FINAL)) {
                Modality k11 = bVar.k();
                g0.o(k11, "getModality(...)");
                Y1(k11, sb2, t1(bVar));
            }
            W1(bVar, sb2);
            a2(sb2, K0().contains(DescriptorRendererModifier.INNER) && bVar.i(), "inner");
            a2(sb2, K0().contains(DescriptorRendererModifier.DATA) && bVar.w(), "data");
            a2(sb2, K0().contains(DescriptorRendererModifier.INLINE) && bVar.isInline(), "inline");
            a2(sb2, K0().contains(DescriptorRendererModifier.VALUE) && bVar.v(), "value");
            a2(sb2, K0().contains(DescriptorRendererModifier.FUN) && bVar.u(), "fun");
            F1(bVar, sb2);
        }
        if (q20.h.x(bVar)) {
            H1(bVar, sb2);
        } else {
            if (!f1()) {
                o2(sb2);
            }
            b2(bVar, sb2, true);
        }
        if (z11) {
            return;
        }
        List<c1> t11 = bVar.t();
        g0.o(t11, "getDeclaredTypeParameters(...)");
        A2(t11, sb2, false);
        D1(bVar, sb2);
        if (!bVar.getKind().isSingleton() && B0() && (B = bVar.B()) != null) {
            sb2.append(" ");
            C1(this, sb2, B, null, 2, null);
            p10.p visibility2 = B.getVisibility();
            g0.o(visibility2, "getVisibility(...)");
            G2(visibility2, sb2);
            sb2.append(U1("constructor"));
            List<j1> g11 = B.g();
            g0.o(g11, "getValueParameters(...)");
            E2(g11, B.o0(), sb2);
        }
        p2(bVar, sb2);
        H2(t11, sb2);
    }

    public final void E2(Collection<? extends j1> collection, boolean z11, StringBuilder sb2) {
        boolean J2 = J2(z11);
        int size = collection.size();
        k1().b(size, sb2);
        int i11 = 0;
        for (j1 j1Var : collection) {
            k1().d(j1Var, i11, size, sb2);
            D2(j1Var, J2, sb2, false);
            k1().a(j1Var, i11, size, sb2);
            i11++;
        }
        k1().c(size, sb2);
    }

    @m80.k
    public Set<n20.c> F0() {
        return this.f78760m.G();
    }

    public final void F1(p10.b bVar, StringBuilder sb2) {
        sb2.append(U1(m.f78740a.a(bVar)));
    }

    public final void F2(l1 l1Var, boolean z11, StringBuilder sb2, boolean z12, boolean z13) {
        e30.r0 type = l1Var.getType();
        g0.o(type, "getType(...)");
        j1 j1Var = l1Var instanceof j1 ? (j1) l1Var : null;
        e30.r0 y02 = j1Var != null ? j1Var.y0() : null;
        e30.r0 r0Var = y02 == null ? type : y02;
        a2(sb2, y02 != null, "vararg");
        if (z13 || (z12 && !f1())) {
            B2(l1Var, sb2, z13);
        }
        if (z11) {
            b2(l1Var, sb2, z12);
            sb2.append(": ");
        }
        sb2.append(W(r0Var));
        T1(l1Var, sb2);
        if (!l1() || y02 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(W(type));
        sb2.append(r60.e.f83303c);
    }

    public final t G0() {
        return (t) this.f78761n.getValue();
    }

    @m80.k
    public String G1(@m80.k p10.d klass) {
        g0.p(klass, "klass");
        return g30.i.m(klass) ? klass.o().toString() : C0().a(klass, this);
    }

    public final boolean G2(p10.p pVar, StringBuilder sb2) {
        if (!K0().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (L0()) {
            pVar = pVar.f();
        }
        if (!Z0() && g0.g(pVar, p10.o.f78597l)) {
            return false;
        }
        sb2.append(U1(pVar.c()));
        sb2.append(" ");
        return true;
    }

    public boolean H0() {
        return this.f78760m.H();
    }

    public final void H1(p10.h hVar, StringBuilder sb2) {
        if (U0()) {
            if (f1()) {
                sb2.append("companion object");
            }
            o2(sb2);
            p10.h b11 = hVar.b();
            if (b11 != null) {
                sb2.append("of ");
                n20.f name = b11.getName();
                g0.o(name, "getName(...)");
                sb2.append(V(name, false));
            }
        }
        if (l1() || !g0.g(hVar.getName(), n20.h.f74303d)) {
            if (!f1()) {
                o2(sb2);
            }
            n20.f name2 = hVar.getName();
            g0.o(name2, "getName(...)");
            sb2.append(V(name2, true));
        }
    }

    public final void H2(List<? extends c1> list, StringBuilder sb2) {
        if (q1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (c1 c1Var : list) {
            List<e30.r0> upperBounds = c1Var.getUpperBounds();
            g0.o(upperBounds, "getUpperBounds(...)");
            for (e30.r0 r0Var : a00.r0.g2(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                n20.f name = c1Var.getName();
                g0.o(name, "getName(...)");
                sb3.append(V(name, false));
                sb3.append(" : ");
                g0.m(r0Var);
                sb3.append(W(r0Var));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(U1("where"));
        sb2.append(" ");
        a00.r0.p3(arrayList, sb2, j2.O, null, null, 0, null, null, 124, null);
    }

    public boolean I0() {
        return this.f78760m.I();
    }

    public final String I1(s20.g<?> gVar) {
        x00.l<s20.g<?>, String> R = this.f78760m.R();
        if (R != null) {
            return R.invoke(gVar);
        }
        if (gVar instanceof s20.b) {
            List<? extends s20.g<?>> b11 = ((s20.b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = b11.iterator();
            while (it.hasNext()) {
                String I1 = I1((s20.g) it.next());
                if (I1 != null) {
                    arrayList.add(I1);
                }
            }
            return a00.r0.r3(arrayList, j2.O, "{", com.alipay.sdk.m.u.i.f11099d, 0, null, null, 56, null);
        }
        if (gVar instanceof s20.a) {
            return k0.x4(m.S(this, ((s20.a) gVar).b(), null, 2, null), EmailAutoCompleteEditText.f17091d);
        }
        if (!(gVar instanceof s20.t)) {
            return gVar.toString();
        }
        t.b b12 = ((s20.t) gVar).b();
        if (b12 instanceof t.b.a) {
            return ((t.b.a) b12).a() + "::class";
        }
        if (!(b12 instanceof t.b.C1127b)) {
            throw new NoWhenBranchMatchedException();
        }
        t.b.C1127b c1127b = (t.b.C1127b) b12;
        String b13 = c1127b.b().a().b();
        g0.o(b13, "asString(...)");
        int a11 = c1127b.a();
        for (int i11 = 0; i11 < a11; i11++) {
            b13 = "kotlin.Array<" + b13 + u30.u0.f91710f;
        }
        return b13 + "::class";
    }

    public final boolean I2(e30.r0 r0Var) {
        if (!n10.i.p(r0Var)) {
            return false;
        }
        List<a2> G0 = r0Var.G0();
        if ((G0 instanceof Collection) && G0.isEmpty()) {
            return true;
        }
        Iterator<T> it = G0.iterator();
        while (it.hasNext()) {
            if (((a2) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public boolean J0() {
        return this.f78760m.J();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(kotlin.reflect.jvm.internal.impl.descriptors.c r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.t.J1(kotlin.reflect.jvm.internal.impl.descriptors.c, java.lang.StringBuilder):void");
    }

    public final boolean J2(boolean z11) {
        int i11 = b.f78765b[O0().ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return !z11;
        }
        if (i11 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public Set<DescriptorRendererModifier> K0() {
        return this.f78760m.K();
    }

    public boolean L0() {
        return this.f78760m.L();
    }

    public final void L1(List<? extends t0> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i11 = 0;
        for (t0 t0Var : list) {
            int i12 = i11 + 1;
            B1(sb2, t0Var, AnnotationUseSiteTarget.RECEIVER);
            e30.r0 type = t0Var.getType();
            g0.o(type, "getType(...)");
            sb2.append(P1(type));
            if (i11 == h0.L(list)) {
                sb2.append(") ");
            } else {
                sb2.append(j2.O);
            }
            i11 = i12;
        }
    }

    @m80.k
    public final x M0() {
        return this.f78760m;
    }

    public final void M1(StringBuilder sb2, e30.r0 r0Var) {
        C1(this, sb2, r0Var, null, 2, null);
        e30.x xVar = r0Var instanceof e30.x ? (e30.x) r0Var : null;
        e30.c1 U0 = xVar != null ? xVar.U0() : null;
        if (v0.a(r0Var)) {
            if (j30.e.A(r0Var) && Q0()) {
                sb2.append(N1(g30.i.f52687a.p(r0Var)));
            } else {
                if (!(r0Var instanceof g30.g) || J0()) {
                    sb2.append(r0Var.I0().toString());
                } else {
                    sb2.append(((g30.g) r0Var).R0());
                }
                sb2.append(t2(r0Var.G0()));
            }
        } else if (r0Var instanceof e30.l1) {
            sb2.append(((e30.l1) r0Var).R0().toString());
        } else if (U0 instanceof e30.l1) {
            sb2.append(((e30.l1) U0).R0().toString());
        } else {
            x2(this, sb2, r0Var, null, 2, null);
            g2 g2Var = g2.f100423a;
        }
        if (r0Var.J0()) {
            sb2.append("?");
        }
        if (g1.c(r0Var)) {
            sb2.append(" & Any");
        }
    }

    @m80.k
    public OverrideRenderingPolicy N0() {
        return this.f78760m.M();
    }

    public final String N1(String str) {
        int i11 = b.f78764a[g1().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    @m80.k
    public ParameterNameRenderingPolicy O0() {
        return this.f78760m.N();
    }

    public final void O1(StringBuilder sb2, e30.a aVar) {
        RenderingFormat g12 = g1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (g12 == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        d2(sb2, aVar.a0());
        sb2.append(" */");
        if (g1() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    public boolean P0() {
        return this.f78760m.O();
    }

    public final String P1(e30.r0 r0Var) {
        String W = W(r0Var);
        if ((!I2(r0Var) || h2.l(r0Var)) && !(r0Var instanceof e30.x)) {
            return W;
        }
        return '(' + W + ')';
    }

    @Override // p20.m
    @m80.k
    public String Q(@m80.k p10.h declarationDescriptor) {
        g0.p(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.y(new a(), sb2);
        if (m1()) {
            q0(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public boolean Q0() {
        return this.f78760m.P();
    }

    public final String Q1(List<n20.f> list) {
        return u0(a0.c(list));
    }

    @Override // p20.m
    @m80.k
    public String R(@m80.k q10.c annotation, @m80.l AnnotationUseSiteTarget annotationUseSiteTarget) {
        g0.p(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        e30.r0 type = annotation.getType();
        sb2.append(W(type));
        if (j()) {
            List<String> A1 = A1(annotation);
            if (l() || !A1.isEmpty()) {
                a00.r0.p3(A1, sb2, j2.O, pn.j.f81006c, pn.j.f81007d, 0, null, null, 112, null);
            }
        }
        if (l1() && (v0.a(type) || (type.I0().r() instanceof f0.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public PropertyAccessorRenderingPolicy R0() {
        return this.f78760m.Q();
    }

    public final void R1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2;
        StringBuilder sb3;
        if (f1()) {
            eVar2 = eVar;
            sb3 = sb2;
        } else {
            if (e1()) {
                eVar2 = eVar;
                sb3 = sb2;
            } else {
                List<t0> z02 = eVar.z0();
                g0.o(z02, "getContextReceiverParameters(...)");
                L1(z02, sb2);
                eVar2 = eVar;
                sb3 = sb2;
                C1(this, sb3, eVar2, null, 2, null);
                p10.p visibility = eVar2.getVisibility();
                g0.o(visibility, "getVisibility(...)");
                G2(visibility, sb3);
                Z1(eVar2, sb3);
                if (H0()) {
                    W1(eVar2, sb3);
                }
                e2(eVar2, sb3);
                if (H0()) {
                    z1(eVar2, sb3);
                } else {
                    r2(eVar2, sb3);
                }
                V1(eVar2, sb3);
                if (l1()) {
                    if (eVar2.D0()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (eVar2.U()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(U1("fun"));
            sb3.append(" ");
            List<c1> typeParameters = eVar2.getTypeParameters();
            g0.o(typeParameters, "getTypeParameters(...)");
            A2(typeParameters, sb3, true);
            l2(eVar2, sb3);
        }
        b2(eVar2, sb3, true);
        List<j1> g11 = eVar2.g();
        g0.o(g11, "getValueParameters(...)");
        E2(g11, eVar2.o0(), sb3);
        m2(eVar2, sb3);
        e30.r0 returnType = eVar2.getReturnType();
        if (!o1() && (j1() || returnType == null || !n10.j.C0(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : W(returnType));
        }
        List<c1> typeParameters2 = eVar2.getTypeParameters();
        g0.o(typeParameters2, "getTypeParameters(...)");
        H2(typeParameters2, sb3);
    }

    public boolean S0() {
        return this.f78760m.S();
    }

    public final void S1(StringBuilder sb2, e30.r0 r0Var) {
        n20.f fVar;
        int length = sb2.length();
        C1(G0(), sb2, r0Var, null, 2, null);
        boolean z11 = sb2.length() != length;
        e30.r0 k11 = n10.i.k(r0Var);
        List<e30.r0> e11 = n10.i.e(r0Var);
        boolean r11 = n10.i.r(r0Var);
        boolean J0 = r0Var.J0();
        boolean z12 = J0 || (z11 && k11 != null);
        if (z12) {
            if (r11) {
                sb2.insert(length, '(');
            } else {
                if (z11) {
                    kotlin.text.a.r(u30.r0.W7(sb2));
                    if (sb2.charAt(k0.A3(sb2) - 1) != ')') {
                        sb2.insert(k0.A3(sb2), "()");
                    }
                }
                sb2.append(pn.j.f81006c);
            }
        }
        if (!e11.isEmpty()) {
            sb2.append("context(");
            Iterator<e30.r0> it = e11.subList(0, h0.L(e11)).iterator();
            while (it.hasNext()) {
                c2(sb2, it.next());
                sb2.append(j2.O);
            }
            c2(sb2, (e30.r0) a00.r0.u3(e11));
            sb2.append(") ");
        }
        a2(sb2, r11, "suspend");
        if (k11 != null) {
            boolean z13 = (I2(k11) && !k11.J0()) || s1(k11) || (k11 instanceof e30.x);
            if (z13) {
                sb2.append(pn.j.f81006c);
            }
            c2(sb2, k11);
            if (z13) {
                sb2.append(pn.j.f81007d);
            }
            sb2.append(".");
        }
        sb2.append(pn.j.f81006c);
        if (!n10.i.n(r0Var) || r0Var.G0().size() > 1) {
            int i11 = 0;
            for (a2 a2Var : n10.i.m(r0Var)) {
                int i12 = i11 + 1;
                if (i11 > 0) {
                    sb2.append(j2.O);
                }
                if (P0()) {
                    e30.r0 type = a2Var.getType();
                    g0.o(type, "getType(...)");
                    fVar = n10.i.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(V(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(X(a2Var));
                i11 = i12;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(t0());
        sb2.append(" ");
        c2(sb2, n10.i.l(r0Var));
        if (z12) {
            sb2.append(pn.j.f81007d);
        }
        if (J0) {
            sb2.append("?");
        }
    }

    @Override // p20.m
    @m80.k
    public String T(@m80.k String lowerRendered, @m80.k String upperRendered, @m80.k n10.j builtIns) {
        g0.p(lowerRendered, "lowerRendered");
        g0.p(upperRendered, "upperRendered");
        g0.p(builtIns, "builtIns");
        if (a0.f(lowerRendered, upperRendered)) {
            if (!u30.f0.J2(upperRendered, pn.j.f81006c, false, 2, null)) {
                return lowerRendered + PublicSuffixDatabase.f77441i;
            }
            return '(' + lowerRendered + ")!";
        }
        p20.a C0 = C0();
        p10.b w11 = builtIns.w();
        g0.o(w11, "getCollection(...)");
        String U5 = k0.U5(C0.a(w11, this), "Collection", null, 2, null);
        String d11 = a0.d(lowerRendered, U5 + "Mutable", upperRendered, U5, U5 + "(Mutable)");
        if (d11 != null) {
            return d11;
        }
        String d12 = a0.d(lowerRendered, U5 + "MutableMap.MutableEntry", upperRendered, U5 + "Map.Entry", U5 + "(Mutable)Map.(Mutable)Entry");
        if (d12 != null) {
            return d12;
        }
        p20.a C02 = C0();
        p10.b j11 = builtIns.j();
        g0.o(j11, "getArray(...)");
        String U52 = k0.U5(C02.a(j11, this), "Array", null, 2, null);
        String d13 = a0.d(lowerRendered, U52 + u0("Array<"), upperRendered, U52 + u0("Array<out "), U52 + u0("Array<(out) "));
        if (d13 != null) {
            return d13;
        }
        return '(' + lowerRendered + zr.m.f102856e + upperRendered + ')';
    }

    public boolean T0() {
        return this.f78760m.T();
    }

    public final void T1(l1 l1Var, StringBuilder sb2) {
        s20.g<?> t02;
        String I1;
        if (!I0() || (t02 = l1Var.t0()) == null || (I1 = I1(t02)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(u0(I1));
    }

    @Override // p20.m
    @m80.k
    public String U(@m80.k n20.d fqName) {
        g0.p(fqName, "fqName");
        List<n20.f> h11 = fqName.h();
        g0.o(h11, "pathSegments(...)");
        return Q1(h11);
    }

    public boolean U0() {
        return this.f78760m.U();
    }

    public final String U1(String str) {
        int i11 = b.f78764a[g1().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!A0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    @Override // p20.m
    @m80.k
    public String V(@m80.k n20.f name, boolean z11) {
        g0.p(name, "name");
        String u02 = u0(a0.b(name));
        if (!A0() || g1() != RenderingFormat.HTML || !z11) {
            return u02;
        }
        return "<b>" + u02 + "</b>";
    }

    public boolean V0() {
        return this.f78760m.V();
    }

    public final void V1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (K0().contains(DescriptorRendererModifier.MEMBER_KIND) && l1() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append(r60.e.f83304d);
            sb2.append(m30.a.f(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    @Override // p20.m
    @m80.k
    public String W(@m80.k e30.r0 type) {
        g0.p(type, "type");
        StringBuilder sb2 = new StringBuilder();
        c2(sb2, h1().invoke(type));
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public boolean W0() {
        return this.f78760m.W();
    }

    public final void W1(p10.x xVar, StringBuilder sb2) {
        a2(sb2, xVar.isExternal(), "external");
        boolean z11 = false;
        a2(sb2, K0().contains(DescriptorRendererModifier.EXPECT) && xVar.q0(), "expect");
        if (K0().contains(DescriptorRendererModifier.ACTUAL) && xVar.k0()) {
            z11 = true;
        }
        a2(sb2, z11, "actual");
    }

    @Override // p20.m
    @m80.k
    public String X(@m80.k a2 typeProjection) {
        g0.p(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        r0(sb2, a00.g0.l(typeProjection));
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public boolean X0() {
        return this.f78760m.X();
    }

    @m80.k
    public String X1(@m80.k String message) {
        g0.p(message, "message");
        int i11 = b.f78764a[g1().ordinal()];
        if (i11 == 1) {
            return message;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public boolean Y0() {
        return this.f78760m.Y();
    }

    public final void Y1(Modality modality, StringBuilder sb2, Modality modality2) {
        if (Y0() || modality != modality2) {
            a2(sb2, K0().contains(DescriptorRendererModifier.MODALITY), m30.a.f(modality.name()));
        }
    }

    public boolean Z0() {
        return this.f78760m.Z();
    }

    public final void Z1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (q20.h.J(callableMemberDescriptor) && callableMemberDescriptor.k() == Modality.FINAL) {
            return;
        }
        if (N0() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.k() == Modality.OPEN && w1(callableMemberDescriptor)) {
            return;
        }
        Modality k11 = callableMemberDescriptor.k();
        g0.o(k11, "getModality(...)");
        Y1(k11, sb2, t1(callableMemberDescriptor));
    }

    @Override // p20.u
    public void a(@m80.k ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        g0.p(parameterNameRenderingPolicy, "<set-?>");
        this.f78760m.a(parameterNameRenderingPolicy);
    }

    public boolean a1() {
        return this.f78760m.a0();
    }

    public final void a2(StringBuilder sb2, boolean z11, String str) {
        if (z11) {
            sb2.append(U1(str));
            sb2.append(" ");
        }
    }

    @Override // p20.u
    public boolean b() {
        return this.f78760m.b();
    }

    public boolean b1() {
        return this.f78760m.b0();
    }

    public final void b2(p10.h hVar, StringBuilder sb2, boolean z11) {
        n20.f name = hVar.getName();
        g0.o(name, "getName(...)");
        sb2.append(V(name, z11));
    }

    @Override // p20.u
    @m80.k
    public Set<n20.c> c() {
        return this.f78760m.c();
    }

    public boolean c1() {
        return this.f78760m.c0();
    }

    public final void c2(StringBuilder sb2, e30.r0 r0Var) {
        k2 L0 = r0Var.L0();
        e30.a aVar = L0 instanceof e30.a ? (e30.a) L0 : null;
        if (aVar == null) {
            d2(sb2, r0Var);
            return;
        }
        if (b1()) {
            d2(sb2, aVar.a0());
            if (T0()) {
                x1(sb2, aVar);
                return;
            }
            return;
        }
        d2(sb2, aVar.U0());
        if (c1()) {
            O1(sb2, aVar);
        }
    }

    @Override // p20.u
    public boolean d() {
        return this.f78760m.d();
    }

    public boolean d1() {
        return this.f78760m.d0();
    }

    public final void d2(StringBuilder sb2, e30.r0 r0Var) {
        if ((r0Var instanceof l2) && d() && !((l2) r0Var).N0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        k2 L0 = r0Var.L0();
        if (L0 instanceof e30.i0) {
            sb2.append(((e30.i0) L0).S0(this, this));
        } else {
            if (!(L0 instanceof e30.c1)) {
                throw new NoWhenBranchMatchedException();
            }
            n2(sb2, (e30.c1) L0);
        }
    }

    @Override // p20.u
    @m80.k
    public AnnotationArgumentsRenderingPolicy e() {
        return this.f78760m.e();
    }

    public boolean e1() {
        return this.f78760m.e0();
    }

    public final void e2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (K0().contains(DescriptorRendererModifier.OVERRIDE) && w1(callableMemberDescriptor) && N0() != OverrideRenderingPolicy.RENDER_OPEN) {
            a2(sb2, true, "override");
            if (l1()) {
                sb2.append(r60.e.f83304d);
                sb2.append(callableMemberDescriptor.e().size());
                sb2.append("*/ ");
            }
        }
    }

    @Override // p20.u
    public void f(@m80.k Set<n20.c> set) {
        g0.p(set, "<set-?>");
        this.f78760m.f(set);
    }

    public boolean f1() {
        return this.f78760m.f0();
    }

    public final void f2(p10.g0 g0Var, StringBuilder sb2) {
        g2(g0Var.d(), "package-fragment", sb2);
        if (d()) {
            sb2.append(" in ");
            b2(g0Var.b(), sb2, false);
        }
    }

    @Override // p20.u
    public void g(@m80.k Set<? extends DescriptorRendererModifier> set) {
        g0.p(set, "<set-?>");
        this.f78760m.g(set);
    }

    @m80.k
    public RenderingFormat g1() {
        return this.f78760m.g0();
    }

    public final void g2(n20.c cVar, String str, StringBuilder sb2) {
        sb2.append(U1(str));
        n20.d j11 = cVar.j();
        g0.o(j11, "toUnsafe(...)");
        String U = U(j11);
        if (U.length() > 0) {
            sb2.append(" ");
            sb2.append(U);
        }
    }

    @Override // p20.u
    public void h(boolean z11) {
        this.f78760m.h(z11);
    }

    @m80.k
    public x00.l<e30.r0, e30.r0> h1() {
        return this.f78760m.h0();
    }

    public final void h2(n0 n0Var, StringBuilder sb2) {
        g2(n0Var.d(), "package", sb2);
        if (d()) {
            sb2.append(" in context of ");
            b2(n0Var.C0(), sb2, false);
        }
    }

    @Override // p20.u
    public void i(boolean z11) {
        this.f78760m.i(z11);
    }

    public boolean i1() {
        return this.f78760m.i0();
    }

    public final void i2(StringBuilder sb2, p0 p0Var) {
        p0 c11 = p0Var.c();
        if (c11 != null) {
            i2(sb2, c11);
            sb2.append('.');
            n20.f name = p0Var.b().getName();
            g0.o(name, "getName(...)");
            sb2.append(V(name, false));
        } else {
            u1 o11 = p0Var.b().o();
            g0.o(o11, "getTypeConstructor(...)");
            sb2.append(u2(o11));
        }
        sb2.append(t2(p0Var.a()));
    }

    @Override // p20.u
    public boolean j() {
        return this.f78760m.j();
    }

    public boolean j1() {
        return this.f78760m.j0();
    }

    public final void j2(q0 q0Var, StringBuilder sb2) {
        q0 q0Var2;
        StringBuilder sb3;
        if (f1()) {
            q0Var2 = q0Var;
            sb3 = sb2;
        } else {
            if (!e1()) {
                List<t0> z02 = q0Var.z0();
                g0.o(z02, "getContextReceiverParameters(...)");
                L1(z02, sb2);
                k2(q0Var, sb2);
                p10.p visibility = q0Var.getVisibility();
                g0.o(visibility, "getVisibility(...)");
                G2(visibility, sb2);
                boolean z11 = false;
                a2(sb2, K0().contains(DescriptorRendererModifier.CONST) && q0Var.isConst(), "const");
                W1(q0Var, sb2);
                Z1(q0Var, sb2);
                e2(q0Var, sb2);
                if (K0().contains(DescriptorRendererModifier.LATEINIT) && q0Var.B0()) {
                    z11 = true;
                }
                a2(sb2, z11, "lateinit");
                V1(q0Var, sb2);
            }
            q0Var2 = q0Var;
            sb3 = sb2;
            C2(this, q0Var2, sb3, false, 4, null);
            List<c1> typeParameters = q0Var2.getTypeParameters();
            g0.o(typeParameters, "getTypeParameters(...)");
            A2(typeParameters, sb3, true);
            l2(q0Var2, sb3);
        }
        b2(q0Var2, sb3, true);
        sb3.append(": ");
        e30.r0 type = q0Var2.getType();
        g0.o(type, "getType(...)");
        sb3.append(W(type));
        m2(q0Var2, sb3);
        T1(q0Var2, sb3);
        List<c1> typeParameters2 = q0Var2.getTypeParameters();
        g0.o(typeParameters2, "getTypeParameters(...)");
        H2(typeParameters2, sb3);
    }

    @Override // p20.u
    public void k(boolean z11) {
        this.f78760m.k(z11);
    }

    @m80.k
    public m.b k1() {
        return this.f78760m.k0();
    }

    public final void k2(q0 q0Var, StringBuilder sb2) {
        if (K0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            C1(this, sb2, q0Var, null, 2, null);
            p10.r Q = q0Var.Q();
            if (Q != null) {
                B1(sb2, Q, AnnotationUseSiteTarget.FIELD);
            }
            p10.r F = q0Var.F();
            if (F != null) {
                B1(sb2, F, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (R0() == PropertyAccessorRenderingPolicy.NONE) {
                r0 getter = q0Var.getGetter();
                if (getter != null) {
                    B1(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                s0 setter = q0Var.getSetter();
                if (setter != null) {
                    B1(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<j1> g11 = setter.g();
                    g0.o(g11, "getValueParameters(...)");
                    j1 j1Var = (j1) a00.r0.m5(g11);
                    g0.m(j1Var);
                    B1(sb2, j1Var, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    @Override // p20.u
    public boolean l() {
        return this.f78760m.l();
    }

    public boolean l1() {
        return this.f78760m.l0();
    }

    public final void l2(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        t0 f02 = aVar.f0();
        if (f02 != null) {
            B1(sb2, f02, AnnotationUseSiteTarget.RECEIVER);
            e30.r0 type = f02.getType();
            g0.o(type, "getType(...)");
            sb2.append(P1(type));
            sb2.append(".");
        }
    }

    @Override // p20.u
    public void m(boolean z11) {
        this.f78760m.m(z11);
    }

    public boolean m1() {
        return this.f78760m.m0();
    }

    public final void m2(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        t0 f02;
        if (S0() && (f02 = aVar.f0()) != null) {
            sb2.append(" on ");
            e30.r0 type = f02.getType();
            g0.o(type, "getType(...)");
            sb2.append(W(type));
        }
    }

    @Override // p20.u
    public void n(boolean z11) {
        this.f78760m.n(z11);
    }

    public boolean n1() {
        return this.f78760m.n0();
    }

    public final void n2(StringBuilder sb2, e30.c1 c1Var) {
        if (g0.g(c1Var, h2.f48598b) || h2.k(c1Var)) {
            sb2.append("???");
            return;
        }
        if (g30.i.o(c1Var)) {
            if (!i1()) {
                sb2.append("???");
                return;
            }
            u1 I0 = c1Var.I0();
            g0.n(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(N1(((g30.h) I0).f(0)));
            return;
        }
        if (v0.a(c1Var)) {
            M1(sb2, c1Var);
        } else if (I2(c1Var)) {
            S1(sb2, c1Var);
        } else {
            M1(sb2, c1Var);
        }
    }

    @Override // p20.u
    public void o(boolean z11) {
        this.f78760m.o(z11);
    }

    public boolean o1() {
        return this.f78760m.o0();
    }

    public final void o2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    @Override // p20.u
    public void p(boolean z11) {
        this.f78760m.p(z11);
    }

    public boolean p1() {
        return this.f78760m.p0();
    }

    public final void p2(p10.b bVar, StringBuilder sb2) {
        if (p1() || n10.j.n0(bVar.s())) {
            return;
        }
        Collection<e30.r0> c11 = bVar.o().c();
        g0.o(c11, "getSupertypes(...)");
        if (c11.isEmpty()) {
            return;
        }
        if (c11.size() == 1 && n10.j.b0(c11.iterator().next())) {
            return;
        }
        o2(sb2);
        sb2.append(": ");
        a00.r0.p3(c11, sb2, j2.O, null, null, 0, null, new r(this), 60, null);
    }

    @Override // p20.u
    public void q(@m80.k RenderingFormat renderingFormat) {
        g0.p(renderingFormat, "<set-?>");
        this.f78760m.q(renderingFormat);
    }

    public final void q0(StringBuilder sb2, p10.h hVar) {
        p10.h b11;
        String name;
        if ((hVar instanceof p10.g0) || (hVar instanceof n0) || (b11 = hVar.b()) == null || (b11 instanceof p10.a0)) {
            return;
        }
        sb2.append(" ");
        sb2.append(X1("defined in"));
        sb2.append(" ");
        n20.d m11 = q20.h.m(b11);
        g0.o(m11, "getFqName(...)");
        sb2.append(m11.e() ? "root package" : U(m11));
        if (n1() && (b11 instanceof p10.g0) && (hVar instanceof p10.k) && (name = ((p10.k) hVar).getSource().b().getName()) != null) {
            sb2.append(" ");
            sb2.append(X1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    public boolean q1() {
        return this.f78760m.q0();
    }

    @Override // p20.u
    public void r(@m80.k AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        g0.p(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f78760m.r(annotationArgumentsRenderingPolicy);
    }

    public final void r0(StringBuilder sb2, List<? extends a2> list) {
        a00.r0.p3(list, sb2, j2.O, null, null, 0, null, new p(this), 60, null);
    }

    public final String r1() {
        return u0(">");
    }

    public final void r2(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
        a2(sb2, eVar.isSuspend(), "suspend");
    }

    @Override // p20.u
    public void s(@m80.k p20.a aVar) {
        g0.p(aVar, "<set-?>");
        this.f78760m.s(aVar);
    }

    public final boolean s1(e30.r0 r0Var) {
        return n10.i.r(r0Var) || !r0Var.getAnnotations().isEmpty();
    }

    public final void s2(b1 b1Var, StringBuilder sb2) {
        C1(this, sb2, b1Var, null, 2, null);
        p10.p visibility = b1Var.getVisibility();
        g0.o(visibility, "getVisibility(...)");
        G2(visibility, sb2);
        W1(b1Var, sb2);
        sb2.append(U1("typealias"));
        sb2.append(" ");
        b2(b1Var, sb2, true);
        List<c1> t11 = b1Var.t();
        g0.o(t11, "getDeclaredTypeParameters(...)");
        A2(t11, sb2, false);
        D1(b1Var, sb2);
        sb2.append(" = ");
        sb2.append(W(b1Var.x0()));
    }

    @Override // p20.u
    public void t(boolean z11) {
        this.f78760m.t(z11);
    }

    public final String t0() {
        int i11 = b.f78764a[g1().ordinal()];
        if (i11 == 1) {
            return u0("->");
        }
        if (i11 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Modality t1(p10.x xVar) {
        if (xVar instanceof p10.b) {
            return ((p10.b) xVar).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        p10.h b11 = xVar.b();
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar == null) {
            return Modality.FINAL;
        }
        if (!(xVar instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) xVar;
        Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
        g0.o(e11, "getOverriddenDescriptors(...)");
        if (!e11.isEmpty() && bVar.k() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (bVar.getKind() != ClassKind.INTERFACE || g0.g(callableMemberDescriptor.getVisibility(), p10.o.f78586a)) {
            return Modality.FINAL;
        }
        Modality k11 = callableMemberDescriptor.k();
        Modality modality = Modality.ABSTRACT;
        return k11 == modality ? modality : Modality.OPEN;
    }

    @m80.k
    public String t2(@m80.k List<? extends a2> typeArguments) {
        g0.p(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v1());
        r0(sb2, typeArguments);
        sb2.append(r1());
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final String u0(String str) {
        return g1().escape(str);
    }

    public final boolean u1(q10.c cVar) {
        return g0.g(cVar.d(), o.a.E);
    }

    @m80.k
    public String u2(@m80.k u1 typeConstructor) {
        g0.p(typeConstructor, "typeConstructor");
        p10.d r11 = typeConstructor.r();
        if ((r11 instanceof c1) || (r11 instanceof p10.b) || (r11 instanceof b1)) {
            return G1(r11);
        }
        if (r11 == null) {
            return typeConstructor instanceof e30.q0 ? ((e30.q0) typeConstructor).l(o.f78755a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + r11.getClass()).toString());
    }

    public final String v1() {
        return u0("<");
    }

    public final boolean w1(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.e().isEmpty();
    }

    public final void w2(StringBuilder sb2, e30.r0 r0Var, u1 u1Var) {
        p0 d11 = p10.g1.d(r0Var);
        if (d11 != null) {
            i2(sb2, d11);
        } else {
            sb2.append(u2(u1Var));
            sb2.append(t2(r0Var.G0()));
        }
    }

    public boolean x0() {
        return this.f78760m.y();
    }

    public final void x1(StringBuilder sb2, e30.a aVar) {
        RenderingFormat g12 = g1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (g12 == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        d2(sb2, aVar.U0());
        sb2.append(" */");
        if (g1() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    public boolean y0() {
        return this.f78760m.z();
    }

    public final void y1(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, StringBuilder sb2) {
        W1(fVar, sb2);
    }

    public final void y2(c1 c1Var, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(v1());
        }
        if (l1()) {
            sb2.append(r60.e.f83304d);
            sb2.append(c1Var.getIndex());
            sb2.append("*/ ");
        }
        a2(sb2, c1Var.h(), "reified");
        String label = c1Var.j().getLabel();
        boolean z12 = true;
        a2(sb2, label.length() > 0, label);
        C1(this, sb2, c1Var, null, 2, null);
        b2(c1Var, sb2, z11);
        int size = c1Var.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            e30.r0 next = c1Var.getUpperBounds().iterator().next();
            if (!n10.j.j0(next)) {
                sb2.append(" : ");
                g0.m(next);
                sb2.append(W(next));
            }
        } else if (z11) {
            for (e30.r0 r0Var : c1Var.getUpperBounds()) {
                if (!n10.j.j0(r0Var)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    g0.m(r0Var);
                    sb2.append(W(r0Var));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(r1());
        }
    }

    @m80.l
    public x00.l<q10.c, Boolean> z0() {
        return this.f78760m.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (y0() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (y0() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(kotlin.reflect.jvm.internal.impl.descriptors.e r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "getOverriddenDescriptors(...)"
            if (r0 == 0) goto L3b
            java.util.Collection r0 = r6.e()
            kotlin.jvm.internal.g0.o(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1d
            goto L39
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L21
            boolean r0 = r5.y0()
            if (r0 == 0) goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L72
            java.util.Collection r4 = r6.e()
            kotlin.jvm.internal.g0.o(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L55
            goto L71
        L55:
            java.util.Iterator r3 = r4.iterator()
        L59:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L59
            boolean r3 = r5.y0()
            if (r3 == 0) goto L72
        L71:
            r1 = r2
        L72:
            boolean r2 = r6.A()
            java.lang.String r3 = "tailrec"
            r5.a2(r7, r2, r3)
            r5.r2(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r2 = "inline"
            r5.a2(r7, r6, r2)
            java.lang.String r6 = "infix"
            r5.a2(r7, r1, r6)
            java.lang.String r6 = "operator"
            r5.a2(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.t.z1(kotlin.reflect.jvm.internal.impl.descriptors.e, java.lang.StringBuilder):void");
    }

    public final void z2(StringBuilder sb2, List<? extends c1> list) {
        Iterator<? extends c1> it = list.iterator();
        while (it.hasNext()) {
            y2(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(j2.O);
            }
        }
    }
}
