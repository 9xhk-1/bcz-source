package rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.c;
import rx.exceptions.OnErrorNotImplementedException;
import rx.internal.operators.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum InternalObservableUtils {
    ;

    public static final h LONG_COUNTER = new h();
    public static final f OBJECT_EQUALS = new f();
    public static final q TO_ARRAY = new q();
    static final o RETURNS_VOID = new o();
    public static final g COUNTER = new g();
    static final e ERROR_EXTRACTOR = new e();
    public static final wb0.b<Throwable> ERROR_NOT_IMPLEMENTED = new wb0.b<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.c
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    };
    public static final c.b<Boolean, Object> IS_EMPTY = new o1(rx.internal.util.o.b(), true);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> implements wb0.q<R, T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.c<R, ? super T> f86639a;

        public a(wb0.c<R, ? super T> cVar) {
            this.f86639a = cVar;
        }

        @Override // wb0.q
        public R call(R r11, T t11) {
            this.f86639a.call(r11, t11);
            return r11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements wb0.p<Object, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f86640a;

        public b(Object obj) {
            this.f86640a = obj;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            Object obj2 = this.f86640a;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements wb0.p<Object, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f86641a;

        public d(Class<?> cls) {
            this.f86641a = cls;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f86641a.isInstance(obj));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements wb0.p<Notification<?>, Throwable> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Notification<?> notification) {
            return notification.g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements wb0.q<Object, Object, Boolean> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements wb0.q<Integer, Object, Integer> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements wb0.q<Long, Object, Long> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call(Long l11, Object obj) {
            return Long.valueOf(l11.longValue() + 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.p<? super rx.c<? extends Void>, ? extends rx.c<?>> f86642a;

        public i(wb0.p<? super rx.c<? extends Void>, ? extends rx.c<?>> pVar) {
            this.f86642a = pVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?> call(rx.c<? extends Notification<?>> cVar) {
            return this.f86642a.call(cVar.c3(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<T> implements wb0.o<yb0.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final rx.c<T> f86643a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86644b;

        public j(rx.c<T> cVar, int i11) {
            this.f86643a = cVar;
            this.f86644b = i11;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yb0.c<T> call() {
            return this.f86643a.v4(this.f86644b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k<T> implements wb0.o<yb0.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final TimeUnit f86645a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<T> f86646b;

        /* renamed from: c, reason: collision with root package name */
        public final long f86647c;

        /* renamed from: d, reason: collision with root package name */
        public final rx.d f86648d;

        public k(rx.c<T> cVar, long j11, TimeUnit timeUnit, rx.d dVar) {
            this.f86645a = timeUnit;
            this.f86646b = cVar;
            this.f86647c = j11;
            this.f86648d = dVar;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yb0.c<T> call() {
            return this.f86646b.A4(this.f86647c, this.f86645a, this.f86648d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<T> implements wb0.o<yb0.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final rx.c<T> f86649a;

        public l(rx.c<T> cVar) {
            this.f86649a = cVar;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yb0.c<T> call() {
            return this.f86649a.u4();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m<T> implements wb0.o<yb0.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final long f86650a;

        /* renamed from: b, reason: collision with root package name */
        public final TimeUnit f86651b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.d f86652c;

        /* renamed from: d, reason: collision with root package name */
        public final int f86653d;

        /* renamed from: e, reason: collision with root package name */
        public final rx.c<T> f86654e;

        public m(rx.c<T> cVar, int i11, long j11, TimeUnit timeUnit, rx.d dVar) {
            this.f86650a = j11;
            this.f86651b = timeUnit;
            this.f86652c = dVar;
            this.f86653d = i11;
            this.f86654e = cVar;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yb0.c<T> call() {
            return this.f86654e.x4(this.f86653d, this.f86650a, this.f86651b, this.f86652c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n implements wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.p<? super rx.c<? extends Throwable>, ? extends rx.c<?>> f86655a;

        public n(wb0.p<? super rx.c<? extends Throwable>, ? extends rx.c<?>> pVar) {
            this.f86655a = pVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?> call(rx.c<? extends Notification<?>> cVar) {
            return this.f86655a.call(cVar.c3(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements wb0.p<Object, Void> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p<T, R> implements wb0.p<rx.c<T>, rx.c<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.p<? super rx.c<T>, ? extends rx.c<R>> f86656a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.d f86657b;

        public p(wb0.p<? super rx.c<T>, ? extends rx.c<R>> pVar, rx.d dVar) {
            this.f86656a = pVar;
            this.f86657b = dVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<R> call(rx.c<T> cVar) {
            return this.f86656a.call(cVar).I3(this.f86657b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements wb0.p<List<? extends rx.c<?>>, rx.c<?>[]> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?>[] call(List<? extends rx.c<?>> list) {
            return (rx.c[]) list.toArray(new rx.c[list.size()]);
        }
    }

    public static <T, R> wb0.q<R, T, R> createCollectorCaller(wb0.c<R, ? super T> cVar) {
        return new a(cVar);
    }

    public static wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> createRepeatDematerializer(wb0.p<? super rx.c<? extends Void>, ? extends rx.c<?>> pVar) {
        return new i(pVar);
    }

    public static <T, R> wb0.p<rx.c<T>, rx.c<R>> createReplaySelectorAndObserveOn(wb0.p<? super rx.c<T>, ? extends rx.c<R>> pVar, rx.d dVar) {
        return new p(pVar, dVar);
    }

    public static <T> wb0.o<yb0.c<T>> createReplaySupplier(rx.c<T> cVar) {
        return new l(cVar);
    }

    public static wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> createRetryDematerializer(wb0.p<? super rx.c<? extends Throwable>, ? extends rx.c<?>> pVar) {
        return new n(pVar);
    }

    public static wb0.p<Object, Boolean> equalsWith(Object obj) {
        return new b(obj);
    }

    public static wb0.p<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static <T> wb0.o<yb0.c<T>> createReplaySupplier(rx.c<T> cVar, int i11) {
        return new j(cVar, i11);
    }

    public static <T> wb0.o<yb0.c<T>> createReplaySupplier(rx.c<T> cVar, long j11, TimeUnit timeUnit, rx.d dVar) {
        return new k(cVar, j11, timeUnit, dVar);
    }

    public static <T> wb0.o<yb0.c<T>> createReplaySupplier(rx.c<T> cVar, int i11, long j11, TimeUnit timeUnit, rx.d dVar) {
        return new m(cVar, i11, j11, timeUnit, dVar);
    }
}
