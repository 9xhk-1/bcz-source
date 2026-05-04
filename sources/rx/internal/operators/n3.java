package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85776a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.d f85777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85778c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85779a;

        public a(b bVar) {
            this.f85779a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85779a.C(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> implements wb0.p<Object, T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85781a;

        /* renamed from: b, reason: collision with root package name */
        public final long f85782b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.d f85783c;

        /* renamed from: d, reason: collision with root package name */
        public final int f85784d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85785e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final ArrayDeque<Object> f85786f = new ArrayDeque<>();

        /* renamed from: g, reason: collision with root package name */
        public final ArrayDeque<Long> f85787g = new ArrayDeque<>();

        public b(qb0.g<? super T> gVar, int i11, long j11, rx.d dVar) {
            this.f85781a = gVar;
            this.f85784d = i11;
            this.f85782b = j11;
            this.f85783c = dVar;
        }

        public void C(long j11) {
            rx.internal.operators.a.h(this.f85785e, j11, this.f85786f, this.f85781a, this);
        }

        @Override // wb0.p
        public T call(Object obj) {
            return (T) v.e(obj);
        }

        @Override // qb0.c
        public void onCompleted() {
            q(this.f85783c.b());
            this.f85787g.clear();
            rx.internal.operators.a.e(this.f85785e, this.f85786f, this.f85781a, this);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85786f.clear();
            this.f85787g.clear();
            this.f85781a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85784d != 0) {
                long b11 = this.f85783c.b();
                if (this.f85786f.size() == this.f85784d) {
                    this.f85786f.poll();
                    this.f85787g.poll();
                }
                q(b11);
                this.f85786f.offer(v.j(t11));
                this.f85787g.offer(Long.valueOf(b11));
            }
        }

        public void q(long j11) {
            long j12 = j11 - this.f85782b;
            while (true) {
                Long peek = this.f85787g.peek();
                if (peek == null || peek.longValue() >= j12) {
                    return;
                }
                this.f85786f.poll();
                this.f85787g.poll();
            }
        }
    }

    public n3(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85776a = timeUnit.toMillis(j11);
        this.f85777b = dVar;
        this.f85778c = -1;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, this.f85778c, this.f85776a, this.f85777b);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        return bVar;
    }

    public n3(int i11, long j11, TimeUnit timeUnit, rx.d dVar) {
        if (i11 >= 0) {
            this.f85776a = timeUnit.toMillis(j11);
            this.f85777b = dVar;
            this.f85778c = i11;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
