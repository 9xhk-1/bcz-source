package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.push.hr;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class cg implements XMPushService.n {

    /* renamed from: a, reason: collision with root package name */
    private static Context f46353a;

    /* renamed from: a, reason: collision with other field name */
    private static final boolean f1001a = Log.isLoggable("UNDatas", 3);

    /* renamed from: a, reason: collision with other field name */
    private static final Map<Integer, Map<String, List<String>>> f1000a = new HashMap();

    public cg(Context context) {
        f46353a = context;
    }

    private static void b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f1000a);
        if (hashMap.size() > 0) {
            for (Integer num : hashMap.keySet()) {
                Map map = (Map) hashMap.get(num);
                if (map != null && map.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : map.keySet()) {
                        sb2.append(str);
                        sb2.append(":");
                        List list = (List) map.get(str);
                        if (!com.xiaomi.push.t.a(list)) {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                if (i11 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append((String) list.get(i11));
                            }
                        }
                        sb2.append(com.alipay.sdk.m.u.i.f11097b);
                    }
                    ig a11 = a(null, bd.a(), hr.NotificationRemoved.f538a, null);
                    a11.a("removed_reason", String.valueOf(num));
                    a11.a("all_delete_msgId_appId", sb2.toString());
                    com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb2.toString());
                    a(f46353a, a11);
                }
                f1000a.remove(num);
            }
        }
    }

    private static ig a(String str, String str2, String str3, String str4) {
        ig igVar = new ig();
        if (str3 != null) {
            igVar.c(str3);
        }
        if (str != null) {
            igVar.b(str);
        }
        if (str2 != null) {
            igVar.a(str2);
        }
        if (str4 != null) {
            igVar.d(str4);
        }
        igVar.a(false);
        return igVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a */
    public void mo6008a() {
        Map<Integer, Map<String, List<String>>> map = f1000a;
        if (map.size() > 0) {
            synchronized (map) {
                b();
            }
        }
    }

    private static void a(Context context, ig igVar) {
        if (f1001a) {
            com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload message notification:" + igVar);
        }
        com.xiaomi.push.aj.a(context).a(new ch(igVar));
    }
}
