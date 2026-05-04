package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.aj;
import com.xiaomi.push.bo;
import com.xiaomi.push.bp;
import com.xiaomi.push.bq;
import com.xiaomi.push.br;
import com.xiaomi.push.bs;
import com.xiaomi.push.bv;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f45148a;

    /* renamed from: a, reason: collision with other field name */
    private static volatile a f48a;

    /* renamed from: a, reason: collision with other field name */
    private Context f49a;

    /* renamed from: a, reason: collision with other field name */
    private Config f50a;

    /* renamed from: a, reason: collision with other field name */
    private IEventProcessor f51a;

    /* renamed from: a, reason: collision with other field name */
    private IPerfProcessor f52a;

    /* renamed from: a, reason: collision with other field name */
    private String f53a;

    /* renamed from: a, reason: collision with other field name */
    private ExecutorService f55a = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f54a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f45149b = new HashMap<>();

    static {
        f45148a = j.m6171a() ? 30 : 10;
    }

    private a(Context context) {
        this.f49a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.f45149b;
        if (hashMap == null) {
            return 0;
        }
        Iterator<String> it = hashMap.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f45149b.get(it.next());
            i11 += arrayList != null ? arrayList.size() : 0;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f54a;
        int i11 = 0;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f54a.get(it.next());
                if (hashMap2 != null) {
                    Iterator<String> it2 = hashMap2.keySet().iterator();
                    while (it2.hasNext()) {
                        com.xiaomi.clientreport.data.a aVar = hashMap2.get(it2.next());
                        if (aVar instanceof PerfClientReport) {
                            i11 = (int) (i11 + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f51a.b();
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("we: " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f52a.b();
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("wp: " + e11.getMessage());
        }
    }

    private void f() {
        if (a(this.f49a).m5644a().isEventUploadSwitchOpen()) {
            bp bpVar = new bp(this.f49a);
            int eventUploadFrequency = (int) a(this.f49a).m5644a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bv.a(this.f49a).a("sp_client_report_status", "event_last_upload_time", 0L) > eventUploadFrequency * 1000) {
                aj.a(this.f49a).a(new h(this, bpVar), 10);
            }
            synchronized (a.class) {
                try {
                    if (!aj.a(this.f49a).a((aj.a) bpVar, eventUploadFrequency)) {
                        aj.a(this.f49a).m5719a("100886");
                        aj.a(this.f49a).a((aj.a) bpVar, eventUploadFrequency);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void g() {
        if (a(this.f49a).m5644a().isPerfUploadSwitchOpen()) {
            bq bqVar = new bq(this.f49a);
            int perfUploadFrequency = (int) a(this.f49a).m5644a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bv.a(this.f49a).a("sp_client_report_status", "perf_last_upload_time", 0L) > perfUploadFrequency * 1000) {
                aj.a(this.f49a).a(new i(this, bqVar), 15);
            }
            synchronized (a.class) {
                try {
                    if (!aj.a(this.f49a).a((aj.a) bqVar, perfUploadFrequency)) {
                        aj.a(this.f49a).m5719a("100887");
                        aj.a(this.f49a).a((aj.a) bqVar, perfUploadFrequency);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void c() {
        if (m5644a().isPerfUploadSwitchOpen()) {
            br brVar = new br();
            brVar.a(this.f52a);
            brVar.a(this.f49a);
            this.f55a.execute(brVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Config m5644a() {
        try {
            if (this.f50a == null) {
                this.f50a = Config.defaultConfig(this.f49a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f50a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5646b() {
        if (m5644a().isEventUploadSwitchOpen()) {
            br brVar = new br();
            brVar.a(this.f49a);
            brVar.a(this.f51a);
            this.f55a.execute(brVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f51a;
        if (iEventProcessor != null) {
            iEventProcessor.mo5647a(eventClientReport);
            if (a() < 10) {
                a(new d(this), f45148a);
            } else {
                d();
                aj.a(this.f49a).m5719a("100888");
            }
        }
    }

    public EventClientReport a(int i11, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i11;
        eventClientReport.eventId = bo.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f49a.getPackageName());
        eventClientReport.setSdkVersion(this.f53a);
        return eventClientReport;
    }

    public static a a(Context context) {
        if (f48a == null) {
            synchronized (a.class) {
                try {
                    if (f48a == null) {
                        f48a = new a(context);
                    }
                } finally {
                }
            }
        }
        return f48a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f52a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo5647a(perfClientReport);
            if (b() < 10) {
                a(new f(this), f45148a);
            } else {
                e();
                aj.a(this.f49a).m5719a("100889");
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5645a() {
        a(this.f49a).f();
        a(this.f49a).g();
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f50a = config;
        this.f51a = iEventProcessor;
        this.f52a = iPerfProcessor;
        iEventProcessor.setEventMap(this.f45149b);
        this.f52a.setPerfMap(this.f54a);
    }

    public void a(EventClientReport eventClientReport) {
        if (m5644a().isEventUploadSwitchOpen()) {
            this.f55a.execute(new b(this, eventClientReport));
        }
    }

    public void a(PerfClientReport perfClientReport) {
        if (m5644a().isPerfUploadSwitchOpen()) {
            this.f55a.execute(new c(this, perfClientReport));
        }
    }

    private void a(aj.a aVar, int i11) {
        aj.a(this.f49a).b(aVar, i11);
    }

    public void a(String str) {
        this.f53a = str;
    }

    public void a(boolean z11, boolean z12, long j11, long j12) {
        Config config = this.f50a;
        if (config != null) {
            if (z11 == config.isEventUploadSwitchOpen() && z12 == this.f50a.isPerfUploadSwitchOpen() && j11 == this.f50a.getEventUploadFrequency() && j12 == this.f50a.getPerfUploadFrequency()) {
                return;
            }
            long eventUploadFrequency = this.f50a.getEventUploadFrequency();
            long perfUploadFrequency = this.f50a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bs.a(this.f49a)).setEventEncrypted(this.f50a.isEventEncrypted()).setEventUploadSwitchOpen(z11).setEventUploadFrequency(j11).setPerfUploadSwitchOpen(z12).setPerfUploadFrequency(j12).build(this.f49a);
            this.f50a = build;
            if (!build.isEventUploadSwitchOpen()) {
                aj.a(this.f49a).m5719a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f49a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                f();
            }
            if (!this.f50a.isPerfUploadSwitchOpen()) {
                aj.a(this.f49a).m5719a("100887");
                return;
            }
            if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f49a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                g();
            }
        }
    }
}
