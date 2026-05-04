package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.l;
import com.xiaomi.push.bj;

/* loaded from: classes6.dex */
public class ak {
    public static AbstractPushManager a(Context context, e eVar) {
        return b(context, eVar);
    }

    private static AbstractPushManager b(Context context, e eVar) {
        l.a m5709a = l.m5709a(eVar);
        if (m5709a == null || TextUtils.isEmpty(m5709a.f45224a) || TextUtils.isEmpty(m5709a.f45225b)) {
            return null;
        }
        return (AbstractPushManager) bj.a(m5709a.f45224a, m5709a.f45225b, context);
    }
}
