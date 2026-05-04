package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.iz;
import com.xiaomi.push.jj;

/* loaded from: classes8.dex */
public class ir {
    public static short a(Context context, id idVar) {
        return a(context, idVar.f668b);
    }

    public static short a(Context context, String str) {
        return (short) (g.a(context, str, false).a() + (ai.b(context) ? 4 : 0) + (ai.a(context) ? 8 : 0) + (com.xiaomi.push.service.ax.m6240a(context) ? 16 : 0));
    }

    public static <T extends is<T, ?>> void a(T t11, byte[] bArr) {
        if (bArr == null) {
            throw new ix("the message byte is empty.");
        }
        new iw(new jj.a(true, true, bArr.length)).a(t11, bArr);
    }

    public static <T extends is<T, ?>> byte[] a(T t11) {
        if (t11 == null) {
            return null;
        }
        try {
            return new iy(new iz.a()).a(t11);
        } catch (ix e11) {
            com.xiaomi.channel.commonutils.logger.b.a("convertThriftObjectToBytes catch TException.", e11);
            return null;
        }
    }
}
