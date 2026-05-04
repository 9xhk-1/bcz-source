package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.de;
import com.xiaomi.push.dw;
import com.xiaomi.push.ey;
import com.xiaomi.push.fi;
import com.xiaomi.push.fk;
import com.xiaomi.push.fw;
import com.xiaomi.push.gj;
import com.xiaomi.push.gk;
import com.xiaomi.push.gl;
import com.xiaomi.push.gm;
import com.xiaomi.push.ha;
import com.xiaomi.push.service.bg;
import java.util.Date;

/* loaded from: classes8.dex */
public class be {

    /* renamed from: a, reason: collision with root package name */
    private XMPushService f46277a;

    public be(XMPushService xMPushService) {
        this.f46277a = xMPushService;
    }

    private void c(fk fkVar) {
        bg.b a11;
        String g11 = fkVar.g();
        String num = Integer.toString(fkVar.a());
        if (TextUtils.isEmpty(g11) || TextUtils.isEmpty(num) || (a11 = bg.a().a(num, g11)) == null) {
            return;
        }
        ha.a(this.f46277a, a11.f965a, fkVar.c(), true, true, System.currentTimeMillis());
    }

    public void a(fk fkVar) {
        if (5 != fkVar.a()) {
            c(fkVar);
        }
        try {
            b(fkVar);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("handle Blob chid = " + fkVar.a() + " cmd = " + fkVar.m5943a() + " packetid = " + fkVar.e() + " failure ", e11);
        }
    }

    public void b(fk fkVar) {
        bg.c cVar;
        int i11;
        String m5943a = fkVar.m5943a();
        if (fkVar.a() == 0) {
            if ("PING".equals(m5943a)) {
                byte[] m5947a = fkVar.m5947a();
                if (m5947a != null && m5947a.length > 0) {
                    dw.j a11 = dw.j.a(m5947a);
                    if (a11.m5898b()) {
                        bv.a().a(a11.m5896a());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f46277a.getPackageName())) {
                    this.f46277a.m6208a();
                }
                if ("1".equals(fkVar.e())) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("received a server ping");
                } else {
                    fi.b();
                }
                this.f46277a.m6212b();
                return;
            }
            if (!"SYNC".equals(m5943a)) {
                if ("NOTIFY".equals(fkVar.m5943a())) {
                    dw.h a12 = dw.h.a(fkVar.m5947a());
                    com.xiaomi.channel.commonutils.logger.b.m5639a("notify by server err = " + a12.c() + " desc = " + a12.m5890a());
                    return;
                }
                return;
            }
            if ("CONF".equals(fkVar.m5949b())) {
                bv.a().a(dw.b.a(fkVar.m5947a()));
                return;
            }
            if (TextUtils.equals("U", fkVar.m5949b())) {
                dw.k a13 = dw.k.a(fkVar.m5947a());
                de.a(this.f46277a).a(a13.m5900a(), a13.m5903b(), new Date(a13.m5899a()), new Date(a13.m5902b()), a13.c() * 1024, a13.e());
                fk fkVar2 = new fk();
                fkVar2.a(0);
                fkVar2.a(fkVar.m5943a(), "UCA");
                fkVar2.a(fkVar.e());
                XMPushService xMPushService = this.f46277a;
                xMPushService.a(new bt(xMPushService, fkVar2));
                return;
            }
            if (TextUtils.equals("P", fkVar.m5949b())) {
                dw.i a14 = dw.i.a(fkVar.m5947a());
                fk fkVar3 = new fk();
                fkVar3.a(0);
                fkVar3.a(fkVar.m5943a(), "PCA");
                fkVar3.a(fkVar.e());
                dw.i iVar = new dw.i();
                if (a14.m5894a()) {
                    iVar.a(a14.m5893a());
                }
                fkVar3.a(iVar.m5907a(), (String) null);
                XMPushService xMPushService2 = this.f46277a;
                xMPushService2.a(new bt(xMPushService2, fkVar3));
                com.xiaomi.channel.commonutils.logger.b.m5639a("ACK msgP: id = " + fkVar.e());
                return;
            }
            return;
        }
        String num = Integer.toString(fkVar.a());
        if ("SECMSG".equals(fkVar.m5943a())) {
            if (!fkVar.m5946a()) {
                this.f46277a.m6211b().a(this.f46277a, num, fkVar);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("Recv SECMSG errCode = " + fkVar.b() + " errStr = " + fkVar.m5950c());
            return;
        }
        if (!"BIND".equals(m5943a)) {
            if ("KICK".equals(m5943a)) {
                dw.g a15 = dw.g.a(fkVar.m5947a());
                String g11 = fkVar.g();
                String m5885a = a15.m5885a();
                String m5887b = a15.m5887b();
                com.xiaomi.channel.commonutils.logger.b.m5639a("kicked by server, chid=" + num + " res= " + bg.b.a(g11) + " type=" + m5885a + " reason=" + m5887b);
                if (!"wait".equals(m5885a)) {
                    this.f46277a.a(num, g11, 3, m5887b, m5885a);
                    bg.a().m6258a(num, g11);
                    return;
                }
                bg.b a16 = bg.a().a(num, g11);
                if (a16 != null) {
                    this.f46277a.a(a16);
                    a16.a(bg.c.unbind, 3, 0, m5887b, m5885a);
                    return;
                }
                return;
            }
            return;
        }
        dw.d a17 = dw.d.a(fkVar.m5947a());
        String g12 = fkVar.g();
        bg.b a18 = bg.a().a(num, g12);
        if (a18 == null) {
            return;
        }
        if (a17.m5864a()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("SMACK: channel bind succeeded, chid=" + fkVar.a());
            a18.a(bg.c.binded, 1, 0, (String) null, (String) null);
            return;
        }
        String m5863a = a17.m5863a();
        if (com.alipay.sdk.m.k.b.f10657n.equals(m5863a)) {
            if ("invalid-sig".equals(a17.m5865b())) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("SMACK: bind error invalid-sig token = " + a18.f46282c + " sec = " + a18.f46287h);
                fi.a(0, ey.BIND_INVALID_SIG.a(), 1, null, 0);
            }
            cVar = bg.c.unbind;
            i11 = 5;
        } else {
            if (!"cancel".equals(m5863a)) {
                if ("wait".equals(m5863a)) {
                    this.f46277a.a(a18);
                    a18.a(bg.c.unbind, 1, 7, a17.m5865b(), m5863a);
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a("SMACK: channel bind failed, chid=" + num + " reason=" + a17.m5865b());
            }
            cVar = bg.c.unbind;
            i11 = 7;
        }
        a18.a(cVar, 1, i11, a17.m5865b(), m5863a);
        bg.a().m6258a(num, g12);
        com.xiaomi.channel.commonutils.logger.b.m5639a("SMACK: channel bind failed, chid=" + num + " reason=" + a17.m5865b());
    }

    private void a(gj gjVar) {
        String c11 = gjVar.c();
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        String[] split = c11.split(com.alipay.sdk.m.u.i.f11097b);
        com.xiaomi.push.cq a11 = com.xiaomi.push.cu.a().a(fw.a(), false);
        if (a11 == null || split.length <= 0) {
            return;
        }
        a11.a(split);
        this.f46277a.a(20, (Exception) null);
        this.f46277a.a(true);
    }

    private void b(gm gmVar) {
        bg.b a11;
        String l11 = gmVar.l();
        String k11 = gmVar.k();
        if (TextUtils.isEmpty(l11) || TextUtils.isEmpty(k11) || (a11 = bg.a().a(k11, l11)) == null) {
            return;
        }
        ha.a(this.f46277a, a11.f965a, ha.a(gmVar.mo5990a()), true, true, System.currentTimeMillis());
    }

    public void a(gm gmVar) {
        if (!"5".equals(gmVar.k())) {
            b(gmVar);
        }
        String k11 = gmVar.k();
        if (TextUtils.isEmpty(k11)) {
            k11 = "1";
            gmVar.l("1");
        }
        String str = k11;
        if (str.equals("0")) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Received wrong packet with chid = 0 : " + gmVar.mo5990a());
        }
        if (gmVar instanceof gk) {
            gj a11 = gmVar.a("kick");
            if (a11 != null) {
                String l11 = gmVar.l();
                String a12 = a11.a("type");
                String a13 = a11.a("reason");
                com.xiaomi.channel.commonutils.logger.b.m5639a("kicked by server, chid=" + str + " res=" + bg.b.a(l11) + " type=" + a12 + " reason=" + a13);
                if (!"wait".equals(a12)) {
                    this.f46277a.a(str, l11, 3, a13, a12);
                    bg.a().m6258a(str, l11);
                    return;
                }
                bg.b a14 = bg.a().a(str, l11);
                if (a14 != null) {
                    this.f46277a.a(a14);
                    a14.a(bg.c.unbind, 3, 0, a13, a12);
                    return;
                }
                return;
            }
        } else if (gmVar instanceof gl) {
            gl glVar = (gl) gmVar;
            if ("redir".equals(glVar.b())) {
                gj a15 = glVar.a("hosts");
                if (a15 != null) {
                    a(a15);
                    return;
                }
                return;
            }
        }
        this.f46277a.m6211b().a(this.f46277a, str, gmVar);
    }
}
