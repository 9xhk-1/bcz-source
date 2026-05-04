package ha0;

import ba0.c2;
import da0.s1;
import ha0.r;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class r<T extends TestDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final List<Function<d<T>, u>> f59124a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Function<d<T>, TestDescriptor.a>> f59125b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public static class b<T extends TestDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final List<Function<d<T>, u>> f59126a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Function<d<T>, TestDescriptor.a>> f59127b;

        public static /* synthetic */ u a(Predicate predicate, d dVar) {
            return new ha0.b(predicate, dVar.a());
        }

        public b<T> c(final Predicate<Class<?>> classFilter) {
            c2.r(classFilter, "classFilter must not be null");
            return e(new Function() { // from class: ha0.s
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return r.b.a(classFilter, (r.d) obj);
                }
            });
        }

        public b<T> d(final u resolver) {
            c2.r(resolver, "resolver must not be null");
            return e(new Function() { // from class: ha0.t
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return r.b.b(u.this, (r.d) obj);
                }
            });
        }

        public b<T> e(Function<d<T>, u> resolverCreator) {
            this.f59126a.add(resolverCreator);
            return this;
        }

        public b<T> f(Function<d<T>, TestDescriptor.a> visitorCreator) {
            this.f59127b.add(visitorCreator);
            return this;
        }

        public r<T> g() {
            return new r<>(this.f59126a, this.f59127b);
        }

        public b() {
            this.f59126a = new ArrayList();
            this.f59127b = new ArrayList();
        }

        public static /* synthetic */ u b(u uVar, d dVar) {
            return uVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T extends TestDescriptor> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final ca0.q f59128a;

        /* renamed from: b, reason: collision with root package name */
        public final T f59129b;

        /* renamed from: c, reason: collision with root package name */
        public final Predicate<String> f59130c;

        public c(ca0.q request, T engineDescriptor) {
            this.f59128a = request;
            this.f59129b = engineDescriptor;
            this.f59130c = d(request);
        }

        @Override // ha0.r.d
        public Predicate<String> a() {
            return this.f59130c;
        }

        @Override // ha0.r.d
        public ca0.q b() {
            return this.f59128a;
        }

        @Override // ha0.r.d
        public T c() {
            return this.f59129b;
        }

        public final Predicate<String> d(ca0.q request) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(request.b(da0.c.class));
            arrayList.addAll(request.b(s1.class));
            return ca0.v.e(arrayList).h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public interface d<T extends TestDescriptor> {
        Predicate<String> a();

        ca0.q b();

        T c();
    }

    public static <T extends TestDescriptor> b<T> b() {
        return new b<>();
    }

    public final <R> List<R> c(List<Function<d<T>, R>> creators, final d<T> context) {
        return (List) creators.stream().map(new Function() { // from class: ha0.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = ((Function) obj).apply(r.d.this);
                return apply;
            }
        }).collect(Collectors.toCollection(new x80.e()));
    }

    public void d(ca0.q qVar, T t11) {
        c2.r(qVar, "request must not be null");
        c2.r(t11, "engineDescriptor must not be null");
        c cVar = new c(qVar, t11);
        new p(qVar, t11, c(this.f59124a, cVar), c(this.f59125b, cVar)).p();
    }

    public r(List<Function<d<T>, u>> resolverCreators, List<Function<d<T>, TestDescriptor.a>> visitorCreators) {
        this.f59124a = new ArrayList(resolverCreators);
        this.f59125b = new ArrayList(visitorCreators);
    }
}
