package r9;

import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.StartupAdRequest;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    public static final String f83825c = "SplashAdManager";

    /* renamed from: d, reason: collision with root package name */
    public static volatile u f83826d;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f83827a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f83828b = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public boolean f83829a = false;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<q> f83830b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f83831c;

        public a(final q val$readToGo) {
            this.f83831c = val$readToGo;
            this.f83830b = new WeakReference<>(val$readToGo);
        }

        @Override // r9.q
        public void a(boolean adOn) {
            q qVar;
            if (this.f83829a || (qVar = this.f83830b.get()) == null) {
                return;
            }
            qVar.a(true);
            this.f83829a = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<Long, Object> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object call(Long aLong) {
            return new Object();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.p<AdvertiseApiService.Client, rx.c<Object>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Object> call(AdvertiseApiService.Client client) {
            try {
                u.f().g();
                StartupAdRequest startupAdRequest = new StartupAdRequest();
                startupAdRequest.setScreen_length(xb.f.f(pb.a.a()));
                startupAdRequest.setScreen_width(xb.f.i(pb.a.a()));
                startupAdRequest.oaid = x9.b.f97909a.b(pb.a.a());
                startupAdRequest.android_id = xb.o.a(pb.a.a());
                p.y().N(client.get_startup_ad_v2(startupAdRequest, AdCommonHelper.INSTANCE.buildAdDeviceInfoSync()));
                return rx.c.M2(null);
            } catch (Throwable th2) {
                return rx.c.T1(th2);
            }
        }
    }

    public static /* synthetic */ Object a(Throwable th2) {
        qb.c.c(f83825c, "", th2);
        return null;
    }

    public static /* synthetic */ void b(q qVar, Throwable th2) {
        qb.c.c(f83825c, "Error checking ad resource status", th2);
        if (qVar != null) {
            qVar.a(false);
        }
    }

    public static u f() {
        if (f83826d == null) {
            synchronized (u.class) {
                try {
                    if (f83826d == null) {
                        f83826d = new u();
                    }
                } finally {
                }
            }
        }
        return f83826d;
    }

    public static rx.c<Object> j() {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise")).b2(new c()).w5(bc0.c.e());
    }

    public static rx.c<Object> k() {
        return rx.c.j3(j(), rx.c.o6(3L, TimeUnit.SECONDS).c3(new b())).W3(new wb0.p() { // from class: r9.r
            @Override // wb0.p
            public final Object call(Object obj) {
                return u.a((Throwable) obj);
            }
        }).X1();
    }

    public void d(final w splashView, final q readToGo, final Runnable onShown, final v clickCallback) {
        final a aVar = new a(readToGo);
        final p y11 = p.y();
        if (y11.q()) {
            y11.s(splashView, aVar, clickCallback);
            if (this.f83828b) {
                y11.K();
            }
            onShown.run();
        } else if (y11.E()) {
            qb.c.i(f83825c, "Ad resource is downloading, waiting for completion (max 3s)", new Object[0]);
            final qb0.h[] hVarArr = new qb0.h[1];
            hVarArr[0] = rx.c.I2(100L, TimeUnit.MILLISECONDS).D5(30).I3(tb0.a.a()).u5(new wb0.b() { // from class: r9.s
                @Override // wb0.b
                public final void call(Object obj) {
                    u.this.h(y11, hVarArr, splashView, aVar, clickCallback, onShown, readToGo, (Long) obj);
                }
            }, new wb0.b() { // from class: r9.t
                @Override // wb0.b
                public final void call(Object obj) {
                    u.b(q.this, (Throwable) obj);
                }
            });
        } else {
            qb.c.i(f83825c, "Ad resource not active (not a download issue), skipping ad", new Object[0]);
            if (readToGo != null) {
                readToGo.a(false);
            }
        }
        qb.c.i(f83825c, "bind %b", Boolean.valueOf(this.f83828b));
    }

    public void e() {
        qb.c.i(f83825c, kc.o.N, new Object[0]);
        p.y().u();
    }

    public void g() {
        p.y().B();
        this.f83827a = true;
        qb.c.i(f83825c, "INIT", new Object[0]);
    }

    public final /* synthetic */ void h(p pVar, qb0.h[] hVarArr, w wVar, q qVar, v vVar, Runnable runnable, q qVar2, Long l11) {
        if (!pVar.q()) {
            if (l11.longValue() == 29) {
                qb.c.i(f83825c, "Ad resource download timeout (3s), skipping ad", new Object[0]);
                if (qVar2 != null) {
                    qVar2.a(false);
                    return;
                }
                return;
            }
            return;
        }
        qb.c.i(f83825c, "Ad resource is ready now, showing ad", new Object[0]);
        qb0.h hVar = hVarArr[0];
        if (hVar != null && !hVar.isUnsubscribed()) {
            hVarArr[0].unsubscribe();
        }
        pVar.s(wVar, qVar, vVar);
        if (this.f83828b) {
            pVar.K();
        }
        runnable.run();
    }

    public void i() {
        qb.c.i(f83825c, "pause %b", Boolean.valueOf(this.f83827a));
        this.f83828b = false;
        if (this.f83827a) {
            p y11 = p.y();
            if (y11.q()) {
                y11.G();
            }
        }
    }

    public void l() {
        qb.c.i(f83825c, "resume %b", Boolean.valueOf(this.f83827a));
        if (!this.f83827a) {
            this.f83828b = true;
            return;
        }
        p y11 = p.y();
        if (y11.q()) {
            y11.K();
        }
    }

    public void m() {
        p y11 = p.y();
        if (y11.q()) {
            y11.M();
        }
        qb.c.i(f83825c, "unBind", new Object[0]);
    }
}
