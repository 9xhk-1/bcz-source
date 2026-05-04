package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.l0;
import e30.e2;
import e30.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k10.g2;
import k10.q2;
import k10.v;
import k10.w;
import k10.x;
import k10.y;
import k10.z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.t;
import p10.c1;
import p10.j1;
import p10.o0;
import p10.t0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n227#2,5:277\n227#2,5:282\n227#2,5:287\n227#2,5:292\n227#2,2:302\n229#2,3:306\n1#3:297\n1557#4:298\n1628#4,3:299\n1010#4,2:309\n1557#4:311\n1628#4,3:312\n1782#4,4:315\n1863#4,2:319\n1755#4,3:321\n37#5,2:304\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n107#1:277,5\n158#1:282,5\n206#1:287,5\n214#1:292,5\n248#1:302,2\n248#1:306,3\n234#1:298\n234#1:299,3\n65#1:309,2\n85#1:311\n85#1:312,3\n124#1:315,4\n132#1:319,2\n220#1:321,3\n249#1:304,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class e<R> implements h10.c<R>, g2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t.a<List<Annotation>> f67145a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t.a<ArrayList<KParameter>> f67146b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final t.a<r> f67147c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t.a<List<s>> f67148d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final t.a<Object[]> f67149e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c0<Boolean> f67150f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n1#1,102:1\n65#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(((KParameter) t11).getName(), ((KParameter) t12).getName());
        }
    }

    public e() {
        t.a<List<Annotation>> c11 = t.c(new k10.q(this));
        g0.o(c11, "lazySoft(...)");
        this.f67145a = c11;
        t.a<ArrayList<KParameter>> c12 = t.c(new k10.r(this));
        g0.o(c12, "lazySoft(...)");
        this.f67146b = c12;
        t.a<r> c13 = t.c(new k10.s(this));
        g0.o(c13, "lazySoft(...)");
        this.f67147c = c13;
        t.a<List<s>> c14 = t.c(new k10.t(this));
        g0.o(c14, "lazySoft(...)");
        this.f67148d = c14;
        t.a<Object[]> c15 = t.c(new k10.u(this));
        g0.o(c15, "lazySoft(...)");
        this.f67149e = c15;
        this.f67150f = e0.b(LazyThreadSafetyMode.PUBLICATION, new v(this));
    }

    public static final Type D(e eVar) {
        Type S = eVar.S();
        return S == null ? eVar.U().getReturnType() : S;
    }

    public static final List E(e eVar) {
        List<c1> typeParameters = eVar.c0().getTypeParameters();
        g0.o(typeParameters, "getTypeParameters(...)");
        List<c1> list = typeParameters;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (c1 c1Var : list) {
            g0.m(c1Var);
            arrayList.add(new s(eVar, c1Var));
        }
        return arrayList;
    }

    public static final boolean b0(e eVar) {
        List<KParameter> parameters = eVar.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (q2.m(((KParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    public static final Object[] j(e eVar) {
        int i11;
        List<KParameter> parameters = eVar.getParameters();
        int size = parameters.size() + (eVar.isSuspend() ? 1 : 0);
        if (eVar.f67150f.getValue().booleanValue()) {
            i11 = 0;
            for (KParameter kParameter : parameters) {
                i11 += kParameter.getKind() == KParameter.Kind.VALUE ? eVar.Y(kParameter) : 0;
            }
        } else {
            List<KParameter> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (i11 = i11 + 1) < 0) {
                        h0.a0();
                    }
                }
            }
        }
        int i12 = (i11 + 31) / 32;
        Object[] objArr = new Object[size + i12 + 1];
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.isOptional() && !q2.n(kParameter2.getType())) {
                objArr[kParameter2.getIndex()] = q2.g(j10.e.i(kParameter2.getType()));
            } else if (kParameter2.b()) {
                objArr[kParameter2.getIndex()] = eVar.R(kParameter2.getType());
            }
        }
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[size + i13] = 0;
        }
        return objArr;
    }

    public static final List l(e eVar) {
        return q2.e(eVar.c0());
    }

    public static final ArrayList n(e eVar) {
        int i11;
        CallableMemberDescriptor c02 = eVar.c0();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (eVar.a0()) {
            i11 = 0;
        } else {
            t0 k11 = q2.k(c02);
            if (k11 != null) {
                arrayList.add(new l(eVar, 0, KParameter.Kind.INSTANCE, new w(k11)));
                i11 = 1;
            } else {
                i11 = 0;
            }
            t0 f02 = c02.f0();
            if (f02 != null) {
                arrayList.add(new l(eVar, i11, KParameter.Kind.EXTENSION_RECEIVER, new x(f02)));
                i11++;
            }
        }
        int size = c02.g().size();
        while (i12 < size) {
            arrayList.add(new l(eVar, i11, KParameter.Kind.VALUE, new y(c02, i12)));
            i12++;
            i11++;
        }
        if (eVar.Z() && (c02 instanceof a20.a) && arrayList.size() > 1) {
            l0.r0(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final o0 s(CallableMemberDescriptor callableMemberDescriptor, int i11) {
        j1 j1Var = callableMemberDescriptor.g().get(i11);
        g0.o(j1Var, "get(...)");
        return j1Var;
    }

    public static final r t(e eVar) {
        r0 returnType = eVar.c0().getReturnType();
        g0.m(returnType);
        return new r(returnType, new z(eVar));
    }

    public final R P(Map<KParameter, ? extends Object> map) {
        Object R;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(i0.d0(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                R = map.get(kParameter);
                if (R == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.isOptional()) {
                R = null;
            } else {
                if (!kParameter.b()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                R = R(kParameter.getType());
            }
            arrayList.add(R);
        }
        kotlin.reflect.jvm.internal.calls.a<?> W = W();
        if (W != null) {
            try {
                return (R) W.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + c0());
    }

    public final R Q(@m80.k Map<KParameter, ? extends Object> args, @m80.l j00.c<?> cVar) {
        g0.p(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z11 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) U().call(isSuspend() ? new j00.c[]{cVar} : new j00.c[0]);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] T = T();
        if (isSuspend()) {
            T[parameters.size()] = cVar;
        }
        boolean booleanValue = this.f67150f.getValue().booleanValue();
        int i11 = 0;
        for (KParameter kParameter : parameters) {
            int Y = booleanValue ? Y(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                T[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                if (booleanValue) {
                    int i12 = i11 + Y;
                    for (int i13 = i11; i13 < i12; i13++) {
                        int i14 = (i13 / 32) + size;
                        Object obj = T[i14];
                        g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
                        T[i14] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i13 % 32)));
                    }
                } else {
                    int i15 = (i11 / 32) + size;
                    Object obj2 = T[i15];
                    g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                    T[i15] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i11 % 32)));
                }
                z11 = true;
            } else if (!kParameter.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i11 += Y;
            }
        }
        if (!z11) {
            try {
                kotlin.reflect.jvm.internal.calls.a<?> U = U();
                Object[] copyOf = Arrays.copyOf(T, size);
                g0.o(copyOf, "copyOf(...)");
                return (R) U.call(copyOf);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        kotlin.reflect.jvm.internal.calls.a<?> W = W();
        if (W != null) {
            try {
                return (R) W.call(T);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + c0());
    }

    public final Object R(h10.r rVar) {
        Class d11 = w00.b.d(j10.d.b(rVar));
        if (d11.isArray()) {
            Object newInstance = Array.newInstance(d11.getComponentType(), 0);
            g0.o(newInstance, "run(...)");
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + d11.getSimpleName() + ", because it is not an array type");
    }

    public final Type S() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object A3 = a00.r0.A3(U().a());
            ParameterizedType parameterizedType = A3 instanceof ParameterizedType ? (ParameterizedType) A3 : null;
            if (g0.g(parameterizedType != null ? parameterizedType.getRawType() : null, j00.c.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                g0.o(actualTypeArguments, "getActualTypeArguments(...)");
                Object At = a0.At(actualTypeArguments);
                WildcardType wildcardType = At instanceof WildcardType ? (WildcardType) At : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) a0.jc(lowerBounds);
                }
            }
        }
        return null;
    }

    public final Object[] T() {
        return (Object[]) this.f67149e.invoke().clone();
    }

    @m80.k
    public abstract kotlin.reflect.jvm.internal.calls.a<?> U();

    @m80.k
    public abstract KDeclarationContainerImpl V();

    @m80.l
    public abstract kotlin.reflect.jvm.internal.calls.a<?> W();

    @m80.k
    /* renamed from: X */
    public abstract CallableMemberDescriptor c0();

    public final int Y(KParameter kParameter) {
        if (!this.f67150f.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!q2.m(kParameter.getType())) {
            return 1;
        }
        h10.r type = kParameter.getType();
        g0.n(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> n11 = l10.i.n(e2.a(((r) type).D()));
        g0.m(n11);
        return n11.size();
    }

    public final boolean Z() {
        return g0.g(getName(), "<init>") && V().g().isAnnotation();
    }

    public abstract boolean a0();

    @Override // h10.c
    public R call(@m80.k Object... args) {
        g0.p(args, "args");
        try {
            return (R) U().call(args);
        } catch (IllegalAccessException e11) {
            throw new IllegalCallableAccessException(e11);
        }
    }

    @Override // h10.c
    public R callBy(@m80.k Map<KParameter, ? extends Object> args) {
        g0.p(args, "args");
        return Z() ? P(args) : Q(args, null);
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f67145a.invoke();
        g0.o(invoke, "invoke(...)");
        return invoke;
    }

    @Override // h10.c
    @m80.k
    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this.f67146b.invoke();
        g0.o(invoke, "invoke(...)");
        return invoke;
    }

    @Override // h10.c
    @m80.k
    public h10.r getReturnType() {
        r invoke = this.f67147c.invoke();
        g0.o(invoke, "invoke(...)");
        return invoke;
    }

    @Override // h10.c
    @m80.k
    public List<h10.s> getTypeParameters() {
        List<s> invoke = this.f67148d.invoke();
        g0.o(invoke, "invoke(...)");
        return invoke;
    }

    @Override // h10.c
    @m80.l
    public KVisibility getVisibility() {
        p10.p visibility = c0().getVisibility();
        g0.o(visibility, "getVisibility(...)");
        return q2.t(visibility);
    }

    @Override // h10.c
    public boolean isAbstract() {
        return c0().k() == Modality.ABSTRACT;
    }

    @Override // h10.c
    public boolean isFinal() {
        return c0().k() == Modality.FINAL;
    }

    @Override // h10.c
    public boolean isOpen() {
        return c0().k() == Modality.OPEN;
    }

    public static final o0 o(t0 t0Var) {
        return t0Var;
    }

    public static final o0 r(t0 t0Var) {
        return t0Var;
    }
}
