package x90;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import x90.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.4", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public abstract class b<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface d<S, T> {
        T apply(S value) throws Exception;
    }

    public static <V> b<V> f(final Callable<V> action) {
        g(action, "action");
        return m(new Callable() { // from class: x90.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b p11;
                p11 = b.p(action.call());
                return p11;
            }
        });
    }

    public static <T> T g(T input, String title) {
        if (input != null) {
            return input;
        }
        throw new JUnitException(title + " must not be null");
    }

    public static <V> b<V> h(Exception cause) {
        return new C1317b((Exception) g(cause, "cause"));
    }

    public static <V> b<V> m(Callable<b<V>> action) {
        try {
            return action.call();
        } catch (Exception e11) {
            return h(e11);
        }
    }

    public static <V> b<V> p(V value) {
        return new c(value);
    }

    public abstract <U> b<U> d(Function<V, b<U>> function);

    public abstract <U> b<U> e(d<V, U> transformer);

    public abstract V i() throws Exception;

    public abstract <E extends Exception> V j(Function<? super Exception, E> exceptionTransformer) throws Exception;

    public abstract b<V> k(Consumer<Exception> causeConsumer);

    public abstract b<V> l(Consumer<V> valueConsumer);

    public abstract b<V> n(Supplier<b<V>> supplier);

    public abstract b<V> o(Callable<V> action);

    public abstract Optional<V> q();

    public b() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: x90.b$b, reason: collision with other inner class name */
    public static class C1317b<V> extends b<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Exception f97919a;

        public C1317b(Exception cause) {
            super();
            this.f97919a = cause;
        }

        @Override // x90.b
        public <U> b<U> d(Function<V, b<U>> function) {
            return r();
        }

        @Override // x90.b
        public <U> b<U> e(d<V, U> transformer) {
            return r();
        }

        public boolean equals(Object that) {
            if (this == that) {
                return true;
            }
            if (that == null || getClass() != that.getClass()) {
                return false;
            }
            return Objects.equals(this.f97919a, ((C1317b) that).f97919a);
        }

        public int hashCode() {
            return Objects.hash(this.f97919a);
        }

        @Override // x90.b
        public V i() throws Exception {
            throw this.f97919a;
        }

        @Override // x90.b
        public <E extends Exception> V j(Function<? super Exception, E> exceptionTransformer) throws Exception {
            b.g(exceptionTransformer, "exceptionTransformer");
            throw exceptionTransformer.apply(this.f97919a);
        }

        @Override // x90.b
        public b<V> k(Consumer<Exception> causeConsumer) {
            b.g(causeConsumer, "causeConsumer");
            causeConsumer.accept(this.f97919a);
            return this;
        }

        @Override // x90.b
        public b<V> n(final Supplier<b<V>> supplier) {
            b.g(supplier, "supplier");
            Objects.requireNonNull(supplier);
            return b.m(new Callable() { // from class: x90.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (b) supplier.get();
                }
            });
        }

        @Override // x90.b
        public b<V> o(Callable<V> action) {
            b.g(action, "action");
            return b.f(action);
        }

        @Override // x90.b
        public Optional<V> q() {
            return Optional.empty();
        }

        public final <U> b<U> r() {
            return this;
        }

        @Override // x90.b
        public b<V> l(Consumer<V> valueConsumer) {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<V> extends b<V> {

        /* renamed from: a, reason: collision with root package name */
        public final V f97920a;

        public c(V value) {
            super();
            this.f97920a = value;
        }

        public static /* synthetic */ b s(c cVar, Function function) {
            return (b) function.apply(cVar.f97920a);
        }

        @Override // x90.b
        public <U> b<U> d(final Function<V, b<U>> function) {
            b.g(function, "function");
            return b.m(new Callable() { // from class: x90.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.c.s(b.c.this, function);
                }
            });
        }

        @Override // x90.b
        public <U> b<U> e(final d<V, U> transformer) {
            b.g(transformer, "transformer");
            return b.f(new Callable() { // from class: x90.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object apply;
                    apply = transformer.apply(b.c.this.f97920a);
                    return apply;
                }
            });
        }

        public boolean equals(Object that) {
            if (this == that) {
                return true;
            }
            if (that == null || getClass() != that.getClass()) {
                return false;
            }
            return Objects.equals(this.f97920a, ((c) that).f97920a);
        }

        public int hashCode() {
            return Objects.hash(this.f97920a);
        }

        @Override // x90.b
        public V i() {
            return this.f97920a;
        }

        @Override // x90.b
        public <E extends Exception> V j(Function<? super Exception, E> exceptionTransformer) {
            return this.f97920a;
        }

        @Override // x90.b
        public b<V> l(Consumer<V> valueConsumer) {
            b.g(valueConsumer, "valueConsumer");
            valueConsumer.accept(this.f97920a);
            return this;
        }

        @Override // x90.b
        public Optional<V> q() {
            return Optional.ofNullable(this.f97920a);
        }

        @Override // x90.b
        public b<V> k(Consumer<Exception> causeConsumer) {
            return this;
        }

        @Override // x90.b
        public b<V> n(Supplier<b<V>> supplier) {
            return this;
        }

        @Override // x90.b
        public b<V> o(Callable<V> action) {
            return this;
        }
    }
}
