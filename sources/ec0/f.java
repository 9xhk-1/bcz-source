package ec0;

import java.util.concurrent.Future;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f49642a = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final Future<?> f49643a;

        public a(Future<?> future) {
            this.f49643a = future;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f49643a.isCancelled();
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f49643a.cancel(true);
        }
    }

    public f() {
        throw new IllegalStateException("No instances!");
    }

    public static h a(wb0.a aVar) {
        return ec0.a.b(aVar);
    }

    public static h b() {
        return ec0.a.a();
    }

    public static ec0.b c(h... hVarArr) {
        return new ec0.b(hVarArr);
    }

    public static h d(Future<?> future) {
        return new a(future);
    }

    public static h e() {
        return f49642a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements h {
        @Override // qb0.h
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // qb0.h
        public void unsubscribe() {
        }
    }
}
