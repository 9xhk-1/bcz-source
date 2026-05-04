package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f extends rx.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f86581a = new f();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends d.a implements qb0.h {

        /* renamed from: a, reason: collision with root package name */
        public final ec0.a f86582a = new ec0.a();

        public a() {
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            aVar.call();
            return ec0.f.e();
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86582a.isUnsubscribed();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            return h(new l(aVar, this, f.this.b() + timeUnit.toMillis(j11)));
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f86582a.unsubscribe();
        }
    }

    @Override // rx.d
    public d.a a() {
        return new a();
    }
}
