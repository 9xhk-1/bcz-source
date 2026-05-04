package h40;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11158#3:114\n11493#3,3:115\n12727#3,3:132\n1971#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58268a = n(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final k f58269b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58270a = new a();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th2) {
            return null;
        }
    }

    static {
        k kVar;
        try {
            kVar = u.a() ? n1.f58259a : c.f58185a;
        } catch (Throwable unused) {
            kVar = n1.f58259a;
        }
        f58269b = kVar;
    }

    public static final <E extends Throwable> x00.l<Throwable, Throwable> g(Class<E> cls) {
        Object obj;
        x00.l<Throwable, Throwable> lVar;
        Pair a11;
        a aVar = a.f58270a;
        if (f58268a == n(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i11 = 0;
            while (true) {
                obj = null;
                if (i11 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i11];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    a11 = yz.h1.a(o(new x00.l() { // from class: h40.r
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            Throwable k11;
                            k11 = s.k(constructor, (Throwable) obj2);
                            return k11;
                        }
                    }), 0);
                } else if (length2 != 1) {
                    a11 = length2 != 2 ? yz.h1.a(null, -1) : (kotlin.jvm.internal.g0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.g0.g(parameterTypes[1], Throwable.class)) ? yz.h1.a(o(new x00.l() { // from class: h40.o
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            Throwable h11;
                            h11 = s.h(constructor, (Throwable) obj2);
                            return h11;
                        }
                    }), 3) : yz.h1.a(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    a11 = kotlin.jvm.internal.g0.g(cls2, String.class) ? yz.h1.a(o(new x00.l() { // from class: h40.p
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            Throwable i12;
                            i12 = s.i(constructor, (Throwable) obj2);
                            return i12;
                        }
                    }), 2) : kotlin.jvm.internal.g0.g(cls2, Throwable.class) ? yz.h1.a(o(new x00.l() { // from class: h40.q
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            Throwable j11;
                            j11 = s.j(constructor, (Throwable) obj2);
                            return j11;
                        }
                    }), 1) : yz.h1.a(null, -1);
                }
                arrayList.add(a11);
                i11++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Pair) obj).getSecond()).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((Pair) next).getSecond()).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null && (lVar = (x00.l) pair.getFirst()) != null) {
                return lVar;
            }
        }
        return aVar;
    }

    public static final Throwable h(Constructor constructor, Throwable th2) {
        Object newInstance = constructor.newInstance(th2.getMessage(), th2);
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable i(Constructor constructor, Throwable th2) {
        Object newInstance = constructor.newInstance(th2.getMessage());
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) newInstance;
        th3.initCause(th2);
        return th3;
    }

    public static final Throwable j(Constructor constructor, Throwable th2) {
        Object newInstance = constructor.newInstance(th2);
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable k(Constructor constructor, Throwable th2) {
        Object newInstance = constructor.newInstance(null);
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) newInstance;
        th3.initCause(th2);
        return th3;
    }

    public static final int l(Class<?> cls, int i11) {
        do {
            int i12 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i12++;
                }
            }
            i11 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i11;
    }

    public static /* synthetic */ int m(Class cls, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return l(cls, i11);
    }

    public static final int n(Class<?> cls, int i11) {
        Object m6308constructorimpl;
        w00.b.i(cls);
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(Integer.valueOf(m(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Integer valueOf = Integer.valueOf(i11);
        if (Result.m6314isFailureimpl(m6308constructorimpl)) {
            m6308constructorimpl = valueOf;
        }
        return ((Number) m6308constructorimpl).intValue();
    }

    public static final x00.l<Throwable, Throwable> o(final x00.l<? super Throwable, ? extends Throwable> lVar) {
        return new x00.l() { // from class: h40.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                Throwable p11;
                p11 = s.p(x00.l.this, (Throwable) obj);
                return p11;
            }
        };
    }

    public static final Throwable p(x00.l lVar, Throwable th2) {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Throwable th3 = (Throwable) lVar.invoke(th2);
            if (!kotlin.jvm.internal.g0.g(th2.getMessage(), th3.getMessage()) && !kotlin.jvm.internal.g0.g(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            m6308constructorimpl = Result.m6308constructorimpl(th3);
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th4));
        }
        return (Throwable) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final <E extends Throwable> E q(@m80.k E e11) {
        Object m6308constructorimpl;
        if (!(e11 instanceof c40.g0)) {
            return (E) f58269b.a(e11.getClass()).invoke(e11);
        }
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(((c40.g0) e11).createCopy());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6314isFailureimpl(m6308constructorimpl)) {
            m6308constructorimpl = null;
        }
        return (E) m6308constructorimpl;
    }
}
