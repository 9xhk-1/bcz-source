package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class em {

    /* renamed from: a, reason: collision with root package name */
    private static a f45478a;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, hr> f344a;

    public interface a {
        void uploader(Context context, hl hlVar);
    }

    public static int a(int i11) {
        if (i11 > 0) {
            return i11 + 1000;
        }
        return -1;
    }

    public static int a(Enum r12) {
        if (r12 == null) {
            return -1;
        }
        if (r12 instanceof hh) {
            return r12.ordinal() + 1001;
        }
        if (r12 instanceof hr) {
            return r12.ordinal() + 2001;
        }
        if (r12 instanceof ex) {
            return r12.ordinal() + 3001;
        }
        return -1;
    }

    public static Config a(Context context) {
        boolean a11 = com.xiaomi.push.service.ba.a(context).a(hm.PerfUploadSwitch.a(), false);
        boolean a12 = com.xiaomi.push.service.ba.a(context).a(hm.EventUploadNewSwitch.a(), false);
        return Config.getBuilder().setEventUploadSwitchOpen(a12).setEventUploadFrequency(com.xiaomi.push.service.ba.a(context).a(hm.EventUploadFrequency.a(), 86400)).setPerfUploadSwitchOpen(a11).setPerfUploadFrequency(com.xiaomi.push.service.ba.a(context).a(hm.PerfUploadFrequency.a(), 86400)).build(context);
    }

    public static EventClientReport a(Context context, String str, String str2, int i11, long j11, String str3) {
        EventClientReport a11 = a(str);
        a11.eventId = str2;
        a11.eventType = i11;
        a11.eventTime = j11;
        a11.eventContent = str3;
        return a11;
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static PerfClientReport a(Context context, int i11, long j11, long j12) {
        PerfClientReport a11 = a();
        a11.code = i11;
        a11.perfCounts = j11;
        a11.perfLatencies = j12;
        return a11;
    }

    public static hl a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hl hlVar = new hl();
        hlVar.d("category_client_report_data");
        hlVar.a("push_sdk_channel");
        hlVar.a(1L);
        hlVar.b(str);
        hlVar.a(true);
        hlVar.b(System.currentTimeMillis());
        hlVar.g(context.getPackageName());
        hlVar.e("com.xiaomi.xmsf");
        hlVar.f(com.xiaomi.push.service.bz.a());
        hlVar.c("quality_support");
        return hlVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hr m5912a(String str) {
        if (f344a == null) {
            synchronized (hr.class) {
                try {
                    if (f344a == null) {
                        f344a = new HashMap();
                        for (hr hrVar : hr.values()) {
                            f344a.put(hrVar.f538a.toLowerCase(), hrVar);
                        }
                    }
                } finally {
                }
            }
        }
        hr hrVar2 = f344a.get(str.toLowerCase());
        return hrVar2 != null ? hrVar2 : hr.Invalid;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m5913a(int i11) {
        return i11 == 1000 ? "E100000" : i11 == 3000 ? "E100002" : i11 == 2000 ? "E100001" : i11 == 6000 ? "E100003" : "";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5914a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new ek(context), new el(context));
    }

    private static void a(Context context, hl hlVar) {
        if (m5915a(context.getApplicationContext())) {
            com.xiaomi.push.service.ca.a(context.getApplicationContext(), hlVar);
            return;
        }
        a aVar = f45478a;
        if (aVar != null) {
            aVar.uploader(context, hlVar);
        }
    }

    public static void a(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                hl a11 = a(context, it.next());
                if (!com.xiaomi.push.service.bz.a(a11, false)) {
                    a(context, a11);
                }
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.d(th2.getMessage());
        }
    }

    public static void a(a aVar) {
        f45478a = aVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5915a(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }
}
