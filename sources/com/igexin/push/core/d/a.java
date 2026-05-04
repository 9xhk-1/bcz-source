package com.igexin.push.core.d;

import android.content.Context;
import android.text.TextUtils;
import com.getui.gtc.api.GtcManager;
import com.getui.gtc.api.SdkInfo;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.config.a.AnonymousClass9;
import com.igexin.push.core.d.f;
import com.igexin.push.core.m;
import com.igexin.push.core.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37954a = "DycSdkConfig";

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f37955b = new HashMap();

    private int a(String str, int i11) {
        if (b(str)) {
            try {
                return Integer.valueOf(a(str)).intValue();
            } catch (Exception unused) {
            }
        }
        return i11;
    }

    private static void d() {
        String str = com.igexin.push.core.e.f37998a;
        String str2 = com.igexin.push.core.e.A;
        GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(com.igexin.push.core.e.f37998a).cid(com.igexin.push.core.e.A).moduleName(com.igexin.push.core.b.f37738j).version("3.3.7.0").build());
    }

    private static /* synthetic */ void e() {
        String str = com.igexin.push.core.e.f37998a;
        String str2 = com.igexin.push.core.e.A;
        GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(com.igexin.push.core.e.f37998a).cid(com.igexin.push.core.e.A).moduleName(com.igexin.push.core.b.f37738j).version("3.3.7.0").build());
    }

    @Override // com.igexin.push.core.d.e
    public final Map<String, String> b() {
        return a(true);
    }

    @Override // com.igexin.push.core.d.e
    public final boolean c() {
        com.igexin.c.a.c.a.a("DycSdkConfig| parse config success", new Object[0]);
        return true;
    }

    private Boolean a(String str, Boolean bool) {
        if (b(str)) {
            try {
                return Boolean.valueOf(a(str));
            } catch (Exception unused) {
            }
        }
        return bool;
    }

    private boolean b(String str) {
        Map<String, String> map = this.f37955b;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    private Long a(String str, Long l11) {
        if (b(str)) {
            try {
                return Long.valueOf(a(str));
            } catch (Exception unused) {
            }
        }
        return l11;
    }

    private String a(String str) {
        return this.f37955b.get(str);
    }

    private String a(String str, String str2) {
        if (b(str)) {
            try {
                String a11 = a(str);
                if (!TextUtils.isEmpty(a11)) {
                    return a11;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    @Override // com.igexin.push.core.d.e
    public final Map<String, String> a() {
        return a(false);
    }

    private static Map<String, String> a(Context context, f fVar) {
        return com.getui.gtc.dyc.b.a.a(context, fVar.f37994a);
    }

    private Map<String, String> a(boolean z11) {
        SDKUrlConfig.getConfigServiceUrl();
        String str = com.igexin.push.core.e.f37998a;
        Map<String, String> a11 = a(com.igexin.push.core.e.f38035l, new f.a().b(com.igexin.push.core.b.f37738j).a(SDKUrlConfig.getConfigServiceUrl()).f("3.3.7.0").c(com.igexin.push.core.e.f37998a).d(com.igexin.push.core.e.A).e(com.getui.gtc.dyc.b.b.f29980a).a(z11 ? 1L : 86400000L).a(new g() { // from class: com.igexin.push.core.d.a.1
            @Override // com.igexin.push.core.d.g
            public final void a(String str2) {
                com.igexin.c.a.c.a.a(a.f37954a, str2);
                com.igexin.c.a.c.a.a("DycSdkConfig| get gtc config error ,message is : ".concat(String.valueOf(str2)), new Object[0]);
            }

            @Override // com.igexin.push.core.d.g
            public final void a(Map<String, String> map) {
                a.this.a(map);
                String str2 = com.igexin.push.core.e.f37998a;
                String str3 = com.igexin.push.core.e.A;
                GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(com.igexin.push.core.e.f37998a).cid(com.igexin.push.core.e.A).moduleName(com.igexin.push.core.b.f37738j).version("3.3.7.0").build());
            }
        }).a());
        a(a11);
        return a11;
    }

    @Override // com.igexin.push.core.d.e
    public final boolean a(Map<String, String> map) {
        if (map != null) {
            try {
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                com.igexin.c.a.c.a.a(f37954a, th2.toString());
            }
            if (map.size() != 0) {
                this.f37955b = map;
                com.igexin.c.a.c.a.a("DycSdkConfig|parse sdk config from server resp = " + this.f37955b.toString(), new Object[0]);
                com.igexin.push.config.d.f37590j = a("sdk.feature.sendmessage.enable", Boolean.valueOf(com.igexin.push.config.d.f37590j)).booleanValue();
                com.igexin.push.config.d.f37588h = a("sdk.readlocalcell.enable", Boolean.valueOf(com.igexin.push.config.d.f37588h)).booleanValue();
                com.igexin.push.config.d.f37587g = a("sdk.domainbackup.enable", Boolean.valueOf(com.igexin.push.config.d.f37587g)).booleanValue();
                boolean booleanValue = a("sdk.feature.setsilenttime.enable", Boolean.valueOf(com.igexin.push.config.d.f37592l)).booleanValue();
                com.igexin.push.config.d.f37592l = booleanValue;
                if (!booleanValue && com.igexin.push.config.d.f37583c != 0) {
                    m.a();
                    m.a(12, 0);
                }
                com.igexin.push.config.d.f37591k = a("sdk.feature.settag.enable", Boolean.valueOf(com.igexin.push.config.d.f37591k)).booleanValue();
                com.igexin.push.config.d.f37593m = a("sdk.feature.setheartbeatinterval.enable", Boolean.valueOf(com.igexin.push.config.d.f37593m)).booleanValue();
                com.igexin.push.config.d.f37594n = a("sdk.feature.setsockettimeout.enable", Boolean.valueOf(com.igexin.push.config.d.f37594n)).booleanValue();
                com.igexin.push.config.d.f37597q = a("sdk.report.initialize.enable", Boolean.valueOf(com.igexin.push.config.d.f37597q)).booleanValue();
                com.igexin.push.config.d.f37595o = a("sdk.feature.feedback.enable", Boolean.valueOf(com.igexin.push.config.d.f37595o)).booleanValue();
                com.igexin.push.config.d.f37596p = a("sdk.daemon.enable", Boolean.valueOf(com.igexin.push.config.d.f37596p)).booleanValue();
                com.igexin.push.config.d.f37604x = a("sdk.polling.dis.cnt", com.igexin.push.config.d.f37604x);
                com.igexin.push.config.d.f37605y = a("sdk.polling.login.interval", Long.valueOf(com.igexin.push.config.d.f37605y)).longValue();
                com.igexin.push.config.d.f37606z = a("sdk.polling.exit.heartbeat.cnt", com.igexin.push.config.d.f37606z);
                com.igexin.push.config.d.N = a("sdk.ral.send.maxcnt", com.igexin.push.config.d.N);
                com.igexin.push.config.d.A = a("sdk.httpdata.maxsize", com.igexin.push.config.d.A);
                com.igexin.push.config.d.B = a("sdk.hide.righticon.blacklist", com.igexin.push.config.d.B);
                String a11 = a("sdk.taskid.blacklist", com.igexin.push.config.d.C);
                com.igexin.push.config.d.C = a11;
                if (TextUtils.isEmpty(a11)) {
                    com.igexin.push.config.d.C = "none";
                } else {
                    n.a();
                    n.b();
                }
                com.igexin.push.config.d.E = a("sdk.applink.feedback.enable", Boolean.valueOf(com.igexin.push.config.d.E)).booleanValue();
                String a12 = a("sdk.applink.domains", com.igexin.push.config.d.F);
                com.igexin.push.config.d.F = a12;
                if (TextUtils.isEmpty(a12)) {
                    com.igexin.push.config.d.F = "none";
                }
                String a13 = a("sdk.del.alarm.brand", com.igexin.push.config.d.G);
                com.igexin.push.config.d.G = a13;
                if (TextUtils.isEmpty(a13)) {
                    com.igexin.push.config.d.G = "none";
                }
                com.igexin.push.config.d.L = a("sdk.vivopush.enable", Boolean.valueOf(com.igexin.push.config.d.L)).booleanValue();
                com.igexin.push.config.d.O = a("sdk.upload.gzip.limit", Long.valueOf(com.igexin.push.config.d.O)).longValue();
                com.igexin.push.config.d.M = a("sdk.multiPuh.stoplist", com.igexin.push.config.d.M);
                com.igexin.push.config.d.P = a("sdk.startservice.limit", com.igexin.push.config.d.P);
                com.igexin.push.config.d.D = a("sdk.miui.wakeup.enable", Boolean.valueOf(com.igexin.push.config.d.D)).booleanValue();
                com.igexin.push.config.d.f37568a = a("sdk.querytag.interval", Long.valueOf(com.igexin.push.config.d.f37568a)).longValue();
                com.igexin.push.config.d.Q = a("sdk.zxsdk.enable", Boolean.valueOf(com.igexin.push.config.d.Q)).booleanValue();
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass9(com.igexin.push.config.d.Q), true, false);
                com.igexin.push.config.d.R = a("sdk.type253.enable", com.igexin.push.config.d.R);
                com.igexin.push.config.d.S = a("sdk.type253.interval", Long.valueOf(com.igexin.push.config.d.S)).longValue();
                com.igexin.push.config.d.T = a("sdk.dud.enable", Boolean.valueOf(com.igexin.push.config.d.T)).booleanValue();
                com.igexin.push.config.d.U = a("sdk.honorpush.enable", Boolean.valueOf(com.igexin.push.config.d.U)).booleanValue();
                com.igexin.push.config.d.V = a("sdk.type144.enable", Boolean.valueOf(com.igexin.push.config.d.V)).booleanValue();
                com.igexin.push.config.d.W = a("sdk.type144.interval", Long.valueOf(com.igexin.push.config.d.W)).longValue();
                com.igexin.push.config.d.X = a("sdk.use.gtwf.enable", Boolean.valueOf(com.igexin.push.config.d.X)).booleanValue();
                com.igexin.push.config.d.Y = a("sdk.type145.enable", Boolean.valueOf(com.igexin.push.config.d.Y)).booleanValue();
                com.igexin.push.config.d.Z = a("sdk.type145.interval.ms", Long.valueOf(com.igexin.push.config.d.Z)).longValue();
                com.igexin.push.config.d.f37569aa = a("sdk.type145.times", com.igexin.push.config.d.f37569aa);
                com.igexin.push.config.d.f37570ab = a("sdk.type145.picc.enable", Boolean.valueOf(com.igexin.push.config.d.f37570ab)).booleanValue();
                com.igexin.push.config.d.f37571ac = a("sdk.type145.ipp.enable", Boolean.valueOf(com.igexin.push.config.d.f37571ac)).booleanValue();
                com.igexin.push.config.d.f37572ad = a("sdk.type145.gploc.enable", Boolean.valueOf(com.igexin.push.config.d.f37572ad)).booleanValue();
                com.igexin.push.config.d.f37573ae = a("sdk.type145.netloc.enable", Boolean.valueOf(com.igexin.push.config.d.f37573ae)).booleanValue();
                com.igexin.push.config.d.f37574af = a("sdk.type145.ceinfo.enable", Boolean.valueOf(com.igexin.push.config.d.f37574af)).booleanValue();
                com.igexin.push.config.d.f37575ag = a("sdk.type10.cidnull.delay", com.igexin.push.config.d.f37575ag);
                com.igexin.push.config.d.f37576ah = a("sdk.newhostad.enable", Boolean.valueOf(com.igexin.push.config.d.f37576ah)).booleanValue();
                com.igexin.push.config.d.f37577ai = a("sdk.al.notify.enable", Boolean.valueOf(com.igexin.push.config.d.f37577ai)).booleanValue();
                com.igexin.push.config.d.f37578aj = a("sdk.sd.rf.enable", com.igexin.push.config.d.f37578aj);
                com.igexin.push.config.d.f37579ak = a("sdk.log.al.enable", Boolean.valueOf(com.igexin.push.config.d.f37579ak)).booleanValue();
                com.igexin.push.config.d.f37580al = a("sdk.notification.failed.feedback.brand", com.igexin.push.config.d.f37580al);
                com.igexin.push.config.d.f37581am = a("sdk.radiotype.enable", Boolean.valueOf(com.igexin.push.config.d.f37581am)).booleanValue();
                return true;
            }
        }
        return false;
    }
}
