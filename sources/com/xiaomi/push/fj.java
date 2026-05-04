package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.push.dw;
import com.xiaomi.push.service.bg;
import java.util.HashMap;

/* loaded from: classes8.dex */
class fj {
    public static void a(bg.b bVar, String str, fv fvVar) {
        String a11;
        dw.c cVar = new dw.c();
        if (!TextUtils.isEmpty(bVar.f46282c)) {
            cVar.a(bVar.f46282c);
        }
        if (!TextUtils.isEmpty(bVar.f46284e)) {
            cVar.d(bVar.f46284e);
        }
        if (!TextUtils.isEmpty(bVar.f46285f)) {
            cVar.e(bVar.f46285f);
        }
        cVar.b(bVar.f967a ? "1" : "0");
        if (TextUtils.isEmpty(bVar.f46283d)) {
            cVar.c("XIAOMI-SASL");
        } else {
            cVar.c(bVar.f46283d);
        }
        fk fkVar = new fk();
        fkVar.c(bVar.f968b);
        fkVar.a(Integer.parseInt(bVar.f46286g));
        fkVar.b(bVar.f965a);
        fkVar.a("BIND", (String) null);
        fkVar.a(fkVar.e());
        com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim]: bind id=" + fkVar.e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f46282c);
        hashMap.put("chid", bVar.f46286g);
        hashMap.put("from", bVar.f968b);
        hashMap.put("id", fkVar.e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f967a) {
            hashMap.put("kick", "1");
        } else {
            hashMap.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f46284e)) {
            hashMap.put("client_attrs", "");
        } else {
            hashMap.put("client_attrs", bVar.f46284e);
        }
        if (TextUtils.isEmpty(bVar.f46285f)) {
            hashMap.put("cloud_attrs", "");
        } else {
            hashMap.put("cloud_attrs", bVar.f46285f);
        }
        if (bVar.f46283d.equals("XIAOMI-PASS") || bVar.f46283d.equals("XMPUSH-PASS")) {
            a11 = bm.a(bVar.f46283d, null, hashMap, bVar.f46287h);
        } else {
            bVar.f46283d.equals("XIAOMI-SASL");
            a11 = null;
        }
        cVar.f(a11);
        fkVar.a(cVar.m5907a(), (String) null);
        fvVar.b(fkVar);
    }

    public static void a(String str, String str2, fv fvVar) {
        fk fkVar = new fk();
        fkVar.c(str2);
        fkVar.a(Integer.parseInt(str));
        fkVar.a("UBND", (String) null);
        fvVar.b(fkVar);
    }
}
