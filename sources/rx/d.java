package rx;

import java.util.concurrent.TimeUnit;
import qb0.h;
import rx.internal.schedulers.i;
import rx.internal.schedulers.k;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a implements h {
        public long b() {
            return System.currentTimeMillis();
        }

        public abstract h h(wb0.a aVar);

        public abstract h j(wb0.a aVar, long j11, TimeUnit timeUnit);

        public h n(wb0.a aVar, long j11, long j12, TimeUnit timeUnit) {
            return i.a(this, aVar, j11, j12, timeUnit, null);
        }
    }

    public abstract a a();

    public long b() {
        return System.currentTimeMillis();
    }

    public <S extends d & h> S c(p<c<c<b>>, b> pVar) {
        return new k(pVar, this);
    }
}
