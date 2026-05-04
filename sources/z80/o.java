package z80;

import ba0.o1;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apiguardian.api.API;
import org.junit.jupiter.api.j2;
import org.junit.platform.commons.JUnitException;
import p80.q;
import z80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.5", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements q.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final q.a<T> f102393a;

        /* renamed from: b, reason: collision with root package name */
        public final b<T> f102394b;

        /* renamed from: c, reason: collision with root package name */
        public final p80.q f102395c;

        public a(q.a<T> invocation, b<T> call, p80.q interceptor) {
            this.f102393a = invocation;
            this.f102394b = call;
            this.f102395c = interceptor;
        }

        @Override // p80.q.a
        public T b() throws Throwable {
            return this.f102394b.a(this.f102395c, this.f102393a);
        }

        @Override // p80.q.a
        public void skip() {
            this.f102393a.skip();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b<T> {
        static b<Void> b(final d call) {
            return new b() { // from class: z80.p
                @Override // z80.o.b
                public final Object a(p80.q qVar, q.a aVar) {
                    return o.b.c(o.d.this, qVar, aVar);
                }
            };
        }

        static /* synthetic */ Void c(d dVar, p80.q qVar, q.a aVar) {
            dVar.a(qVar, aVar);
            return null;
        }

        T a(p80.q interceptor, q.a<T> invocation) throws Throwable;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T> implements q.a<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final y90.e f102396d = y90.g.c(c.class);

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f102397a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final q.a<T> f102398b;

        /* renamed from: c, reason: collision with root package name */
        public final List<p80.q> f102399c;

        public c(q.a<T> delegate, List<p80.q> interceptors) {
            this.f102398b = delegate;
            this.f102399c = interceptors;
        }

        public static /* synthetic */ String c() {
            return "The invocation is skipped";
        }

        @Override // p80.q.a
        public T b() throws Throwable {
            e();
            return this.f102398b.b();
        }

        public final void d(String prefix) {
            throw new JUnitException(prefix + ": " + ((String) this.f102399c.stream().map(new Function() { // from class: z80.r
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Class cls;
                    cls = ((p80.q) obj).getClass();
                    return cls;
                }
            }).map(new s()).collect(Collectors.joining(j2.O))));
        }

        public final void e() {
            if (this.f102397a.compareAndSet(false, true)) {
                return;
            }
            d("Chain of InvocationInterceptors called invocation multiple times instead of just once");
        }

        public void f() {
            if (this.f102397a.get()) {
                return;
            }
            d("Chain of InvocationInterceptors never called invocation");
        }

        @Override // p80.q.a
        public void skip() {
            f102396d.h(new Supplier() { // from class: z80.q
                @Override // java.util.function.Supplier
                public final Object get() {
                    return o.c.c();
                }
            });
            e();
            this.f102398b.skip();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface d {
        void a(p80.q interceptor, q.a<Void> invocation) throws Throwable;
    }

    public final <T> T a(q.a<T> aVar, b<T> bVar, List<p80.q> list) {
        c cVar = new c(aVar, list);
        T t11 = (T) d(b(cVar, bVar, list));
        cVar.f();
        return t11;
    }

    public final <T> q.a<T> b(q.a<T> invocation, b<T> call, List<p80.q> interceptors) {
        ListIterator<p80.q> listIterator = interceptors.listIterator(interceptors.size());
        while (listIterator.hasPrevious()) {
            invocation = new a(invocation, call, listIterator.previous());
        }
        return invocation;
    }

    public <T> T c(q.a<T> aVar, a90.o oVar, b<T> bVar) {
        List<p80.q> c11 = oVar.c(p80.q.class);
        return c11.isEmpty() ? (T) d(aVar) : (T) a(aVar, bVar, c11);
    }

    public final <T> T d(q.a<T> invocation) {
        try {
            return invocation.b();
        } catch (Throwable th2) {
            throw o1.e(th2);
        }
    }
}
