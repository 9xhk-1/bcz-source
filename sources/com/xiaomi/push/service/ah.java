package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.da;
import com.xiaomi.push.fk;
import com.xiaomi.push.fv;
import com.xiaomi.push.gg;
import com.xiaomi.push.gm;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.hw;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.service.bg;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes8.dex */
final class ah {
    public static fk a(XMPushService xMPushService, byte[] bArr) {
        id idVar = new id();
        try {
            ir.a(idVar, bArr);
            return a(u.m6297a((Context) xMPushService), xMPushService, idVar);
        } catch (ix e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return null;
        }
    }

    public static id b(String str, String str2) {
        ig igVar = new ig();
        igVar.b(str2);
        igVar.c(hr.AppDataCleared.f538a);
        igVar.a(bd.a());
        igVar.a(false);
        return a(str, str2, igVar, hh.Notification);
    }

    public static fk a(t tVar, Context context, id idVar) {
        try {
            fk fkVar = new fk();
            fkVar.a(5);
            fkVar.c(tVar.f1035a);
            fkVar.b(a(idVar));
            fkVar.a("SECMSG", "message");
            String str = tVar.f1035a;
            idVar.f663a.f587a = str.substring(0, str.indexOf(EmailAutoCompleteEditText.f17091d));
            idVar.f663a.f591c = str.substring(str.indexOf("/") + 1);
            fkVar.a(ir.a(idVar), tVar.f46401c);
            fkVar.a((short) 1);
            com.xiaomi.channel.commonutils.logger.b.m5639a("try send mi push message. packagename:" + idVar.f668b + " action:" + idVar.f661a);
            return fkVar;
        } catch (NullPointerException e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return null;
        }
    }

    public static <T extends is<T, ?>> id b(String str, String str2, T t11, hh hhVar) {
        return a(str, str2, t11, hhVar, false);
    }

    public static id a(String str, String str2) {
        ig igVar = new ig();
        igVar.b(str2);
        igVar.c("package uninstalled");
        igVar.a(gm.i());
        igVar.a(false);
        return a(str, str2, igVar, hh.Notification);
    }

    public static <T extends is<T, ?>> id a(String str, String str2, T t11, hh hhVar) {
        return a(str, str2, t11, hhVar, true);
    }

    private static <T extends is<T, ?>> id a(String str, String str2, T t11, hh hhVar, boolean z11) {
        byte[] a11 = ir.a(t11);
        id idVar = new id();
        hw hwVar = new hw();
        hwVar.f586a = 5L;
        hwVar.f587a = "fakeid";
        idVar.a(hwVar);
        idVar.a(ByteBuffer.wrap(a11));
        idVar.a(hhVar);
        idVar.b(z11);
        idVar.b(str);
        idVar.a(false);
        idVar.a(str2);
        return idVar;
    }

    private static String a(id idVar) {
        Map<String, String> map;
        hu huVar = idVar.f662a;
        if (huVar != null && (map = huVar.f577b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return idVar.f668b;
    }

    public static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    public static void a(XMPushService xMPushService) {
        t m6297a = u.m6297a(xMPushService.getApplicationContext());
        if (m6297a != null) {
            bg.b a11 = u.m6297a(xMPushService.getApplicationContext()).a(xMPushService);
            com.xiaomi.channel.commonutils.logger.b.m5639a("prepare account. " + a11.f965a);
            a(xMPushService, a11);
            bg.a().a(a11);
            a(xMPushService, m6297a, 172800);
        }
    }

    public static void a(XMPushService xMPushService, id idVar) {
        da.a(idVar.b(), xMPushService.getApplicationContext(), idVar, -1);
        fv m6206a = xMPushService.m6206a();
        if (m6206a == null) {
            throw new gg("try send msg while connection is null.");
        }
        if (!m6206a.mo5957a()) {
            throw new gg("Don't support XMPP connection.");
        }
        fk a11 = a(u.m6297a((Context) xMPushService), xMPushService, idVar);
        if (a11 != null) {
            m6206a.b(a11);
        }
    }

    public static void a(XMPushService xMPushService, bg.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new aj(xMPushService));
    }

    private static void a(XMPushService xMPushService, t tVar, int i11) {
        bx.a(xMPushService).a(new ai("MSAID", i11, xMPushService, tVar));
    }

    public static void a(XMPushService xMPushService, String str, byte[] bArr) {
        da.a(str, xMPushService.getApplicationContext(), bArr);
        fv m6206a = xMPushService.m6206a();
        if (m6206a == null) {
            throw new gg("try send msg while connection is null.");
        }
        if (!m6206a.mo5957a()) {
            throw new gg("Don't support XMPP connection.");
        }
        fk a11 = a(xMPushService, bArr);
        if (a11 != null) {
            m6206a.b(a11);
        } else {
            x.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
        }
    }
}
