package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h1 implements c.a<Long> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85436a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f85437b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f85438c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85439a;

        public a(qb0.g gVar) {
            this.f85439a = gVar;
        }

        @Override // wb0.a
        public void call() {
            try {
                this.f85439a.onNext(0L);
                this.f85439a.onCompleted();
            } catch (Throwable th2) {
                vb0.a.f(th2, this.f85439a);
            }
        }
    }

    public h1(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85436a = j11;
        this.f85437b = timeUnit;
        this.f85438c = dVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super Long> gVar) {
        d.a a11 = this.f85438c.a();
        gVar.add(a11);
        a11.j(new a(gVar), this.f85436a, this.f85437b);
    }
}
