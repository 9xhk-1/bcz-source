package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes8.dex */
class ei implements ef {
    private void a(Service service, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (TextUtils.isEmpty(stringExtra)) {
            dy.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
            return;
        }
        String b11 = dx.b(stringExtra);
        boolean isEmpty = TextUtils.isEmpty(b11);
        Context applicationContext = service.getApplicationContext();
        if (isEmpty) {
            dy.a(applicationContext, "service", 1008, "B get a incorrect message");
        } else {
            dy.a(applicationContext, b11, 1007, "play with service successfully");
        }
    }

    private void b(Context context, eb ebVar) {
        String str;
        String m5908a = ebVar.m5908a();
        String b11 = ebVar.b();
        String d11 = ebVar.d();
        int a11 = ebVar.a();
        if (context == null || TextUtils.isEmpty(m5908a) || TextUtils.isEmpty(b11) || TextUtils.isEmpty(d11)) {
            if (TextUtils.isEmpty(d11)) {
                dy.a(context, "service", 1008, "argument error");
                return;
            } else {
                dy.a(context, d11, 1008, "argument error");
                return;
            }
        }
        if (!com.xiaomi.push.service.l.a(context, m5908a, b11)) {
            dy.a(context, d11, 1003, "B is not ready");
            return;
        }
        dy.a(context, d11, 1002, "B is ready");
        dy.a(context, d11, 1004, "A is ready");
        try {
            Intent intent = new Intent();
            intent.setAction(b11);
            intent.setPackage(m5908a);
            intent.putExtra("awake_info", dx.a(d11));
            if (a11 == 1 && !ec.m5909a(context)) {
                str = "A not in foreground";
            } else {
                if (context.startService(intent) != null) {
                    dy.a(context, d11, 1005, "A is successful");
                    dy.a(context, d11, 1006, "The job is finished");
                    return;
                }
                str = "A is fail to help B's service";
            }
            dy.a(context, d11, 1008, str);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            dy.a(context, d11, 1008, "A meet a exception when help B's service");
        }
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            dy.a(context, "service", 1008, "A receive incorrect message");
        } else {
            a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, eb ebVar) {
        if (ebVar != null) {
            b(context, ebVar);
        } else {
            dy.a(context, "service", 1008, "A receive incorrect message");
        }
    }
}
