package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
public class bp extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f45315a;

    public bp(Context context) {
        this.f45315a = context;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a, reason: collision with other method in class */
    public String mo5759a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f45315a.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.a.a(this.f45315a).m5646b();
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f45315a).m5644a().isEventUploadSwitchOpen();
    }
}
