package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static volatile s f45231a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f117a;

    private s(Context context) {
        this.f117a = context.getApplicationContext();
    }

    private static s a(Context context) {
        if (f45231a == null) {
            synchronized (s.class) {
                try {
                    if (f45231a == null) {
                        f45231a = new s(context);
                    }
                } finally {
                }
            }
        }
        return f45231a;
    }

    public static void b(Context context, id idVar, boolean z11) {
        a(context).a(idVar, 2, z11);
    }

    public static void c(Context context, id idVar, boolean z11) {
        a(context).a(idVar, 3, z11);
    }

    public static void d(Context context, id idVar, boolean z11) {
        a(context).a(idVar, 4, z11);
    }

    public static void e(Context context, id idVar, boolean z11) {
        s a11;
        int i11;
        b m5683a = b.m5683a(context);
        if (TextUtils.isEmpty(m5683a.m5691c()) || TextUtils.isEmpty(m5683a.d())) {
            a11 = a(context);
            i11 = 6;
        } else {
            boolean m5695f = m5683a.m5695f();
            a11 = a(context);
            i11 = m5695f ? 7 : 5;
        }
        a11.a(idVar, i11, z11);
    }

    public static void a(Context context, id idVar) {
        a(context).a(idVar, 0, true);
    }

    public static void a(Context context, id idVar, boolean z11) {
        a(context).a(idVar, 1, z11);
    }

    private void a(id idVar, int i11, boolean z11) {
        if (com.xiaomi.push.j.m6172a(this.f117a) || !com.xiaomi.push.j.m6171a() || idVar == null || idVar.f661a != hh.SendMessage || idVar.m6085a() == null || !z11) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("click to start activity result:" + String.valueOf(i11));
        ig igVar = new ig(idVar.m6085a().m6045a(), false);
        igVar.c(hr.SDK_START_ACTIVITY.f538a);
        igVar.b(idVar.m6086a());
        igVar.d(idVar.f668b);
        HashMap hashMap = new HashMap();
        igVar.f680a = hashMap;
        hashMap.put("result", String.valueOf(i11));
        ao.a(this.f117a).a(igVar, hh.Notification, false, false, null, true, idVar.f668b, idVar.f664a, true, false);
    }
}
