package com.mob.mgs.impl;

import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static SharePrefrenceHelper f40624a;

    public static synchronized void a(boolean z11) {
        synchronized (i.class) {
            e();
            f40624a.putInt("device_switch_local_cache", Integer.valueOf(z11 ? 1 : 0));
        }
    }

    public static synchronized void b(boolean z11) {
        synchronized (i.class) {
            e();
            f40624a.putInt("device_switch_remote_cache", Integer.valueOf(z11 ? 1 : 0));
        }
    }

    public static synchronized String c() {
        String string;
        synchronized (i.class) {
            e();
            string = f40624a.getString("duid_remote_cache", "");
        }
        return string;
    }

    public static synchronized String d() {
        String string;
        synchronized (i.class) {
            e();
            string = f40624a.getString("guard_id_remote_cache", "");
        }
        return string;
    }

    private static void e() {
        if (f40624a == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext().getApplicationContext());
            f40624a = sharePrefrenceHelper;
            sharePrefrenceHelper.open("gu", 0);
        }
    }

    public static synchronized Boolean a() {
        Boolean bool;
        synchronized (i.class) {
            try {
                e();
                int i11 = f40624a.getInt("device_switch_local_cache", -1);
                if (i11 == 1) {
                    bool = Boolean.TRUE;
                } else {
                    bool = i11 == 0 ? Boolean.FALSE : null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bool;
    }

    public static synchronized Boolean b() {
        Boolean bool;
        synchronized (i.class) {
            try {
                e();
                int i11 = f40624a.getInt("device_switch_remote_cache", -1);
                if (i11 == 1) {
                    bool = Boolean.TRUE;
                } else {
                    bool = i11 == 0 ? Boolean.FALSE : null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bool;
    }

    public static synchronized void a(String str) {
        synchronized (i.class) {
            e();
            f40624a.putString("duid_remote_cache", str);
        }
    }

    public static synchronized void b(String str) {
        synchronized (i.class) {
            e();
            f40624a.putString("guard_id_remote_cache", str);
        }
    }
}
