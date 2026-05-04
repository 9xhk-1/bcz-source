package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.aj;
import com.xiaomi.push.hh;
import com.xiaomi.push.hn;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.hz;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bb;

/* loaded from: classes6.dex */
public class ae extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f45177a;

    public ae(Context context) {
        this.f45177a = context;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        ba a11 = ba.a(this.f45177a);
        hz hzVar = new hz();
        hzVar.a(bb.a(a11, hn.MISC_CONFIG));
        hzVar.b(bb.a(a11, hn.PLUGIN_CONFIG));
        ig igVar = new ig("-1", false);
        igVar.c(hr.DailyCheckClientConfig.f538a);
        igVar.a(ir.a(hzVar));
        ao.a(this.f45177a).a((ao) igVar, hh.Notification, (hu) null);
    }
}
