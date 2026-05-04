package com.huawei.hms.aggrpay.util;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static long f35385a;

    public static boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - f35385a);
        f35385a = currentTimeMillis;
        return abs <= 2000;
    }
}
