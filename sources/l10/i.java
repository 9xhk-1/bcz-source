package l10;

import a00.i0;
import a00.m0;
import e30.c1;
import e30.e2;
import e30.h2;
import e30.r0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.q2;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m80.k;
import m80.l;
import n10.j;
import p10.b0;
import p10.j1;
import p10.l1;
import p10.q0;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,387:1\n1#2:388\n1557#3:389\n1628#3,3:390\n1557#3:393\n1628#3,3:394\n1628#3,3:397\n1755#3,3:400\n1755#3,3:403\n1368#3:406\n1454#3,2:407\n1557#3:409\n1628#3,3:410\n1456#3,3:413\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n257#1:389\n257#1:390,3\n259#1:393\n259#1:394,3\n303#1:397,3\n323#1:400,3\n324#1:403,3\n252#1:406\n252#1:407,2\n253#1:409\n253#1:410,3\n252#1:413,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    public static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !w00.b.i(r0).v();
    }

    public static final void g(kotlin.reflect.jvm.internal.calls.a<?> aVar, int i11, CallableMemberDescriptor callableMemberDescriptor, boolean z11) {
        if (g.a(aVar) == i11) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + g.a(aVar) + " != " + i11 + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + aVar.a() + ")\nDefault: " + z11);
    }

    @l
    public static final Object h(@l Object obj, @k CallableMemberDescriptor descriptor) {
        r0 l11;
        Class<?> s11;
        Method m11;
        g0.p(descriptor, "descriptor");
        return (((descriptor instanceof q0) && q20.i.e((l1) descriptor)) || (l11 = l(descriptor)) == null || (s11 = s(l11)) == null || (m11 = m(s11, descriptor)) == null) ? obj : m11.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <M extends Member> kotlin.reflect.jvm.internal.calls.a<M> i(@k kotlin.reflect.jvm.internal.calls.a<? extends M> aVar, @k CallableMemberDescriptor descriptor, boolean z11) {
        g0.p(aVar, "<this>");
        g0.p(descriptor, "descriptor");
        if (!q20.i.a(descriptor)) {
            List<t0> z02 = descriptor.z0();
            g0.o(z02, "getContextReceiverParameters(...)");
            List<t0> list = z02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    r0 type = ((t0) it.next()).getType();
                    g0.o(type, "getType(...)");
                    if (q20.i.h(type)) {
                        break;
                    }
                }
            }
            List<j1> g11 = descriptor.g();
            g0.o(g11, "getValueParameters(...)");
            List<j1> list2 = g11;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    r0 type2 = ((j1) it2.next()).getType();
                    g0.o(type2, "getType(...)");
                    if (q20.i.h(type2)) {
                        break;
                    }
                }
            }
            r0 returnType = descriptor.getReturnType();
            if ((returnType == null || !q20.i.c(returnType)) && !q(descriptor)) {
                return aVar;
            }
        }
        return new kotlin.reflect.jvm.internal.calls.e(descriptor, aVar, z11);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.calls.a j(kotlin.reflect.jvm.internal.calls.a aVar, CallableMemberDescriptor callableMemberDescriptor, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return i(aVar, callableMemberDescriptor, z11);
    }

    public static final Method k(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, callableMemberDescriptor).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final r0 l(CallableMemberDescriptor callableMemberDescriptor) {
        t0 f02 = callableMemberDescriptor.f0();
        t0 d02 = callableMemberDescriptor.d0();
        if (f02 != null) {
            return f02.getType();
        }
        if (d02 == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
            return d02.getType();
        }
        p10.h b11 = callableMemberDescriptor.b();
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar != null) {
            return bVar.s();
        }
        return null;
    }

    @k
    public static final Method m(@k Class<?> cls, @k CallableMemberDescriptor descriptor) {
        g0.p(cls, "<this>");
        g0.p(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    @l
    public static final List<Method> n(@k c1 type) {
        g0.p(type, "type");
        List<String> o11 = o(e2.a(type));
        if (o11 == null) {
            return null;
        }
        List<String> list = o11;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        p10.d r11 = type.I0().r();
        g0.n(r11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> s11 = q2.s((p10.b) r11);
        g0.m(s11);
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(s11.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    public static final List<String> o(c1 c1Var) {
        Collection l11;
        if (!q20.i.i(c1Var)) {
            return null;
        }
        p10.d r11 = c1Var.I0().r();
        g0.n(r11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        b0<c1> t11 = u20.e.t((p10.b) r11);
        g0.m(t11);
        List<Pair<n20.f, c1>> c11 = t11.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            n20.f fVar = (n20.f) pair.component1();
            List<String> o11 = o((c1) pair.component2());
            if (o11 != null) {
                List<String> list = o11;
                l11 = new ArrayList(i0.d0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    l11.add(fVar.d() + '-' + ((String) it2.next()));
                }
            } else {
                l11 = a00.g0.l(fVar.d());
            }
            m0.s0(arrayList, l11);
        }
        return arrayList;
    }

    public static final List<Method> p(c1 c1Var, CallableMemberDescriptor callableMemberDescriptor) {
        Method m11;
        List<Method> n11 = n(c1Var);
        if (n11 != null) {
            return n11;
        }
        Class<?> s11 = s(c1Var);
        if (s11 == null || (m11 = m(s11, callableMemberDescriptor)) == null) {
            return null;
        }
        return a00.g0.l(m11);
    }

    public static final boolean q(CallableMemberDescriptor callableMemberDescriptor) {
        r0 l11 = l(callableMemberDescriptor);
        return l11 != null && q20.i.h(l11);
    }

    public static final List<r0> r(CallableMemberDescriptor callableMemberDescriptor, Member member, x00.l<? super p10.b, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        t0 f02 = callableMemberDescriptor.f0();
        r0 type = f02 != null ? f02.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
            p10.b L = ((kotlin.reflect.jvm.internal.impl.descriptors.c) callableMemberDescriptor).L();
            g0.o(L, "getConstructedClass(...)");
            if (L.i()) {
                p10.h b11 = L.b();
                g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((p10.b) b11).s());
            }
        } else {
            p10.h b12 = callableMemberDescriptor.b();
            g0.o(b12, "getContainingDeclaration(...)");
            if ((b12 instanceof p10.b) && lVar.invoke(b12).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((p10.b) b12).s());
                } else {
                    c1 s11 = ((p10.b) b12).s();
                    g0.o(s11, "getDefaultType(...)");
                    arrayList.add(j30.e.C(s11));
                }
            }
        }
        List<j1> g11 = callableMemberDescriptor.g();
        g0.o(g11, "getValueParameters(...)");
        Iterator<T> it = g11.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class<?> s(r0 r0Var) {
        r0 k11;
        Class<?> t11 = t(r0Var.I0().r());
        if (t11 == null) {
            return null;
        }
        if (h2.l(r0Var) && ((k11 = q20.i.k(r0Var)) == null || h2.l(k11) || j.s0(k11))) {
            return null;
        }
        return t11;
    }

    @l
    public static final Class<?> t(@l p10.h hVar) {
        if (!(hVar instanceof p10.b) || !q20.i.b(hVar)) {
            return null;
        }
        p10.b bVar = (p10.b) hVar;
        Class<?> s11 = q2.s(bVar);
        if (s11 != null) {
            return s11;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + bVar.getName() + " cannot be found (classId=" + u20.e.n((p10.d) hVar) + ')');
    }

    @k
    public static final String u(@k p10.d dVar) {
        g0.p(dVar, "<this>");
        n20.b n11 = u20.e.n(dVar);
        g0.m(n11);
        return m20.b.b(n11.b());
    }
}
