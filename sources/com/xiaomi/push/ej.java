package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes8.dex */
class ej implements ef {
    private void a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (TextUtils.isEmpty(stringExtra)) {
                dy.a(service.getApplicationContext(), "service", 1007, "old version message");
                return;
            }
            if (TextUtils.isEmpty(stringExtra2)) {
                dy.a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
                return;
            }
            String b11 = dx.b(stringExtra2);
            boolean isEmpty = TextUtils.isEmpty(b11);
            Context applicationContext = service.getApplicationContext();
            if (isEmpty) {
                dy.a(applicationContext, "service", 1008, "B get a incorrect message");
            } else {
                dy.a(applicationContext, b11, 1007, "old version message ");
            }
        }
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            return;
        }
        a((Service) context, intent);
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, eb ebVar) {
        if (ebVar != null) {
            a(context, ebVar.m5908a(), ebVar.c(), ebVar.d());
        }
    }

    private void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                dy.a(context, "service", 1008, "argument error");
                return;
            } else {
                dy.a(context, str3, 1008, "argument error");
                return;
            }
        }
        if (!com.xiaomi.push.service.l.a(context, str)) {
            dy.a(context, str3, 1003, "B is not ready");
            return;
        }
        dy.a(context, str3, 1002, "B is ready");
        dy.a(context, str3, 1004, "A is ready");
        try {
            Intent intent = new Intent();
            intent.setClassName(str, str2);
            intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
            intent.putExtra("waker_pkgname", context.getPackageName());
            intent.putExtra("awake_info", dx.a(str3));
            if (context.startService(intent) == null) {
                dy.a(context, str3, 1008, "A is fail to help B's service");
            } else {
                dy.a(context, str3, 1005, "A is successful");
                dy.a(context, str3, 1006, "The job is finished");
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            dy.a(context, str3, 1008, "A meet a exception when help B's service");
        }
    }
}
