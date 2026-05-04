package kotlin.reflect.jvm.internal;

import a00.k1;
import a00.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k10.a1;
import k10.h2;
import k10.q2;
import k10.w0;
import k10.x0;
import k10.y0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.t;
import kotlin.text.Regex;
import p10.q0;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,316:1\n1611#2,9:317\n1863#2:326\n1864#2:328\n1620#2:329\n774#2:330\n865#2,2:331\n1485#2:333\n1510#2,3:334\n1513#2,3:344\n774#2:347\n865#2,2:348\n774#2:350\n865#2,2:351\n1#3:327\n1#3:353\n381#4,7:337\n1310#5,2:354\n37#6,2:356\n37#6,2:358\n37#6,2:360\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:317,9\n58#1:326\n58#1:328\n58#1:329\n83#1:330\n83#1:331,2\n103#1:333\n103#1:334,3\n103#1:344,3\n128#1:347\n128#1:348,2\n142#1:350\n142#1:351,2\n58#1:327\n103#1:337,7\n197#1:354,2\n207#1:356,2\n216#1:358,2\n241#1:360,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f67077a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f67078b = v.class;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Regex f67079c = new Regex("<v#(\\d+)>");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MemberBelonginess {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ MemberBelonginess[] $VALUES;
        public static final MemberBelonginess DECLARED = new MemberBelonginess("DECLARED", 0);
        public static final MemberBelonginess INHERITED = new MemberBelonginess("INHERITED", 1);

        private static final /* synthetic */ MemberBelonginess[] $values() {
            return new MemberBelonginess[]{DECLARED, INHERITED};
        }

        static {
            MemberBelonginess[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private MemberBelonginess(String str, int i11) {
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) $VALUES.clone();
        }

        public final boolean accept(@m80.k CallableMemberDescriptor member) {
            g0.p(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final Regex a() {
            return KDeclarationContainerImpl.f67079c;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f67080c = {o0.u(new PropertyReference1Impl(o0.d(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final t.a f67081a;

        public b() {
            this.f67081a = t.c(new a1(KDeclarationContainerImpl.this));
        }

        public static final u10.k c(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return h2.b(kDeclarationContainerImpl.g());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @m80.k
        public final u10.k b() {
            T b11 = this.f67081a.b(this, f67080c[0]);
            g0.o(b11, "getValue(...)");
            return (u10.k) b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Class<?>> f67083a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Class<?> f67084b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k List<? extends Class<?>> parameters, @m80.l Class<?> cls) {
            g0.p(parameters, "parameters");
            this.f67083a = parameters;
            this.f67084b = cls;
        }

        @m80.k
        public final List<Class<?>> a() {
            return this.f67083a;
        }

        @m80.l
        public final Class<?> b() {
            return this.f67084b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends k10.n {
        public d(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        @Override // s10.o, p10.j
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public e<?> e(kotlin.reflect.jvm.internal.impl.descriptors.c descriptor, g2 data) {
            g0.p(descriptor, "descriptor");
            g0.p(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    public static final CharSequence H(kotlin.reflect.jvm.internal.impl.descriptors.e descriptor) {
        g0.p(descriptor, "descriptor");
        return p20.m.f78750k.Q(descriptor) + " | " + u.f67731a.g(descriptor).a();
    }

    public static final int K(p10.p pVar, p10.p pVar2) {
        Integer d11 = p10.o.d(pVar, pVar2);
        if (d11 != null) {
            return d11.intValue();
        }
        return 0;
    }

    public static final int L(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public static final CharSequence M(q0 descriptor) {
        g0.p(descriptor, "descriptor");
        return p20.m.f78750k.Q(descriptor) + " | " + u.f67731a.f(descriptor).a();
    }

    @m80.l
    public final Constructor<?> D(@m80.k String desc) {
        g0.p(desc, "desc");
        return W(g(), U(desc, false).a());
    }

    @m80.l
    public final Constructor<?> E(@m80.k String desc) {
        g0.p(desc, "desc");
        Class<?> g11 = g();
        ArrayList arrayList = new ArrayList();
        t(arrayList, U(desc, false).a(), true);
        g2 g2Var = g2.f100423a;
        return W(g11, arrayList);
    }

    @m80.l
    public final Method F(@m80.k String name, @m80.k String desc, boolean z11) {
        g0.p(name, "name");
        g0.p(desc, "desc");
        if (g0.g(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(g());
        }
        c U = U(desc, true);
        t(arrayList, U.a(), false);
        Class<?> R = R();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> b11 = U.b();
        g0.m(b11);
        return T(R, str, clsArr, b11, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e G(@m80.k java.lang.String r14, @m80.k java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.G(java.lang.String, java.lang.String):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    @m80.l
    public final Method I(@m80.k String name, @m80.k String desc) {
        Method T;
        g0.p(name, "name");
        g0.p(desc, "desc");
        if (g0.g(name, "<init>")) {
            return null;
        }
        c U = U(desc, true);
        Class<?>[] clsArr = (Class[]) U.a().toArray(new Class[0]);
        Class<?> b11 = U.b();
        g0.m(b11);
        Method T2 = T(R(), name, clsArr, b11, false);
        if (T2 != null) {
            return T2;
        }
        if (!R().isInterface() || (T = T(Object.class, name, clsArr, b11, false)) == null) {
            return null;
        }
        return T;
    }

    @m80.k
    public final q0 J(@m80.k String name, @m80.k String signature) {
        g0.p(name, "name");
        g0.p(signature, "signature");
        u30.o matchEntire = f67079c.matchEntire(signature);
        if (matchEntire != null) {
            String str = matchEntire.a().k().b().get(1);
            q0 P = P(Integer.parseInt(str));
            if (P != null) {
                return P;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + g());
        }
        n20.f f11 = n20.f.f(name);
        g0.o(f11, "identifier(...)");
        Collection<q0> S = S(f11);
        ArrayList arrayList = new ArrayList();
        for (Object obj : S) {
            if (g0.g(u.f67731a.f((q0) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (q0) r0.m5(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            p10.p visibility = ((q0) obj2).getVisibility();
            Object obj3 = linkedHashMap.get(visibility);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(visibility, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection values = k1.r(linkedHashMap, new x0(w0.f65006a)).values();
        g0.o(values, "<get-values>(...)");
        List list = (List) r0.s3(values);
        if (list.size() == 1) {
            g0.m(list);
            return (q0) r0.G2(list);
        }
        n20.f f12 = n20.f.f(name);
        g0.o(f12, "identifier(...)");
        String r32 = r0.r3(S(f12), "\n", null, null, 0, null, y0.f65013a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(r32.length() == 0 ? " no members found" : '\n' + r32);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    @m80.k
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> N();

    @m80.k
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> O(@m80.k n20.f fVar);

    @m80.l
    public abstract q0 P(int i11);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.e<?>> Q(@m80.k x20.k r8, @m80.k kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$d r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$d
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = x20.n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            p10.h r3 = (p10.h) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            p10.p r5 = r4.getVisibility()
            p10.p r6 = p10.o.f78593h
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4e
            yz.g2 r4 = yz.g2.f100423a
            java.lang.Object r3 = r3.y(r0, r4)
            kotlin.reflect.jvm.internal.e r3 = (kotlin.reflect.jvm.internal.e) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = a00.r0.a6(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Q(x20.k, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    @m80.k
    public Class<?> R() {
        Class<?> k11 = v10.f.k(g());
        return k11 == null ? g() : k11;
    }

    @m80.k
    public abstract Collection<q0> S(@m80.k n20.f fVar);

    public final Method T(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z11) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z12;
        if (z11) {
            clsArr[0] = cls;
        }
        Method X = X(cls, str, clsArr, cls2);
        if (X != null) {
            return X;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method T = T(superclass, str, clsArr, cls2, z11);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
            if (T != null) {
                return T;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
        }
        Iterator a11 = kotlin.jvm.internal.h.a(cls.getInterfaces());
        while (a11.hasNext()) {
            Class<?> cls4 = (Class) a11.next();
            g0.m(cls4);
            Method T2 = T(cls4, str2, clsArr2, cls3, z12);
            if (T2 != null) {
                return T2;
            }
            if (z12) {
                Class<?> a12 = u10.e.a(v10.f.j(cls4), cls4.getName() + "$DefaultImpls");
                if (a12 != null) {
                    clsArr2[0] = cls4;
                    Method X2 = X(a12, str2, clsArr2, cls3);
                    if (X2 != null) {
                        return X2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final c U(String str, boolean z11) {
        String str2;
        int I3;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (true) {
            if (str.charAt(i11) == ')') {
                String str3 = str;
                return new c(arrayList, z11 ? V(str3, i11 + 1, str3.length()) : null);
            }
            int i12 = i11;
            while (str.charAt(i12) == '[') {
                i12++;
            }
            char charAt = str.charAt(i12);
            if (k0.m3("VZCBSIFJD", charAt, false, 2, null)) {
                int i13 = i12 + 1;
                str2 = str;
                I3 = i13;
            } else {
                if (charAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                I3 = k0.I3(str2, l70.f.f70689d, i11, false, 4, null) + 1;
            }
            arrayList.add(V(str2, i11, I3));
            i11 = I3;
            str = str2;
        }
    }

    public final Class<?> V(String str, int i11, int i12) {
        char charAt = str.charAt(i11);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader j11 = v10.f.j(g());
            String substring = str.substring(i11 + 1, i12 - 1);
            g0.o(substring, "substring(...)");
            Class<?> loadClass = j11.loadClass(f0.y2(substring, '/', '.', false, 4, null));
            g0.o(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            g0.o(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == '[') {
            return q2.f(V(str, i11 + 1, i12));
        }
        switch (charAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
        }
    }

    public final Constructor<?> W(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method X(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (g0.g(declaredMethod.getReturnType(), cls2)) {
            return declaredMethod;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        g0.o(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (g0.g(method.getName(), str) && g0.g(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public final void t(List<Class<?>> list, List<? extends Class<?>> list2, boolean z11) {
        if (g0.g(r0.A3(list2), f67078b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i11 = 0; i11 < size; i11++) {
            Class<?> TYPE = Integer.TYPE;
            g0.o(TYPE, "TYPE");
            list.add(TYPE);
        }
        Class cls = z11 ? f67078b : Object.class;
        g0.m(cls);
        list.add(cls);
    }
}
