package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.fk;
import com.xiaomi.push.gk;
import com.xiaomi.push.gl;
import com.xiaomi.push.gm;
import com.xiaomi.push.go;
import com.xiaomi.push.service.bg;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private y f46375a = new y();

    public bg.b a(fk fkVar) {
        Collection<bg.b> m6254a = bg.a().m6254a(Integer.toString(fkVar.a()));
        if (m6254a.isEmpty()) {
            return null;
        }
        Iterator<bg.b> it = m6254a.iterator();
        if (m6254a.size() == 1) {
            return it.next();
        }
        String g11 = fkVar.g();
        while (it.hasNext()) {
            bg.b next = it.next();
            if (TextUtils.equals(g11, next.f968b)) {
                return next;
            }
        }
        return null;
    }

    public bg.b a(gm gmVar) {
        Collection<bg.b> m6254a = bg.a().m6254a(gmVar.k());
        if (m6254a.isEmpty()) {
            return null;
        }
        Iterator<bg.b> it = m6254a.iterator();
        if (m6254a.size() == 1) {
            return it.next();
        }
        String m11 = gmVar.m();
        String l11 = gmVar.l();
        while (it.hasNext()) {
            bg.b next = it.next();
            if (TextUtils.equals(m11, next.f968b) || TextUtils.equals(l11, next.f968b)) {
                return next;
            }
        }
        return null;
    }

    public static String a(bg.b bVar) {
        StringBuilder sb2;
        String str;
        if (Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f46286g)) {
            sb2 = new StringBuilder();
            sb2.append(bVar.f965a);
            str = ".permission.MIMC_RECEIVE";
        } else {
            sb2 = new StringBuilder();
            sb2.append(bVar.f965a);
            str = ".permission.MIPUSH_RECEIVE";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (com.xiaomi.push.j.m6176c()) {
            intent.addFlags(16777216);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    private static void a(Context context, Intent intent, bg.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, bg.b bVar, int i11) {
        if ("5".equalsIgnoreCase(bVar.f46286g)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f965a);
        intent.putExtra(bk.f46319t, bVar.f46286g);
        intent.putExtra("ext_reason", i11);
        intent.putExtra(bk.f46316q, bVar.f968b);
        intent.putExtra(bk.F, bVar.f46288i);
        if (bVar.f959a == null || !Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f46286g)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.f46286g, bVar.f965a, Integer.valueOf(i11)));
            a(context, intent, bVar);
            return;
        }
        try {
            bVar.f959a.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            bVar.f959a = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("peer may died: ");
            String str = bVar.f968b;
            sb2.append(str.substring(str.lastIndexOf(64)));
            com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
        }
    }

    public void a(Context context, bg.b bVar, String str, String str2) {
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.f46286g)) {
            com.xiaomi.channel.commonutils.logger.b.d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f965a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f46286g);
        intent.putExtra(bk.f46316q, bVar.f968b);
        intent.putExtra(bk.F, bVar.f46288i);
        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.f46286g, bVar.f965a, str2));
        a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, bg.b bVar, boolean z11, int i11, String str) {
        if ("5".equalsIgnoreCase(bVar.f46286g)) {
            this.f46375a.a(context, bVar, z11, i11, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f965a);
        intent.putExtra("ext_succeeded", z11);
        if (!z11) {
            intent.putExtra("ext_reason", i11);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f46286g);
        intent.putExtra(bk.f46316q, bVar.f968b);
        intent.putExtra(bk.F, bVar.f46288i);
        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.f46286g, bVar.f965a, Boolean.valueOf(z11), Integer.valueOf(i11)));
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, fk fkVar) {
        an anVar;
        bg.b a11 = a(fkVar);
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f46375a.a(xMPushService, fkVar, a11);
            return;
        }
        String str2 = a11.f965a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", fkVar.m5948a(a11.f46287h));
        intent.putExtra(bk.F, a11.f46288i);
        intent.putExtra(bk.f46323x, a11.f46287h);
        if (a11.f959a != null) {
            try {
                a11.f959a.send(Message.obtain(null, 17, intent));
                com.xiaomi.channel.commonutils.logger.b.m5639a("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                a11.f959a = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("peer may died: ");
                String str3 = a11.f968b;
                sb2.append(str3.substring(str3.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", a11.f46286g, a11.f965a, fkVar.e()));
        a(xMPushService, intent, a11);
        if (!Constants.VIA_REPORT_TYPE_SHARE_TO_QQ.equals(str) || (anVar = fkVar.f405a) == null) {
            return;
        }
        anVar.f46248d = System.currentTimeMillis();
        ao.a(xMPushService, "coord_down", fkVar.f405a);
    }

    public void a(XMPushService xMPushService, String str, gm gmVar) {
        String str2;
        bg.b a11 = a(gmVar);
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f46375a.a(xMPushService, gmVar, a11);
            return;
        }
        String str3 = a11.f965a;
        if (gmVar instanceof gl) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (gmVar instanceof gk) {
            str2 = "com.xiaomi.push.new_iq";
        } else {
            if (!(gmVar instanceof go)) {
                com.xiaomi.channel.commonutils.logger.b.d("unknown packet type, drop it");
                return;
            }
            str2 = "com.xiaomi.push.new_pres";
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", gmVar.a());
        intent.putExtra(bk.F, a11.f46288i);
        intent.putExtra(bk.f46323x, a11.f46287h);
        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[Bcst] notify packet arrival. %s,%s,%s", a11.f46286g, a11.f965a, gmVar.j()));
        a(xMPushService, intent, a11);
    }
}
