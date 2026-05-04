package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> extends b<T> implements x00.a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final x00.a<T> f67728b;

        /* renamed from: c, reason: collision with root package name */
        public volatile SoftReference<Object> f67729c;

        public a(@m80.l T t11, @m80.k x00.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f67729c = null;
            this.f67728b = aVar;
            if (t11 != null) {
                this.f67729c = new SoftReference<>(a(t11));
            }
        }

        public static /* synthetic */ void d(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.t.b, x00.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f67729c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T invoke = this.f67728b.invoke();
            this.f67729c = new SoftReference<>(a(invoke));
            return invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public static final Object f67730a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a {
        }

        public Object a(T t11) {
            return t11 == null ? f67730a : t11;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T c(Object obj) {
            if (obj == f67730a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    public static /* synthetic */ void a(int i11) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    @m80.k
    public static <T> a<T> b(@m80.l T t11, @m80.k x00.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t11, aVar);
    }

    @m80.k
    public static <T> a<T> c(@m80.k x00.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return b(null, aVar);
    }
}
