package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85739a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85740a;

        public a(b bVar) {
            this.f85740a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85740a.q(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> implements wb0.p<Object, T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85742a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicLong f85743b = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque<Object> f85744c = new ArrayDeque<>();

        /* renamed from: d, reason: collision with root package name */
        public final int f85745d;

        public b(qb0.g<? super T> gVar, int i11) {
            this.f85742a = gVar;
            this.f85745d = i11;
        }

        @Override // wb0.p
        public T call(Object obj) {
            return (T) v.e(obj);
        }

        @Override // qb0.c
        public void onCompleted() {
            rx.internal.operators.a.e(this.f85743b, this.f85744c, this.f85742a, this);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85744c.clear();
            this.f85742a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85744c.size() == this.f85745d) {
                this.f85744c.poll();
            }
            this.f85744c.offer(v.j(t11));
        }

        public void q(long j11) {
            if (j11 > 0) {
                rx.internal.operators.a.h(this.f85743b, j11, this.f85744c, this.f85742a, this);
            }
        }
    }

    public m3(int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.f85739a = i11;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, this.f85739a);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        return bVar;
    }
}
