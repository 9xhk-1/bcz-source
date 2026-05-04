package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f35700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f35701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f35702c;

        public a(long j11, ArrayList arrayList, JSONArray jSONArray) {
            this.f35700a = j11;
            this.f35701b = arrayList;
            this.f35702c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.hms.framework.network.grs.g.j.a aVar = new com.huawei.hms.framework.network.grs.g.j.a();
            aVar.put("total_time", this.f35700a);
            Iterator it = this.f35701b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.o() || dVar.m()) {
                    aVar.put(e.b(dVar));
                    it.remove();
                    break;
                }
            }
            if (this.f35701b.size() > 0) {
                d dVar2 = (d) this.f35701b.get(r1.size() - 1);
                aVar.put(e.b(dVar2));
                this.f35701b.remove(dVar2);
            }
            if (this.f35701b.size() > 0) {
                Iterator it2 = this.f35701b.iterator();
                while (it2.hasNext()) {
                    this.f35702c.put(new JSONObject(e.b((d) it2.next())));
                }
            }
            if (this.f35702c.length() > 0) {
                aVar.put("failed_info", this.f35702c.toString());
            }
            Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
            HianalyticsHelper.getInstance().onEvent(aVar.get(), "grs_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d11 = dVar.d();
        if (d11 != null) {
            linkedHashMapPack.put(ma.b.f72948u, ExceptionCode.getErrorCodeFromException(d11));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, d11.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(d11.getMessage()));
        } else {
            linkedHashMapPack.put(ma.b.f72948u, dVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(dVar.l()).getHost());
        } catch (MalformedURLException e11) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e11);
        }
        linkedHashMapPack.put("req_start_time", dVar.h());
        linkedHashMapPack.put("req_end_time", dVar.g());
        linkedHashMapPack.put("req_total_time", dVar.i());
        return linkedHashMapPack.getAll();
    }

    public static void a(ArrayList<d> arrayList, long j11, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReport(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j11, arrayList, jSONArray));
    }
}
