package rx.internal.schedulers;

import androidx.camera.view.q;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.RxThreadFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b extends rx.d implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final String f86544c = "rx.scheduler.max-computation-threads";

    /* renamed from: d, reason: collision with root package name */
    public static final int f86545d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f86546e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1116b f86547f;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f86548a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C1116b> f86549b = new AtomicReference<>(f86547f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public final rx.internal.util.m f86550a;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f86551b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.internal.util.m f86552c;

        /* renamed from: d, reason: collision with root package name */
        public final c f86553d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.b$a$a, reason: collision with other inner class name */
        public class C1114a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wb0.a f86554a;

            public C1114a(wb0.a aVar) {
                this.f86554a = aVar;
            }

            @Override // wb0.a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f86554a.call();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.b$a$b, reason: collision with other inner class name */
        public class C1115b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wb0.a f86556a;

            public C1115b(wb0.a aVar) {
                this.f86556a = aVar;
            }

            @Override // wb0.a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f86556a.call();
            }
        }

        public a(c cVar) {
            rx.internal.util.m mVar = new rx.internal.util.m();
            this.f86550a = mVar;
            ec0.b bVar = new ec0.b();
            this.f86551b = bVar;
            this.f86552c = new rx.internal.util.m(mVar, bVar);
            this.f86553d = cVar;
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            return isUnsubscribed() ? ec0.f.e() : this.f86553d.I(new C1114a(aVar), 0L, null, this.f86550a);
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86552c.isUnsubscribed();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            return isUnsubscribed() ? ec0.f.e() : this.f86553d.H(new C1115b(aVar), j11, timeUnit, this.f86551b);
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f86552c.unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.internal.schedulers.b$b, reason: collision with other inner class name */
    public static final class C1116b {

        /* renamed from: a, reason: collision with root package name */
        public final int f86558a;

        /* renamed from: b, reason: collision with root package name */
        public final c[] f86559b;

        /* renamed from: c, reason: collision with root package name */
        public long f86560c;

        public C1116b(ThreadFactory threadFactory, int i11) {
            this.f86558a = i11;
            this.f86559b = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f86559b[i12] = new c(threadFactory);
            }
        }

        public c a() {
            int i11 = this.f86558a;
            if (i11 == 0) {
                return b.f86546e;
            }
            c[] cVarArr = this.f86559b;
            long j11 = this.f86560c;
            this.f86560c = 1 + j11;
            return cVarArr[(int) (j11 % i11)];
        }

        public void b() {
            for (c cVar : this.f86559b) {
                cVar.unsubscribe();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends h {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger(f86544c, 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f86545d = intValue;
        c cVar = new c(RxThreadFactory.NONE);
        f86546e = cVar;
        cVar.unsubscribe();
        f86547f = new C1116b(null, 0);
    }

    public b(ThreadFactory threadFactory) {
        this.f86548a = threadFactory;
        start();
    }

    @Override // rx.d
    public d.a a() {
        return new a(this.f86549b.get().a());
    }

    public qb0.h d(wb0.a aVar) {
        return this.f86549b.get().a().E(aVar, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
        C1116b c1116b;
        C1116b c1116b2;
        do {
            c1116b = this.f86549b.get();
            c1116b2 = f86547f;
            if (c1116b == c1116b2) {
                return;
            }
        } while (!q.a(this.f86549b, c1116b, c1116b2));
        c1116b.b();
    }

    @Override // rx.internal.schedulers.j
    public void start() {
        C1116b c1116b = new C1116b(this.f86548a, f86545d);
        if (q.a(this.f86549b, f86547f, c1116b)) {
            return;
        }
        c1116b.b();
    }
}
