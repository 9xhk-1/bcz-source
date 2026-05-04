package ma;

import android.text.TextUtils;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.online.bcz_report_api.BczReportApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ma.j;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: d, reason: collision with root package name */
    public static final String f72992d = "bcz_app";

    /* renamed from: e, reason: collision with root package name */
    public static final String f72993e = "product_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f72994f = "stat_group";

    /* renamed from: g, reason: collision with root package name */
    public static final String f72995g = "event_id";

    /* renamed from: h, reason: collision with root package name */
    public static final String f72996h = "log_time";

    /* renamed from: i, reason: collision with root package name */
    public static final String f72997i = "user_group";

    /* renamed from: a, reason: collision with root package name */
    public final j f72998a;

    /* renamed from: b, reason: collision with root package name */
    public final k f72999b;

    /* renamed from: c, reason: collision with root package name */
    public String f73000c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f73001a = new r();
    }

    public static /* synthetic */ Object a(List list, BczReportApiService.Client client) {
        try {
            client.report_event_without_login(list);
            return null;
        } catch (TException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static r g() {
        return a.f73001a;
    }

    public void f() {
        this.f72998a.i();
    }

    public final /* synthetic */ String h() {
        return TextUtils.isEmpty(this.f73000c) ? i9.m.d() : this.f73000c;
    }

    public final /* synthetic */ void i(String str, String str2, Map map, Long l11) {
        String j11 = j(str, str2, map, l11.longValue());
        if (TextUtils.isEmpty(j11)) {
            return;
        }
        this.f72999b.d(j11);
        this.f72998a.n();
    }

    public String j(final String group, final String eventId, final Map<String, String> data, long logTime) {
        String valueOf = String.valueOf(logTime);
        TreeMap treeMap = new TreeMap();
        treeMap.put("product_id", "bcz_app");
        treeMap.put("event_id", eventId);
        treeMap.put("stat_group", group);
        treeMap.put("log_time", valueOf);
        if (!CollectionUtils.isEmpty(data)) {
            treeMap.putAll(data);
        }
        return BczJson.toJson(treeMap);
    }

    public void k(final String group, final String eventId, final Map<String, String> data) {
        rx.c.M2(Long.valueOf(System.currentTimeMillis())).I3(bc0.c.a()).L1(new wb0.b() { // from class: ma.o
            @Override // wb0.b
            public final void call(Object obj) {
                r.this.i(group, eventId, data, (Long) obj);
            }
        }).u5(new wb0.b() { // from class: ma.p
            @Override // wb0.b
            public final void call(Object obj) {
                r.e((Long) obj);
            }
        }, new wb0.b() { // from class: ma.q
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c("ReportV2Mgr", "report error: ", (Throwable) obj);
            }
        });
    }

    public void l() {
        this.f72998a.n();
    }

    public void m(final String group, final String eventId, final Map<String, String> data) {
        String j11 = j(group, eventId, data, System.currentTimeMillis());
        final ArrayList arrayList = new ArrayList();
        arrayList.add(j11);
        com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_report").e(false)).c3(new wb0.p() { // from class: ma.n
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.a(arrayList, (BczReportApiService.Client) obj);
            }
        }).w5(bc0.c.e()).p5();
    }

    public void n(String token) {
        this.f73000c = token;
    }

    public synchronized void o(List<String> reports) {
        if (CollectionUtils.isEmpty(reports)) {
            return;
        }
        this.f72999b.e(reports);
        this.f72998a.n();
    }

    public r() {
        this.f73000c = null;
        this.f72998a = new j(new j.c() { // from class: ma.m
            @Override // ma.j.c
            public final String a() {
                String h11;
                h11 = r.this.h();
                return h11;
            }
        });
        this.f72999b = new k();
    }

    public static /* synthetic */ void e(Long l11) {
    }
}
