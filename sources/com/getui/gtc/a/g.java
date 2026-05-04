package com.getui.gtc.a;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.text.TextUtils;
import com.getui.gtc.a.a.n;
import com.getui.gtc.a.a.o;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.e.c;
import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class g implements b {

    /* renamed from: e, reason: collision with root package name */
    public static int f29759e = 4;

    /* renamed from: i, reason: collision with root package name */
    private static long f29760i = 86400000;

    /* renamed from: a, reason: collision with root package name */
    public int f29761a;

    /* renamed from: b, reason: collision with root package name */
    public int f29762b;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29767h = false;

    /* renamed from: j, reason: collision with root package name */
    private long f29768j = 604800000;

    /* renamed from: k, reason: collision with root package name */
    private String f29769k = "none";

    /* renamed from: c, reason: collision with root package name */
    public boolean f29763c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29764d = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29765f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29766g = false;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f29770l = new AtomicBoolean(true);

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i11) {
        if (i11 == -1) {
            com.getui.gtc.i.c.a.d("not integrate ct.");
            a(3, new o(-3));
            return;
        }
        if (!com.getui.gtc.a.a.l.c()) {
            com.getui.gtc.i.c.a.d("not init ct.");
            a(3, new o(-4));
            return;
        }
        o b11 = com.getui.gtc.a.a.l.b("");
        boolean isEmpty = TextUtils.isEmpty(b11.f29740c);
        if (this.f29770l.getAndSet(false) && isEmpty) {
            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.getui.gtc.i.c.a.d("ct retry.");
                        g.this.a(i11);
                    } catch (Throwable th2) {
                        com.getui.gtc.i.c.a.c(th2);
                    }
                }
            }, 5000L);
        } else if (isEmpty && (this.f29762b & 1) == 1) {
            com.getui.gtc.a.a.l.g();
        } else {
            a(3, b11);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        String str;
        o oVar;
        o oVar2;
        Map<String, String> a11 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, (com.getui.gtc.f.e) null);
        if (a11 != null && a11.size() > 0) {
            try {
                String str2 = a11.get("sdk.gtc.type305.enable");
                if (str2 != null) {
                    this.f29767h = Boolean.parseBoolean(str2);
                }
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b(e11);
            }
            try {
                String str3 = a11.get("sdk.gtc.type305.interval");
                if (str3 != null) {
                    f29760i = Long.parseLong(str3) * 1000;
                }
            } catch (Exception e12) {
                com.getui.gtc.i.c.a.b(e12);
            }
            try {
                String str4 = a11.get("sdk.gtc.type305.collect_interval");
                if (str4 != null) {
                    this.f29768j = Long.parseLong(str4) * 1000;
                }
            } catch (Exception e13) {
                com.getui.gtc.i.c.a.b(e13);
            }
            try {
                String str5 = a11.get("sdk.gtc.type305.cu_path_list");
                if (str5 != null) {
                    this.f29769k = str5;
                }
            } catch (Exception e14) {
                com.getui.gtc.i.c.a.b(e14);
            }
            try {
                String str6 = a11.get("sdk.gtc.type305.s_pm_enable");
                if (str6 != null) {
                    this.f29761a = Integer.parseInt(str6);
                }
            } catch (Exception e15) {
                com.getui.gtc.i.c.a.b(e15);
            }
            try {
                String str7 = a11.get("sdk.gtc.type305.pl_enable");
                if (str7 != null) {
                    this.f29762b = Integer.parseInt(str7);
                }
            } catch (Exception e16) {
                com.getui.gtc.i.c.a.b(e16);
            }
            try {
                String str8 = a11.get("sdk.gtc.type305.first_call");
                if (str8 != null) {
                    f29759e = Integer.parseInt(str8);
                }
            } catch (Exception e17) {
                com.getui.gtc.i.c.a.b(e17);
            }
            try {
                String str9 = a11.get("sdk.gtc.type305.n_pm_enable");
                if (str9 != null) {
                    this.f29765f = Boolean.parseBoolean(str9);
                }
            } catch (Exception e18) {
                com.getui.gtc.i.c.a.b(e18);
            }
            try {
                String str10 = a11.get("sdk.gtc.type305.cl_enable");
                if (str10 != null) {
                    this.f29766g = Boolean.parseBoolean(str10);
                }
            } catch (Exception e19) {
                com.getui.gtc.i.c.a.b(e19);
            }
            try {
                String str11 = a11.get("sdk.gtc.type305.sf_enable");
                if (str11 != null) {
                    this.f29764d = Boolean.parseBoolean(str11);
                }
            } catch (Exception e21) {
                com.getui.gtc.i.c.a.b(e21);
            }
            try {
                String str12 = a11.get("sdk.gtc.type305.gbd.check");
                if (str12 != null) {
                    this.f29763c = Boolean.parseBoolean(str12);
                }
            } catch (Exception e22) {
                com.getui.gtc.i.c.a.b(e22);
            }
        }
        if (!this.f29767h) {
            com.getui.gtc.i.c.a.b("type 305 is not enabled");
            return;
        }
        try {
            if (this.f29763c) {
                Bundle bundle = new Bundle();
                bundle.putString(AdvanceSetting.CLEAR_NOTIFICATION, "com.getui.gtc.extension.distribution.gbd.stub.PushExtension");
                if (com.getui.gtc.g.b.a(bundle) != null) {
                    com.getui.gtc.i.c.a.a("type 305 exist gbd pm");
                    return;
                }
            }
            a((String) null);
            cVar = c.a.f30027a;
            JSONObject b11 = cVar.f30024a.b();
            if (System.currentTimeMillis() - b11.optLong("collectTime") < this.f29768j) {
                com.getui.gtc.i.c.a.c("type 305 collect time not expired");
                return;
            }
            int optInt = b11.optInt("accessCount") + 1;
            b11.put("accessCount", optInt);
            cVar2 = c.a.f30027a;
            cVar2.f30024a.b(b11);
            if (optInt < f29759e) {
                com.getui.gtc.i.c.a.d("accessCount:" + optInt + " < starPmFirstCall:" + f29759e + ", ignored");
                return;
            }
            try {
                int a12 = com.getui.gtc.a.a.l.a(GtcProvider.context());
                if (this.f29764d && !com.getui.gtc.a.a.l.b(GtcProvider.context())) {
                    com.getui.gtc.i.c.a.d("type 305 report not sf.");
                    oVar2 = new o(-1);
                } else {
                    if (com.getui.gtc.a.a.l.a()) {
                        com.getui.gtc.i.c.a.d("type 305 pmEnable: " + this.f29761a);
                        if (a12 != 1) {
                            if (a12 != 2) {
                                if (a12 != 3) {
                                    str = "type 305 no mc or error.";
                                } else if ((this.f29761a & 1) == 1) {
                                    com.getui.gtc.i.c.a.d("type 305 ct fetch.");
                                    a(com.getui.gtc.a.a.l.b());
                                    return;
                                }
                            } else if ((this.f29761a & 2) == 2) {
                                com.getui.gtc.i.c.a.d("type 305 cu fetch.");
                                a(com.getui.gtc.a.a.l.a(this.f29769k));
                                return;
                            }
                            com.getui.gtc.i.c.a.d("type 305 starPm disable.");
                            return;
                        }
                        if (this.f29765f) {
                            com.getui.gtc.i.c.a.d("type 305 cm vd fetch.");
                            final com.getui.gtc.a.a.i iVar = new com.getui.gtc.a.a.i(GtcProvider.context());
                            boolean z11 = this.f29766g;
                            final ConnectivityManager connectivityManager = (ConnectivityManager) iVar.f29707a.getSystemService("connectivity");
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                                int type = activeNetworkInfo.getType();
                                if (type == 0) {
                                    com.getui.gtc.i.c.a.d("in cl.");
                                    iVar.a((Network) null);
                                    return;
                                }
                                if (type == 1) {
                                    com.getui.gtc.i.c.a.d("in wf.");
                                    if (!z11) {
                                        com.getui.gtc.i.c.a.d("sc dy not allow");
                                        a(1, new o(-2, "", ""));
                                        return;
                                    }
                                    try {
                                        if (!CommonUtil.hasPermission(iVar.f29707a, "android.permission.CHANGE_NETWORK_STATE", false)) {
                                            com.getui.gtc.i.c.a.d("sc dy not allow or no net perm.");
                                            oVar = new o(-2, "", "");
                                        } else {
                                            if (com.getui.gtc.a.a.i.a(connectivityManager)) {
                                                com.getui.gtc.i.c.a.d("in wf mode, attempt 2 cl.");
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                                                builder.addCapability(12);
                                                builder.addTransportType(0);
                                                NetworkRequest build = builder.build();
                                                final ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.getui.gtc.a.a.i.1
                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onAvailable(final Network network) {
                                                        super.onAvailable(network);
                                                        com.getui.gtc.i.c.a.d("w2cl su.");
                                                        if (atomicBoolean.getAndSet(false)) {
                                                            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.a.i.1.1
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    i.this.a(network);
                                                                }
                                                            });
                                                        }
                                                    }

                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                                                        super.onCapabilitiesChanged(network, networkCapabilities);
                                                    }

                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                                                        super.onLinkPropertiesChanged(network, linkProperties);
                                                        com.getui.gtc.i.c.a.d("onLPChanged, if name = " + linkProperties.getInterfaceName());
                                                    }

                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onLosing(Network network, int i11) {
                                                        super.onLosing(network, i11);
                                                    }

                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onLost(Network network) {
                                                        super.onLost(network);
                                                    }

                                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                                    public final void onUnavailable() {
                                                        super.onUnavailable();
                                                        com.getui.gtc.i.c.a.d("w2cu f.");
                                                    }
                                                };
                                                connectivityManager.requestNetwork(build, networkCallback);
                                                iVar.f29708b = new Runnable() { // from class: com.getui.gtc.a.a.i.2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            i.this.f29708b = null;
                                                            connectivityManager.unregisterNetworkCallback(networkCallback);
                                                        } catch (Throwable th2) {
                                                            com.getui.gtc.i.c.a.c(th2);
                                                        }
                                                    }
                                                };
                                                ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.a.i.3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Runnable runnable = i.this.f29708b;
                                                        if (runnable != null) {
                                                            runnable.run();
                                                        }
                                                    }
                                                }, 15000L);
                                                return;
                                            }
                                            com.getui.gtc.i.c.a.d("sc  cl closed.");
                                            oVar = new o(-5, "", "");
                                        }
                                        a(1, oVar);
                                        return;
                                    } catch (Throwable th2) {
                                        com.getui.gtc.i.c.a.c(th2);
                                        return;
                                    }
                                }
                                return;
                            }
                            str = "net info is null";
                        } else {
                            str = "type 305 cm vd disable.";
                        }
                        com.getui.gtc.i.c.a.d(str);
                        return;
                    }
                    com.getui.gtc.i.c.a.d("type 305 report not net.");
                    oVar2 = new o(-2);
                }
                a(a12, oVar2);
            } catch (Throwable th3) {
                com.getui.gtc.i.c.a.c(th3);
            }
        } catch (Throwable th4) {
            com.getui.gtc.i.c.a.c("type 305 report error: " + th4.toString());
        }
    }

    public static void a(int i11, o oVar) {
        String str;
        String str2;
        try {
            String str3 = oVar.f29740c;
            int i12 = 0;
            if (TextUtils.isEmpty(str3)) {
                str = "";
                str2 = "";
            } else {
                if (i11 != 1) {
                    str = n.a(str3);
                    com.getui.gtc.i.c.a.d("305 * PM: ".concat(String.valueOf(str3)));
                } else {
                    i12 = 1;
                    str = n.a(com.getui.gtc.a.a.h.a(str3));
                }
                str2 = "2#" + n.a();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            a(a.a(simpleDateFormat.format(new Date())) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a.a(com.getui.gtc.c.b.f29827d) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a.a(com.getui.gtc.c.b.f29824a) + "|android|" + GtcProvider.context().getPackageName() + "|GTC-3.2.16.0|" + i11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oVar.f29738a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oVar.f29739b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i12);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c("type 305 report error: " + th2.toString());
        }
    }

    private static void a(final String str) {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        boolean z11;
        com.getui.gtc.e.c cVar3;
        com.getui.gtc.e.c cVar4;
        String str2;
        try {
            cVar = c.a.f30027a;
            final JSONObject b11 = cVar.f30024a.b();
            if (str == null) {
                str = b11.optString("content");
                z11 = true;
            } else {
                b11.put("collectTime", System.currentTimeMillis());
                b11.put("content", str);
                cVar2 = c.a.f30027a;
                cVar2.f30024a.b(b11);
                com.getui.gtc.i.c.a.a("type 305 save content");
                z11 = false;
            }
            if (TextUtils.isEmpty(str)) {
                str2 = "type 305 no content report";
            } else {
                boolean endsWith = str.endsWith("|1");
                if (System.currentTimeMillis() - b11.optLong("reportTime") >= f29760i) {
                    if (!endsWith) {
                        com.getui.gtc.h.a.a(str, 305);
                        b11.put("reportTime", System.currentTimeMillis());
                        cVar4 = c.a.f30027a;
                        cVar4.f30024a.b(b11);
                        return;
                    }
                    if (!z11) {
                        ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.g.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.getui.gtc.e.c cVar5;
                                try {
                                    com.getui.gtc.h.a.a(str, 305);
                                    b11.put("reportTime", System.currentTimeMillis());
                                    b11.put("content", "");
                                    cVar5 = c.a.f30027a;
                                    cVar5.f30024a.b(b11);
                                    com.getui.gtc.i.c.a.a("type 305 delete content");
                                } catch (Throwable th2) {
                                    com.getui.gtc.i.c.a.c(th2);
                                }
                            }
                        }, 300000L);
                        return;
                    }
                    com.getui.gtc.h.a.a(str, 305);
                    b11.put("reportTime", System.currentTimeMillis());
                    b11.put("content", "");
                    cVar3 = c.a.f30027a;
                    cVar3.f30024a.b(b11);
                    com.getui.gtc.i.c.a.a("type 305 delete content");
                    return;
                }
                str2 = "type 305 report not expired";
            }
            com.getui.gtc.i.c.a.c(str2);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z11) {
        if (!z11) {
            com.getui.gtc.i.c.a.d("not integrate cu.");
            a(2, new o(-3));
            return;
        }
        if (!com.getui.gtc.a.a.l.d()) {
            com.getui.gtc.i.c.a.d("not init cu.");
            a(2, new o(-4));
            return;
        }
        o e11 = com.getui.gtc.a.a.l.e();
        boolean isEmpty = TextUtils.isEmpty(e11.f29740c);
        if (this.f29770l.getAndSet(false) && isEmpty) {
            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.getui.gtc.i.c.a.d("cu retry.");
                        g.this.a(true);
                    } catch (Throwable th2) {
                        com.getui.gtc.i.c.a.c(th2);
                    }
                }
            }, 5000L);
        } else if (isEmpty && (this.f29762b & 2) == 2) {
            com.getui.gtc.a.a.l.f();
        } else {
            a(2, e11);
        }
    }
}
