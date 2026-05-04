package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class dy {
    public static void a(Context context, String str, int i11, String str2) {
        aj.a(context).a(new dz(context, str, i11, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i11, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("awake_info", str);
            hashMap.put("event_type", String.valueOf(i11));
            hashMap.put("description", str2);
            int a11 = ec.a(context).a();
            if (a11 != 1) {
                if (a11 != 2) {
                    if (a11 == 3) {
                        a(context, hashMap);
                    }
                }
                c(context, hashMap);
            } else {
                a(context, hashMap);
            }
            b(context, hashMap);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    private static void a(Context context, HashMap<String, String> hashMap) {
        eg m5910a = ec.a(context).m5910a();
        if (m5910a != null) {
            m5910a.a(context, hashMap);
        }
    }

    private static void b(Context context, HashMap<String, String> hashMap) {
        eg m5910a = ec.a(context).m5910a();
        if (m5910a != null) {
            m5910a.c(context, hashMap);
        }
    }

    private static void c(Context context, HashMap<String, String> hashMap) {
        eg m5910a = ec.a(context).m5910a();
        if (m5910a != null) {
            m5910a.b(context, hashMap);
        }
    }
}
