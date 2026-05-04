package kotlin.reflect.jvm.internal;

import a00.i0;
import e30.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.f2;
import k10.g2;
import k10.q2;
import k10.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.y0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.t;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKTypeParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1557#2:92\n1628#2,3:93\n*S KotlinDebug\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl\n*L\n38#1:92\n38#1:93,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s implements h10.s, v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f67723d = {o0.u(new PropertyReference1Impl(o0.d(s.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c1 f67724a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t.a f67725b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g2 f67726c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67727a;

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
            f67727a = iArr;
        }
    }

    public s(@m80.l g2 g2Var, @m80.k c1 descriptor) {
        f<?> fVar;
        Object y11;
        g0.p(descriptor, "descriptor");
        this.f67724a = descriptor;
        this.f67725b = t.c(new f2(this));
        if (g2Var == null) {
            p10.h b11 = a().b();
            g0.o(b11, "getContainingDeclaration(...)");
            if (b11 instanceof p10.b) {
                y11 = g((p10.b) b11);
            } else {
                if (!(b11 instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + b11);
                }
                p10.h b12 = ((CallableMemberDescriptor) b11).b();
                g0.o(b12, "getContainingDeclaration(...)");
                if (b12 instanceof p10.b) {
                    fVar = g((p10.b) b12);
                } else {
                    c30.t tVar = b11 instanceof c30.t ? (c30.t) b11 : null;
                    if (tVar == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + b11);
                    }
                    h10.d i11 = w00.b.i(d(tVar));
                    g0.n(i11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    fVar = (f) i11;
                }
                y11 = b11.y(new k10.n(fVar), yz.g2.f100423a);
            }
            g2Var = (g2) y11;
        }
        this.f67726c = g2Var;
    }

    public static final List l(s sVar) {
        List<r0> upperBounds = sVar.a().getUpperBounds();
        g0.o(upperBounds, "getUpperBounds(...)");
        List<r0> list = upperBounds;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r((r0) it.next(), null, 2, null));
        }
        return arrayList;
    }

    public final Class<?> d(c30.t tVar) {
        Class<?> e11;
        c30.s c02 = tVar.c0();
        h20.r rVar = c02 instanceof h20.r ? (h20.r) c02 : null;
        Object g11 = rVar != null ? rVar.g() : null;
        u10.f fVar = g11 instanceof u10.f ? (u10.f) g11 : null;
        if (fVar != null && (e11 = fVar.e()) != null) {
            return e11;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + tVar);
    }

    @Override // k10.v0
    @m80.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c1 a() {
        return this.f67724a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f67726c, sVar.f67726c) && g0.g(getName(), sVar.getName());
    }

    public final f<?> g(p10.b bVar) {
        Class<?> s11 = q2.s(bVar);
        f<?> fVar = (f) (s11 != null ? w00.b.i(s11) : null);
        if (fVar != null) {
            return fVar;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + bVar.b());
    }

    @Override // h10.s
    @m80.k
    public String getName() {
        String b11 = a().getName().b();
        g0.o(b11, "asString(...)");
        return b11;
    }

    @Override // h10.s
    @m80.k
    public List<h10.r> getUpperBounds() {
        T b11 = this.f67725b.b(this, f67723d[0]);
        g0.o(b11, "getValue(...)");
        return (List) b11;
    }

    @Override // h10.s
    public boolean h() {
        return a().h();
    }

    public int hashCode() {
        return (this.f67726c.hashCode() * 31) + getName().hashCode();
    }

    @Override // h10.s
    @m80.k
    public KVariance j() {
        int i11 = a.f67727a[a().j().ordinal()];
        if (i11 == 1) {
            return KVariance.INVARIANT;
        }
        if (i11 == 2) {
            return KVariance.IN;
        }
        if (i11 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public String toString() {
        return y0.f67053f.a(this);
    }
}
