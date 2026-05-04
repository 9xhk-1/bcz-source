package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.fo;

/* loaded from: classes8.dex */
class fl {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f45569a = Log.isLoggable("BCompressed", 3);

    public static byte[] a(fk fkVar, byte[] bArr) {
        try {
            byte[] a11 = fo.a.a(bArr);
            if (f45569a) {
                com.xiaomi.channel.commonutils.logger.b.m5640a("BCompressed", "decompress " + bArr.length + " to " + a11.length + " for " + fkVar);
                if (fkVar.f403a == 1) {
                    com.xiaomi.channel.commonutils.logger.b.m5640a("BCompressed", "decompress not support upStream");
                    return a11;
                }
            }
            return a11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5640a("BCompressed", "decompress error " + e11);
            return bArr;
        }
    }
}
