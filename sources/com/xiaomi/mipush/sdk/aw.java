package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.az;
import com.xiaomi.push.bo;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.bd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45204a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f99a;

    public aw(Context context, boolean z11) {
        this.f45204a = context;
        this.f99a = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        String d11;
        String d12;
        Map<String, String> map;
        String d13;
        String str;
        String c11;
        String c12;
        com.xiaomi.channel.commonutils.logger.b.m5639a("do sync info");
        ig igVar = new ig(bd.a(), false);
        b m5683a = b.m5683a(this.f45204a);
        igVar.c(hr.SyncInfo.f538a);
        igVar.b(m5683a.m5684a());
        igVar.d(this.f45204a.getPackageName());
        HashMap hashMap = new HashMap();
        igVar.f680a = hashMap;
        Context context = this.f45204a;
        com.xiaomi.push.k.a(hashMap, "app_version", com.xiaomi.push.g.m5976a(context, context.getPackageName()));
        Map<String, String> map2 = igVar.f680a;
        Context context2 = this.f45204a;
        com.xiaomi.push.k.a(map2, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.g.a(context2, context2.getPackageName())));
        com.xiaomi.push.k.a(igVar.f680a, "push_sdk_vn", BuildConfig.VERSION_NAME);
        com.xiaomi.push.k.a(igVar.f680a, "push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
        com.xiaomi.push.k.a(igVar.f680a, "token", m5683a.b());
        if (!com.xiaomi.push.j.m6177d()) {
            String a11 = bo.a(com.xiaomi.push.i.c(this.f45204a));
            String e11 = com.xiaomi.push.i.e(this.f45204a);
            if (!TextUtils.isEmpty(e11)) {
                a11 = a11 + "," + e11;
            }
            if (!TextUtils.isEmpty(a11)) {
                com.xiaomi.push.k.a(igVar.f680a, Constants.EXTRA_KEY_IMEI_MD5, a11);
            }
        }
        az.a(this.f45204a).a(igVar.f680a);
        com.xiaomi.push.k.a(igVar.f680a, Constants.EXTRA_KEY_REG_ID, m5683a.m5691c());
        com.xiaomi.push.k.a(igVar.f680a, Constants.EXTRA_KEY_REG_SECRET, m5683a.d());
        com.xiaomi.push.k.a(igVar.f680a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f45204a).replace(",", Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f99a) {
            Map<String, String> map3 = igVar.f680a;
            c11 = av.c(MiPushClient.getAllAlias(this.f45204a));
            com.xiaomi.push.k.a(map3, Constants.EXTRA_KEY_ALIASES_MD5, c11);
            Map<String, String> map4 = igVar.f680a;
            c12 = av.c(MiPushClient.getAllTopic(this.f45204a));
            com.xiaomi.push.k.a(map4, Constants.EXTRA_KEY_TOPICS_MD5, c12);
            map = igVar.f680a;
            d13 = av.c(MiPushClient.getAllUserAccount(this.f45204a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            Map<String, String> map5 = igVar.f680a;
            d11 = av.d(MiPushClient.getAllAlias(this.f45204a));
            com.xiaomi.push.k.a(map5, Constants.EXTRA_KEY_ALIASES, d11);
            Map<String, String> map6 = igVar.f680a;
            d12 = av.d(MiPushClient.getAllTopic(this.f45204a));
            com.xiaomi.push.k.a(map6, "topics", d12);
            map = igVar.f680a;
            d13 = av.d(MiPushClient.getAllUserAccount(this.f45204a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        com.xiaomi.push.k.a(map, str, d13);
        ao.a(this.f45204a).a((ao) igVar, hh.Notification, false, (hu) null);
    }
}
