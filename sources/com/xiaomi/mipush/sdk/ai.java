package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bl;
import com.xiaomi.push.hh;
import com.xiaomi.push.hw;
import com.xiaomi.push.hx;
import com.xiaomi.push.hy;
import com.xiaomi.push.ic;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ii;
import com.xiaomi.push.ij;
import com.xiaomi.push.ik;
import com.xiaomi.push.im;
import com.xiaomi.push.io;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class ai {
    public static <T extends is<T, ?>> id a(Context context, T t11, hh hhVar) {
        return a(context, t11, hhVar, !hhVar.equals(hh.Registration), context.getPackageName(), b.m5683a(context).m5684a());
    }

    public static <T extends is<T, ?>> id b(Context context, T t11, hh hhVar, boolean z11, String str, String str2) {
        return a(context, t11, hhVar, z11, str, str2, false);
    }

    public static <T extends is<T, ?>> id a(Context context, T t11, hh hhVar, boolean z11, String str, String str2) {
        return a(context, t11, hhVar, z11, str, str2, true);
    }

    public static <T extends is<T, ?>> id a(Context context, T t11, hh hhVar, boolean z11, String str, String str2, boolean z12) {
        String str3;
        byte[] a11 = ir.a(t11);
        if (a11 != null) {
            id idVar = new id();
            if (z11) {
                String d11 = b.m5683a(context).d();
                if (TextUtils.isEmpty(d11)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        a11 = com.xiaomi.push.h.b(bl.m5755a(d11), a11);
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.b.d("encryption error. ");
                    }
                }
            }
            hw hwVar = new hw();
            hwVar.f586a = 5L;
            hwVar.f587a = "fakeid";
            idVar.a(hwVar);
            idVar.a(ByteBuffer.wrap(a11));
            idVar.a(hhVar);
            idVar.b(z12);
            idVar.b(str);
            idVar.a(z11);
            idVar.a(str2);
            return idVar;
        }
        str3 = "invoke convertThriftObjectToBytes method, return null.";
        com.xiaomi.channel.commonutils.logger.b.m5639a(str3);
        return null;
    }

    public static is a(Context context, id idVar) {
        byte[] m6091a;
        if (idVar.m6093b()) {
            byte[] a11 = i.a(context, idVar, e.ASSEMBLE_PUSH_FCM);
            if (a11 == null) {
                a11 = bl.m5755a(b.m5683a(context).d());
            }
            try {
                m6091a = com.xiaomi.push.h.a(a11, idVar.m6091a());
            } catch (Exception e11) {
                throw new u("the aes decrypt failed.", e11);
            }
        } else {
            m6091a = idVar.m6091a();
        }
        is a12 = a(idVar.a(), idVar.f669b);
        if (a12 != null) {
            ir.a(a12, m6091a);
        }
        return a12;
    }

    private static is a(hh hhVar, boolean z11) {
        switch (aj.f45185a[hhVar.ordinal()]) {
            case 1:
                return new ii();
            case 2:
                return new io();
            case 3:
                return new im();
            case 4:
                return new iq();
            case 5:
                return new ik();
            case 6:
                return new hx();
            case 7:
                return new ic();
            case 8:
                return new ij();
            case 9:
                if (z11) {
                    return new ig();
                }
                hy hyVar = new hy();
                hyVar.a(true);
                return hyVar;
            case 10:
                return new ic();
            default:
                return null;
        }
    }
}
