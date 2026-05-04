package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes8.dex */
class eh implements ef {
    private void b(Context context, eb ebVar) {
        String str;
        String b11 = ebVar.b();
        String d11 = ebVar.d();
        int a11 = ebVar.a();
        if (context == null || TextUtils.isEmpty(b11) || TextUtils.isEmpty(d11)) {
            if (TextUtils.isEmpty(d11)) {
                dy.a(context, ma.b.f72911h1, 1008, "argument error");
                return;
            } else {
                dy.a(context, d11, 1008, "argument error");
                return;
            }
        }
        if (!com.xiaomi.push.service.l.b(context, b11)) {
            dy.a(context, d11, 1003, "B is not ready");
            return;
        }
        dy.a(context, d11, 1002, "B is ready");
        dy.a(context, d11, 1004, "A is ready");
        String a12 = dx.a(d11);
        try {
            if (TextUtils.isEmpty(a12)) {
                str = "info is empty";
            } else if (a11 != 1 || ec.m5909a(context)) {
                String type = context.getContentResolver().getType(dx.a(b11, a12));
                if (!TextUtils.isEmpty(type) && "success".equals(type)) {
                    dy.a(context, d11, 1005, "A is successful");
                    dy.a(context, d11, 1006, "The job is finished");
                    return;
                }
                str = "A is fail to help B's provider";
            } else {
                str = "A not in foreground";
            }
            dy.a(context, d11, 1008, str);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            dy.a(context, d11, 1008, "A meet a exception when help B's provider");
        }
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, Intent intent, String str) {
        a(context, str);
    }

    @Override // com.xiaomi.push.ef
    public void a(Context context, eb ebVar) {
        if (ebVar != null) {
            b(context, ebVar);
        } else {
            dy.a(context, ma.b.f72911h1, 1008, "A receive incorrect message");
        }
    }

    private void a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                String[] split = str.split("/");
                if (split.length > 0 && !TextUtils.isEmpty(split[split.length - 1])) {
                    String str2 = split[split.length - 1];
                    if (!TextUtils.isEmpty(str2)) {
                        String decode = Uri.decode(str2);
                        if (!TextUtils.isEmpty(decode)) {
                            String b11 = dx.b(decode);
                            if (!TextUtils.isEmpty(b11)) {
                                dy.a(context, b11, 1007, "play with provider successfully");
                                return;
                            }
                        }
                    }
                }
            }
            dy.a(context, ma.b.f72911h1, 1008, "B get a incorrect message");
        } catch (Exception e11) {
            dy.a(context, ma.b.f72911h1, 1008, "B meet a exception" + e11.getMessage());
        }
    }
}
