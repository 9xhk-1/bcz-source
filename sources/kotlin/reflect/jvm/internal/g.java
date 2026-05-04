package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.i0;
import e30.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.b1;
import k10.c1;
import k10.d1;
import k10.l2;
import k10.q2;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.c;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.b;
import kotlin.reflect.jvm.internal.calls.e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.t;
import p10.j1;
import p10.t0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n2632#2,3:232\n1755#2,3:236\n1557#2:240\n1628#2,3:241\n1557#2:245\n1628#2,3:246\n1557#2:249\n1628#2,3:250\n1557#2:253\n1628#2,3:254\n183#3:235\n184#3:239\n1#4:244\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl\n*L\n156#1:232,3\n163#1:236,3\n72#1:240\n72#1:241,3\n87#1:245\n87#1:246,3\n123#1:249\n123#1:250,3\n128#1:253\n128#1:254,3\n163#1:235\n163#1:239\n*E\n"})
/* loaded from: classes8.dex */
public final class g extends e<Object> implements c0<Object>, h10.i<Object>, b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f67175m = {o0.u(new PropertyReference1Impl(o0.d(g.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final KDeclarationContainerImpl f67176g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f67177h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final Object f67178i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final t.a f67179j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f67180k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f67181l;

    public /* synthetic */ g(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Object obj, int i11, v vVar) {
        this(kDeclarationContainerImpl, str, str2, eVar, (i11 & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    public static final kotlin.reflect.jvm.internal.calls.a f0(g gVar) {
        Object d11;
        kotlin.reflect.jvm.internal.calls.b<Constructor<?>> h02;
        c g11 = u.f67731a.g(gVar.c0());
        if (g11 instanceof c.d) {
            if (gVar.Z()) {
                Class<?> g12 = gVar.V().g();
                List<KParameter> parameters = gVar.getParameters();
                ArrayList arrayList = new ArrayList(i0.d0(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    g0.m(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(g12, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            d11 = gVar.V().D(((c.d) g11).b());
        } else if (g11 instanceof c.e) {
            kotlin.reflect.jvm.internal.impl.descriptors.e c02 = gVar.c0();
            p10.h b11 = c02.b();
            g0.o(b11, "getContainingDeclaration(...)");
            if (q20.i.d(b11) && (c02 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) && ((kotlin.reflect.jvm.internal.impl.descriptors.c) c02).n0()) {
                kotlin.reflect.jvm.internal.impl.descriptors.e c03 = gVar.c0();
                KDeclarationContainerImpl V = gVar.V();
                String b12 = ((c.e) g11).b();
                List<j1> g13 = gVar.c0().g();
                g0.o(g13, "getValueParameters(...)");
                return new e.b(c03, V, b12, g13);
            }
            c.e eVar = (c.e) g11;
            d11 = gVar.V().I(eVar.c(), eVar.b());
        } else if (g11 instanceof c.C0782c) {
            d11 = ((c.C0782c) g11).b();
            g0.n(d11, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(g11 instanceof c.b)) {
                if (!(g11 instanceof c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> d12 = ((c.a) g11).d();
                Class<?> g14 = gVar.V().g();
                List<Method> list = d12;
                ArrayList arrayList2 = new ArrayList(i0.d0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(g14, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, d12);
            }
            d11 = ((c.b) g11).d();
            g0.n(d11, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (d11 instanceof Constructor) {
            h02 = gVar.g0((Constructor) d11, gVar.c0(), false);
        } else {
            if (!(d11 instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + gVar.c0() + " (member = " + d11 + ')');
            }
            Method method = (Method) d11;
            h02 = !Modifier.isStatic(method.getModifiers()) ? gVar.h0(method) : gVar.c0().getAnnotations().i(q2.l()) != null ? gVar.i0(method) : gVar.j0(method);
        }
        return l10.i.j(h02, gVar.c0(), false, 2, null);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.reflect.Member] */
    public static final kotlin.reflect.jvm.internal.calls.a k0(g gVar) {
        GenericDeclaration genericDeclaration;
        kotlin.reflect.jvm.internal.calls.b<Constructor<?>> bVar;
        u uVar = u.f67731a;
        c g11 = uVar.g(gVar.c0());
        if (g11 instanceof c.e) {
            kotlin.reflect.jvm.internal.impl.descriptors.e c02 = gVar.c0();
            p10.h b11 = c02.b();
            g0.o(b11, "getContainingDeclaration(...)");
            if (q20.i.d(b11) && (c02 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) && ((kotlin.reflect.jvm.internal.impl.descriptors.c) c02).n0()) {
                throw new KotlinReflectionInternalError(gVar.c0().b() + " cannot have default arguments");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e o02 = gVar.o0(gVar.c0());
            if (o02 != null) {
                c g12 = uVar.g(o02);
                g0.n(g12, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                c.e eVar = (c.e) g12;
                genericDeclaration = gVar.V().F(eVar.c(), eVar.b(), true);
            } else {
                KDeclarationContainerImpl V = gVar.V();
                c.e eVar2 = (c.e) g11;
                String c11 = eVar2.c();
                String b12 = eVar2.b();
                g0.m(gVar.U().b());
                genericDeclaration = V.F(c11, b12, !Modifier.isStatic(r5.getModifiers()));
            }
        } else if (g11 instanceof c.d) {
            if (gVar.Z()) {
                Class<?> g13 = gVar.V().g();
                List<KParameter> parameters = gVar.getParameters();
                ArrayList arrayList = new ArrayList(i0.d0(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    g0.m(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(g13, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclaration = gVar.V().E(((c.d) g11).b());
        } else {
            if (g11 instanceof c.a) {
                List<Method> d11 = ((c.a) g11).d();
                Class<?> g14 = gVar.V().g();
                List<Method> list = d11;
                ArrayList arrayList2 = new ArrayList(i0.d0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(g14, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, d11);
            }
            genericDeclaration = null;
        }
        if (genericDeclaration instanceof Constructor) {
            bVar = gVar.g0((Constructor) genericDeclaration, gVar.c0(), true);
        } else if (genericDeclaration instanceof Method) {
            if (gVar.c0().getAnnotations().i(q2.l()) != null) {
                p10.h b13 = gVar.c0().b();
                g0.n(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((p10.b) b13).m0()) {
                    bVar = gVar.i0((Method) genericDeclaration);
                }
            }
            bVar = gVar.j0((Method) genericDeclaration);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return l10.i.i(bVar, gVar.c0(), true);
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e l0(g gVar, String str) {
        return gVar.V().G(str, gVar.f67177h);
    }

    private final Object m0() {
        return l10.i.h(this.f67178i, c0());
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    public kotlin.reflect.jvm.internal.calls.a<?> U() {
        return (kotlin.reflect.jvm.internal.calls.a) this.f67180k.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    public KDeclarationContainerImpl V() {
        return this.f67176g;
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.l
    public kotlin.reflect.jvm.internal.calls.a<?> W() {
        return (kotlin.reflect.jvm.internal.calls.a) this.f67181l.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.e
    public boolean a0() {
        return this.f67178i != CallableReference.NO_RECEIVER;
    }

    public boolean equals(@m80.l Object obj) {
        g c11 = q2.c(obj);
        return c11 != null && g0.g(V(), c11.V()) && g0.g(getName(), c11.getName()) && g0.g(this.f67177h, c11.f67177h) && g0.g(this.f67178i, c11.f67178i);
    }

    public final kotlin.reflect.jvm.internal.calls.b<Constructor<?>> g0(Constructor<?> constructor, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z11) {
        return (z11 || !v20.b.f(eVar)) ? a0() ? new b.c(constructor, m0()) : new b.e(constructor) : a0() ? new b.a(constructor, m0()) : new b.C0784b(constructor);
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
        return l10.g.a(U());
    }

    @Override // h10.c
    @m80.k
    public String getName() {
        String b11 = c0().getName().b();
        g0.o(b11, "asString(...)");
        return b11;
    }

    public final b.h h0(Method method) {
        return a0() ? new b.h.a(method, m0()) : new b.h.e(method);
    }

    public int hashCode() {
        return (((V().hashCode() * 31) + getName().hashCode()) * 31) + this.f67177h.hashCode();
    }

    public final b.h i0(Method method) {
        return a0() ? new b.h.C0787b(method) : new b.h.f(method);
    }

    @Override // x00.a
    @m80.l
    public Object invoke() {
        return b.a.a(this);
    }

    @Override // h10.i
    public boolean isExternal() {
        return c0().isExternal();
    }

    @Override // h10.i
    public boolean isInfix() {
        return c0().isInfix();
    }

    @Override // h10.i
    public boolean isInline() {
        return c0().isInline();
    }

    @Override // h10.i
    public boolean isOperator() {
        return c0().isOperator();
    }

    @Override // h10.c
    public boolean isSuspend() {
        return c0().isSuspend();
    }

    public final b.h j0(Method method) {
        if (a0()) {
            return new b.h.c(method, p0(method) ? this.f67178i : m0());
        }
        return new b.h.g(method);
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e c0() {
        T b11 = this.f67179j.b(this, f67175m[0]);
        g0.o(b11, "getValue(...)");
        return (kotlin.reflect.jvm.internal.impl.descriptors.e) b11;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.reflect.Member] */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e o0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        CallableMemberDescriptor callableMemberDescriptor;
        List<j1> g11 = eVar.g();
        g0.o(g11, "getValueParameters(...)");
        List<j1> list = g11;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((j1) it.next()).S()) {
                    break;
                }
            }
        }
        p10.h b11 = eVar.b();
        g0.o(b11, "getContainingDeclaration(...)");
        if (q20.i.g(b11)) {
            ?? b12 = U().b();
            g0.m(b12);
            if (Modifier.isStatic(b12.getModifiers())) {
                Iterator<CallableMemberDescriptor> it2 = u20.e.z(eVar, false).iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        callableMemberDescriptor = null;
                        break;
                    }
                    callableMemberDescriptor = it2.next();
                    List<j1> g12 = callableMemberDescriptor.g();
                    g0.o(g12, "getValueParameters(...)");
                    List<j1> list2 = g12;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (((j1) it3.next()).S()) {
                                break loop0;
                            }
                        }
                    }
                }
                if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e) callableMemberDescriptor;
                }
            }
        }
        return null;
    }

    public final boolean p0(Method method) {
        r0 type;
        t0 d02 = c0().d0();
        if (d02 == null || (type = d02.getType()) == null || !q20.i.c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        g0.o(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) a0.Fc(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @m80.k
    public String toString() {
        return l2.f64961a.f(c0());
    }

    @Override // x00.l
    @m80.l
    public Object invoke(@m80.l Object obj) {
        return b.a.b(this, obj);
    }

    public g(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Object obj) {
        this.f67176g = kDeclarationContainerImpl;
        this.f67177h = str2;
        this.f67178i = obj;
        this.f67179j = t.b(eVar, new b1(this, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67180k = e0.b(lazyThreadSafetyMode, new c1(this));
        this.f67181l = e0.b(lazyThreadSafetyMode, new d1(this));
    }

    @Override // x00.p
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2) {
        return b.a.c(this, obj, obj2);
    }

    @Override // x00.q
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3) {
        return b.a.d(this, obj, obj2, obj3);
    }

    @Override // x00.r
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4) {
        return b.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // x00.s
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5) {
        return b.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // x00.t
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6) {
        return b.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // x00.u
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7) {
        return b.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // x00.v
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8) {
        return b.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        this(container, name, signature, null, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
    }

    @Override // x00.w
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9) {
        return b.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(@m80.k kotlin.reflect.jvm.internal.KDeclarationContainerImpl r10, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.e r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r11, r0)
            n20.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.u r0 = kotlin.reflect.jvm.internal.u.f67731a
            kotlin.reflect.jvm.internal.c r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.g.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.e):void");
    }

    @Override // x00.b
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10) {
        return b.a.k(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // x00.c
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11) {
        return b.a.l(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // x00.d
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12) {
        return b.a.m(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // x00.e
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13) {
        return b.a.n(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // x00.f
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14) {
        return b.a.o(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // x00.g
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15) {
        return b.a.p(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // x00.h
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16) {
        return b.a.q(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // x00.i
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17) {
        return b.a.r(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // x00.j
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17, @m80.l Object obj18) {
        return b.a.s(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // x00.k
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17, @m80.l Object obj18, @m80.l Object obj19) {
        return b.a.t(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // x00.m
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17, @m80.l Object obj18, @m80.l Object obj19, @m80.l Object obj20) {
        return b.a.u(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // x00.n
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17, @m80.l Object obj18, @m80.l Object obj19, @m80.l Object obj20, @m80.l Object obj21) {
        return b.a.v(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // x00.o
    @m80.l
    public Object invoke(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @m80.l Object obj4, @m80.l Object obj5, @m80.l Object obj6, @m80.l Object obj7, @m80.l Object obj8, @m80.l Object obj9, @m80.l Object obj10, @m80.l Object obj11, @m80.l Object obj12, @m80.l Object obj13, @m80.l Object obj14, @m80.l Object obj15, @m80.l Object obj16, @m80.l Object obj17, @m80.l Object obj18, @m80.l Object obj19, @m80.l Object obj20, @m80.l Object obj21, @m80.l Object obj22) {
        return b.a.w(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
