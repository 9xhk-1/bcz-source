package ho;

import com.google.common.base.Preconditions;
import ho.r0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class r0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class a<T> implements p0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient Object f59686a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final p0<T> f59687b;

        /* renamed from: c, reason: collision with root package name */
        public final long f59688c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public volatile transient T f59689d;

        /* renamed from: e, reason: collision with root package name */
        public volatile transient long f59690e;

        public a(p0<T> delegate, long durationNanos) {
            this.f59687b = delegate;
            this.f59688c = durationNanos;
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            in2.defaultReadObject();
            this.f59686a = new Object();
        }

        @Override // ho.p0
        @f0
        public T get() {
            long j11 = this.f59690e;
            long nanoTime = System.nanoTime();
            if (j11 == 0 || nanoTime - j11 >= 0) {
                synchronized (this.f59686a) {
                    try {
                        if (j11 == this.f59690e) {
                            T t11 = this.f59687b.get();
                            this.f59689d = t11;
                            long j12 = nanoTime + this.f59688c;
                            if (j12 == 0) {
                                j12 = 1;
                            }
                            this.f59690e = j12;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) c0.a(this.f59689d);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.f59687b + j2.O + this.f59688c + ", NANOS)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class b<T> implements p0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient Object f59691a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final p0<T> f59692b;

        /* renamed from: c, reason: collision with root package name */
        public volatile transient boolean f59693c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public transient T f59694d;

        public b(p0<T> delegate) {
            this.f59692b = (p0) Preconditions.checkNotNull(delegate);
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            in2.defaultReadObject();
            this.f59691a = new Object();
        }

        @Override // ho.p0
        @f0
        public T get() {
            if (!this.f59693c) {
                synchronized (this.f59691a) {
                    try {
                        if (!this.f59693c) {
                            T t11 = this.f59692b.get();
                            this.f59694d = t11;
                            this.f59693c = true;
                            return t11;
                        }
                    } finally {
                    }
                }
            }
            return (T) c0.a(this.f59694d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f59693c) {
                obj = "<supplier that returned " + this.f59694d + ">";
            } else {
                obj = this.f59692b;
            }
            sb2.append(obj);
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class c<T> implements p0<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final p0<Void> f59695d = new p0() { // from class: ho.s0
            @Override // ho.p0
            public final Object get() {
                return r0.c.a();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Object f59696a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public volatile p0<T> f59697b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public T f59698c;

        public c(p0<T> delegate) {
            this.f59697b = (p0) Preconditions.checkNotNull(delegate);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // ho.p0
        @f0
        public T get() {
            p0<T> p0Var = this.f59697b;
            p0<T> p0Var2 = (p0<T>) f59695d;
            if (p0Var != p0Var2) {
                synchronized (this.f59696a) {
                    try {
                        if (this.f59697b != p0Var2) {
                            T t11 = this.f59697b.get();
                            this.f59698c = t11;
                            this.f59697b = p0Var2;
                            return t11;
                        }
                    } finally {
                    }
                }
            }
            return (T) c0.a(this.f59698c);
        }

        public String toString() {
            Object obj = this.f59697b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f59695d) {
                obj = "<supplier that returned " + this.f59698c + ">";
            }
            sb2.append(obj);
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<F, T> implements p0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final r<? super F, T> f59699a;

        /* renamed from: b, reason: collision with root package name */
        public final p0<F> f59700b;

        public d(r<? super F, T> function, p0<F> supplier) {
            this.f59699a = (r) Preconditions.checkNotNull(function);
            this.f59700b = (p0) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f59699a.equals(dVar.f59699a) && this.f59700b.equals(dVar.f59700b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ho.p0
        @f0
        public T get() {
            return this.f59699a.apply(this.f59700b.get());
        }

        public int hashCode() {
            return d0.b(this.f59699a, this.f59700b);
        }

        public String toString() {
            return "Suppliers.compose(" + this.f59699a + j2.O + this.f59700b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e<T> extends r<p0<T>, T> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum f implements e<Object> {
        INSTANCE;

        @Override // ho.r
        @CheckForNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object apply(p0<Object> input) {
            return input.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<T> implements p0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @f0
        public final T f59703a;

        public g(@f0 T instance) {
            this.f59703a = instance;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof g) {
                return d0.a(this.f59703a, ((g) obj).f59703a);
            }
            return false;
        }

        @Override // ho.p0
        @f0
        public T get() {
            return this.f59703a;
        }

        public int hashCode() {
            return d0.b(this.f59703a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f59703a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class h<T> implements p0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final p0<T> f59704a;

        public h(p0<T> delegate) {
            this.f59704a = (p0) Preconditions.checkNotNull(delegate);
        }

        @Override // ho.p0
        @f0
        public T get() {
            T t11;
            synchronized (this.f59704a) {
                t11 = this.f59704a.get();
            }
            return t11;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.f59704a + pn.j.f81007d;
        }
    }

    public static <F, T> p0<T> a(r<? super F, T> function, p0<F> supplier) {
        return new d(function, supplier);
    }

    public static <T> p0<T> b(p0<T> delegate) {
        return !(delegate instanceof c) ? delegate instanceof b ? delegate : delegate instanceof Serializable ? new b(delegate) : new c(delegate) : delegate;
    }

    public static <T> p0<T> c(p0<T> delegate, long duration, TimeUnit unit) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkArgument(duration > 0, "duration (%s %s) must be > 0", duration, unit);
        return new a(delegate, unit.toNanos(duration));
    }

    @go.d
    @go.c
    @u
    public static <T> p0<T> d(p0<T> delegate, Duration duration) {
        boolean isNegative;
        boolean z11;
        boolean isZero;
        Preconditions.checkNotNull(delegate);
        isNegative = duration.isNegative();
        if (!isNegative) {
            isZero = duration.isZero();
            if (!isZero) {
                z11 = true;
                Preconditions.checkArgument(z11, "duration (%s) must be > 0", duration);
                return new a(delegate, x.a(duration));
            }
        }
        z11 = false;
        Preconditions.checkArgument(z11, "duration (%s) must be > 0", duration);
        return new a(delegate, x.a(duration));
    }

    public static <T> p0<T> e(@f0 T instance) {
        return new g(instance);
    }

    public static <T> r<p0<T>, T> f() {
        return f.INSTANCE;
    }

    @go.d
    public static <T> p0<T> g(p0<T> delegate) {
        return new h(delegate);
    }
}
