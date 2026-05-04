package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* loaded from: classes8.dex */
public class cn {

    /* renamed from: a, reason: collision with root package name */
    private static String f45348a;

    /* renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f210a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ef.l.f49767x);
        f210a = simpleDateFormat;
        f45348a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static hl a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hl hlVar = new hl();
        hlVar.d("category_push_stat");
        hlVar.a("push_sdk_stat_channel");
        hlVar.a(1L);
        hlVar.b(str);
        hlVar.a(true);
        hlVar.b(System.currentTimeMillis());
        hlVar.g(bw.a(context).m5767a());
        hlVar.e("com.xiaomi.xmsf");
        hlVar.f("");
        hlVar.c("push_stat");
        return hlVar;
    }
}
