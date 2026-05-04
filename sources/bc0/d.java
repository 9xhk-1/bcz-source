package bc0;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import qb0.h;
import rx.d;
import rx.internal.schedulers.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends rx.d {

    /* renamed from: c, reason: collision with root package name */
    public static long f6740c;

    /* renamed from: a, reason: collision with root package name */
    public final Queue<c> f6741a = new PriorityQueue(11, new a());

    /* renamed from: b, reason: collision with root package name */
    public long f6742b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            long j11 = cVar.f6749a;
            long j12 = cVar2.f6749a;
            if (j11 == j12) {
                if (cVar.f6752d < cVar2.f6752d) {
                    return -1;
                }
                return cVar.f6752d > cVar2.f6752d ? 1 : 0;
            }
            if (j11 < j12) {
                return -1;
            }
            return j11 > j12 ? 1 : 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends d.a implements i.b {

        /* renamed from: a, reason: collision with root package name */
        public final ec0.a f6743a = new ec0.a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f6745a;

            public a(c cVar) {
                this.f6745a = cVar;
            }

            @Override // wb0.a
            public void call() {
                d.this.f6741a.remove(this.f6745a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: bc0.d$b$b, reason: collision with other inner class name */
        public class C0116b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f6747a;

            public C0116b(c cVar) {
                this.f6747a = cVar;
            }

            @Override // wb0.a
            public void call() {
                d.this.f6741a.remove(this.f6747a);
            }
        }

        public b() {
        }

        @Override // rx.internal.schedulers.i.b
        public long a() {
            return d.this.f6742b;
        }

        @Override // rx.d.a
        public long b() {
            return d.this.b();
        }

        @Override // rx.d.a
        public h h(wb0.a aVar) {
            c cVar = new c(this, 0L, aVar);
            d.this.f6741a.add(cVar);
            return ec0.f.a(new C0116b(cVar));
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f6743a.isUnsubscribed();
        }

        @Override // rx.d.a
        public h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            c cVar = new c(this, d.this.f6742b + timeUnit.toNanos(j11), aVar);
            d.this.f6741a.add(cVar);
            return ec0.f.a(new a(cVar));
        }

        @Override // rx.d.a
        public h n(wb0.a aVar, long j11, long j12, TimeUnit timeUnit) {
            return i.a(this, aVar, j11, j12, timeUnit, this);
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f6743a.unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f6749a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.a f6750b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f6751c;

        /* renamed from: d, reason: collision with root package name */
        public final long f6752d;

        public c(d.a aVar, long j11, wb0.a aVar2) {
            long j12 = d.f6740c;
            d.f6740c = 1 + j12;
            this.f6752d = j12;
            this.f6749a = j11;
            this.f6750b = aVar2;
            this.f6751c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f6749a), this.f6750b.toString());
        }
    }

    @Override // rx.d
    public d.a a() {
        return new b();
    }

    @Override // rx.d
    public long b() {
        return TimeUnit.NANOSECONDS.toMillis(this.f6742b);
    }

    public void d(long j11, TimeUnit timeUnit) {
        e(this.f6742b + timeUnit.toNanos(j11), TimeUnit.NANOSECONDS);
    }

    public void e(long j11, TimeUnit timeUnit) {
        g(timeUnit.toNanos(j11));
    }

    public void f() {
        g(this.f6742b);
    }

    public final void g(long j11) {
        while (!this.f6741a.isEmpty()) {
            c peek = this.f6741a.peek();
            long j12 = peek.f6749a;
            if (j12 > j11) {
                break;
            }
            if (j12 == 0) {
                j12 = this.f6742b;
            }
            this.f6742b = j12;
            this.f6741a.remove();
            if (!peek.f6751c.isUnsubscribed()) {
                peek.f6750b.call();
            }
        }
        this.f6742b = j11;
    }
}
