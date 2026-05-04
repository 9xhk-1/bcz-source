package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.n0;
import rx.internal.util.ExceptionsUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k0<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f85629a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends Iterable<? extends R>> f85630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85631c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85632a;

        public a(b bVar) {
            this.f85632a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85632a.D(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85634a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends Iterable<? extends R>> f85635b;

        /* renamed from: c, reason: collision with root package name */
        public final long f85636c;

        /* renamed from: d, reason: collision with root package name */
        public final Queue<Object> f85637d;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f85641h;

        /* renamed from: i, reason: collision with root package name */
        public long f85642i;

        /* renamed from: j, reason: collision with root package name */
        public Iterator<? extends R> f85643j;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<Throwable> f85638e = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f85640g = new AtomicInteger();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f85639f = new AtomicLong();

        public b(qb0.g<? super R> gVar, wb0.p<? super T, ? extends Iterable<? extends R>> pVar, int i11) {
            this.f85634a = gVar;
            this.f85635b = pVar;
            if (i11 == Integer.MAX_VALUE) {
                this.f85636c = Long.MAX_VALUE;
                this.f85637d = new rx.internal.util.atomic.e(rx.internal.util.j.f86718d);
            } else {
                this.f85636c = i11 - (i11 >> 2);
                if (rx.internal.util.unsafe.n0.f()) {
                    this.f85637d = new rx.internal.util.unsafe.z(i11);
                } else {
                    this.f85637d = new rx.internal.util.atomic.d(i11);
                }
            }
            request(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0012 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00ce A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void C() {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.k0.b.C():void");
        }

        public void D(long j11) {
            if (j11 > 0) {
                rx.internal.operators.a.b(this.f85639f, j11);
                C();
            } else {
                if (j11 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j11);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85641h = true;
            C();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (!ExceptionsUtils.addThrowable(this.f85638e, th2)) {
                ac0.c.I(th2);
            } else {
                this.f85641h = true;
                C();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85637d.offer(v.j(t11))) {
                C();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        public boolean q(boolean z11, boolean z12, qb0.g<?> gVar, Queue<?> queue) {
            if (gVar.isUnsubscribed()) {
                queue.clear();
                this.f85643j = null;
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.f85638e.get() == null) {
                if (!z12) {
                    return false;
                }
                gVar.onCompleted();
                return true;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f85638e);
            unsubscribe();
            queue.clear();
            this.f85643j = null;
            gVar.onError(terminate);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T, R> implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final T f85644a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends Iterable<? extends R>> f85645b;

        public c(T t11, wb0.p<? super T, ? extends Iterable<? extends R>> pVar) {
            this.f85644a = t11;
            this.f85645b = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            try {
                Iterator<? extends R> it = this.f85645b.call(this.f85644a).iterator();
                if (it.hasNext()) {
                    gVar.setProducer(new n0.a(gVar, it));
                } else {
                    gVar.onCompleted();
                }
            } catch (Throwable th2) {
                vb0.a.g(th2, gVar, this.f85644a);
            }
        }
    }

    public k0(rx.c<? extends T> cVar, wb0.p<? super T, ? extends Iterable<? extends R>> pVar, int i11) {
        this.f85629a = cVar;
        this.f85630b = pVar;
        this.f85631c = i11;
    }

    public static <T, R> rx.c<R> b(rx.c<? extends T> cVar, wb0.p<? super T, ? extends Iterable<? extends R>> pVar, int i11) {
        return cVar instanceof rx.internal.util.k ? rx.c.I6(new c(((rx.internal.util.k) cVar).y7(), pVar)) : rx.c.I6(new k0(cVar, pVar, i11));
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        b bVar = new b(gVar, this.f85630b, this.f85631c);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        this.f85629a.J6(bVar);
    }
}
