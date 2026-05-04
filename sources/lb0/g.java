package lb0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import l60.i1;
import lb0.c;
import lb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f70868a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c<Object, lb0.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f70869a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f70870b;

        public a(Type type, Executor executor) {
            this.f70869a = type;
            this.f70870b = executor;
        }

        @Override // lb0.c
        public Type b() {
            return this.f70869a;
        }

        @Override // lb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public lb0.b<Object> a(lb0.b<Object> bVar) {
            Executor executor = this.f70870b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements lb0.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f70872a;

        /* renamed from: b, reason: collision with root package name */
        public final lb0.b<T> f70873b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f70874a;

            public a(d dVar) {
                this.f70874a = dVar;
            }

            public static /* synthetic */ void d(a aVar, d dVar, y yVar) {
                if (b.this.f70873b.isCanceled()) {
                    dVar.b(b.this, new IOException("Canceled"));
                } else {
                    dVar.a(b.this, yVar);
                }
            }

            @Override // lb0.d
            public void a(lb0.b<T> bVar, final y<T> yVar) {
                Executor executor = b.this.f70872a;
                final d dVar = this.f70874a;
                executor.execute(new Runnable() { // from class: lb0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.d(g.b.a.this, dVar, yVar);
                    }
                });
            }

            @Override // lb0.d
            public void b(lb0.b<T> bVar, final Throwable th2) {
                Executor executor = b.this.f70872a;
                final d dVar = this.f70874a;
                executor.execute(new Runnable() { // from class: lb0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.b(g.b.this, th2);
                    }
                });
            }
        }

        public b(Executor executor, lb0.b<T> bVar) {
            this.f70872a = executor;
            this.f70873b = bVar;
        }

        @Override // lb0.b
        public i1 D() {
            return this.f70873b.D();
        }

        @Override // lb0.b
        public void K0(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f70873b.K0(new a(dVar));
        }

        @Override // lb0.b
        public void cancel() {
            this.f70873b.cancel();
        }

        @Override // lb0.b
        public y<T> execute() throws IOException {
            return this.f70873b.execute();
        }

        @Override // lb0.b
        public boolean isCanceled() {
            return this.f70873b.isCanceled();
        }

        @Override // lb0.b
        public boolean isExecuted() {
            return this.f70873b.isExecuted();
        }

        @Override // lb0.b
        public okhttp3.l request() {
            return this.f70873b.request();
        }

        @Override // lb0.b
        public lb0.b<T> clone() {
            return new b(this.f70872a, this.f70873b.clone());
        }
    }

    public g(@Nullable Executor executor) {
        this.f70868a = executor;
    }

    @Override // lb0.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, z zVar) {
        if (c.a.c(type) != lb0.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(d0.g(0, (ParameterizedType) type), d0.l(annotationArr, b0.class) ? null : this.f70868a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
