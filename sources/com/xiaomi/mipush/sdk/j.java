package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes6.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45221a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ e f114a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f115a;

    public j(String str, Context context, e eVar) {
        this.f115a = str;
        this.f45221a = context;
        this.f114a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (TextUtils.isEmpty(this.f115a)) {
            return;
        }
        String[] split = this.f115a.split(Constants.WAVE_SEPARATOR);
        int length = split.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str = "";
                break;
            }
            String str2 = split[i11];
            if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                str = str2.substring(str2.indexOf(":") + 1);
                break;
            }
            i11++;
        }
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive correct token");
        i.d(this.f45221a, this.f114a, str);
        i.m5703a(this.f45221a);
    }
}
