package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.d;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f86596a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public long f86597a;

        /* renamed from: b, reason: collision with root package name */
        public long f86598b;

        /* renamed from: c, reason: collision with root package name */
        public long f86599c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f86600d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f86601e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ wb0.a f86602f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ SequentialSubscription f86603g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f86604h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d.a f86605i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f86606j;

        public a(long j11, long j12, wb0.a aVar, SequentialSubscription sequentialSubscription, b bVar, d.a aVar2, long j13) {
            this.f86600d = j11;
            this.f86601e = j12;
            this.f86602f = aVar;
            this.f86603g = sequentialSubscription;
            this.f86604h = bVar;
            this.f86605i = aVar2;
            this.f86606j = j13;
            this.f86598b = j11;
            this.f86599c = j12;
        }

        @Override // wb0.a
        public void call() {
            long j11;
            this.f86602f.call();
            if (this.f86603g.isUnsubscribed()) {
                return;
            }
            b bVar = this.f86604h;
            long a11 = bVar != null ? bVar.a() : TimeUnit.MILLISECONDS.toNanos(this.f86605i.b());
            long j12 = i.f86596a;
            long j13 = a11 + j12;
            long j14 = this.f86598b;
            if (j13 >= j14) {
                long j15 = this.f86606j;
                if (a11 < j14 + j15 + j12) {
                    long j16 = this.f86599c;
                    long j17 = this.f86597a + 1;
                    this.f86597a = j17;
                    j11 = j16 + (j17 * j15);
                    this.f86598b = a11;
                    this.f86603g.replace(this.f86605i.j(this, j11 - a11, TimeUnit.NANOSECONDS));
                }
            }
            long j18 = this.f86606j;
            long j19 = a11 + j18;
            long j21 = this.f86597a + 1;
            this.f86597a = j21;
            this.f86599c = j19 - (j18 * j21);
            j11 = j19;
            this.f86598b = a11;
            this.f86603g.replace(this.f86605i.j(this, j11 - a11, TimeUnit.NANOSECONDS));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        long a();
    }

    public i() {
        throw new IllegalStateException("No instances!");
    }

    public static qb0.h a(d.a aVar, wb0.a aVar2, long j11, long j12, TimeUnit timeUnit, b bVar) {
        long nanos = timeUnit.toNanos(j12);
        long a11 = bVar != null ? bVar.a() : TimeUnit.MILLISECONDS.toNanos(aVar.b());
        long nanos2 = timeUnit.toNanos(j11) + a11;
        SequentialSubscription sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        sequentialSubscription.replace(aVar.j(new a(a11, nanos2, aVar2, sequentialSubscription2, bVar, aVar, nanos), j11, timeUnit));
        return sequentialSubscription2;
    }
}
