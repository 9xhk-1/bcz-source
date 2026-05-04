package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.FullscreenVideoLayout;
import com.igexin.assist.sdk.AssistPushConsts;
import com.tencent.liteav.TXLiteAVCode;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.Cif;
import com.xiaomi.push.bo;
import com.xiaomi.push.bw;
import com.xiaomi.push.da;
import com.xiaomi.push.em;
import com.xiaomi.push.en;
import com.xiaomi.push.ex;
import com.xiaomi.push.hh;
import com.xiaomi.push.hm;
import com.xiaomi.push.hr;
import com.xiaomi.push.ht;
import com.xiaomi.push.hu;
import com.xiaomi.push.hv;
import com.xiaomi.push.hx;
import com.xiaomi.push.hy;
import com.xiaomi.push.ic;
import com.xiaomi.push.id;
import com.xiaomi.push.ie;
import com.xiaomi.push.ig;
import com.xiaomi.push.ii;
import com.xiaomi.push.ik;
import com.xiaomi.push.im;
import com.xiaomi.push.io;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bb;
import com.xiaomi.push.service.bk;
import com.xiaomi.push.service.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import org.junit.jupiter.api.j2;

/* loaded from: classes6.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private static am f45187a;

    /* renamed from: a, reason: collision with other field name */
    private static Object f82a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static Queue<String> f83a;

    /* renamed from: a, reason: collision with other field name */
    private Context f84a;

    private am(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f84a = applicationContext;
        if (applicationContext == null) {
            this.f84a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i11) {
        return com.xiaomi.push.service.ak.b(context, str, map, i11);
    }

    private void b(hy hyVar) {
        Context context;
        e eVar;
        com.xiaomi.channel.commonutils.logger.b.c("ASSEMBLE_PUSH : " + hyVar.toString());
        String a11 = hyVar.a();
        Map<String, String> m6060a = hyVar.m6060a();
        if (m6060a != null) {
            String str = m6060a.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + ag.FCM.name())) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive fcm token sync ack");
                context = this.f84a;
                eVar = e.ASSEMBLE_PUSH_FCM;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("brand:");
                ag agVar = ag.HUAWEI;
                sb2.append(agVar.name());
                if (!str.contains(sb2.toString())) {
                    if (!str.contains("channel:" + agVar.name())) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("brand:");
                        ag agVar2 = ag.OPPO;
                        sb3.append(agVar2.name());
                        if (!str.contains(sb3.toString())) {
                            if (!str.contains("channel:" + agVar2.name())) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("brand:");
                                ag agVar3 = ag.VIVO;
                                sb4.append(agVar3.name());
                                if (!str.contains(sb4.toString())) {
                                    if (!str.contains("channel:" + agVar3.name())) {
                                        return;
                                    }
                                }
                                com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                context = this.f84a;
                                eVar = e.ASSEMBLE_PUSH_FTOS;
                            }
                        }
                        com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive COS token sync ack");
                        context = this.f84a;
                        eVar = e.ASSEMBLE_PUSH_COS;
                    }
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : receive hw token sync ack");
                context = this.f84a;
                eVar = e.ASSEMBLE_PUSH_HUAWEI;
            }
            i.b(context, eVar, str);
            a(a11, hyVar.f616a, eVar);
        }
    }

    private void b(id idVar) {
        hu m6085a = idVar.m6085a();
        if (m6085a != null) {
            m6085a = br.a(m6085a.m6044a());
        }
        hx hxVar = new hx();
        hxVar.b(idVar.m6086a());
        hxVar.a(m6085a.m6045a());
        hxVar.a(m6085a.m6043a());
        if (!TextUtils.isEmpty(m6085a.m6050b())) {
            hxVar.c(m6085a.m6050b());
        }
        hxVar.a(ir.a(this.f84a, idVar));
        ao.a(this.f84a).a((ao) hxVar, hh.AckMessage, false, m6085a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.xiaomi.push.hh] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    public PushMessageHandler.a a(Intent intent) {
        String str;
        am amVar;
        Intent intent2;
        am amVar2;
        Intent intent3;
        String packageName;
        String str2;
        en enVar;
        Intent intent4;
        am amVar3;
        en a11;
        String packageName2;
        String format;
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.b.m5639a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an empty message, drop");
                en.a(this.f84a).a(this.f84a.getPackageName(), intent, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SET_AVATAR);
                return null;
            }
            id idVar = new id();
            try {
                ir.a(idVar, byteArrayExtra);
                b m5683a = b.m5683a(this.f84a);
                hu m6085a = idVar.m6085a();
                hh a12 = idVar.a();
                ?? r102 = hh.SendMessage;
                am amVar4 = a12;
                amVar4 = a12;
                if (a12 == r102 && m6085a != null) {
                    ?? m5694e = m5683a.m5694e();
                    amVar4 = m5694e;
                    amVar4 = m5694e;
                    if (m5694e == 0 && !booleanExtra) {
                        m6085a.a("mrt", stringExtra);
                        m6085a.a("mat", Long.toString(System.currentTimeMillis()));
                        if (m5663a(idVar)) {
                            com.xiaomi.channel.commonutils.logger.b.b("this is a mina's message, ack later");
                            m6085a.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(m6085a.m6043a()));
                            m6085a.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) ir.a(this.f84a, idVar)));
                            amVar4 = m5694e;
                        } else {
                            b(idVar);
                            amVar4 = m5694e;
                        }
                    }
                }
                if (idVar.a() == r102 && !idVar.m6093b()) {
                    if (com.xiaomi.push.service.ak.m6226a(idVar)) {
                        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", idVar.b(), m6085a != null ? m6085a.m6045a() : ""));
                        a11 = en.a(this.f84a);
                        packageName2 = this.f84a.getPackageName();
                        format = String.format("13: %1$s", idVar.b());
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("drop an un-encrypted messages. %1$s, %2$s", idVar.b(), m6085a != null ? m6085a.m6045a() : ""));
                        a11 = en.a(this.f84a);
                        packageName2 = this.f84a.getPackageName();
                        format = String.format("14: %1$s", idVar.b());
                    }
                    a11.a(packageName2, intent, format);
                    s.a(this.f84a, idVar, booleanExtra);
                    return null;
                }
                am amVar5 = amVar4;
                if (idVar.a() == r102) {
                    amVar5 = amVar4;
                    if (idVar.m6093b()) {
                        amVar5 = amVar4;
                        if (com.xiaomi.push.service.ak.m6226a(idVar)) {
                            if (booleanExtra && m6085a != null && m6085a.m6046a() != null) {
                                ?? r42 = "notify_effect";
                                if (m6085a.m6046a().containsKey("notify_effect")) {
                                    amVar5 = r42;
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", idVar.b(), m6085a != null ? m6085a.m6045a() : ""));
                            en.a(this.f84a).a(this.f84a.getPackageName(), intent, String.format("25: %1$s", idVar.b()));
                            s.b(this.f84a, idVar, booleanExtra);
                            return null;
                        }
                    }
                }
                try {
                    if (!m5683a.m5692c()) {
                        try {
                            if (idVar.f661a != hh.Registration) {
                                amVar3 = this;
                                if (com.xiaomi.push.service.ak.m6226a(idVar)) {
                                    return amVar3.a(idVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                                }
                                s.e(amVar3.f84a, idVar, booleanExtra);
                                boolean m5693d = m5683a.m5693d();
                                com.xiaomi.channel.commonutils.logger.b.d("receive message without registration. need re-register!registered?" + m5693d);
                                en.a(amVar3.f84a).a(amVar3.f84a.getPackageName(), intent, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_WPA_STATE);
                                if (m5693d) {
                                    a();
                                }
                            }
                        } catch (ix e11) {
                            e = e11;
                            amVar5 = this;
                            r102 = intent;
                            amVar2 = amVar5;
                            intent3 = r102;
                            en a13 = en.a(amVar2.f84a);
                            packageName = amVar2.f84a.getPackageName();
                            str2 = "16";
                            intent4 = intent3;
                            enVar = a13;
                            enVar.a(packageName, intent4, str2);
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            return null;
                        } catch (Exception e12) {
                            e = e12;
                            amVar5 = this;
                            r102 = intent;
                            amVar = amVar5;
                            intent2 = r102;
                            en a14 = en.a(amVar.f84a);
                            packageName = amVar.f84a.getPackageName();
                            str2 = com.tencent.connect.common.Constants.VIA_REPORT_TYPE_START_GROUP;
                            intent4 = intent2;
                            enVar = a14;
                            enVar.a(packageName, intent4, str2);
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            return null;
                        }
                    }
                    amVar3 = this;
                    if (!m5683a.m5692c() || !m5683a.m5695f()) {
                        return amVar3.a(idVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (idVar.f661a != hh.UnRegistration) {
                        s.e(amVar3.f84a, idVar, booleanExtra);
                        MiPushClient.unregisterPush(amVar3.f84a);
                    } else if (idVar.m6093b()) {
                        m5683a.m5685a();
                        MiPushClient.clearExtras(amVar3.f84a);
                        PushMessageHandler.a();
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt unregistration message");
                    }
                } catch (ix e13) {
                    e = e13;
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (ix e15) {
                e = e15;
                amVar2 = this;
                intent3 = intent;
            } catch (Exception e16) {
                e = e16;
                amVar = this;
                intent2 = intent;
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                id idVar2 = new id();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        ir.a(idVar2, byteArrayExtra2);
                    }
                } catch (ix unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(idVar2.a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                com.xiaomi.channel.commonutils.logger.b.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an empty message, drop");
                    return null;
                }
                id idVar3 = new id();
                try {
                    ir.a(idVar3, byteArrayExtra3);
                    b m5683a2 = b.m5683a(this.f84a);
                    if (com.xiaomi.push.service.ak.m6226a(idVar3)) {
                        str = "message arrived: receive ignore reg message, ignore!";
                    } else if (!m5683a2.m5692c()) {
                        str = "message arrived: receive message without registration. need unregister or re-register!";
                    } else {
                        if (!m5683a2.m5692c() || !m5683a2.m5695f()) {
                            return a(idVar3, byteArrayExtra3);
                        }
                        str = "message arrived: app info is invalidated";
                    }
                    com.xiaomi.channel.commonutils.logger.b.d(str);
                } catch (Exception e17) {
                    com.xiaomi.channel.commonutils.logger.b.d("fail to deal with arrived message. " + e17);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.xiaomi.mipush.sdk.PushMessageHandler$a] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    private PushMessageHandler.a a(id idVar, boolean z11, byte[] bArr, String str, int i11, Intent intent) {
        ?? r16;
        MiPushMessage miPushMessage;
        en a11;
        String packageName;
        String m5913a;
        int i12;
        String str2;
        String str3 = str;
        ArrayList arrayList = null;
        try {
            is a12 = ai.a(this.f84a, idVar);
            if (a12 == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized message. " + idVar.f661a);
                en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, "18");
                s.c(this.f84a, idVar, z11);
                return null;
            }
            hh a13 = idVar.a();
            com.xiaomi.channel.commonutils.logger.b.m5639a("processing a message, action=" + a13);
            switch (an.f45188a[a13.ordinal()]) {
                case 1:
                    if (!idVar.m6093b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (b.m5683a(this.f84a).m5694e() && !z11) {
                        com.xiaomi.channel.commonutils.logger.b.m5639a("receive a message in pause state. drop it");
                        en.a(this.f84a).a(this.f84a.getPackageName(), em.m5913a(i11), str3, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SET_AVATAR);
                        return null;
                    }
                    ik ikVar = (ik) a12;
                    ht a14 = ikVar.a();
                    if (a14 == null) {
                        com.xiaomi.channel.commonutils.logger.b.d("receive an empty message without push content, drop it");
                        en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_DATALINE);
                        s.d(this.f84a, idVar, z11);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (!z11) {
                        r16 = 0;
                    } else if (com.xiaomi.push.service.ak.m6226a(idVar)) {
                        r16 = 0;
                        MiPushClient.reportIgnoreRegMessageClicked(this.f84a, a14.m6037a(), idVar.m6085a(), idVar.f668b, a14.b());
                    } else {
                        r16 = 0;
                        hu huVar = idVar.m6085a() != null ? new hu(idVar.m6085a()) : new hu();
                        if (huVar.m6046a() == null) {
                            huVar.a(new HashMap());
                        }
                        huVar.m6046a().put("notification_click_button", String.valueOf(intExtra));
                        MiPushClient.reportMessageClicked(this.f84a, a14.m6037a(), huVar, a14.b());
                    }
                    if (!z11) {
                        if (!TextUtils.isEmpty(ikVar.d()) && MiPushClient.aliasSetTime(this.f84a, ikVar.d()) < 0) {
                            MiPushClient.addAlias(this.f84a, ikVar.d());
                        } else if (!TextUtils.isEmpty(ikVar.c()) && MiPushClient.topicSubscribedTime(this.f84a, ikVar.c()) < 0) {
                            MiPushClient.addTopic(this.f84a, ikVar.c());
                        }
                    }
                    hu huVar2 = idVar.f662a;
                    String str4 = (huVar2 == null || huVar2.m6046a() == null) ? r16 : idVar.f662a.f573a.get("jobkey");
                    String str5 = str4;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = a14.m6037a();
                    }
                    if (z11 || !m5662a(this.f84a, str4)) {
                        MiPushMessage generateMessage = PushMessageHelper.generateMessage(ikVar, idVar.m6085a(), z11);
                        if (generateMessage.getPassThrough() == 0 && !z11 && com.xiaomi.push.service.ak.m6227a(generateMessage.getExtra())) {
                            com.xiaomi.push.service.ak.m6222a(this.f84a, idVar, bArr);
                            return r16;
                        }
                        com.xiaomi.channel.commonutils.logger.b.m5639a("receive a message, msgid=" + a14.m6037a() + ", jobkey=" + str4 + ", btn=" + intExtra);
                        String a15 = com.xiaomi.push.service.ak.a(generateMessage.getExtra(), intExtra);
                        if (z11 && generateMessage.getExtra() != null && !TextUtils.isEmpty(a15)) {
                            Map<String, String> extra = generateMessage.getExtra();
                            if (intExtra != 0 && idVar.m6085a() != null) {
                                ao.a(this.f84a).a(idVar.m6085a().c(), intExtra);
                            }
                            if (com.xiaomi.push.service.ak.m6226a(idVar)) {
                                Intent a16 = a(this.f84a, idVar.f668b, extra, intExtra);
                                a16.putExtra("eventMessageType", i11);
                                a16.putExtra("messageId", str3);
                                a16.putExtra("jobkey", str5);
                                String c11 = a14.c();
                                if (!TextUtils.isEmpty(c11)) {
                                    a16.putExtra(AssistPushConsts.MSG_TYPE_PAYLOAD, c11);
                                }
                                this.f84a.startActivity(a16);
                                s.a(this.f84a, idVar);
                                en.a(this.f84a).a(this.f84a.getPackageName(), em.m5913a(i11), str3, TXLiteAVCode.WARNING_RTMP_WRITE_FAIL, a15);
                            } else {
                                Context context = this.f84a;
                                Intent a17 = a(context, context.getPackageName(), extra, intExtra);
                                if (a17 != null) {
                                    if (!a15.equals(bk.f46302c)) {
                                        a17.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                        a17.putExtra("eventMessageType", i11);
                                        a17.putExtra("messageId", str3);
                                        a17.putExtra("jobkey", str5);
                                    }
                                    this.f84a.startActivity(a17);
                                    s.a(this.f84a, idVar);
                                    com.xiaomi.channel.commonutils.logger.b.m5639a("start activity succ");
                                    en.a(this.f84a).a(this.f84a.getPackageName(), em.m5913a(i11), str3, 1006, a15);
                                    if (a15.equals(bk.f46302c)) {
                                        en.a(this.f84a).a(this.f84a.getPackageName(), em.m5913a(i11), str3, "13");
                                    }
                                }
                            }
                            return r16;
                        }
                        miPushMessage = generateMessage;
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m5639a("drop a duplicate message, key=" + str4);
                        en.a(this.f84a).c(this.f84a.getPackageName(), em.m5913a(i11), str3, "2:" + str4);
                        miPushMessage = r16;
                    }
                    if (idVar.m6085a() == null && !z11) {
                        a(ikVar, idVar);
                    }
                    return miPushMessage;
                case 2:
                    ii iiVar = (ii) a12;
                    String str6 = b.m5683a(this.f84a).f102a;
                    if (TextUtils.isEmpty(str6) || !TextUtils.equals(str6, iiVar.m6114a())) {
                        com.xiaomi.channel.commonutils.logger.b.m5639a("bad Registration result:");
                        en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, "21");
                        return null;
                    }
                    long m5672a = ao.a(this.f84a).m5672a();
                    if (m5672a <= 0 || SystemClock.elapsedRealtime() - m5672a <= com.heytap.mcssdk.constant.Constants.MILLS_OF_CONNECT_SUCCESS) {
                        b.m5683a(this.f84a).f102a = null;
                        if (iiVar.f724a == 0) {
                            b.m5683a(this.f84a).b(iiVar.f736e, iiVar.f737f, iiVar.f743l);
                            FCMPushHelper.persistIfXmsfSupDecrypt(this.f84a);
                            a11 = en.a(this.f84a);
                            packageName = this.f84a.getPackageName();
                            m5913a = em.m5913a(i11);
                            i12 = 6006;
                            str2 = "1";
                        } else {
                            a11 = en.a(this.f84a);
                            packageName = this.f84a.getPackageName();
                            m5913a = em.m5913a(i11);
                            i12 = 6006;
                            str2 = "2";
                            str3 = str;
                        }
                        a11.a(packageName, m5913a, str3, i12, str2);
                        if (!TextUtils.isEmpty(iiVar.f736e)) {
                            arrayList = new ArrayList();
                            arrayList.add(iiVar.f736e);
                        }
                        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ex.COMMAND_REGISTER.f366a, arrayList, iiVar.f724a, iiVar.f735d, null, iiVar.m6115a());
                        ao.a(this.f84a).m5681d();
                        return generateCommandMessage;
                    }
                    com.xiaomi.channel.commonutils.logger.b.m5639a("The received registration result has expired.");
                    en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
                    return null;
                case 3:
                    if (!idVar.m6093b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((io) a12).f802a == 0) {
                        b.m5683a(this.f84a).m5685a();
                        MiPushClient.clearExtras(this.f84a);
                    }
                    PushMessageHandler.a();
                    return null;
                case 4:
                    im imVar = (im) a12;
                    if (imVar.f777a == 0) {
                        MiPushClient.addTopic(this.f84a, imVar.b());
                    }
                    if (!TextUtils.isEmpty(imVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(imVar.b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    ex exVar = ex.COMMAND_SUBSCRIBE_TOPIC;
                    sb2.append(exVar);
                    sb2.append(j2.O);
                    sb2.append(imVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb2.toString());
                    return PushMessageHelper.generateCommandMessage(exVar.f366a, arrayList, imVar.f777a, imVar.f783d, imVar.c(), null);
                case 5:
                    iq iqVar = (iq) a12;
                    if (iqVar.f822a == 0) {
                        MiPushClient.removeTopic(this.f84a, iqVar.b());
                    }
                    if (!TextUtils.isEmpty(iqVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(iqVar.b());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("resp-cmd:");
                    ex exVar2 = ex.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb3.append(exVar2);
                    sb3.append(j2.O);
                    sb3.append(iqVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb3.toString());
                    return PushMessageHelper.generateCommandMessage(exVar2.f366a, arrayList, iqVar.f822a, iqVar.f828d, iqVar.c(), null);
                case 6:
                    da.a(this.f84a.getPackageName(), this.f84a, a12, hh.Command, bArr.length);
                    ic icVar = (ic) a12;
                    String b11 = icVar.b();
                    List<String> m6079a = icVar.m6079a();
                    if (icVar.f649a == 0) {
                        if (TextUtils.equals(b11, ex.COMMAND_SET_ACCEPT_TIME.f366a) && m6079a != null && m6079a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f84a, m6079a.get(0), m6079a.get(1));
                            if (!FullscreenVideoLayout.L.equals(m6079a.get(0)) || !FullscreenVideoLayout.L.equals(m6079a.get(1))) {
                                b.m5683a(this.f84a).a(false);
                            } else {
                                b.m5683a(this.f84a).a(true);
                            }
                            m6079a = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), m6079a);
                        } else if (TextUtils.equals(b11, ex.COMMAND_SET_ALIAS.f366a) && m6079a != null && m6079a.size() > 0) {
                            MiPushClient.addAlias(this.f84a, m6079a.get(0));
                        } else if (TextUtils.equals(b11, ex.COMMAND_UNSET_ALIAS.f366a) && m6079a != null && m6079a.size() > 0) {
                            MiPushClient.removeAlias(this.f84a, m6079a.get(0));
                        } else if (TextUtils.equals(b11, ex.COMMAND_SET_ACCOUNT.f366a) && m6079a != null && m6079a.size() > 0) {
                            MiPushClient.addAccount(this.f84a, m6079a.get(0));
                        } else if (TextUtils.equals(b11, ex.COMMAND_UNSET_ACCOUNT.f366a) && m6079a != null && m6079a.size() > 0) {
                            MiPushClient.removeAccount(this.f84a, m6079a.get(0));
                        } else if (TextUtils.equals(b11, ex.COMMAND_CHK_VDEVID.f366a)) {
                            return null;
                        }
                    }
                    List<String> list = m6079a;
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + b11 + j2.O + icVar.a());
                    return PushMessageHelper.generateCommandMessage(b11, list, icVar.f649a, icVar.f657d, icVar.c(), null);
                case 7:
                    da.a(this.f84a.getPackageName(), this.f84a, a12, hh.Notification, bArr.length);
                    if (a12 instanceof hy) {
                        hy hyVar = (hy) a12;
                        String a18 = hyVar.a();
                        com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + hyVar.b() + ", code:" + hyVar.f616a + j2.O + a18);
                        if (hr.DisablePushMessage.f538a.equalsIgnoreCase(hyVar.f623d)) {
                            if (hyVar.f616a == 0) {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f84a).m5661a(a18)) {
                                            af.a(this.f84a).c(a18);
                                            af a19 = af.a(this.f84a);
                                            au auVar = au.DISABLE_PUSH;
                                            if ("syncing".equals(a19.a(auVar))) {
                                                af.a(this.f84a).a(auVar, "synced");
                                                MiPushClient.clearNotification(this.f84a);
                                                MiPushClient.clearLocalNotificationType(this.f84a);
                                                PushMessageHandler.a();
                                                ao.a(this.f84a).m5678b();
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } else if ("syncing".equals(af.a(this.f84a).a(au.DISABLE_PUSH))) {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f84a).m5661a(a18)) {
                                            if (af.a(this.f84a).a(a18) < 10) {
                                                af.a(this.f84a).b(a18);
                                                ao.a(this.f84a).a(true, a18);
                                            } else {
                                                af.a(this.f84a).c(a18);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (hr.EnablePushMessage.f538a.equalsIgnoreCase(hyVar.f623d)) {
                            if (hyVar.f616a == 0) {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f84a).m5661a(a18)) {
                                            af.a(this.f84a).c(a18);
                                            af a21 = af.a(this.f84a);
                                            au auVar2 = au.ENABLE_PUSH;
                                            if ("syncing".equals(a21.a(auVar2))) {
                                                af.a(this.f84a).a(auVar2, "synced");
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } else if ("syncing".equals(af.a(this.f84a).a(au.ENABLE_PUSH))) {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f84a).m5661a(a18)) {
                                            if (af.a(this.f84a).a(a18) < 10) {
                                                af.a(this.f84a).b(a18);
                                                ao.a(this.f84a).a(false, a18);
                                            } else {
                                                af.a(this.f84a).c(a18);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (hr.ThirdPartyRegUpdate.f538a.equalsIgnoreCase(hyVar.f623d)) {
                            b(hyVar);
                        } else if (hr.UploadTinyData.f538a.equalsIgnoreCase(hyVar.f623d)) {
                            a(hyVar);
                        }
                        af.a(this.f84a).c(a18);
                    } else if (a12 instanceof ig) {
                        ig igVar = (ig) a12;
                        if ("registration id expired".equalsIgnoreCase(igVar.f685d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.f84a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.f84a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f84a);
                            String acceptTime = MiPushClient.getAcceptTime(this.f84a);
                            com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + igVar.f685d + j2.O + igVar.m6100a());
                            MiPushClient.reInitialize(this.f84a, hv.RegIdExpired);
                            for (String str7 : allAlias) {
                                MiPushClient.removeAlias(this.f84a, str7);
                                MiPushClient.setAlias(this.f84a, str7, null);
                            }
                            for (String str8 : allTopic) {
                                MiPushClient.removeTopic(this.f84a, str8);
                                MiPushClient.subscribe(this.f84a, str8, null);
                            }
                            for (String str9 : allUserAccount) {
                                MiPushClient.removeAccount(this.f84a, str9);
                                MiPushClient.setUserAccount(this.f84a, str9, null);
                            }
                            String[] split = acceptTime.split(",");
                            if (split.length == 2) {
                                MiPushClient.removeAcceptTime(this.f84a);
                                MiPushClient.addAcceptTime(this.f84a, split[0], split[1]);
                            }
                        } else if (hr.ClientInfoUpdateOk.f538a.equalsIgnoreCase(igVar.f685d)) {
                            if (igVar.m6101a() != null && igVar.m6101a().containsKey("app_version")) {
                                b.m5683a(this.f84a).m5686a(igVar.m6101a().get("app_version"));
                            }
                        } else if (!hr.AwakeApp.f538a.equalsIgnoreCase(igVar.f685d)) {
                            try {
                                if (hr.NormalClientConfigUpdate.f538a.equalsIgnoreCase(igVar.f685d)) {
                                    Cif cif = new Cif();
                                    ir.a(cif, igVar.m6106a());
                                    bb.a(ba.a(this.f84a), cif);
                                } else if (hr.CustomClientConfigUpdate.f538a.equalsIgnoreCase(igVar.f685d)) {
                                    ie ieVar = new ie();
                                    ir.a(ieVar, igVar.m6106a());
                                    bb.a(ba.a(this.f84a), ieVar);
                                } else if (hr.SyncInfoResult.f538a.equalsIgnoreCase(igVar.f685d)) {
                                    av.a(this.f84a, igVar);
                                } else if (hr.ForceSync.f538a.equalsIgnoreCase(igVar.f685d)) {
                                    com.xiaomi.channel.commonutils.logger.b.m5639a("receive force sync notification");
                                    av.a(this.f84a, false);
                                } else if (hr.CancelPushMessage.f538a.equals(igVar.f685d)) {
                                    com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + igVar.f685d + j2.O + igVar.m6100a());
                                    if (igVar.m6101a() != null) {
                                        int i13 = -2;
                                        if (igVar.m6101a().containsKey(bk.M)) {
                                            String str10 = igVar.m6101a().get(bk.M);
                                            if (!TextUtils.isEmpty(str10)) {
                                                try {
                                                    i13 = Integer.parseInt(str10);
                                                } catch (NumberFormatException e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i13 >= -1) {
                                            MiPushClient.clearNotification(this.f84a, i13);
                                        } else {
                                            MiPushClient.clearNotification(this.f84a, igVar.m6101a().containsKey(bk.K) ? igVar.m6101a().get(bk.K) : "", igVar.m6101a().containsKey(bk.L) ? igVar.m6101a().get(bk.L) : "");
                                        }
                                    }
                                    a(igVar);
                                } else {
                                    try {
                                        if (hr.HybridRegisterResult.f538a.equals(igVar.f685d)) {
                                            ii iiVar2 = new ii();
                                            ir.a(iiVar2, igVar.m6106a());
                                            MiPushClient4Hybrid.onReceiveRegisterResult(this.f84a, iiVar2);
                                        } else if (hr.HybridUnregisterResult.f538a.equals(igVar.f685d)) {
                                            io ioVar = new io();
                                            ir.a(ioVar, igVar.m6106a());
                                            MiPushClient4Hybrid.onReceiveUnregisterResult(this.f84a, ioVar);
                                        } else if (!hr.PushLogUpload.f538a.equals(igVar.f685d)) {
                                            if (hr.DetectAppAlive.f538a.equals(igVar.f685d)) {
                                                com.xiaomi.channel.commonutils.logger.b.b("receive detect msg");
                                                b(igVar);
                                            } else if (com.xiaomi.push.service.i.a(igVar)) {
                                                com.xiaomi.channel.commonutils.logger.b.b("receive notification handle by cpra");
                                            }
                                        }
                                    } catch (ix e12) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e12);
                                    }
                                }
                            } catch (ix unused) {
                            }
                        } else if (idVar.m6093b() && igVar.m6101a() != null && igVar.m6101a().containsKey("awake_info")) {
                            String str11 = igVar.m6101a().get("awake_info");
                            Context context2 = this.f84a;
                            o.a(context2, b.m5683a(context2).m5684a(), ba.a(this.f84a).a(hm.AwakeInfoUploadWaySwitch.a(), 0), str11);
                        }
                    }
                    return null;
                default:
                    return null;
            }
        } catch (u e13) {
            com.xiaomi.channel.commonutils.logger.b.a(e13);
            a(idVar);
            en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, com.tencent.connect.common.Constants.VIA_ACT_TYPE_NINETEEN);
            s.c(this.f84a, idVar, z11);
            return null;
        } catch (ix e14) {
            com.xiaomi.channel.commonutils.logger.b.a(e14);
            com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. is the reg expired?");
            en.a(this.f84a).b(this.f84a.getPackageName(), em.m5913a(i11), str3, "20");
            s.c(this.f84a, idVar, z11);
            return null;
        }
    }

    private void b(ig igVar) {
        Map<String, String> m6101a = igVar.m6101a();
        if (m6101a == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("detect failed because null");
            return;
        }
        String str = (String) ay.a(m6101a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("detect failed because empty");
            return;
        }
        Map<String, String> m5977a = com.xiaomi.push.g.m5977a(this.f84a, str);
        if (m5977a == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("detect failed because get status illegal");
            return;
        }
        String str2 = m5977a.get("alive");
        String str3 = m5977a.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.b("detect failed because no alive process");
            return;
        }
        ig igVar2 = new ig();
        igVar2.a(igVar.m6100a());
        igVar2.b(igVar.b());
        igVar2.d(igVar.c());
        igVar2.c(hr.DetectAppAliveResult.f538a);
        HashMap hashMap = new HashMap();
        igVar2.f680a = hashMap;
        hashMap.put("alive", str2);
        if (Boolean.parseBoolean((String) ay.a(m6101a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            igVar2.f680a.put("notAlive", str3);
        }
        ao.a(this.f84a).a((ao) igVar2, hh.Notification, false, (hu) null);
    }

    private PushMessageHandler.a a(id idVar, byte[] bArr) {
        String str;
        is a11;
        String str2 = null;
        try {
            a11 = ai.a(this.f84a, idVar);
        } catch (u e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (ix e12) {
            com.xiaomi.channel.commonutils.logger.b.a(e12);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an un-recognized message. " + idVar.f661a);
            return null;
        }
        hh a12 = idVar.a();
        com.xiaomi.channel.commonutils.logger.b.m5639a("message arrived: processing an arrived message, action=" + a12);
        if (an.f45188a[a12.ordinal()] != 1) {
            return null;
        }
        if (idVar.m6093b()) {
            ik ikVar = (ik) a11;
            ht a13 = ikVar.a();
            if (a13 != null) {
                hu huVar = idVar.f662a;
                if (huVar != null && huVar.m6046a() != null) {
                    str2 = idVar.f662a.f573a.get("jobkey");
                }
                MiPushMessage generateMessage = PushMessageHelper.generateMessage(ikVar, idVar.m6085a(), false);
                generateMessage.setArrivedMessage(true);
                com.xiaomi.channel.commonutils.logger.b.m5639a("message arrived: receive a message, msgid=" + a13.m6037a() + ", jobkey=" + str2);
                return generateMessage;
            }
            str = "message arrived: receive an empty message without push content, drop it";
        } else {
            str = "message arrived: receiving an un-encrypt message(SendMessage).";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
        return null;
    }

    public static am a(Context context) {
        if (f45187a == null) {
            f45187a = new am(context);
        }
        return f45187a;
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long parseLong = Long.parseLong(list.get(0).split(":")[0]);
        long parseLong2 = ((((parseLong * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long parseLong3 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong2 / 60), Long.valueOf(parseLong2 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong3 / 60), Long.valueOf(parseLong3 % 60)));
        return arrayList;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f84a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f84a, hv.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    public static void a(Context context, String str) {
        synchronized (f82a) {
            f83a.remove(str);
            b.m5683a(context);
            SharedPreferences a11 = b.a(context);
            String a12 = bo.a(f83a, ",");
            SharedPreferences.Editor edit = a11.edit();
            edit.putString("pref_msg_ids", a12);
            com.xiaomi.push.q.a(edit);
        }
    }

    private void a(hy hyVar) {
        String a11 = hyVar.a();
        com.xiaomi.channel.commonutils.logger.b.b("receive ack " + a11);
        Map<String, String> m6060a = hyVar.m6060a();
        if (m6060a != null) {
            String str = m6060a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.b("receive ack : messageId = " + a11 + "  realSource = " + str);
            bw.a(this.f84a).a(a11, str, Boolean.valueOf(hyVar.f616a == 0));
        }
    }

    private void a(id idVar) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("receive a message but decrypt failed. report now.");
        ig igVar = new ig(idVar.m6085a().f571a, false);
        igVar.c(hr.DecryptMessageFail.f538a);
        igVar.b(idVar.m6086a());
        igVar.d(idVar.f668b);
        HashMap hashMap = new HashMap();
        igVar.f680a = hashMap;
        hashMap.put("regid", MiPushClient.getRegId(this.f84a));
        ao.a(this.f84a).a((ao) igVar, hh.Notification, false, (hu) null);
    }

    private void a(ig igVar) {
        hy hyVar = new hy();
        hyVar.c(hr.CancelPushMessageACK.f538a);
        hyVar.a(igVar.m6100a());
        hyVar.a(igVar.a());
        hyVar.b(igVar.b());
        hyVar.e(igVar.c());
        hyVar.a(0L);
        hyVar.d("success clear push message.");
        ao.a(this.f84a).a(hyVar, hh.Notification, false, true, null, false, this.f84a.getPackageName(), b.m5683a(this.f84a).m5684a(), false);
    }

    private void a(ik ikVar, id idVar) {
        hu m6085a = idVar.m6085a();
        if (m6085a != null) {
            m6085a = br.a(m6085a.m6044a());
        }
        hx hxVar = new hx();
        hxVar.b(ikVar.b());
        hxVar.a(ikVar.m6123a());
        hxVar.a(ikVar.a().a());
        if (!TextUtils.isEmpty(ikVar.c())) {
            hxVar.c(ikVar.c());
        }
        if (!TextUtils.isEmpty(ikVar.d())) {
            hxVar.d(ikVar.d());
        }
        hxVar.a(ir.a(this.f84a, idVar));
        ao.a(this.f84a).a((ao) hxVar, hh.AckMessage, m6085a);
    }

    private void a(String str, long j11, e eVar) {
        au a11 = l.a(eVar);
        if (a11 == null) {
            return;
        }
        if (j11 == 0) {
            synchronized (af.class) {
                try {
                    if (af.a(this.f84a).m5661a(str)) {
                        af.a(this.f84a).c(str);
                        if ("syncing".equals(af.a(this.f84a).a(a11))) {
                            af.a(this.f84a).a(a11, "synced");
                        }
                    }
                } finally {
                }
            }
            return;
        }
        if (!"syncing".equals(af.a(this.f84a).a(a11))) {
            af.a(this.f84a).c(str);
            return;
        }
        synchronized (af.class) {
            try {
                if (af.a(this.f84a).m5661a(str)) {
                    if (af.a(this.f84a).a(str) < 10) {
                        af.a(this.f84a).b(str);
                        ao.a(this.f84a).a(str, a11, eVar, "retry");
                    } else {
                        af.a(this.f84a).c(str);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m5662a(Context context, String str) {
        synchronized (f82a) {
            try {
                b.m5683a(context);
                SharedPreferences a11 = b.a(context);
                if (f83a == null) {
                    String[] split = a11.getString("pref_msg_ids", "").split(",");
                    f83a = new LinkedList();
                    for (String str2 : split) {
                        f83a.add(str2);
                    }
                }
                if (f83a.contains(str)) {
                    return true;
                }
                f83a.add(str);
                if (f83a.size() > 25) {
                    f83a.poll();
                }
                String a12 = bo.a(f83a, ",");
                SharedPreferences.Editor edit = a11.edit();
                edit.putString("pref_msg_ids", a12);
                com.xiaomi.push.q.a(edit);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m5663a(id idVar) {
        Map<String, String> m6046a = idVar.m6085a() == null ? null : idVar.m6085a().m6046a();
        if (m6046a == null) {
            return false;
        }
        String str = m6046a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }
}
