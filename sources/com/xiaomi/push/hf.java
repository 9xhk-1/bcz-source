package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class hf {

    /* renamed from: a, reason: collision with root package name */
    private static volatile hf f45712a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f498a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, hg> f499a = new HashMap();

    private hf(Context context) {
        this.f498a = context;
    }

    public static hf a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f45712a == null) {
            synchronized (hf.class) {
                try {
                    if (f45712a == null) {
                        f45712a = new hf(context);
                    }
                } finally {
                }
            }
        }
        return f45712a;
    }

    public hg a() {
        hg hgVar = this.f499a.get("UPLOADER_PUSH_CHANNEL");
        if (hgVar != null) {
            return hgVar;
        }
        hg hgVar2 = this.f499a.get("UPLOADER_HTTP");
        if (hgVar2 != null) {
            return hgVar2;
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, hg> m6009a() {
        return this.f499a;
    }

    public void a(hg hgVar, String str) {
        if (hgVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m6009a().put(str, hgVar);
        }
    }

    public boolean a(hl hlVar, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (com.xiaomi.push.service.bz.a(hlVar, false)) {
            return false;
        }
        if (TextUtils.isEmpty(hlVar.d())) {
            hlVar.f(com.xiaomi.push.service.bz.a());
        }
        hlVar.g(str);
        com.xiaomi.push.service.ca.a(this.f498a, hlVar);
        return true;
    }

    public boolean a(String str, String str2, long j11, String str3) {
        return a(this.f498a.getPackageName(), this.f498a.getPackageName(), str, str2, j11, str3);
    }

    private boolean a(String str, String str2, String str3, String str4, long j11, String str5) {
        hl hlVar = new hl();
        hlVar.d(str3);
        hlVar.c(str4);
        hlVar.a(j11);
        hlVar.b(str5);
        hlVar.a(true);
        hlVar.a("push_sdk_channel");
        hlVar.e(str2);
        return a(hlVar, str);
    }
}
