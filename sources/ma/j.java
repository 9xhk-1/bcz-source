package ma;

import com.baicizhan.online.bcz_report_api.BczReportApiService;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import ma.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static final long f72972e = 3000;

    /* renamed from: f, reason: collision with root package name */
    public static final int f72973f = 100;

    /* renamed from: a, reason: collision with root package name */
    public qb0.h f72974a;

    /* renamed from: b, reason: collision with root package name */
    public k f72975b = new k();

    /* renamed from: c, reason: collision with root package name */
    public Executor f72976c = Executors.newSingleThreadExecutor();

    /* renamed from: d, reason: collision with root package name */
    public c f72977d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends RuntimeException {
        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        String a();
    }

    public j(c tokenFetch) {
        this.f72977d = tokenFetch;
    }

    public synchronized void i() {
        try {
            qb0.h hVar = this.f72974a;
            if (hVar != null && !hVar.isUnsubscribed()) {
                qb.c.i("ReportV2", "cancel sending", new Object[0]);
                this.f72974a.unsubscribe();
                this.f72974a = null;
            }
            this.f72974a = p(false).r5(new a());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ Object j(Object obj) {
        if (this.f72975b.c()) {
            return obj;
        }
        qb.c.i("ReportV2", "data coming", new Object[0]);
        throw new b();
    }

    public final /* synthetic */ rx.c k(Long l11) {
        this.f72975b.a();
        return rx.c.u2(this.f72975b.b());
    }

    public final /* synthetic */ Object l(List list, List list2, BczReportApiService.Client client) {
        if (xb.e.h(list)) {
            qb.c.i("ReportV2", "nothing to send", new Object[0]);
            return null;
        }
        try {
            client.report_event(list2);
            qb.c.i("ReportV2", "count %d, [%s]", Integer.valueOf(list2.size()), new com.google.gson.d().z(list2));
            this.f72975b.f(list2);
        } catch (Exception e11) {
            qb.c.c("ReportV2", "", e11);
        }
        return null;
    }

    public final /* synthetic */ rx.c m(String str, final List list) {
        return rx.c.r7(rx.c.M2(list), q(str), new wb0.q() { // from class: ma.g
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                Object l11;
                l11 = j.this.l(list, (List) obj, (BczReportApiService.Client) obj2);
                return l11;
            }
        });
    }

    public synchronized void n() {
        qb0.h hVar = this.f72974a;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f72974a = o().u5(new wb0.b() { // from class: ma.e
                @Override // wb0.b
                public final void call(Object obj) {
                    j.f(obj);
                }
            }, new wb0.b() { // from class: ma.f
                @Override // wb0.b
                public final void call(Object obj) {
                    qb.c.c("ReportV2", "notifyReport", (Throwable) obj);
                }
            });
        } else {
            qb.c.i("ReportV2", "sending", new Object[0]);
        }
    }

    public final rx.c<?> o() {
        return p(true).H5(1).c3(new wb0.p() { // from class: ma.h
            @Override // wb0.p
            public final Object call(Object obj) {
                Object j11;
                j11 = j.this.j(obj);
                return j11;
            }
        }).E4(new wb0.q() { // from class: ma.i
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Throwable) obj2) instanceof j.b);
                return valueOf;
            }
        });
    }

    public final rx.c<?> p(boolean delay) {
        final String a11 = this.f72977d.a();
        return rx.c.o6(delay ? 3000L : 0L, TimeUnit.MILLISECONDS).I3(bc0.c.b(this.f72976c)).b2(new wb0.p() { // from class: ma.c
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c k11;
                k11 = j.this.k((Long) obj);
                return k11;
            }
        }).D(100).Z0(new wb0.p() { // from class: ma.d
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c m11;
                m11 = j.this.m(a11, (List) obj);
                return m11;
            }
        });
    }

    public final rx.c<BczReportApiService.Client> q(String token) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_report").c(4).g(token).b(3000).d(10000)).w5(bc0.c.e());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Object> {
        public a() {
        }

        @Override // qb0.c
        public void onCompleted() {
            j.this.f72975b.g(new TreeSet());
            qb.c.i("ReportV2", "clear sending", new Object[0]);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            j.this.f72975b.g(new TreeSet());
            qb.c.h("ReportV2", "clear sending", e11);
        }

        @Override // qb0.c
        public void onNext(Object o11) {
        }
    }

    public static /* synthetic */ void f(Object obj) {
    }
}
