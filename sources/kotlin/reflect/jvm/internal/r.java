package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.i0;
import e30.a2;
import e30.h2;
import e30.l0;
import e30.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import k10.b2;
import k10.c2;
import k10.d2;
import k10.e2;
import k10.l2;
import k10.q2;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.t;
import p10.b1;
import p10.c1;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1#2:137\n1567#3:138\n1598#3,4:139\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n*L\n81#1:138\n81#1:139,4\n*E\n"})
/* loaded from: classes8.dex */
public final class r implements h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f67717e = {o0.u(new PropertyReference1Impl(o0.d(r.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), o0.u(new PropertyReference1Impl(o0.d(r.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r0 f67718a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final t.a<Type> f67719b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final t.a f67720c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t.a f67721d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67722a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67722a = iArr;
        }
    }

    public r(@m80.k r0 type, @m80.l x00.a<? extends Type> aVar) {
        g0.p(type, "type");
        this.f67718a = type;
        t.a<Type> aVar2 = null;
        t.a<Type> aVar3 = aVar instanceof t.a ? (t.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = t.c(aVar);
        }
        this.f67719b = aVar2;
        this.f67720c = t.c(new b2(this));
        this.f67721d = t.c(new c2(this, aVar));
    }

    public static final List l(r rVar, x00.a aVar) {
        h10.t e11;
        List<a2> G0 = rVar.f67718a.G0();
        if (G0.isEmpty()) {
            return a00.h0.J();
        }
        c0 b11 = e0.b(LazyThreadSafetyMode.PUBLICATION, new d2(rVar));
        List<a2> list = G0;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            a2 a2Var = (a2) obj;
            if (a2Var.a()) {
                e11 = h10.t.f57954c.c();
            } else {
                r0 type = a2Var.getType();
                g0.o(type, "getType(...)");
                r rVar2 = new r(type, aVar == null ? null : new e2(rVar, i11, b11));
                int i13 = a.f67722a[a2Var.b().ordinal()];
                if (i13 == 1) {
                    e11 = h10.t.f57954c.e(rVar2);
                } else if (i13 == 2) {
                    e11 = h10.t.f57954c.a(rVar2);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e11 = h10.t.f57954c.b(rVar2);
                }
            }
            arrayList.add(e11);
            i11 = i12;
        }
        return arrayList;
    }

    public static final List n(r rVar) {
        Type d11 = rVar.d();
        g0.m(d11);
        return v10.f.h(d11);
    }

    public static final List<Type> o(c0<? extends List<? extends Type>> c0Var) {
        return (List) c0Var.getValue();
    }

    public static final Type r(r rVar, int i11, c0<? extends List<? extends Type>> c0Var) {
        Type d11 = rVar.d();
        if (d11 instanceof Class) {
            Class cls = (Class) d11;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            g0.m(componentType);
            return componentType;
        }
        if (d11 instanceof GenericArrayType) {
            if (i11 == 0) {
                Type genericComponentType = ((GenericArrayType) d11).getGenericComponentType();
                g0.m(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + rVar);
        }
        if (!(d11 instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + rVar);
        }
        Type type = o(c0Var).get(i11);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        g0.o(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) a0.Fc(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            g0.o(upperBounds, "getUpperBounds(...)");
            type2 = (Type) a0.jc(upperBounds);
        }
        g0.m(type2);
        return type2;
    }

    public static final h10.g s(r rVar) {
        return rVar.t(rVar.f67718a);
    }

    @m80.k
    public final r0 D() {
        return this.f67718a;
    }

    @m80.k
    public final r E(boolean z11) {
        if (!l0.b(this.f67718a) && e() == z11) {
            return this;
        }
        r0 p11 = h2.p(this.f67718a, z11);
        g0.o(p11, "makeNullableAsSpecified(...)");
        return new r(p11, this.f67719b);
    }

    @Override // kotlin.jvm.internal.h0
    @m80.l
    public Type d() {
        t.a<Type> aVar = this.f67719b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Override // h10.r
    public boolean e() {
        return this.f67718a.J0();
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return g0.g(this.f67718a, rVar.f67718a) && g0.g(m(), rVar.m()) && g0.g(getArguments(), rVar.getArguments());
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        return q2.e(this.f67718a);
    }

    @Override // h10.r
    @m80.k
    public List<h10.t> getArguments() {
        T b11 = this.f67721d.b(this, f67717e[1]);
        g0.o(b11, "getValue(...)");
        return (List) b11;
    }

    public int hashCode() {
        int hashCode = this.f67718a.hashCode() * 31;
        h10.g m11 = m();
        return ((hashCode + (m11 != null ? m11.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    @Override // h10.r
    @m80.l
    public h10.g m() {
        return (h10.g) this.f67720c.b(this, f67717e[0]);
    }

    public final h10.g t(r0 r0Var) {
        r0 type;
        p10.d r11 = r0Var.I0().r();
        if (!(r11 instanceof p10.b)) {
            if (r11 instanceof c1) {
                return new s(null, (c1) r11);
            }
            if (!(r11 instanceof b1)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> s11 = q2.s((p10.b) r11);
        if (s11 == null) {
            return null;
        }
        if (!s11.isArray()) {
            if (h2.l(r0Var)) {
                return new f(s11);
            }
            Class<?> i11 = v10.f.i(s11);
            if (i11 != null) {
                s11 = i11;
            }
            return new f(s11);
        }
        a2 a2Var = (a2) a00.r0.p5(r0Var.G0());
        if (a2Var == null || (type = a2Var.getType()) == null) {
            return new f(s11);
        }
        h10.g t11 = t(type);
        if (t11 != null) {
            return new f(q2.f(w00.b.d(j10.d.a(t11))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    @m80.k
    public String toString() {
        return l2.f64961a.l(this.f67718a);
    }

    public /* synthetic */ r(r0 r0Var, x00.a aVar, int i11, v vVar) {
        this(r0Var, (i11 & 2) != 0 ? null : aVar);
    }
}
