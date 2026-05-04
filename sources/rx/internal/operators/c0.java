package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f85172a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85173b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85174c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85175d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85176a;

        public a(qb0.g gVar) {
            this.f85176a = gVar;
        }

        @Override // wb0.a
        public void call() {
            if (this.f85176a.isUnsubscribed()) {
                return;
            }
            c0.this.f85172a.J6(zb0.h.f(this.f85176a));
        }
    }

    public c0(rx.c<? extends T> cVar, long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85172a = cVar;
        this.f85173b = j11;
        this.f85174c = timeUnit;
        this.f85175d = dVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        d.a a11 = this.f85175d.a();
        gVar.add(a11);
        a11.j(new a(gVar), this.f85173b, this.f85174c);
    }
}
