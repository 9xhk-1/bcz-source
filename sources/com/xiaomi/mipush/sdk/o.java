package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.push.aj;
import com.xiaomi.push.ec;
import com.xiaomi.push.ee;
import com.xiaomi.push.hm;
import com.xiaomi.push.hr;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bd;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class o {
    public static void a(Context context, Intent intent, Uri uri) {
        if (context == null) {
            return;
        }
        ao.a(context).m5673a();
        if (ec.a(context.getApplicationContext()).m5910a() == null) {
            ec.a(context.getApplicationContext()).a(b.m5683a(context.getApplicationContext()).m5684a(), context.getPackageName(), ba.a(context.getApplicationContext()).a(hm.AwakeInfoUploadWaySwitch.a(), 0), new c());
            ba.a(context).a(new q(102, "awake online config", context));
        }
        if ((context instanceof Activity) && intent != null) {
            ec.a(context.getApplicationContext()).a(ee.ACTIVITY, context, intent, (String) null);
            return;
        }
        if (!(context instanceof Service) || intent == null) {
            if (uri == null || TextUtils.isEmpty(uri.toString())) {
                return;
            }
            ec.a(context.getApplicationContext()).a(ee.PROVIDER, context, (Intent) null, uri.toString());
            return;
        }
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            ec.a(context.getApplicationContext()).a(ee.SERVICE_COMPONENT, context, intent, (String) null);
        } else {
            ec.a(context.getApplicationContext()).a(ee.SERVICE_ACTION, context, intent, (String) null);
        }
    }

    private static void a(Context context, ig igVar) {
        boolean a11 = ba.a(context).a(hm.AwakeAppPingSwitch.a(), false);
        int a12 = ba.a(context).a(hm.AwakeAppPingFrequency.a(), 0);
        if (a12 >= 0 && a12 < 30) {
            com.xiaomi.channel.commonutils.logger.b.c("aw_ping: frquency need > 30s.");
            a12 = 30;
        }
        boolean z11 = a12 >= 0 ? a11 : false;
        if (!com.xiaomi.push.j.m6171a()) {
            a(context, igVar, z11, a12);
        } else if (z11) {
            com.xiaomi.push.aj.a(context.getApplicationContext()).a((aj.a) new p(igVar, context), a12);
        }
    }

    public static final <T extends is<T, ?>> void a(Context context, T t11, boolean z11, int i11) {
        byte[] a11 = ir.a(t11);
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z11);
        intent.putExtra("extra_help_ping_frequency", i11);
        intent.putExtra("mipush_payload", a11);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ao.a(context).m5675a(intent);
    }

    public static void a(Context context, String str) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf(9999));
        hashMap.put("description", "ping message");
        ig igVar = new ig();
        igVar.b(b.m5683a(context).m5684a());
        igVar.d(context.getPackageName());
        igVar.c(hr.AwakeAppResponse.f538a);
        igVar.a(bd.a());
        igVar.f680a = hashMap;
        a(context, igVar);
    }

    public static void a(Context context, String str, int i11, String str2) {
        ig igVar = new ig();
        igVar.b(str);
        igVar.a(new HashMap());
        igVar.m6101a().put("extra_aw_app_online_cmd", String.valueOf(i11));
        igVar.m6101a().put("extra_help_aw_info", str2);
        igVar.a(bd.a());
        byte[] a11 = ir.a(igVar);
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a11);
        ao.a(context).m5675a(intent);
    }
}
