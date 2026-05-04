package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m extends rx.d {

    /* renamed from: a, reason: collision with root package name */
    public static final m f86629a = new m();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d.a implements qb0.h {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f86630a = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f86631b = new PriorityBlockingQueue<>();

        /* renamed from: c, reason: collision with root package name */
        public final ec0.a f86632c = new ec0.a();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f86633d = new AtomicInteger();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.m$a$a, reason: collision with other inner class name */
        public class C1119a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f86634a;

            public C1119a(b bVar) {
                this.f86634a = bVar;
            }

            @Override // wb0.a
            public void call() {
                a.this.f86631b.remove(this.f86634a);
            }
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            return q(aVar, b());
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86632c.isUnsubscribed();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            long b11 = b() + timeUnit.toMillis(j11);
            return q(new l(aVar, this, b11), b11);
        }

        public final qb0.h q(wb0.a aVar, long j11) {
            if (this.f86632c.isUnsubscribed()) {
                return ec0.f.e();
            }
            b bVar = new b(aVar, Long.valueOf(j11), this.f86630a.incrementAndGet());
            this.f86631b.add(bVar);
            if (this.f86633d.getAndIncrement() != 0) {
                return ec0.f.a(new C1119a(bVar));
            }
            do {
                b poll = this.f86631b.poll();
                if (poll != null) {
                    poll.f86636a.call();
                }
            } while (this.f86633d.decrementAndGet() > 0);
            return ec0.f.e();
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f86632c.unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.a f86636a;

        /* renamed from: b, reason: collision with root package name */
        public final Long f86637b;

        /* renamed from: c, reason: collision with root package name */
        public final int f86638c;

        public b(wb0.a aVar, Long l11, int i11) {
            this.f86636a = aVar;
            this.f86637b = l11;
            this.f86638c = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int compareTo = this.f86637b.compareTo(bVar.f86637b);
            return compareTo == 0 ? m.d(this.f86638c, bVar.f86638c) : compareTo;
        }
    }

    public static int d(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    @Override // rx.d
    public d.a a() {
        return new a();
    }
}
