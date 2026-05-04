package com.xiaomi.push.service;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public class bd {

    /* renamed from: a, reason: collision with root package name */
    private static long f46276a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static String f954a = "";

    public static String a() {
        if (TextUtils.isEmpty(f954a)) {
            f954a = com.xiaomi.push.bo.a(4);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f954a);
        long j11 = f46276a;
        f46276a = 1 + j11;
        sb2.append(j11);
        return sb2.toString();
    }

    public static String b() {
        return com.xiaomi.push.bo.a(32);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("Exception occurred when filtering registration packet id for log. " + e11);
            return "UnexpectedId";
        }
    }
}
