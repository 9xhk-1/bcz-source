package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.aj;
import com.xiaomi.push.hh;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.bd;

/* loaded from: classes6.dex */
final class p extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45228a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ig f116a;

    public p(ig igVar, Context context) {
        this.f116a = igVar;
        this.f45228a = context;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return com.tencent.connect.common.Constants.VIA_REPORT_TYPE_DATALINE;
    }

    @Override // java.lang.Runnable
    public void run() {
        ig igVar = this.f116a;
        if (igVar != null) {
            igVar.a(bd.a());
            ao.a(this.f45228a.getApplicationContext()).a((ao) this.f116a, hh.Notification, true, (hu) null, true);
        }
    }
}
