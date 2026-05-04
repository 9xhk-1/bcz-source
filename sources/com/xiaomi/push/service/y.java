package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.da;
import com.xiaomi.push.en;
import com.xiaomi.push.fk;
import com.xiaomi.push.gg;
import com.xiaomi.push.gj;
import com.xiaomi.push.gl;
import com.xiaomi.push.gm;
import com.xiaomi.push.ha;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.hx;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ii;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.service.ak;
import com.xiaomi.push.service.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class y {
    public static Intent a(byte[] bArr, long j11) {
        id a11 = a(bArr);
        if (a11 == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j11));
        intent.setPackage(a11.f668b);
        return intent;
    }

    private static void b(Context context, id idVar, byte[] bArr) {
        if (ak.m6226a(idVar)) {
            return;
        }
        String a11 = ak.a(idVar);
        if (TextUtils.isEmpty(a11) || a(context, a11, bArr)) {
            return;
        }
        en.a(context).b(a11, ak.b(idVar), idVar.m6085a().m6045a(), "1");
    }

    private static void c(XMPushService xMPushService, id idVar) {
        xMPushService.a(new ab(4, xMPushService, idVar));
    }

    private static void d(XMPushService xMPushService, id idVar) {
        xMPushService.a(new ac(4, xMPushService, idVar));
    }

    public static id a(Context context, id idVar) {
        return a(context, idVar, (Map<String, String>) null);
    }

    private static void b(XMPushService xMPushService, id idVar) {
        xMPushService.a(new aa(4, xMPushService, idVar));
    }

    private static boolean c(id idVar) {
        if (idVar.m6085a() == null || idVar.m6085a().m6046a() == null) {
            return false;
        }
        return "1".equals(idVar.m6085a().m6046a().get("obslete_ads_message"));
    }

    public static id a(Context context, id idVar, Map<String, String> map) {
        hx hxVar = new hx();
        hxVar.b(idVar.m6086a());
        hu m6085a = idVar.m6085a();
        if (m6085a != null) {
            hxVar.a(m6085a.m6045a());
            hxVar.a(m6085a.m6043a());
            if (!TextUtils.isEmpty(m6085a.m6050b())) {
                hxVar.c(m6085a.m6050b());
            }
        }
        hxVar.a(ir.a(context, idVar));
        id a11 = ah.a(idVar.b(), idVar.m6086a(), hxVar, hh.AckMessage);
        hu m6085a2 = idVar.m6085a();
        if (m6085a2 != null) {
            m6085a2 = br.a(m6085a2.m6044a());
        }
        m6085a2.a("mat", Long.toString(System.currentTimeMillis()));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        m6085a2.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        a11.a(m6085a2);
        return a11;
    }

    private static boolean b(id idVar) {
        Map<String, String> m6046a = idVar.m6085a().m6046a();
        return m6046a != null && m6046a.containsKey("notify_effect");
    }

    public static id a(byte[] bArr) {
        id idVar = new id();
        try {
            ir.a(idVar, bArr);
            return idVar;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
            return null;
        }
    }

    public static void a(Context context, id idVar, byte[] bArr) {
        Context context2;
        try {
            ak.a(idVar);
            idVar.m6085a();
            ak.c m6222a = ak.m6222a(context, idVar, bArr);
            if (m6222a.f46242a <= 0 || TextUtils.isEmpty(m6222a.f925a)) {
                context2 = context;
            } else {
                context2 = context;
                ha.a(context2, m6222a.f925a, m6222a.f46242a, true, false, System.currentTimeMillis());
            }
            if (!com.xiaomi.push.j.m6172a(context2) || !ag.a(context2, idVar, m6222a.f926a)) {
                b(context2, idVar, bArr);
            } else {
                ag.m6217a(context2, idVar);
                com.xiaomi.channel.commonutils.logger.b.m5639a("consume this broadcast by tts");
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("notify push msg error " + e11);
            e11.printStackTrace();
        }
    }

    public void a(Context context, bg.b bVar, boolean z11, int i11, String str) {
        t m6297a;
        if (z11 || (m6297a = u.m6297a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        u.a(context, m6297a.f46404f, m6297a.f46402d, m6297a.f46403e);
    }

    public void a(XMPushService xMPushService, fk fkVar, bg.b bVar) {
        try {
            a(xMPushService, fkVar.m5948a(bVar.f46287h), fkVar.c());
        } catch (IllegalArgumentException e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    public void a(XMPushService xMPushService, gm gmVar, bg.b bVar) {
        if (!(gmVar instanceof gl)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("not a mipush message");
            return;
        }
        gl glVar = (gl) gmVar;
        gj a11 = glVar.a("s");
        if (a11 != null) {
            try {
                a(xMPushService, bp.a(bp.a(bVar.f46287h, glVar.j()), a11.c()), ha.a(gmVar.mo5990a()));
            } catch (IllegalArgumentException e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
    }

    private static void a(XMPushService xMPushService, id idVar) {
        xMPushService.a(new z(4, xMPushService, idVar));
    }

    private static void a(XMPushService xMPushService, id idVar, ig igVar) {
        xMPushService.a(new af(4, igVar, idVar, xMPushService));
    }

    private static void a(XMPushService xMPushService, id idVar, String str) {
        xMPushService.a(new ad(4, xMPushService, idVar, str));
    }

    private static void a(XMPushService xMPushService, id idVar, String str, String str2) {
        xMPushService.a(new ae(4, xMPushService, idVar, str, str2));
    }

    public static void a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        en a11;
        String b11;
        String m6045a;
        int i11;
        String str2;
        String str3;
        en a12;
        String b12;
        String b13;
        String m6045a2;
        String str4;
        String str5;
        id a13 = a(bArr);
        hu m6085a = a13.m6085a();
        is isVar = null;
        if (bArr != null) {
            da.a(a13.b(), xMPushService.getApplicationContext(), null, a13.a(), bArr.length);
        }
        if (c(a13) && a(xMPushService, str)) {
            if (ak.e(a13)) {
                en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), "5");
            }
            c(xMPushService, a13);
            return;
        }
        if (!a(a13) || a(xMPushService, str) || b(a13)) {
            if ((!ak.m6226a(a13) || !com.xiaomi.push.g.c(xMPushService, a13.f668b)) && !a(xMPushService, intent)) {
                if (!com.xiaomi.push.g.c(xMPushService, a13.f668b)) {
                    if (ak.e(a13)) {
                        en.a(xMPushService.getApplicationContext()).b(a13.b(), ak.b(a13), m6085a.m6045a(), "2");
                    }
                    a(xMPushService, a13);
                    return;
                } else {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("receive a mipush message, we can see the app, but we can't see the receiver.");
                    if (ak.e(a13)) {
                        en.a(xMPushService.getApplicationContext()).b(a13.b(), ak.b(a13), m6085a.m6045a(), "3");
                        return;
                    }
                    return;
                }
            }
            boolean z11 = false;
            if (hh.Registration == a13.a()) {
                String b14 = a13.b();
                SharedPreferences.Editor edit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
                edit.putString(b14, a13.f664a);
                edit.commit();
                ii a14 = n.a(a13);
                if (a14.a() != 0 || TextUtils.isEmpty(a14.b())) {
                    com.xiaomi.channel.commonutils.logger.b.d("read regSecret failed");
                } else {
                    n.a(xMPushService, b14, a14.b());
                }
                v.a(xMPushService).e(b14);
                v.a(xMPushService).f(b14);
                en.a(xMPushService.getApplicationContext()).a(b14, "E100003", m6085a.m6045a(), 6003, null);
                if (!TextUtils.isEmpty(m6085a.m6045a())) {
                    intent.putExtra("messageId", m6085a.m6045a());
                    intent.putExtra("eventMessageType", 6000);
                }
            }
            if (ak.c(a13)) {
                en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), 1001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(m6085a.m6045a())) {
                    intent.putExtra("messageId", m6085a.m6045a());
                    intent.putExtra("eventMessageType", 1000);
                }
            }
            if (ak.m6230b(a13)) {
                en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), 2001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(m6085a.m6045a())) {
                    intent.putExtra("messageId", m6085a.m6045a());
                    intent.putExtra("eventMessageType", 2000);
                }
            }
            if (ak.m6226a(a13)) {
                en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), 3001, System.currentTimeMillis(), null);
                if (!TextUtils.isEmpty(m6085a.m6045a())) {
                    intent.putExtra("messageId", m6085a.m6045a());
                    intent.putExtra("eventMessageType", 3000);
                }
            }
            if (m6085a != null && !TextUtils.isEmpty(m6085a.m6053c()) && !TextUtils.isEmpty(m6085a.d()) && m6085a.f575b != 1 && !ak.m6225a((Context) xMPushService, a13.f668b, ak.m6227a(m6085a.m6046a()))) {
                Map<String, String> map = m6085a.f573a;
                String str6 = map != null ? map.get("jobkey") : null;
                if (TextUtils.isEmpty(str6)) {
                    str6 = m6085a.m6045a();
                }
                if (am.a(xMPushService, a13.f668b, str6)) {
                    en.a(xMPushService.getApplicationContext()).c(a13.b(), ak.b(a13), m6085a.m6045a(), "1:" + str6);
                    str5 = "drop a duplicate message, key=" + str6;
                } else if (com.xiaomi.push.j.m6172a((Context) xMPushService) && ag.m6218a(a13)) {
                    str5 = "receive pull down message";
                } else {
                    a(xMPushService, a13, bArr);
                    b(xMPushService, a13);
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a(str5);
                b(xMPushService, a13);
            } else if (!"com.xiaomi.xmsf".contains(a13.f668b) || a13.m6093b() || m6085a == null || m6085a.m6046a() == null || !m6085a.m6046a().containsKey("ab")) {
                if (a(xMPushService, str, a13, m6085a)) {
                    if (m6085a != null && !TextUtils.isEmpty(m6085a.m6045a())) {
                        if (ak.m6230b(a13)) {
                            a11 = en.a(xMPushService.getApplicationContext());
                            b11 = a13.b();
                            str3 = ak.b(a13);
                            m6045a = m6085a.m6045a();
                            i11 = 2002;
                            str2 = null;
                        } else {
                            if (ak.m6226a(a13)) {
                                a12 = en.a(xMPushService.getApplicationContext());
                                b12 = a13.b();
                                b13 = ak.b(a13);
                                m6045a2 = m6085a.m6045a();
                                str4 = "7";
                            } else if (ak.c(a13)) {
                                a12 = en.a(xMPushService.getApplicationContext());
                                b12 = a13.b();
                                b13 = ak.b(a13);
                                m6045a2 = m6085a.m6045a();
                                str4 = Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
                            } else if (ak.d(a13)) {
                                a11 = en.a(xMPushService.getApplicationContext());
                                b11 = a13.b();
                                m6045a = m6085a.m6045a();
                                i11 = 6004;
                                str2 = null;
                                str3 = "E100003";
                            }
                            a12.a(b12, b13, m6045a2, str4);
                        }
                        a11.a(b11, str3, m6045a, i11, str2);
                    }
                    if (hh.Notification == a13.f661a) {
                        try {
                            isVar = ce.a(xMPushService, a13);
                            if (isVar == null) {
                                com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized notification message. " + a13.f661a);
                            } else {
                                z11 = true;
                            }
                        } catch (ix e11) {
                            com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. " + e11);
                        }
                        if (z11 && (isVar instanceof ig)) {
                            ig igVar = (ig) isVar;
                            if (hr.CancelPushMessage.f538a.equals(igVar.f685d) && igVar.m6101a() != null) {
                                String str7 = igVar.m6101a().get(bk.M);
                                int i12 = -2;
                                if (!TextUtils.isEmpty(str7)) {
                                    try {
                                        i12 = Integer.parseInt(str7);
                                    } catch (NumberFormatException e12) {
                                        com.xiaomi.channel.commonutils.logger.b.m5639a("parse notifyId from STRING to INT failed: " + e12);
                                    }
                                }
                                if (i12 >= -1) {
                                    com.xiaomi.channel.commonutils.logger.b.m5639a("try to retract a message by notifyId=" + i12);
                                    ak.a(xMPushService, a13.f668b, i12);
                                } else {
                                    String str8 = igVar.m6101a().get(bk.K);
                                    String str9 = igVar.m6101a().get(bk.L);
                                    com.xiaomi.channel.commonutils.logger.b.m5639a("try to retract a message by title&description.");
                                    ak.a(xMPushService, a13.f668b, str8, str9);
                                }
                                if (m6085a != null && m6085a.m6046a() != null && com.xiaomi.push.j.m6172a((Context) xMPushService) && "pulldown".equals(ay.a((Object) m6085a.m6046a()))) {
                                    ag.a(a13);
                                }
                                a(xMPushService, a13, igVar);
                            }
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.m5639a("broadcast passthrough message.");
                    xMPushService.sendBroadcast(intent, ah.a(a13.f668b));
                } else {
                    en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
                }
            } else {
                b(xMPushService, a13);
                com.xiaomi.channel.commonutils.logger.b.c("receive abtest message. ack it." + m6085a.m6045a());
            }
            if (a13.a() != hh.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
                return;
            }
            xMPushService.stopSelf();
            return;
        }
        if (ak.e(a13)) {
            en.a(xMPushService.getApplicationContext()).a(a13.b(), ak.b(a13), m6085a.m6045a(), Constants.VIA_SHARE_TYPE_INFO);
        }
        d(xMPushService, a13);
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j11) {
        Map<String, String> m6046a;
        id a11 = a(bArr);
        if (a11 == null) {
            return;
        }
        if (TextUtils.isEmpty(a11.f668b)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("receive a mipush message without package name");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intent a12 = a(bArr, currentTimeMillis);
        String a13 = ak.a(a11);
        ha.a(xMPushService, a13, j11, true, true, System.currentTimeMillis());
        hu m6085a = a11.m6085a();
        if (m6085a != null && m6085a.m6045a() != null) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", a11.m6086a(), bd.a(m6085a.m6045a()), a11.a()));
        }
        if (m6085a != null) {
            m6085a.a("mrt", Long.toString(currentTimeMillis));
        }
        hh hhVar = hh.SendMessage;
        String str = "";
        if (hhVar == a11.a() && v.a(xMPushService).m6301a(a11.f668b) && !ak.m6226a(a11)) {
            if (m6085a != null) {
                str = m6085a.m6045a();
                if (ak.e(a11)) {
                    en.a(xMPushService.getApplicationContext()).a(a11.b(), ak.b(a11), str, "1");
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("Drop a message for unregistered, msgid=" + str);
            a(xMPushService, a11, a11.f668b);
            return;
        }
        if (hhVar == a11.a() && v.a(xMPushService).m6303c(a11.f668b) && !ak.m6226a(a11)) {
            if (m6085a != null) {
                str = m6085a.m6045a();
                if (ak.e(a11)) {
                    en.a(xMPushService.getApplicationContext()).a(a11.b(), ak.b(a11), str, "2");
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("Drop a message for push closed, msgid=" + str);
            a(xMPushService, a11, a11.f668b);
            return;
        }
        if (hhVar == a11.a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), a11.f668b)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a11.f668b);
            a(xMPushService, a11, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a11.f668b);
            if (m6085a == null || !ak.e(a11)) {
                return;
            }
            en.a(xMPushService.getApplicationContext()).a(a11.b(), ak.b(a11), m6085a.m6045a(), "3");
            return;
        }
        if (hhVar != a11.a() || com.xiaomi.push.i.a() != 999 || !com.xiaomi.push.i.a(xMPushService, a13)) {
            if (m6085a == null || (m6046a = m6085a.m6046a()) == null || !m6046a.containsKey("hide") || !n6.m.f74525c.equalsIgnoreCase(m6046a.get("hide"))) {
                a(xMPushService, a13, bArr, a12);
                return;
            } else {
                b(xMPushService, a11);
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("Receive the uninstalled dual app message");
        try {
            ah.a(xMPushService, ah.a(a13, a11.m6086a()));
            com.xiaomi.channel.commonutils.logger.b.m5639a("uninstall " + a13 + " msg sent");
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.d("Fail to send Message: " + e11.getMessage());
            xMPushService.a(10, e11);
        }
        ak.m6223a((Context) xMPushService, a13);
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                return !queryBroadcastReceivers.isEmpty();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryBroadcastReceivers.isEmpty()) {
                return !queryIntentServices.isEmpty();
            }
            return true;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        if (com.xiaomi.push.g.m5979a(context, str)) {
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
            intent.putExtra("mipush_payload", bArr);
            intent.setPackage(str);
            try {
                if (!context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("broadcast message arrived.");
                    context.sendBroadcast(intent, ah.a(str));
                    return true;
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("meet error when broadcast message arrived. " + e11);
            }
        }
        return false;
    }

    private static boolean a(id idVar) {
        return "com.xiaomi.xmsf".equals(idVar.f668b) && idVar.m6085a() != null && idVar.m6085a().m6046a() != null && idVar.m6085a().m6046a().containsKey("miui_package_name");
    }

    private static boolean a(XMPushService xMPushService, String str, id idVar, hu huVar) {
        boolean z11 = true;
        if (huVar != null && huVar.m6046a() != null && huVar.m6046a().containsKey("__check_alive") && huVar.m6046a().containsKey("__awake")) {
            ig igVar = new ig();
            igVar.b(idVar.m6086a());
            igVar.d(str);
            igVar.c(hr.AwakeSystemApp.f538a);
            igVar.a(huVar.m6045a());
            igVar.f680a = new HashMap();
            boolean m5979a = com.xiaomi.push.g.m5979a(xMPushService.getApplicationContext(), str);
            igVar.f680a.put("app_running", Boolean.toString(m5979a));
            if (!m5979a) {
                boolean parseBoolean = Boolean.parseBoolean(huVar.m6046a().get("__awake"));
                igVar.f680a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z11 = false;
                }
            }
            try {
                ah.a(xMPushService, ah.a(idVar.b(), idVar.m6086a(), igVar, hh.Notification));
            } catch (gg e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
        return z11;
    }
}
