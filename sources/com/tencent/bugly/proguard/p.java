package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f42619a = true;

    /* renamed from: b, reason: collision with root package name */
    public static List<o> f42620b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f42621c;

    /* renamed from: d, reason: collision with root package name */
    private static w f42622d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f42623e;

    private static boolean a(aa aaVar) {
        List<String> list = aaVar.f42205v;
        return list != null && list.contains("bugly");
    }

    public static synchronized void a(Context context) {
        synchronized (p.class) {
            a(context, null);
        }
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (p.class) {
            if (f42623e) {
                al.d("[init] initial Multi-times, ignore this.", new Object[0]);
                return;
            }
            if (context == null) {
                Log.w(al.f42282b, "[init] context of init() is null, check it.");
                return;
            }
            aa a11 = aa.a(context);
            if (a(a11)) {
                f42619a = false;
                return;
            }
            String e11 = a11.e();
            if (e11 == null) {
                Log.e(al.f42282b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
            } else {
                a(context, e11, a11.D, buglyStrategy);
            }
        }
    }

    public static synchronized void a(o oVar) {
        synchronized (p.class) {
            if (!f42620b.contains(oVar)) {
                f42620b.add(oVar);
            }
        }
    }

    public static synchronized void a(Context context, String str, boolean z11, BuglyStrategy buglyStrategy) {
        byte[] bArr;
        synchronized (p.class) {
            if (f42623e) {
                al.d("[init] initial Multi-times, ignore this.", new Object[0]);
                return;
            }
            if (context == null) {
                Log.w(al.f42282b, "[init] context is null, check it.");
                return;
            }
            if (str == null) {
                Log.e(al.f42282b, "init arg 'crashReportAppID' should not be null!");
                return;
            }
            f42623e = true;
            if (z11) {
                f42621c = true;
                al.f42283c = true;
                al.d("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
                al.e("--------------------------------------------------------------------------------------------", new Object[0]);
                al.d("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
                al.d("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
                al.d("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
                al.d("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
                al.e("--------------------------------------------------------------------------------------------", new Object[0]);
                al.b("[init] Open debug mode of Bugly.", new Object[0]);
            }
            al.a(" crash report start initializing...", new Object[0]);
            al.b("[init] Bugly start initializing...", new Object[0]);
            al.a("[init] Bugly complete version: v%s", "4.1.9.3");
            Context a11 = ap.a(context);
            aa a12 = aa.a(a11);
            a12.o();
            ao.a(a11);
            f42622d = w.a(a11, f42620b);
            ai.a(a11);
            ac.a(a11, f42620b);
            u a13 = u.a(a11);
            if (a(a12)) {
                f42619a = false;
                return;
            }
            a12.f42201r = str;
            a12.b("APP_ID", str);
            al.a("[param] Set APP ID:%s", str);
            if (buglyStrategy != null) {
                String appVersion = buglyStrategy.getAppVersion();
                if (!TextUtils.isEmpty(appVersion)) {
                    if (appVersion.length() > 100) {
                        String substring = appVersion.substring(0, 100);
                        al.d("appVersion %s length is over limit %d substring to %s", appVersion, 100, substring);
                        appVersion = substring;
                    }
                    a12.f42198o = appVersion;
                    al.a("[param] Set App version: %s", buglyStrategy.getAppVersion());
                }
                try {
                    if (buglyStrategy.isReplaceOldChannel()) {
                        String appChannel = buglyStrategy.getAppChannel();
                        if (!TextUtils.isEmpty(appChannel)) {
                            if (appChannel.length() > 100) {
                                String substring2 = appChannel.substring(0, 100);
                                al.d("appChannel %s length is over limit %d substring to %s", appChannel, 100, substring2);
                                appChannel = substring2;
                            }
                            f42622d.a(556, "app_channel", appChannel.getBytes(), false);
                            a12.f42202s = appChannel;
                        }
                    } else {
                        Map<String, byte[]> a14 = f42622d.a(556, (v) null);
                        if (a14 != null && (bArr = a14.get("app_channel")) != null) {
                            a12.f42202s = new String(bArr);
                        }
                    }
                    al.a("[param] Set App channel: %s", a12.f42202s);
                } catch (Exception e11) {
                    if (f42621c) {
                        e11.printStackTrace();
                    }
                }
                String appPackageName = buglyStrategy.getAppPackageName();
                if (!TextUtils.isEmpty(appPackageName)) {
                    if (appPackageName.length() > 100) {
                        String substring3 = appPackageName.substring(0, 100);
                        al.d("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, substring3);
                        appPackageName = substring3;
                    }
                    a12.f42186c = appPackageName;
                    al.a("[param] Set App package: %s", buglyStrategy.getAppPackageName());
                }
                String deviceID = buglyStrategy.getDeviceID();
                if (deviceID != null) {
                    if (deviceID.length() > 100) {
                        String substring4 = deviceID.substring(0, 100);
                        al.d("deviceId %s length is over limit %d substring to %s", deviceID, 100, substring4);
                        deviceID = substring4;
                    }
                    a12.a(deviceID);
                    al.a("[param] Set device ID: %s", deviceID);
                }
                String deviceModel = buglyStrategy.getDeviceModel();
                if (deviceModel != null) {
                    a12.b(deviceModel);
                    al.a("[param] Set device model: %s", deviceModel);
                }
                a12.f42189f = buglyStrategy.isUploadProcess();
                ao.f42288b = buglyStrategy.isBuglyLogUpload();
            }
            for (int i11 = 0; i11 < f42620b.size(); i11++) {
                try {
                    if (a13.b(f42620b.get(i11).f42618id)) {
                        f42620b.get(i11).init(a11, z11, buglyStrategy);
                    }
                } catch (Throwable th2) {
                    if (!al.a(th2)) {
                        th2.printStackTrace();
                    }
                }
            }
            s.a(a11, buglyStrategy);
            long appReportDelay = buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L;
            final ac a15 = ac.a();
            a15.f42217c.a(new Thread() { // from class: com.tencent.bugly.proguard.ac.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        Map<String, byte[]> a16 = w.a().a(ac.f42213a, (v) null);
                        if (a16 != null) {
                            byte[] bArr2 = a16.get("device");
                            byte[] bArr3 = a16.get("gateway");
                            if (bArr2 != null) {
                                aa.a(ac.this.f42221h).d(new String(bArr2));
                            }
                            if (bArr3 != null) {
                                aa.a(ac.this.f42221h).c(new String(bArr3));
                            }
                        }
                        ac.this.f42220g = ac.d();
                        if (ac.this.f42220g != null) {
                            if (ap.b(ac.f42216i) || !ap.d(ac.f42216i)) {
                                ac.this.f42220g.f42095q = StrategyBean.f42079a;
                                ac.this.f42220g.f42096r = StrategyBean.f42080b;
                            } else {
                                ac.this.f42220g.f42095q = ac.f42216i;
                                ac.this.f42220g.f42096r = ac.f42216i;
                            }
                        }
                    } catch (Throwable th3) {
                        if (!al.a(th3)) {
                            th3.printStackTrace();
                        }
                    }
                    ac acVar = ac.this;
                    acVar.a(acVar.f42220g, false);
                }
            }, appReportDelay);
            al.b("[init] Bugly initialization finished.", new Object[0]);
        }
    }
}
