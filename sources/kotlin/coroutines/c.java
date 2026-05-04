package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public interface c extends d.b {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final b f66933w0 = b.f66934a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <R> R a(@k c cVar, R r11, @k p<? super R, ? super d.b, ? extends R> operation) {
            g0.p(operation, "operation");
            return (R) d.b.a.a(cVar, r11, operation);
        }

        @l
        public static <E extends d.b> E b(@k c cVar, @k d.c<E> key) {
            E e11;
            g0.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (c.f66933w0 != key) {
                    return null;
                }
                g0.n(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(cVar.getKey()) || (e11 = (E) bVar.b(cVar)) == null) {
                return null;
            }
            return e11;
        }

        @k
        public static d c(@k c cVar, @k d.c<?> key) {
            g0.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return c.f66933w0 == key ? EmptyCoroutineContext.INSTANCE : cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(cVar.getKey()) || bVar.b(cVar) == null) ? cVar : EmptyCoroutineContext.INSTANCE;
        }

        @k
        public static d d(@k c cVar, @k d context) {
            g0.p(context, "context");
            return d.b.a.d(cVar, context);
        }

        public static void e(@k c cVar, @k j00.c<?> continuation) {
            g0.p(continuation, "continuation");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements d.c<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f66934a = new b();
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    <E extends d.b> E get(@k d.c<E> cVar);

    @k
    <T> j00.c<T> interceptContinuation(@k j00.c<? super T> cVar);

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    d minusKey(@k d.c<?> cVar);

    void releaseInterceptedContinuation(@k j00.c<?> cVar);
}
