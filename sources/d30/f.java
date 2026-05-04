package d30;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f implements d30.n {

    /* renamed from: d, reason: collision with root package name */
    public static final String f47124d = k0.W5(f.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final d30.n f47125e = new a("NO_LOCKS", InterfaceC0546f.f47136a, d30.e.f47123b);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f47126f = false;

    /* renamed from: a, reason: collision with root package name */
    public final d30.k f47127a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0546f f47128b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47129c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends f {
        public a(String str, InterfaceC0546f interfaceC0546f, d30.k kVar) {
            super(str, interfaceC0546f, kVar, null);
        }

        public static /* synthetic */ void j(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i11 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // d30.f
        @m80.k
        public <K, V> o<V> p(@m80.k String str, K k11) {
            if (str == null) {
                j(0);
            }
            o<V> a11 = o.a();
            if (a11 == null) {
                j(1);
            }
            return a11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends j<T> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f47130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, x00.a aVar, Object obj) {
            super(fVar, aVar);
            this.f47130e = obj;
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // d30.f.h
        @m80.k
        public o<T> c(boolean z11) {
            o<T> d11 = o.d(this.f47130e);
            if (d11 == null) {
                a(0);
            }
            return d11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> extends k<T> {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l f47132f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.l f47133g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, x00.a aVar, x00.l lVar, x00.l lVar2) {
            super(fVar, aVar);
            this.f47132f = lVar;
            this.f47133g = lVar2;
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i11 != 2 ? 2 : 3];
            if (i11 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i11 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i11 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // d30.f.h
        @m80.k
        public o<T> c(boolean z11) {
            x00.l lVar = this.f47132f;
            if (lVar == null) {
                o<T> c11 = super.c(z11);
                if (c11 == null) {
                    a(0);
                }
                return c11;
            }
            o<T> d11 = o.d(lVar.invoke(Boolean.valueOf(z11)));
            if (d11 == null) {
                a(1);
            }
            return d11;
        }

        @Override // d30.f.i
        public void d(@m80.k T t11) {
            if (t11 == null) {
                a(2);
            }
            this.f47133g.invoke(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K, V> extends e<K, V> implements d30.a<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ boolean f47135d = false;

        public /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // d30.f.e, d30.a
        @m80.k
        public V a(K k11, @m80.k x00.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v11 = (V) super.a(k11, aVar);
            if (v11 == null) {
                b(3);
            }
            return v11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k f fVar, @m80.k ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<K, V> extends l<g<K, V>, V> implements d30.b<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements x00.l<g<K, V>, V> {
            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) gVar.f47138b.invoke();
            }
        }

        public /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i11 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @m80.l
        public V a(K k11, @m80.k x00.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k11, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k f fVar, @m80.k ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: d30.f$f, reason: collision with other inner class name */
    public interface InterfaceC0546f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0546f f47136a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: d30.f$f$a */
        public static class a implements InterfaceC0546f {
            public static /* synthetic */ void b(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // d30.f.InterfaceC0546f
            @m80.k
            public RuntimeException a(@m80.k Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw o30.d.b(th2);
            }
        }

        @m80.k
        RuntimeException a(@m80.k Throwable th2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f47137a;

        /* renamed from: b, reason: collision with root package name */
        public final x00.a<? extends V> f47138b;

        public g(K k11, x00.a<? extends V> aVar) {
            this.f47137a = k11;
            this.f47138b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f47137a.equals(((g) obj).f47137a);
        }

        public int hashCode() {
            return this.f47137a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class i<T> extends h<T> {

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public volatile d30.l<T> f47142d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k f fVar, @m80.k x00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f47142d = null;
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // d30.f.h
        public final void b(T t11) {
            this.f47142d = new d30.l<>(t11);
            try {
                d(t11);
            } finally {
                this.f47142d = null;
            }
        }

        public abstract void d(T t11);

        @Override // d30.f.h, x00.a
        public T invoke() {
            d30.l<T> lVar = this.f47142d;
            return (lVar == null || !lVar.b()) ? (T) super.invoke() : lVar.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j<T> extends h<T> implements d30.i<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ boolean f47143d = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k f fVar, @m80.k x00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // d30.f.h, x00.a
        @m80.k
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class k<T> extends i<T> implements d30.i<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ boolean f47144e = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k f fVar, @m80.k x00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // d30.f.i, d30.f.h, x00.a
        @m80.k
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l<K, V> implements d30.h<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final f f47145a;

        /* renamed from: b, reason: collision with root package name */
        public final ConcurrentMap<K, Object> f47146b;

        /* renamed from: c, reason: collision with root package name */
        public final x00.l<? super K, ? extends V> f47147c;

        public l(@m80.k f fVar, @m80.k ConcurrentMap<K, Object> concurrentMap, @m80.k x00.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f47145a = fVar;
            this.f47146b = concurrentMap;
            this.f47147c = lVar;
        }

        private static /* synthetic */ void b(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public f c() {
            return this.f47145a;
        }

        public final AssertionError d(K k11, Object obj) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k11 + " under " + this.f47145a));
        }

        @m80.k
        public final AssertionError e(K k11, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.f47145a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        @m80.k
        public o<V> f(K k11, boolean z11) {
            o<V> p11 = this.f47145a.p("", k11);
            if (p11 == null) {
                b(3);
            }
            return p11;
        }

        @Override // d30.h
        public boolean h(K k11) {
            Object obj = this.f47146b.get(k11);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        public final AssertionError i(K k11, Throwable th2) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + k11 + " under " + this.f47145a, th2));
        }

        @Override // x00.l
        @m80.l
        public V invoke(K k11) {
            AssertionError i11;
            AssertionError i12;
            V v11;
            Object obj = this.f47146b.get(k11);
            if (obj != null && obj != n.COMPUTING) {
                return (V) WrappedValues.d(obj);
            }
            this.f47145a.f47127a.lock();
            try {
                Object obj2 = this.f47146b.get(k11);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> f11 = f(k11, true);
                    if (!f11.c()) {
                        v11 = f11.b();
                        return v11;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o<V> f12 = f(k11, false);
                    if (!f12.c()) {
                        v11 = f12.b();
                        return v11;
                    }
                }
                if (obj2 != null) {
                    v11 = (V) WrappedValues.d(obj2);
                    return v11;
                }
                AssertionError assertionError = null;
                try {
                    this.f47146b.put(k11, nVar);
                    V invoke = this.f47147c.invoke(k11);
                    Object put = this.f47146b.put(k11, WrappedValues.b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    assertionError = e(k11, put);
                    throw assertionError;
                } catch (Throwable th2) {
                    if (o30.d.a(th2)) {
                        try {
                            Object remove = this.f47146b.remove(k11);
                            if (remove != n.COMPUTING) {
                                throw d(k11, remove);
                            }
                            throw th2;
                        } finally {
                        }
                    }
                    if (th2 == assertionError) {
                        try {
                            this.f47146b.remove(k11);
                            throw this.f47145a.f47128b.a(th2);
                        } finally {
                        }
                    }
                    Object put2 = this.f47146b.put(k11, WrappedValues.c(th2));
                    if (put2 != n.COMPUTING) {
                        throw e(k11, put2);
                    }
                    throw this.f47145a.f47128b.a(th2);
                }
            } finally {
                this.f47145a.f47127a.unlock();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<K, V> extends l<K, V> implements d30.g<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ boolean f47148d = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k f fVar, @m80.k ConcurrentMap<K, Object> concurrentMap, @m80.k x00.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // d30.f.l, x00.l
        @m80.k
        public V invoke(K k11) {
            V v11 = (V) super.invoke(k11);
            if (v11 == null) {
                b(3);
            }
            return v11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ boolean f47153c = false;

        /* renamed from: a, reason: collision with root package name */
        public final T f47154a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47155b;

        public o(T t11, boolean z11) {
            this.f47154a = t11;
            this.f47155b = z11;
        }

        @m80.k
        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        @m80.k
        public static <T> o<T> d(T t11) {
            return new o<>(t11, false);
        }

        public T b() {
            return this.f47154a;
        }

        public boolean c() {
            return this.f47155b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f47154a);
        }
    }

    public /* synthetic */ f(String str, InterfaceC0546f interfaceC0546f, d30.k kVar, a aVar) {
        this(str, interfaceC0546f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.f.j(int):void");
    }

    @m80.k
    public static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @m80.k
    public static <T extends Throwable> T q(@m80.k T t11) {
        if (t11 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!stackTrace[i11].getClassName().startsWith(f47124d)) {
                break;
            }
            i11++;
        }
        List subList = Arrays.asList(stackTrace).subList(i11, length);
        t11.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t11;
    }

    @Override // d30.n
    public <T> T a(@m80.k x00.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f47127a.lock();
        try {
            return aVar.invoke();
        } finally {
        }
    }

    @Override // d30.n
    @m80.k
    public <K, V> d30.g<K, V> b(@m80.k x00.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        d30.g<K, V> n11 = n(lVar, m());
        if (n11 == null) {
            j(10);
        }
        return n11;
    }

    @Override // d30.n
    @m80.k
    public <T> d30.i<T> c(@m80.k x00.a<? extends T> aVar, x00.l<? super Boolean, ? extends T> lVar, @m80.k x00.l<? super T, g2> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // d30.n
    @m80.k
    public <T> d30.i<T> d(@m80.k x00.a<? extends T> aVar, @m80.k T t11) {
        if (aVar == null) {
            j(26);
        }
        if (t11 == null) {
            j(27);
        }
        return new b(this, aVar, t11);
    }

    @Override // d30.n
    @m80.k
    public <T> d30.j<T> e(@m80.k x00.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // d30.n
    @m80.k
    public <T> d30.i<T> f(@m80.k x00.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // d30.n
    @m80.k
    public <K, V> d30.a<K, V> g() {
        return new d(this, m(), null);
    }

    @Override // d30.n
    @m80.k
    public <K, V> d30.h<K, V> h(@m80.k x00.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        d30.h<K, V> o11 = o(lVar, m());
        if (o11 == null) {
            j(20);
        }
        return o11;
    }

    @Override // d30.n
    @m80.k
    public <K, V> d30.b<K, V> i() {
        return new e(this, m(), null);
    }

    @m80.k
    public <K, V> d30.g<K, V> n(@m80.k x00.l<? super K, ? extends V> lVar, @m80.k ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    @m80.k
    public <K, V> d30.h<K, V> o(@m80.k x00.l<? super K, ? extends V> lVar, @m80.k ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    @m80.k
    public <K, V> o<V> p(@m80.k String str, K k11) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k11 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k11;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + EmailAutoCompleteEditText.f17091d + Integer.toHexString(hashCode()) + " (" + this.f47129c + pn.j.f81007d;
    }

    public f(@m80.k String str, @m80.k InterfaceC0546f interfaceC0546f, @m80.k d30.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0546f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f47127a = kVar;
        this.f47128b = interfaceC0546f;
        this.f47129c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (x00.l<InterruptedException, g2>) null);
    }

    public f(String str, @m80.l Runnable runnable, @m80.l x00.l<InterruptedException, g2> lVar) {
        this(str, InterfaceC0546f.f47136a, d30.k.f47156a.a(runnable, lVar));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<T> implements d30.j<T> {

        /* renamed from: a, reason: collision with root package name */
        public final f f47139a;

        /* renamed from: b, reason: collision with root package name */
        public final x00.a<? extends T> f47140b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public volatile Object f47141c;

        public h(@m80.k f fVar, @m80.k x00.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f47141c = n.NOT_COMPUTED;
            this.f47139a = fVar;
            this.f47140b = aVar;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @m80.k
        public o<T> c(boolean z11) {
            o<T> p11 = this.f47139a.p("in a lazy value", null);
            if (p11 == null) {
                a(2);
            }
            return p11;
        }

        public boolean g() {
            return (this.f47141c == n.NOT_COMPUTED || this.f47141c == n.COMPUTING) ? false : true;
        }

        @Override // x00.a
        public T invoke() {
            T invoke;
            Object obj = this.f47141c;
            if (!(obj instanceof n)) {
                return (T) WrappedValues.f(obj);
            }
            this.f47139a.f47127a.lock();
            try {
                Object obj2 = this.f47141c;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f47141c = n.RECURSION_WAS_DETECTED;
                        o<T> c11 = c(true);
                        if (!c11.c()) {
                            invoke = c11.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> c12 = c(false);
                        if (!c12.c()) {
                            invoke = c12.b();
                        }
                    }
                    this.f47141c = nVar;
                    try {
                        invoke = this.f47140b.invoke();
                        b(invoke);
                        this.f47141c = invoke;
                    } catch (Throwable th2) {
                        if (o30.d.a(th2)) {
                            this.f47141c = n.NOT_COMPUTED;
                            throw th2;
                        }
                        if (this.f47141c == n.COMPUTING) {
                            this.f47141c = WrappedValues.c(th2);
                        }
                        throw this.f47139a.f47128b.a(th2);
                    }
                } else {
                    invoke = (T) WrappedValues.f(obj2);
                }
                return invoke;
            } finally {
                this.f47139a.f47127a.unlock();
            }
        }

        public void b(T t11) {
        }
    }
}
