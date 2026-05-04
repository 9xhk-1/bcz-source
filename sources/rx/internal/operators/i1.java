package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i1 implements c.a<Long> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85482b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85483c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85484d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public long f85485a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85486b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d.a f85487c;

        public a(qb0.g gVar, d.a aVar) {
            this.f85486b = gVar;
            this.f85487c = aVar;
        }

        @Override // wb0.a
        public void call() {
            try {
                qb0.g gVar = this.f85486b;
                long j11 = this.f85485a;
                this.f85485a = 1 + j11;
                gVar.onNext(Long.valueOf(j11));
            } catch (Throwable th2) {
                try {
                    this.f85487c.unsubscribe();
                } finally {
                    vb0.a.f(th2, this.f85486b);
                }
            }
        }
    }

    public i1(long j11, long j12, TimeUnit timeUnit, rx.d dVar) {
        this.f85481a = j11;
        this.f85482b = j12;
        this.f85483c = timeUnit;
        this.f85484d = dVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super Long> gVar) {
        d.a a11 = this.f85484d.a();
        gVar.add(a11);
        a11.n(new a(gVar, a11), this.f85481a, this.f85482b, this.f85483c);
    }
}
