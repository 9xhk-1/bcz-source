package com.xiaomi.push;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f45246a = TimeZone.getTimeZone("Asia/Shanghai");

    public static int a() {
        return (int) (((m5715a() / 3600000) % 24) + 8);
    }

    public static long b() {
        return m5715a() / 86400000;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final long m5715a() {
        return Calendar.getInstance(f45246a).getTimeInMillis();
    }
}
