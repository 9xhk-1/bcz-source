package h10;

import a00.i0;
import a00.r0;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KVariance;
import q30.k0;
import u30.f0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1563#3:232\n1634#3,3:233\n1563#3:236\n1634#3,3:237\n1563#3:240\n1634#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes8.dex */
public final class y {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57964a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57964a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<Class<?>, Class<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f57965a = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> p02) {
            g0.p(p02, "p0");
            return p02.getComponentType();
        }
    }

    @kotlin.c
    public static final Type c(r rVar, boolean z11) {
        g m11 = rVar.m();
        if (m11 instanceof s) {
            return new x((s) m11);
        }
        if (!(m11 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
        }
        d dVar = (d) m11;
        Class g11 = z11 ? w00.b.g(dVar) : w00.b.d(dVar);
        List<t> arguments = rVar.getArguments();
        if (arguments.isEmpty()) {
            return g11;
        }
        if (!g11.isArray()) {
            return e(g11, arguments);
        }
        if (g11.getComponentType().isPrimitive()) {
            return g11;
        }
        t tVar = (t) r0.p5(arguments);
        if (tVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
        }
        KVariance a11 = tVar.a();
        r b11 = tVar.b();
        int i11 = a11 == null ? -1 : a.f57964a[a11.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return g11;
        }
        if (i11 != 2 && i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        g0.m(b11);
        Type d11 = d(b11, false, 1, null);
        return d11 instanceof Class ? g11 : new h10.a(d11);
    }

    public static /* synthetic */ Type d(r rVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(rVar, z11);
    }

    @kotlin.c
    public static final Type e(Class<?> cls, List<t> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<t> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((t) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<t> list3 = list;
            ArrayList arrayList2 = new ArrayList(i0.d0(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((t) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e11 = e(declaringClass, list.subList(length, list.size()));
        List<t> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(i0.d0(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((t) it3.next()));
        }
        return new u(cls, e11, arrayList3);
    }

    @m80.k
    public static final Type f(@m80.k r rVar) {
        Type d11;
        g0.p(rVar, "<this>");
        return (!(rVar instanceof h0) || (d11 = ((h0) rVar).d()) == null) ? d(rVar, false, 1, null) : d11;
    }

    public static final Type g(t tVar) {
        KVariance h11 = tVar.h();
        if (h11 == null) {
            return z.f57966c.a();
        }
        r g11 = tVar.g();
        g0.m(g11);
        int i11 = a.f57964a[h11.ordinal()];
        if (i11 == 1) {
            return new z(null, c(g11, true));
        }
        if (i11 == 2) {
            return c(g11, true);
        }
        if (i11 == 3) {
            return new z(c(g11, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String j(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            g0.o(name, "getName(...)");
            return name;
        }
        q30.m t11 = q30.x.t(type, b.f57965a);
        return ((Class) k0.I1(t11)).getName() + f0.v2(okhttp3.i.f77289p, k0.E0(t11));
    }

    @o00.i
    @y0(version = "1.4")
    @kotlin.c
    public static /* synthetic */ void h(r rVar) {
    }

    @kotlin.c
    public static /* synthetic */ void i(t tVar) {
    }
}
