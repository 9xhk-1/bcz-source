package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.id;
import com.xiaomi.push.ii;
import com.xiaomi.push.ir;
import com.xiaomi.push.ix;

/* loaded from: classes8.dex */
public class n {
    public static ii a(id idVar) {
        byte[] m6091a = idVar.m6091a();
        ii iiVar = new ii();
        try {
            ir.a(iiVar, m6091a);
            return iiVar;
        } catch (ix unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.push.h.a(com.xiaomi.push.bl.m5755a(str), bArr);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("dencryption error. ", e11);
            return null;
        }
    }

    public static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] b11 = b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (b11 != null) {
                ak.m6222a(context, y.a(b11), b11);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("notify fcm notification error ", th2);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }

    public static byte[] a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.push.h.b(com.xiaomi.push.bl.m5755a(str), bArr);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("encryption error. ", e11);
            return null;
        }
    }
}
