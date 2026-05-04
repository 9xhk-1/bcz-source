package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a00.i0;
import a00.w1;
import c20.z;
import d30.g;
import d30.i;
import d30.m;
import e30.c1;
import e30.f2;
import e30.r0;
import e30.x0;
import h10.n;
import h20.b0;
import h20.c0;
import h20.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import m80.k;
import o10.h;
import o10.j;
import o10.o;
import o10.p;
import o10.s;
import o30.b;
import o30.l;
import p10.a0;
import p10.j1;
import p10.t;
import q10.f;
import s10.h0;
import x00.l;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmBuiltInsCustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1755#2,3:377\n1611#2,9:380\n1863#2:389\n1864#2:391\n1620#2:392\n1557#2:393\n1628#2,3:394\n774#2:397\n865#2:398\n1755#2,3:399\n866#2:402\n774#2:403\n865#2:404\n2632#2,3:405\n866#2:408\n1557#2:409\n1628#2,3:410\n1755#2,3:413\n1611#2,9:416\n1863#2:425\n1864#2:427\n1620#2:428\n1#3:390\n1#3:426\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n*L\n120#1:377,3\n136#1:380,9\n136#1:389\n136#1:391\n136#1:392\n195#1:393\n195#1:394,3\n209#1:397\n209#1:398\n214#1:399,3\n209#1:402\n317#1:403\n317#1:404\n319#1:405,3\n317#1:408\n326#1:409\n326#1:410,3\n353#1:413,3\n257#1:416,9\n257#1:425\n257#1:427\n257#1:428\n136#1:390\n257#1:426\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements r10.a, r10.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f67233i = {o0.u(new PropertyReference1Impl(o0.d(d.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), o0.u(new PropertyReference1Impl(o0.d(d.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), o0.u(new PropertyReference1Impl(o0.d(d.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a0 f67234a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o10.b f67235b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f67236c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r0 f67237d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final i f67238e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d30.a<n20.c, p10.b> f67239f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final i f67240g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g<Pair<String, String>, q10.g> f67241h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67242a = new a("HIDDEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f67243b = new a("VISIBLE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f67244c = new a("DEPRECATED_LIST_METHODS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f67245d = new a("NOT_CONSIDERED", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f67246e = new a("DROP", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f67247f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ m00.a f67248g;

        static {
            a[] a11 = a();
            f67247f = a11;
            f67248g = m00.c.c(a11);
        }

        public a(String str, int i11) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f67242a, f67243b, f67244c, f67245d, f67246e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f67247f.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67249a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f67242a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f67244c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f67245d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f67246e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f67243b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f67249a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends h0 {
        public c(a0 a0Var, n20.c cVar) {
            super(a0Var, cVar);
        }

        @Override // p10.g0
        /* renamed from: E0, reason: merged with bridge method [inline-methods] */
        public k.c r() {
            return k.c.f97119b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.d$d, reason: collision with other inner class name */
    public static final class C0791d extends b.AbstractC0924b<p10.b, a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67250a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<a> f67251b;

        public C0791d(String str, Ref.ObjectRef<a> objectRef) {
            this.f67250a = str;
            this.f67251b = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.d$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.d$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.d$a] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.d$a] */
        @Override // o30.b.AbstractC0924b, o30.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(p10.b javaClassDescriptor) {
            g0.p(javaClassDescriptor, "javaClassDescriptor");
            String a11 = b0.a(f0.f58067a, javaClassDescriptor, this.f67250a);
            s sVar = s.f75565a;
            if (sVar.f().contains(a11)) {
                this.f67251b.element = a.f67242a;
            } else if (sVar.i().contains(a11)) {
                this.f67251b.element = a.f67243b;
            } else if (sVar.c().contains(a11)) {
                this.f67251b.element = a.f67244c;
            } else if (sVar.d().contains(a11)) {
                this.f67251b.element = a.f67246e;
            }
            return this.f67251b.element == null;
        }

        @Override // o30.b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = this.f67251b.element;
            return aVar == null ? a.f67245d : aVar;
        }
    }

    public d(@m80.k a0 moduleDescriptor, @m80.k d30.n storageManager, @m80.k x00.a<JvmBuiltIns.a> settingsComputation) {
        g0.p(moduleDescriptor, "moduleDescriptor");
        g0.p(storageManager, "storageManager");
        g0.p(settingsComputation, "settingsComputation");
        this.f67234a = moduleDescriptor;
        this.f67235b = o10.b.f75542a;
        this.f67236c = storageManager.f(settingsComputation);
        this.f67237d = q(storageManager);
        this.f67238e = storageManager.f(new h(this, storageManager));
        this.f67239f = storageManager.g();
        this.f67240g = storageManager.f(new o10.i(this));
        this.f67241h = storageManager.b(new j(this));
    }

    public static final Iterable B(d dVar, p10.b bVar) {
        Collection<r0> c11 = bVar.o().c();
        g0.o(c11, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            p10.d r11 = ((r0) it.next()).I0().r();
            c20.n nVar = null;
            p10.d a11 = r11 != null ? r11.a() : null;
            p10.b bVar2 = a11 instanceof p10.b ? (p10.b) a11 : null;
            if (bVar2 != null && (nVar = dVar.z(bVar2)) == null) {
                nVar = bVar2;
            }
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public static final Iterable F(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.a().e();
    }

    public static final Boolean G(d dVar, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z11;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            o10.b bVar = dVar.f67235b;
            p10.h b11 = callableMemberDescriptor.b();
            g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (bVar.c((p10.b) b11)) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }

    public static final q10.g I(d dVar) {
        return q10.g.A0.a(a00.g0.l(f.c(dVar.f67234a.q(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    public static final c1 o(d dVar, d30.n nVar) {
        return t.d(dVar.D().a(), kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f67225d.a(), new p10.f0(nVar, dVar.D().a())).s();
    }

    public static final r0 r(d dVar) {
        c1 i11 = dVar.f67234a.q().i();
        g0.o(i11, "getAnyType(...)");
        return i11;
    }

    public static final q10.g s(d dVar, Pair pair) {
        g0.p(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return q10.g.A0.a(a00.g0.l(f.b(dVar.f67234a.q(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    public static final p10.b u(c20.n nVar, p10.b bVar) {
        z10.j EMPTY = z10.j.f100618a;
        g0.o(EMPTY, "EMPTY");
        return nVar.K0(EMPTY, bVar);
    }

    public static final boolean w(kotlin.reflect.jvm.internal.impl.descriptors.c cVar, f2 f2Var, kotlin.reflect.jvm.internal.impl.descriptors.c cVar2) {
        return OverridingUtil.x(cVar, cVar2.c(f2Var)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    public static final Collection x(n20.f fVar, x20.k it) {
        g0.p(it, "it");
        return it.a(fVar, NoLookupLocation.FROM_BUILTINS);
    }

    public final a A(e eVar) {
        p10.h b11 = eVar.b();
        g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b12 = o30.b.b(a00.g0.l((p10.b) b11), new p(this), new C0791d(c0.c(eVar, false, false, 3, null), new Ref.ObjectRef()));
        g0.o(b12, "dfs(...)");
        return (a) b12;
    }

    public final q10.g C() {
        return (q10.g) m.a(this.f67240g, this, f67233i[2]);
    }

    public final JvmBuiltIns.a D() {
        return (JvmBuiltIns.a) m.a(this.f67236c, this, f67233i[0]);
    }

    public final boolean E(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, boolean z11) {
        p10.h b11 = gVar.b();
        g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c11 = c0.c(gVar, false, false, 3, null);
        if (z11 ^ s.f75565a.g().contains(b0.a(f0.f58067a, (p10.b) b11, c11))) {
            return true;
        }
        Boolean e11 = o30.b.e(a00.g0.l(gVar), o10.n.f75559a, new o(this));
        g0.o(e11, "ifAny(...)");
        return e11.booleanValue();
    }

    public final boolean H(kotlin.reflect.jvm.internal.impl.descriptors.c cVar, p10.b bVar) {
        if (cVar.g().size() != 1) {
            return false;
        }
        List<j1> g11 = cVar.g();
        g0.o(g11, "getValueParameters(...)");
        p10.d r11 = ((j1) a00.r0.m5(g11)).getType().I0().r();
        return g0.g(r11 != null ? u20.e.p(r11) : null, u20.e.p(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8 A[SYNTHETIC] */
    @Override // r10.a
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f r7, @m80.k p10.b r8) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a(n20.f, p10.b):java.util.Collection");
    }

    @Override // r10.c
    public boolean c(@m80.k p10.b classDescriptor, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.g functionDescriptor) {
        g0.p(classDescriptor, "classDescriptor");
        g0.p(functionDescriptor, "functionDescriptor");
        c20.n z11 = z(classDescriptor);
        if (z11 == null || !functionDescriptor.getAnnotations().a0(r10.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String c11 = c0.c(functionDescriptor, false, false, 3, null);
        z J = z11.J();
        n20.f name = functionDescriptor.getName();
        g0.o(name, "getName(...)");
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a11 = J.a(name, NoLookupLocation.FROM_BUILTINS);
        if ((a11 instanceof Collection) && a11.isEmpty()) {
            return false;
        }
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            if (g0.g(c0.c((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next(), false, false, 3, null), c11)) {
                return true;
            }
        }
        return false;
    }

    @Override // r10.a
    @m80.k
    public Collection<r0> d(@m80.k p10.b classDescriptor) {
        g0.p(classDescriptor, "classDescriptor");
        n20.d p11 = u20.e.p(classDescriptor);
        s sVar = s.f75565a;
        return sVar.j(p11) ? a00.h0.Q(v(), this.f67237d) : sVar.k(p11) ? a00.g0.l(this.f67237d) : a00.h0.J();
    }

    @Override // r10.a
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e(@m80.k p10.b classDescriptor) {
        g0.p(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !D().b()) {
            return a00.h0.J();
        }
        c20.n z11 = z(classDescriptor);
        if (z11 == null) {
            return a00.h0.J();
        }
        p10.b f11 = o10.b.f(this.f67235b, u20.e.o(z11), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f67223i.a(), null, 4, null);
        if (f11 == null) {
            return a00.h0.J();
        }
        f2 c11 = o10.t.a(f11, z11).c();
        List<kotlin.reflect.jvm.internal.impl.descriptors.b> f12 = z11.f();
        ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.b> arrayList = new ArrayList();
        for (Object obj : f12) {
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) obj;
            if (bVar.getVisibility().d()) {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f13 = f11.f();
                g0.o(f13, "getConstructors(...)");
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection = f13;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
                        g0.m(bVar2);
                        if (w(bVar2, c11, bVar)) {
                            break;
                        }
                    }
                }
                if (!H(bVar, classDescriptor) && !n10.j.k0(bVar) && !s.f75565a.e().contains(b0.a(f0.f58067a, z11, c0.c(bVar, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar3 : arrayList) {
            e.a<? extends e> n11 = bVar3.n();
            n11.r(classDescriptor);
            n11.j(classDescriptor.s());
            n11.d();
            n11.h(c11.j());
            if (!s.f75565a.h().contains(b0.a(f0.f58067a, z11, c0.c(bVar3, false, false, 3, null)))) {
                n11.a(C());
            }
            e build = n11.build();
            g0.n(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.b) build);
        }
        return arrayList2;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g p(c30.n nVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> n11 = gVar.n();
        n11.r(nVar);
        n11.m(p10.o.f78590e);
        n11.j(nVar.s());
        n11.o(nVar.W());
        kotlin.reflect.jvm.internal.impl.descriptors.g build = n11.build();
        g0.m(build);
        return build;
    }

    public final r0 q(d30.n nVar) {
        s10.k kVar = new s10.k(new c(this.f67234a, new n20.c("java.io")), n20.f.f("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, a00.g0.l(new x0(nVar, new o10.k(this))), p10.x0.f78622a, false, nVar);
        kVar.F0(k.c.f97119b, w1.k(), null);
        c1 s11 = kVar.s();
        g0.o(s11, "getDefaultType(...)");
        return s11;
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> t(p10.b bVar, l<? super x20.k, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        c20.n z11 = z(bVar);
        if (z11 == null) {
            return a00.h0.J();
        }
        Collection<p10.b> g11 = this.f67235b.g(u20.e.o(z11), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f67223i.a());
        p10.b bVar2 = (p10.b) a00.r0.y3(g11);
        if (bVar2 == null) {
            return a00.h0.J();
        }
        l.b bVar3 = o30.l.f75704c;
        ArrayList arrayList = new ArrayList(i0.d0(g11, 10));
        Iterator<T> it = g11.iterator();
        while (it.hasNext()) {
            arrayList.add(u20.e.o((p10.b) it.next()));
        }
        o30.l b11 = bVar3.b(arrayList);
        boolean c11 = this.f67235b.c(bVar);
        x20.k J = this.f67239f.a(u20.e.o(z11), new o10.m(z11, bVar2)).J();
        g0.o(J, "getUnsubstitutedMemberScope(...)");
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> invoke = lVar.invoke(J);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : invoke) {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj;
            if (gVar.getKind() == CallableMemberDescriptor.Kind.DECLARATION && gVar.getVisibility().d() && !n10.j.k0(gVar)) {
                Collection<? extends e> e11 = gVar.e();
                g0.o(e11, "getOverriddenDescriptors(...)");
                Collection<? extends e> collection = e11;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        p10.h b12 = ((e) it2.next()).b();
                        g0.o(b12, "getContainingDeclaration(...)");
                        if (b11.contains(u20.e.o(b12))) {
                            break;
                        }
                    }
                }
                if (!E(gVar, c11)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public final c1 v() {
        return (c1) m.a(this.f67238e, this, f67233i[1]);
    }

    @Override // r10.a
    @m80.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<n20.f> b(@m80.k p10.b classDescriptor) {
        z J;
        Set<n20.f> b11;
        g0.p(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return w1.k();
        }
        c20.n z11 = z(classDescriptor);
        return (z11 == null || (J = z11.J()) == null || (b11 = J.b()) == null) ? w1.k() : b11;
    }

    public final c20.n z(p10.b bVar) {
        n20.b n11;
        n20.c a11;
        if (n10.j.a0(bVar) || !n10.j.B0(bVar)) {
            return null;
        }
        n20.d p11 = u20.e.p(bVar);
        if (p11.f() && (n11 = o10.a.f75522a.n(p11)) != null && (a11 = n11.a()) != null) {
            p10.b d11 = p10.n.d(D().a(), a11, NoLookupLocation.FROM_BUILTINS);
            if (d11 instanceof c20.n) {
                return (c20.n) d11;
            }
        }
        return null;
    }
}
