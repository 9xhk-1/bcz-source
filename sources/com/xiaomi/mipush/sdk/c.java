package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.dx;
import com.xiaomi.push.ec;
import com.xiaomi.push.eg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.bd;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class c implements eg {
    @Override // com.xiaomi.push.eg
    public void a(Context context, HashMap<String, String> hashMap) {
        ig igVar = new ig();
        igVar.b(ec.a(context).m5911a());
        igVar.d(ec.a(context).b());
        igVar.c(hr.AwakeAppResponse.f538a);
        igVar.a(bd.a());
        igVar.f680a = hashMap;
        ao.a(context).a((ao) igVar, hh.Notification, true, (hu) null, true);
        com.xiaomi.channel.commonutils.logger.b.m5639a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.eg
    public void b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1L, dx.a(hashMap));
        com.xiaomi.channel.commonutils.logger.b.m5639a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.eg
    public void c(Context context, HashMap<String, String> hashMap) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("MoleInfo：\u3000" + dx.b(hashMap));
        String str = hashMap.get("event_type");
        String str2 = hashMap.get("awake_info");
        if (String.valueOf(1007).equals(str)) {
            o.a(context, str2);
        }
    }
}
