package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35735a = "e";

    public static boolean a(Long l11) {
        if (l11 == null) {
            Logger.v(f35735a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(f35735a, "isSpExpire spValue NumberFormatException.");
        }
        if (l11.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i(f35735a, "isSpExpire false.");
            return false;
        }
        Logger.i(f35735a, "isSpExpire true.");
        return true;
    }

    public static boolean a(Long l11, long j11) {
        if (l11 == null) {
            Logger.v(f35735a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l11.longValue() - (System.currentTimeMillis() + j11) >= 0) {
                Logger.v(f35735a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f35735a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
