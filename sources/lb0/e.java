package lb0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import lb0.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@IgnoreJRERequirement
/* loaded from: classes9.dex */
public final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f70860a = new e();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @IgnoreJRERequirement
    public static final class a<R> implements lb0.c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f70861a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @IgnoreJRERequirement
        /* renamed from: lb0.e$a$a, reason: collision with other inner class name */
        public class C0851a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f70862a;

            public C0851a(CompletableFuture<R> completableFuture) {
                this.f70862a = completableFuture;
            }

            @Override // lb0.d
            public void a(lb0.b<R> bVar, y<R> yVar) {
                if (yVar.g()) {
                    this.f70862a.complete(yVar.a());
                } else {
                    this.f70862a.completeExceptionally(new HttpException(yVar));
                }
            }

            @Override // lb0.d
            public void b(lb0.b<R> bVar, Throwable th2) {
                this.f70862a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f70861a = type;
        }

        @Override // lb0.c
        public Type b() {
            return this.f70861a;
        }

        @Override // lb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> a(lb0.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.K0(new C0851a(bVar2));
            return bVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a, reason: collision with root package name */
        public final lb0.b<?> f70864a;

        public b(lb0.b<?> bVar) {
            this.f70864a = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            if (z11) {
                this.f70864a.cancel();
            }
            return super.cancel(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @IgnoreJRERequirement
    public static final class c<R> implements lb0.c<R, CompletableFuture<y<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f70865a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<y<R>> f70866a;

            public a(CompletableFuture<y<R>> completableFuture) {
                this.f70866a = completableFuture;
            }

            @Override // lb0.d
            public void a(lb0.b<R> bVar, y<R> yVar) {
                this.f70866a.complete(yVar);
            }

            @Override // lb0.d
            public void b(lb0.b<R> bVar, Throwable th2) {
                this.f70866a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f70865a = type;
        }

        @Override // lb0.c
        public Type b() {
            return this.f70865a;
        }

        @Override // lb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<y<R>> a(lb0.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.K0(new a(bVar2));
            return bVar2;
        }
    }

    @Override // lb0.c.a
    @Nullable
    public lb0.c<?, ?> a(Type type, Annotation[] annotationArr, z zVar) {
        if (c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type b11 = c.a.b(0, (ParameterizedType) type);
        if (c.a.c(b11) != y.class) {
            return new a(b11);
        }
        if (b11 instanceof ParameterizedType) {
            return new c(c.a.b(0, (ParameterizedType) b11));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
