package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
public class bq extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f45316a;

    public bq(Context context) {
        this.f45316a = context;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.clientreport.manager.a.a(this.f45316a).c();
                com.xiaomi.channel.commonutils.logger.b.c(this.f45316a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to send perf data. " + e11);
        }
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f45316a).m5644a().isPerfUploadSwitchOpen();
    }
}
