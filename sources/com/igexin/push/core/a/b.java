package com.igexin.push.core.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.config.a.AnonymousClass3;
import com.igexin.push.config.a.AnonymousClass4;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.a.a.c;
import com.igexin.push.core.a.a.d;
import com.igexin.push.core.a.a.e;
import com.igexin.push.core.a.a.f;
import com.igexin.push.core.d;
import com.igexin.push.core.e.e.AnonymousClass3;
import com.igexin.push.core.e.f.AnonymousClass20;
import com.igexin.push.core.e.f.AnonymousClass21;
import com.igexin.push.core.j;
import com.igexin.push.core.l;
import com.igexin.push.core.m;
import com.igexin.push.core.n;
import com.igexin.push.d.c.h;
import com.igexin.push.d.c.k;
import com.igexin.push.d.c.p;
import com.igexin.push.d.c.q;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.push.g.g;
import com.igexin.push.g.j;
import com.igexin.push.g.o;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.main.FeedbackImpl;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k3.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends a implements com.igexin.push.e.b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37654b = "CoreAction";

    /* renamed from: c, reason: collision with root package name */
    private static SparseArray<a> f37655c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f37656d;

    private b() {
        SparseArray<a> sparseArray = new SparseArray<>();
        f37655c = sparseArray;
        sparseArray.put(0, new com.igexin.push.core.a.a.a());
        f37655c.put(5, new c());
        f37655c.put(37, new d());
        f37655c.put(9, new f());
        f37655c.put(20, new e());
        f37655c.put(26, new com.igexin.push.core.a.b.d());
        f37655c.put(97, new com.igexin.push.core.a.a.b());
    }

    public static Class a(Context context) {
        return ServiceManager.getInstance().b(context);
    }

    private static void c(Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        try {
            String action = intent.getAction();
            if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(action)) {
                e();
                return;
            }
            if (com.igexin.push.core.b.L.equals(action)) {
                n.a().a(intent);
                return;
            }
            if (com.igexin.push.core.b.N.equals(action)) {
                if (com.igexin.push.config.d.f37583c != 0) {
                    com.igexin.push.f.f.a().d();
                }
            } else if (!"android.intent.action.SCREEN_ON".equals(action)) {
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    com.igexin.push.core.e.f38048y = 0;
                }
            } else {
                com.igexin.push.core.e.f38048y = 1;
                com.igexin.push.f.a.a().a(true);
                if (Build.VERSION.SDK_INT >= 26) {
                    b("screen on");
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static b d() {
        if (f37656d == null) {
            synchronized (b.class) {
                try {
                    if (f37656d == null) {
                        f37656d = new b();
                    }
                } finally {
                }
            }
        }
        return f37656d;
    }

    public static void e() {
        com.igexin.push.core.d unused = d.a.f37956a;
        com.igexin.push.e.a.d();
        com.igexin.c.a.c.a.a("CoreAction|network changed check condition status", new Object[0]);
        com.igexin.push.f.a.a().a(true);
    }

    public static int f() {
        com.igexin.c.a.c.a.a("CoreAction|send heart beat data ........", new Object[0]);
        return d.a.f37956a.f37949h.a("H-" + com.igexin.push.core.e.A, new com.igexin.push.d.c.f(), true);
    }

    public static void g() {
        try {
            for (com.igexin.push.core.b.n nVar : com.igexin.push.core.e.e.a().f38073a) {
                if (nVar.f37891e >= com.igexin.push.config.d.N - 1) {
                    com.igexin.c.a.c.a.a("CoreAction|data.getSendTimes=" + nVar.f37891e + " id=" + nVar.f37887a, new Object[0]);
                } else if (nVar.f37890d + 20000 <= System.currentTimeMillis()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject(nVar.f37888b);
                    com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                    bVar.f38418c = 128;
                    bVar.f38417b = (int) currentTimeMillis;
                    bVar.f38420e = com.igexin.push.core.b.O;
                    if (jSONObject.has("extraData")) {
                        bVar.f38422g = Base64.decode(jSONObject.optString("extraData").getBytes(), 0);
                        jSONObject.remove("extraData");
                    }
                    bVar.f38421f = nVar.f37888b;
                    bVar.f38423h = com.igexin.push.core.e.A;
                    com.igexin.c.a.c.a.a("freshral|" + nVar.f37888b, new Object[0]);
                    com.igexin.push.core.e.e a11 = com.igexin.push.core.e.e.a();
                    long j11 = nVar.f37887a;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    com.igexin.push.core.b.n a12 = a11.a(j11);
                    if (a12 != null) {
                        a12.f37890d = currentTimeMillis2;
                        a12.f37891e++;
                        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass3(com.igexin.push.core.e.e.a(a12), j11), true, true);
                    }
                    d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, bVar, false);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static void h() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "request_deviceid");
            jSONObject.put("id", String.valueOf(currentTimeMillis));
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        String jSONObject2 = jSONObject.toString();
        com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
        bVar.f38418c = 128;
        bVar.f38417b = (int) currentTimeMillis;
        bVar.f38420e = com.igexin.push.core.b.O;
        bVar.f38421f = jSONObject2;
        bVar.f38423h = com.igexin.push.core.e.A;
        d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, bVar, false);
        com.igexin.c.a.c.a.a("CoreAction|deviceidReq", new Object[0]);
    }

    public static void j() {
        if (!com.igexin.push.core.e.W || com.igexin.push.core.e.X >= System.currentTimeMillis()) {
            return;
        }
        com.igexin.push.core.e.f.a().a(false);
    }

    public static void k() {
        if (!com.igexin.push.core.e.f38003ae) {
            com.igexin.push.core.e.f38003ae = com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.f.b.b.g(), false, true);
        }
        if (!com.igexin.push.core.e.f38004af) {
            com.igexin.push.core.e.f38004af = com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.f.b.e.g(), true, true);
        }
        if (com.igexin.push.core.e.f38005ag) {
            return;
        }
        d.a.f37956a.b();
    }

    private static boolean l() {
        return false;
    }

    private static void m() {
        com.igexin.push.g.c.d();
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }

    public final void i() {
        try {
            if ((System.currentTimeMillis() - com.igexin.push.core.e.Q) - 86400000 > 0) {
                com.igexin.push.core.e.f.a().b(0);
                com.igexin.push.core.e.f.a().c(System.currentTimeMillis());
            }
            com.igexin.c.a.c.a.b(f37654b, "sendAddphoneinfo.deviceToken" + com.igexin.push.core.e.I);
            if (com.igexin.push.core.e.aA <= 7) {
                com.igexin.push.core.e.f.a().b(com.igexin.push.core.e.aA + 1);
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.d() { // from class: com.igexin.push.core.a.b.1
                    @Override // com.igexin.push.f.d
                    public final void b() {
                        com.igexin.push.g.n.m();
                        try {
                            com.igexin.push.core.b.a aVar = new com.igexin.push.core.b.a();
                            long j11 = aVar.f37768n;
                            JSONObject jSONObject = new JSONObject();
                            String str = aVar.f37755a;
                            if (str == null) {
                                str = "";
                            }
                            jSONObject.put("model", str);
                            String str2 = aVar.f37756b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            jSONObject.put("sim", str2);
                            String str3 = aVar.f37757c;
                            if (str3 == null) {
                                str3 = "";
                            }
                            jSONObject.put("imei", str3);
                            jSONObject.put("mac", aVar.f37758d == null ? "" : com.igexin.push.g.n.c());
                            String str4 = aVar.f37759e;
                            if (str4 == null) {
                                str4 = "";
                            }
                            jSONObject.put("version", str4);
                            String str5 = aVar.f37760f;
                            if (str5 == null) {
                                str5 = "";
                            }
                            jSONObject.put("channelid", str5);
                            jSONObject.put("type", "ANDROID");
                            String str6 = aVar.f37765k;
                            if (str6 == null) {
                                str6 = "";
                            }
                            jSONObject.put("app", str6);
                            StringBuilder sb2 = new StringBuilder("ANDROID-");
                            String str7 = aVar.f37761g;
                            if (str7 == null) {
                                str7 = "";
                            }
                            sb2.append(str7);
                            jSONObject.put("deviceid", sb2.toString());
                            String str8 = aVar.f37766l;
                            if (str8 == null) {
                                str8 = "";
                            }
                            jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, str8);
                            String str9 = aVar.f37767m;
                            if (str9 == null) {
                                str9 = "";
                            }
                            jSONObject.put(Constants.PHONE_BRAND, str9);
                            String str10 = aVar.f37764j;
                            if (str10 == null) {
                                str10 = "";
                            }
                            jSONObject.put("system_version", str10);
                            String str11 = aVar.f37763i;
                            if (str11 == null) {
                                str11 = "";
                            }
                            jSONObject.put("cell", str11);
                            jSONObject.put("aid", com.igexin.push.g.n.h());
                            jSONObject.put("adid", com.igexin.push.g.n.i());
                            jSONObject.put("gtcid", TextUtils.isEmpty(aVar.f37769o) ? "" : aVar.f37769o);
                            String str12 = com.igexin.push.core.e.f38031h;
                            if (str12 == null) {
                                str12 = "";
                            }
                            jSONObject.put("oaid", str12);
                            ServiceManager.getInstance();
                            String e11 = ServiceManager.e(com.igexin.push.core.e.f38035l);
                            if (!com.igexin.push.core.b.f37719ap.equals(e11)) {
                                jSONObject.put("us", e11);
                            }
                            ServiceManager.getInstance();
                            jSONObject.put(o.f38735d, ServiceManager.d(com.igexin.push.core.e.f38035l));
                            jSONObject.put("notification_enabled", com.igexin.push.g.c.b(com.igexin.push.core.e.f38035l) ? 1 : 0);
                            jSONObject.put("installChannel", com.igexin.c.b.a.b(com.igexin.push.core.e.f38025b, "").replaceAll("\\|", ""));
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("action", "addphoneinfo");
                            jSONObject2.put("id", String.valueOf(aVar.f37768n));
                            jSONObject2.put("info", jSONObject);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("guardMe", String.valueOf(com.igexin.push.config.e.b()));
                            jSONObject3.put("guardOthers", String.valueOf(com.igexin.push.config.e.c()));
                            jSONObject2.put("extra", jSONObject3);
                            String jSONObject4 = jSONObject2.toString();
                            com.igexin.c.a.c.a.a("addphoneinfo |  ".concat(String.valueOf(jSONObject4)), new Object[0]);
                            com.igexin.push.core.e.e a11 = com.igexin.push.core.e.e.a();
                            if (a11 != null) {
                                a11.b(new com.igexin.push.core.b.n(j11, jSONObject4, (byte) 5, j11));
                            }
                            com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                            bVar.f38418c = 128;
                            bVar.f38417b = (int) j11;
                            bVar.f38420e = com.igexin.push.core.b.O;
                            bVar.f38421f = jSONObject4;
                            bVar.f38423h = com.igexin.push.core.e.A;
                            d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, bVar, false);
                            if (com.igexin.c.b.a.a(com.igexin.push.core.e.K, com.igexin.push.core.e.I)) {
                                return;
                            }
                            com.igexin.push.core.e.f.a().c(com.igexin.push.core.e.I);
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                    }
                }, false, true);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static String a(String str, String str2) {
        return str + ":" + str2;
    }

    public static void b(Intent intent) {
        if (intent == null || !intent.hasExtra("isSlave")) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("isSlave", false);
        com.igexin.c.a.c.a.a("CoreAction|onServiceInitializeForSlave isSlave =".concat(String.valueOf(booleanExtra)), new Object[0]);
        if (booleanExtra) {
            com.igexin.push.core.d unused = d.a.f37956a;
            com.igexin.push.core.d.a(true);
            com.igexin.push.core.e.N = intent.hasExtra("op_app") ? intent.getStringExtra("op_app") : "";
            if (com.igexin.push.core.e.f38044u) {
                l.a().c();
            }
        }
    }

    public static void b(String str) {
        com.igexin.c.a.c.a.a("CoreAction|resetDelayTime from = ".concat(String.valueOf(str)), new Object[0]);
        long j11 = com.igexin.push.core.e.O;
        if (j11 <= 10000 && j11 != 0) {
            com.igexin.c.a.c.a.a("CoreAction|resetDelayTime ignore, delay = " + com.igexin.push.core.e.O, new Object[0]);
            return;
        }
        int random = (int) ((Math.random() * 100.0d) + 1000.0d);
        long j12 = com.igexin.push.core.e.O;
        com.igexin.c.a.c.a.a("CoreAction|reConnectDelayTime = " + com.igexin.push.core.e.O + ", reset = " + random, new Object[0]);
        com.igexin.push.f.b.e.g().a((long) random);
    }

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    public static void a(Intent intent) {
        com.igexin.c.a.c.a.a("CoreAction|onServiceInitialize ##", new Object[0]);
        if (intent == null) {
            return;
        }
        com.igexin.push.core.d unused = d.a.f37956a;
        com.igexin.push.core.d.a(false);
        com.igexin.push.core.e.N = intent.hasExtra("op_app") ? intent.getStringExtra("op_app") : "";
        com.igexin.push.core.e.f38045v = false;
        if (com.igexin.push.core.e.f38044u) {
            l.a().c();
            com.igexin.push.core.e.f38045v = true;
        }
        if (!o.a(com.igexin.push.core.e.f38035l) || j.f38710d == null) {
            return;
        }
        ServiceManager.getInstance();
        String e11 = ServiceManager.e(com.igexin.push.core.e.f38035l);
        if (!com.igexin.push.core.b.f37719ap.equals(e11)) {
            byte[] b11 = com.igexin.c.b.a.b(e11.getBytes());
            if (b11 == null || !j.k()) {
                return;
            }
            j.a(b11, j.f38710d);
            return;
        }
        if (j.k() && new File(j.f38710d).delete()) {
            String str = j.f38710d;
            com.igexin.c.a.c.a.a("del " + j.f38710d + " success ~~~", new Object[0]);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(Bundle bundle) {
        com.igexin.c.a.c.a.d a11;
        String str;
        try {
            m.a();
            String string = bundle.getString("action");
            com.igexin.c.a.c.a.a("PushController|action pushmanager action = ".concat(String.valueOf(string)), new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                try {
                    switch (string.hashCode()) {
                        case -1710807787:
                            if (string.equals("queryPushOnLine")) {
                                l.a().b();
                                break;
                            }
                            break;
                        case -1673882831:
                            if (!string.equals("setVivoBadgeNum")) {
                            }
                            com.igexin.push.g.d.b(bundle.getInt("badgeNum"), true);
                            break;
                        case -1411528570:
                            if (string.equals("setNotificationIcon")) {
                                com.igexin.push.core.e.aK = bundle.getString("smallIcon", "");
                                com.igexin.push.core.e.aL = bundle.getString("largeIcon", "");
                                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass20(com.igexin.push.core.e.aK, com.igexin.push.core.e.aL), false, true);
                                a11 = com.igexin.c.a.c.a.d.a();
                                str = "[PushController] setNotificationIcon success";
                                a11.a(str);
                                break;
                            }
                            break;
                        case -1166665294:
                            if (string.equals(PushConsts.QUERY_TAG)) {
                                String string2 = bundle.getString("sn");
                                if (!TextUtils.isEmpty(com.igexin.push.core.e.A)) {
                                    if (System.currentTimeMillis() - com.igexin.push.core.e.f38026c < com.igexin.push.config.d.f37568a * 1000 && com.igexin.push.core.e.f38027d != null) {
                                        com.igexin.c.a.c.a.a("PushController|query tag already cache, tag = " + com.igexin.push.core.e.f38027d, new Object[0]);
                                        l.a().a(string2, "0", com.igexin.push.core.e.f38027d);
                                        break;
                                    } else {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("action", "query_tag");
                                            jSONObject.put("id", String.valueOf(currentTimeMillis));
                                            jSONObject.put("cid", com.igexin.push.core.e.A);
                                            jSONObject.put("appid", com.igexin.push.core.e.f37998a);
                                            jSONObject.put("sn", string2);
                                        } catch (Exception e11) {
                                            com.igexin.c.a.c.a.a(e11);
                                        }
                                        String jSONObject2 = jSONObject.toString();
                                        com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, (byte) 11, currentTimeMillis));
                                        com.igexin.push.d.c.o oVar = new com.igexin.push.d.c.o();
                                        oVar.f38418c = 128;
                                        oVar.f38420e = com.igexin.push.core.b.O;
                                        oVar.f38421f = jSONObject2;
                                        d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, oVar, false);
                                        com.igexin.push.core.e.f a12 = com.igexin.push.core.e.f.a();
                                        if (com.igexin.push.core.e.f38026c != currentTimeMillis) {
                                            com.igexin.push.core.e.f38026c = currentTimeMillis;
                                            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a12.new AnonymousClass21(), false, true);
                                        }
                                        com.igexin.c.a.c.a.a("PushController｜queryTag", new Object[0]);
                                        break;
                                    }
                                }
                            }
                            break;
                        case -1092138459:
                            if (!string.equals("setOppoBadgeNum")) {
                            }
                            com.igexin.push.g.d.c(bundle.getInt("badgeNum"), true);
                            break;
                        case -957964269:
                            if (string.equals("bindAlias")) {
                                String string3 = bundle.getString(PushConstants.SUB_ALIAS_STATUS_NAME);
                                String string4 = bundle.getString("sn");
                                com.igexin.c.a.c.a.a("PushController|onPushManagerMessage bindAlias...", new Object[0]);
                                if (!TextUtils.isEmpty(com.igexin.push.core.e.A)) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    if (currentTimeMillis2 - com.igexin.push.core.e.f37999aa <= 1000) {
                                        com.igexin.c.a.c.a.a("PushController|bindAlias frequently called", new Object[0]);
                                        break;
                                    } else {
                                        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis2));
                                        if (!format.equals(com.igexin.push.core.e.Z)) {
                                            com.igexin.push.core.e.f.a().d(format);
                                            com.igexin.push.core.e.f.a().a(0);
                                        }
                                        int i11 = com.igexin.push.core.e.f38000ab;
                                        com.igexin.c.a.c.a.a("-> CoreRuntimeInfo.opAliasTimes:" + com.igexin.push.core.e.f38000ab, new Object[0]);
                                        if (com.igexin.push.core.e.f38000ab >= 100) {
                                            com.igexin.c.a.c.a.a("PushController|bindAlias times exceed", new Object[0]);
                                            com.igexin.c.a.c.a.d.a().a("bindAlias : " + string3 + ", failed, , the number of calls per day cannot exceed 100");
                                            l.a().b(string4, "30003");
                                            break;
                                        } else {
                                            com.igexin.c.a.c.a.a("start bindAlias ###", new Object[0]);
                                            com.igexin.push.core.e.f37999aa = currentTimeMillis2;
                                            com.igexin.push.core.e.f.a().a(com.igexin.push.core.e.f38000ab + 1);
                                            m.a(string3, string4, false, true);
                                            break;
                                        }
                                    }
                                } else {
                                    com.igexin.c.a.c.a.d.a().a("bindAlias : " + string3 + ", failed, has not get clientid");
                                    l.a().b(string4, "30005");
                                    break;
                                }
                            }
                            break;
                        case -908867308:
                            if (!string.equals("setHwBadgeNum")) {
                            }
                            com.igexin.push.g.d.a(bundle.getInt("badgeNum"), true);
                            break;
                        case -905799720:
                            if (string.equals("setTag") && com.igexin.push.config.d.f37591k) {
                                String string5 = bundle.getString("tags");
                                String string6 = bundle.getString("sn");
                                if (!TextUtils.isEmpty(com.igexin.push.core.e.A)) {
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("action", "set_tag");
                                        jSONObject3.put("id", String.valueOf(currentTimeMillis3));
                                        jSONObject3.put("cid", com.igexin.push.core.e.A);
                                        jSONObject3.put("appid", com.igexin.push.core.e.f37998a);
                                        jSONObject3.put("tags", URLEncoder.encode(string5, "utf-8"));
                                        jSONObject3.put("sn", string6);
                                    } catch (Exception e12) {
                                        com.igexin.c.a.c.a.a(e12);
                                    }
                                    com.igexin.push.core.e.f38028e = string5.replaceAll(",", " ");
                                    String jSONObject4 = jSONObject3.toString();
                                    com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis3, jSONObject4, (byte) 2, com.igexin.push.core.e.f38044u ? currentTimeMillis3 : 0L));
                                    com.igexin.push.d.c.o oVar2 = new com.igexin.push.d.c.o();
                                    oVar2.f38418c = 128;
                                    oVar2.f38420e = com.igexin.push.core.b.O;
                                    oVar2.f38421f = jSONObject4;
                                    d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, oVar2, false);
                                    com.igexin.c.a.c.a.a("settag", new Object[0]);
                                    break;
                                } else {
                                    com.igexin.c.a.c.a.d.a().a("setTag : " + string5 + ", failed, has not get clientid");
                                    l.a().a(string6, "20008");
                                    break;
                                }
                            }
                            break;
                        case -889524838:
                            if (string.equals("unbindAlias")) {
                                String string7 = bundle.getString(PushConstants.SUB_ALIAS_STATUS_NAME);
                                String string8 = bundle.getString("sn");
                                boolean z11 = bundle.getBoolean("isSeft");
                                com.igexin.c.a.c.a.a("PushController|onPushManagerMessage unbindAlias...", new Object[0]);
                                if (!TextUtils.isEmpty(com.igexin.push.core.e.A)) {
                                    if (!z11 || !TextUtils.isEmpty(com.igexin.push.core.e.A)) {
                                        long currentTimeMillis4 = System.currentTimeMillis();
                                        if (currentTimeMillis4 - com.igexin.push.core.e.f37999aa <= 1000) {
                                            com.igexin.c.a.c.a.a("PushController|unbindAlias frequently called", new Object[0]);
                                            break;
                                        } else {
                                            String format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis4));
                                            if (!format2.equals(com.igexin.push.core.e.Z)) {
                                                com.igexin.push.core.e.f.a().d(format2);
                                                com.igexin.push.core.e.f.a().a(0);
                                            }
                                            if (com.igexin.push.core.e.f38000ab >= 100) {
                                                com.igexin.c.a.c.a.a("PushController|unbindAlias times exceed", new Object[0]);
                                                com.igexin.c.a.c.a.d.a().a("unbindAlias : " + string7 + ", failed, , the number of calls per day cannot exceed 100");
                                                l.a().c(string8, "30003");
                                                break;
                                            } else {
                                                com.igexin.c.a.c.a.a("start unbindAlias ###", new Object[0]);
                                                com.igexin.push.core.e.f37999aa = currentTimeMillis4;
                                                com.igexin.push.core.e.f.a().a(com.igexin.push.core.e.f38000ab + 1);
                                                m.a(string7, string8, true, z11);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    com.igexin.c.a.c.a.d.a().a("unbindAlias : " + string7 + ", failed, has not get clientid");
                                    l.a().c(string8, "30005");
                                    break;
                                }
                            }
                            break;
                        case -850755092:
                            if (string.equals("turnOffPush")) {
                                com.igexin.push.core.d dVar = d.a.f37956a;
                                if (com.igexin.push.core.e.f38035l != null) {
                                    com.igexin.push.core.d.d.a().a("p", Boolean.FALSE);
                                    com.igexin.push.core.e.f38042s = false;
                                    com.igexin.push.core.e.f38045v = false;
                                    dVar.f37949h.b();
                                }
                                AssistPushManager.getInstance().turnOffPush(com.igexin.push.core.e.f38035l);
                                break;
                            }
                            break;
                        case -479268212:
                            if (!string.equals("registerPushActivity")) {
                            }
                            com.igexin.push.core.e.a();
                            break;
                        case -344351336:
                            if (string.equals("sendApplinkFeedback")) {
                                String string9 = bundle.getString("url");
                                boolean z12 = com.igexin.push.config.d.E;
                                if (!TextUtils.isEmpty(string9)) {
                                    try {
                                        Uri parse = Uri.parse(string9);
                                        String host = parse.getHost();
                                        String queryParameter = parse.getQueryParameter("p");
                                        if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(queryParameter)) {
                                            if (!com.igexin.push.config.d.E) {
                                                com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is false, not feedback", new Object[0]);
                                                break;
                                            } else if (!com.igexin.push.g.c.c(host)) {
                                                com.igexin.c.a.c.a.a("PushController|checkIsWhiteApplinkDomain is false, not feedback", new Object[0]);
                                                break;
                                            } else {
                                                com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is true and checkIsWhiteApplinkDomain is true, to feedback", new Object[0]);
                                                PushTaskBean pushTaskBean = new PushTaskBean();
                                                pushTaskBean.setTaskId("getuiapplinkup");
                                                pushTaskBean.setMessageId(queryParameter);
                                                pushTaskBean.setAppid(com.igexin.push.core.e.f37998a);
                                                FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean, PushConsts.SEND_MESSAGE_ERROR);
                                                break;
                                            }
                                        }
                                        com.igexin.c.a.c.a.a("PushController|url " + string9 + " is invalid", new Object[0]);
                                    } catch (Exception e13) {
                                        com.igexin.c.a.c.a.a(e13);
                                        com.igexin.c.a.c.a.a("PushController|" + e13.toString(), new Object[0]);
                                        return;
                                    }
                                }
                            }
                            break;
                        case -159289499:
                            if (string.equals("setBadgeNum")) {
                                if (!com.igexin.push.g.n.d().equalsIgnoreCase("huawei") && !com.igexin.push.g.n.d().equalsIgnoreCase(AssistUtils.BRAND_HON)) {
                                    if (!com.igexin.push.g.n.d().equalsIgnoreCase("oppo")) {
                                        if (com.igexin.push.g.n.d().equalsIgnoreCase("vivo")) {
                                            com.igexin.push.g.d.b(bundle.getInt("badgeNum"), true);
                                            break;
                                        }
                                    } else {
                                        com.igexin.push.g.d.c(bundle.getInt("badgeNum"), true);
                                        break;
                                    }
                                }
                                com.igexin.push.g.d.a(bundle.getInt("badgeNum"), true);
                            }
                            break;
                        case -101965284:
                            if (string.equals("setLinkMerge")) {
                                boolean z13 = bundle.getBoolean(u0.f65628b, true);
                                com.igexin.push.config.e.a(z13, z13);
                                com.igexin.push.core.e.a();
                                a11 = com.igexin.c.a.c.a.d.a();
                                str = "[PushController] setLinkMerge success";
                                a11.a(str);
                                break;
                            }
                            break;
                        case -12797509:
                            if (string.equals("setGuardOptions")) {
                                com.igexin.push.config.e.a(bundle.getBoolean("guardMe", true), bundle.getBoolean("guardOthers", true));
                                com.igexin.push.core.e.a();
                                a11 = com.igexin.c.a.c.a.d.a();
                                str = "[PushController] setGuardOptions success";
                                a11.a(str);
                                break;
                            }
                            break;
                        case 329771905:
                            if (string.equals("setDeviceToken")) {
                                String string10 = bundle.getString("token", "");
                                if (!TextUtils.isEmpty(string10) && com.igexin.push.core.e.b().booleanValue() && !string10.equals(com.igexin.push.core.e.I)) {
                                    com.igexin.push.core.e.f.a().b(string10);
                                    if (com.igexin.push.core.e.f38044u) {
                                        com.igexin.c.a.c.a.b("PushController", "online, send addphoneinfo");
                                        d().i();
                                    }
                                }
                                com.igexin.c.a.c.a.d.a().a("[PushController] setDeviceToken success ".concat(String.valueOf(string10)));
                                break;
                            }
                            break;
                        case 495464132:
                            if (string.equals("setSilentTime") && com.igexin.push.config.d.f37592l) {
                                int i12 = bundle.getInt("beginHour", 0);
                                int i13 = bundle.getInt("duration", 0);
                                com.igexin.push.core.e.f38035l.getPackageName();
                                m.a(i12, i13);
                                AssistPushManager.getInstance().setSilentTime(com.igexin.push.core.e.f38035l, i12, i13);
                                break;
                            }
                            break;
                        case 539767084:
                            if (string.equals("setSocketTimeout") && com.igexin.push.config.d.f37594n) {
                                int i14 = bundle.getInt("submitTimeoutEvent", 0);
                                com.igexin.push.core.e.f38035l.getPackageName();
                                com.igexin.push.config.d.f37586f = i14;
                                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass4(), false, true);
                                break;
                            }
                            break;
                        case 556182983:
                            if (string.equals("registerUserService")) {
                                com.igexin.push.core.e.a();
                                break;
                            }
                            break;
                        case 691453791:
                            if (string.equals("sendMessage")) {
                                boolean z14 = com.igexin.push.config.d.f37590j;
                                com.igexin.c.a.c.a.a("PushController onPushManagerMessage recevie action : sendMessage", new Object[0]);
                                if (com.igexin.push.config.d.f37590j) {
                                    String string11 = bundle.getString("taskid");
                                    byte[] byteArray = bundle.getByteArray("extraData");
                                    com.igexin.c.a.c.a.a("PushController receive broadcast msg data , task id : " + string11 + " ######@##@@@#", new Object[0]);
                                    if (com.igexin.push.core.e.A != null) {
                                        JSONObject jSONObject5 = new JSONObject();
                                        long currentTimeMillis5 = System.currentTimeMillis();
                                        jSONObject5.put("action", "sendmessage");
                                        jSONObject5.put("id", String.valueOf(currentTimeMillis5));
                                        jSONObject5.put("cid", com.igexin.push.core.e.A);
                                        jSONObject5.put("appid", com.igexin.push.core.e.f37998a);
                                        jSONObject5.put("taskid", string11);
                                        jSONObject5.put("extraData", Base64.encodeToString(byteArray, 0));
                                        String jSONObject6 = jSONObject5.toString();
                                        com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis5, jSONObject6, (byte) 6, currentTimeMillis5));
                                        com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                                        bVar.f38418c = 128;
                                        bVar.f38417b = (int) currentTimeMillis5;
                                        String str2 = com.igexin.push.core.e.A;
                                        bVar.f38420e = str2;
                                        bVar.f38421f = jSONObject6;
                                        bVar.f38422g = byteArray;
                                        bVar.f38423h = str2;
                                        d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, bVar, false);
                                        if (string11 != null && string11.startsWith("4T5@S_")) {
                                            com.igexin.c.a.c.a.a("PushController sending lbs report message : ".concat(String.valueOf(jSONObject6)), new Object[0]);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 999002527:
                            if (string.equals("setHeartbeatInterval") && com.igexin.push.config.d.f37593m) {
                                int i15 = bundle.getInt("interval", 0);
                                com.igexin.push.core.e.f38035l.getPackageName();
                                com.igexin.push.config.d.f37585e = i15;
                                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass3(), false, true);
                                if (com.igexin.push.core.e.f38044u) {
                                    System.currentTimeMillis();
                                    com.igexin.c.a.c.a.a("setHeartbeatInterval heartbeatReq", new Object[0]);
                                    if (System.currentTimeMillis() - com.igexin.push.core.e.Y > 5000) {
                                        com.igexin.push.core.e.Y = System.currentTimeMillis();
                                        d();
                                        f();
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1841202202:
                            if (string.equals("sendFeedbackMessage")) {
                                boolean z15 = com.igexin.push.config.d.f37595o;
                                int i16 = com.igexin.push.core.e.f38011am;
                                if (com.igexin.push.config.d.f37595o && com.igexin.push.core.e.f38011am <= 200) {
                                    String string12 = bundle.getString("taskid");
                                    String string13 = bundle.getString("messageid");
                                    String string14 = bundle.getString("actionid");
                                    String str3 = string12 + ":" + string13 + ":" + string14;
                                    if (com.igexin.push.core.e.f38010al.get(str3) == null) {
                                        long currentTimeMillis6 = System.currentTimeMillis();
                                        PushTaskBean pushTaskBean2 = new PushTaskBean();
                                        pushTaskBean2.setTaskId(string12);
                                        pushTaskBean2.setMessageId(string13);
                                        pushTaskBean2.setAppid(com.igexin.push.core.e.f37998a);
                                        FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean2, string14);
                                        com.igexin.push.core.e.f38011am++;
                                        com.igexin.push.core.e.f38010al.put(str3, Long.valueOf(currentTimeMillis6));
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                } catch (Exception e14) {
                    e = e14;
                    com.igexin.c.a.c.a.a(e);
                }
            } catch (Throwable th2) {
                e = th2;
                com.igexin.c.a.c.a.a(e);
            }
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
        }
    }

    public static void a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", com.igexin.push.core.b.F);
            jSONObject.put("id", str);
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        String jSONObject2 = jSONObject.toString();
        com.igexin.push.d.c.o oVar = new com.igexin.push.d.c.o();
        oVar.f38418c = 128;
        ((com.igexin.push.d.c.b) oVar).f38417b = (int) System.currentTimeMillis();
        oVar.f38420e = com.igexin.push.core.b.O;
        oVar.f38421f = jSONObject2;
        oVar.f38423h = com.igexin.push.core.e.A;
        d.a.f37956a.f37949h.a("C-" + com.igexin.push.core.e.A, oVar, false);
    }

    @TargetApi(12)
    private static void a(String str, String str2, String str3, String str4) {
        l.a().a(str, str2, str3, str4);
    }

    @Override // com.igexin.push.e.b
    public final boolean a(com.igexin.push.d.c.c cVar) {
        if (cVar != null) {
            a aVar = f37655c.get(cVar.f38438m);
            com.igexin.c.a.c.a.a("CoreAction|receive : " + cVar.getClass().getName() + " resp ~~~~", new Object[0]);
            if ((cVar instanceof h) || (cVar instanceof k) || (cVar instanceof com.igexin.push.d.c.m) || (cVar instanceof p) || (cVar instanceof com.igexin.push.d.c.f) || (cVar instanceof q)) {
                com.igexin.c.a.b.a.a.d.a().a(cVar.getClass().getName());
            }
            if ((cVar instanceof k) || (cVar instanceof com.igexin.push.d.c.m) || (cVar instanceof p)) {
                com.igexin.push.core.e.b(0L);
                com.igexin.push.c.c.a().d().b();
            }
            if (aVar != null) {
                aVar.a(cVar);
            }
            com.igexin.push.f.b.b.g().i();
            return true;
        }
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        com.igexin.push.e.a aVar = d.a.f37956a.f37949h;
        if ((obj instanceof com.igexin.push.d.c.c) && aVar != null) {
            com.igexin.push.e.a.a((com.igexin.push.d.c.c) obj);
        } else if (obj instanceof com.igexin.push.d.b.b) {
            com.igexin.c.a.c.a.a("CoreAction|TcpExceptionNotify###", new Object[0]);
            com.igexin.push.c.c.a().d().c();
            com.igexin.push.c.a d11 = com.igexin.push.c.c.a().d();
            com.igexin.push.core.j.a().a(j.a.f38321c);
            d11.f();
            if (com.igexin.push.e.a.e()) {
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a, "sdkOn = false or pushOn = false, disconnect|user");
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a + "|sdkOn = false or pushOn = false, disconnect|user", new Object[0]);
            } else {
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a + "|disconnect by network", new Object[0]);
            }
            com.igexin.c.a.d.e<com.igexin.c.a.d.f> eVar = com.igexin.c.a.b.e.a().f37248s;
            if (eVar != null) {
                eVar.a(com.igexin.c.a.b.a.a.f.class);
            }
            com.igexin.push.e.a.a(false);
        } else if (obj instanceof com.igexin.push.d.b.a) {
            com.igexin.c.a.c.a.a("CoreAction|TcpDisconnectSuccessNotify ###", new Object[0]);
            if (com.igexin.push.core.e.f38044u) {
                com.igexin.push.core.e.f38044u = false;
                com.igexin.c.a.c.a.a("CoreAction|broadcast online state = offline", new Object[0]);
                l.a().b();
            }
            com.igexin.push.d.a.c.f38390b = -1;
            if (com.igexin.push.core.e.f38040q) {
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a, "isAppidWrong = true");
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a + "|isAppidWrong = true", new Object[0]);
                com.igexin.c.a.c.a.d.a().a("isAppidWrong = true");
            } else if (!g.a()) {
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a, "so error ++++++++");
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a + "|so error ++++++++", new Object[0]);
            } else if (com.igexin.push.core.e.f38024az) {
                com.igexin.push.e.a.c();
            } else {
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a, "initSuccess = false");
                com.igexin.c.a.c.a.a(com.igexin.push.e.a.f38514a + "|initSuccess = false", new Object[0]);
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, String str3) {
        return n.a().a(str, str2, str3);
    }

    private static boolean a(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        return n.a().a(jSONObject, pushTaskBean);
    }
}
