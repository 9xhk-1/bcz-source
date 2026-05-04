package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* loaded from: classes8.dex */
public class br implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f45317a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.clientreport.processor.c f180a;

    public void a(Context context) {
        this.f45317a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        bv a11;
        String str;
        try {
            com.xiaomi.clientreport.processor.c cVar = this.f180a;
            if (cVar != null) {
                cVar.a();
            }
            com.xiaomi.channel.commonutils.logger.b.c("begin read and send perf / event");
            com.xiaomi.clientreport.processor.c cVar2 = this.f180a;
            if (cVar2 instanceof IEventProcessor) {
                a11 = bv.a(this.f45317a);
                str = "event_last_upload_time";
            } else {
                if (!(cVar2 instanceof IPerfProcessor)) {
                    return;
                }
                a11 = bv.a(this.f45317a);
                str = "perf_last_upload_time";
            }
            a11.m5763a("sp_client_report_status", str, System.currentTimeMillis());
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    public void a(com.xiaomi.clientreport.processor.c cVar) {
        this.f180a = cVar;
    }
}
