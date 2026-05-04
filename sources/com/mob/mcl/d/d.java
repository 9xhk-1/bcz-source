package com.mob.mcl.d;

import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static SharePrefrenceHelper f40554a;

    public static synchronized void a(String str) {
        synchronized (d.class) {
            e();
            f40554a.putString("tcp_config", str);
        }
    }

    public static synchronized boolean b() {
        boolean z11;
        synchronized (d.class) {
            e();
            z11 = f40554a.getBoolean("use_config", true);
        }
        return z11;
    }

    public static synchronized String c() {
        String string;
        synchronized (d.class) {
            e();
            string = f40554a.getString("suid");
        }
        return string;
    }

    public static synchronized long d() {
        long j11;
        synchronized (d.class) {
            e();
            j11 = f40554a.getLong("create_suid_time");
        }
        return j11;
    }

    private static void e() {
        if (f40554a == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext().getApplicationContext());
            f40554a = sharePrefrenceHelper;
            sharePrefrenceHelper.open("mcl", 0);
        }
    }

    public static synchronized void b(String str) {
        synchronized (d.class) {
            e();
            f40554a.putString("suid", str);
        }
    }

    public static synchronized String a() {
        String string;
        synchronized (d.class) {
            e();
            string = f40554a.getString("tcp_config");
        }
        return string;
    }

    public static synchronized void a(boolean z11) {
        synchronized (d.class) {
            e();
            f40554a.putBoolean("use_config", Boolean.valueOf(z11));
        }
    }

    public static synchronized void a(long j11) {
        synchronized (d.class) {
            e();
            f40554a.putLong("create_suid_time", Long.valueOf(j11));
        }
    }
}
