package kotlin.coroutines;

import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public interface d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @k
        public static d b(@k d dVar, @k d context) {
            g0.p(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? dVar : (d) context.fold(dVar, new p() { // from class: j00.e
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    kotlin.coroutines.d c11;
                    c11 = d.a.c((kotlin.coroutines.d) obj, (d.b) obj2);
                    return c11;
                }
            });
        }

        public static d c(d acc, b element) {
            g0.p(acc, "acc");
            g0.p(element, "element");
            d minusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (minusKey == emptyCoroutineContext) {
                return element;
            }
            c.b bVar = kotlin.coroutines.c.f66933w0;
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) minusKey.get(bVar);
            if (cVar == null) {
                return new CombinedContext(minusKey, element);
            }
            d minusKey2 = minusKey.minusKey(bVar);
            return minusKey2 == emptyCoroutineContext ? new CombinedContext(element, cVar) : new CombinedContext(new CombinedContext(minusKey2, element), cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b extends d {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public static <R> R a(@k b bVar, R r11, @k p<? super R, ? super b, ? extends R> operation) {
                g0.p(operation, "operation");
                return operation.invoke(r11, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @l
            public static <E extends b> E b(@k b bVar, @k c<E> key) {
                g0.p(key, "key");
                if (!g0.g(bVar.getKey(), key)) {
                    return null;
                }
                g0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            @k
            public static d c(@k b bVar, @k c<?> key) {
                g0.p(key, "key");
                return g0.g(bVar.getKey(), key) ? EmptyCoroutineContext.INSTANCE : bVar;
            }

            @k
            public static d d(@k b bVar, @k d context) {
                g0.p(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // kotlin.coroutines.d
        <R> R fold(R r11, @k p<? super R, ? super b, ? extends R> pVar);

        @Override // kotlin.coroutines.d
        @l
        <E extends b> E get(@k c<E> cVar);

        @k
        c<?> getKey();

        @Override // kotlin.coroutines.d
        @k
        d minusKey(@k c<?> cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c<E extends b> {
    }

    <R> R fold(R r11, @k p<? super R, ? super b, ? extends R> pVar);

    @l
    <E extends b> E get(@k c<E> cVar);

    @k
    d minusKey(@k c<?> cVar);

    @k
    d plus(@k d dVar);
}
